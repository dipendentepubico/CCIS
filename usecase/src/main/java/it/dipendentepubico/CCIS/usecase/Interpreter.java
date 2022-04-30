package it.dipendentepubico.CCIS.usecase;

import it.dipendentepubico.CCIS.usecase.xhmapping.MapInfo;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.*;
import java.util.*;

public class Interpreter {

    /**
     * Interpretes xml request and convert into HQL select query
     * @param requestTag                    the main request tag
     * @param byteArrayInputStream          the xml request
     * @param mappingFrom                   main Hibernate entity name
     * @param mappingWhere                  mapping between xml path and Hibernate entity
     * @return
     */
    public String generateHQLFromXML(String requestTag, ByteArrayInputStream byteArrayInputStream, String mappingFrom, Map<String, MapInfo> mappingWhere) {
        //  processo tutti gli elementi di mandato_ricerca mappandoli con Xml2HQLMapping.yaml
        StringBuffer sbSelect = new StringBuffer();
        StringBuffer sbFrom = new StringBuffer();
        StringBuffer sbWhere = new StringBuffer();

        sbWhere.append(" WHERE 1=1 ");
        // StAX
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        try {
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(byteArrayInputStream);
            String andOr = "";
            Stack<String> path = new Stack<>();
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    String elementName = startElement.getName().getLocalPart();

                    if(elementName.equals(requestTag)){
                        // FROM
                        sbFrom.append(" FROM ").append(mappingFrom).append(" as theEntity ");
                    }else {
//                         WHERE
                        switch (elementName) {
                            case "and":
                            case "or":
                                andOr = startElement.getName().getLocalPart().toUpperCase(Locale.ROOT);
                                sbWhere.append(" ").append(andOr).append(" ( ");
                                break;
                            default:
                                // per tutti gli altri tag mi conservo una specie di xpath
                                path.push(elementName);
                                MapInfo mapInfo = mappingWhere.get(getPath(path));
                                if (mapInfo != null) {
                                    // se il mapping di questo path esiste allora genero la condizione della where
                                    String columnName = mapInfo.getHname();
                                    String operation = startElement.getAttributeByName(new QName("op")).getValue();
                                    StringBuffer userValue = new StringBuffer();
                                    // il prossimo valore StAX è il contenuto del tag ossia il valore cercato dall'utente
                                    userValue.append(xmlEventReader.nextEvent().asCharacters());
                                    // se campo db è varchar allora metto apici
                                    if (mapInfo.getHtype().equals("string")) {
                                        userValue.insert(0, " '").append("' ");
                                    }

                                    sbWhere.append(" ").append(columnName).append(" ")
                                            .append(decodeOp(operation))
                                            .append(" ").append(userValue).append(" ").append(andOr);
                                }
                        }
                    }

                }
                if(xmlEvent.isEndElement()){
                    EndElement endElement = xmlEvent.asEndElement();
                    String elementName = endElement.getName().getLocalPart();
                    switch (elementName.toUpperCase(Locale.ROOT)) {
                        case "AND":
                        case "OR":
                            andOr = endElement.getName().getLocalPart().toUpperCase(Locale.ROOT);
                            sbWhere.append(" 1=1 ) ");
                            break;
                        default:
                            // elemento chiuso: per il prossimo elemento rimuovo questo parent
                            if(!path.empty()){
                                path.pop();
                            }
                    }
                }
            }
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }
        String finalQuery = sbSelect.append(sbFrom).append(sbWhere).toString();
        System.out.println(System.lineSeparator());
        System.out.println(finalQuery);
        return finalQuery;
    }

    private static String getPath(Stack<String> path) {
        return path.stream().reduce((s, s2) -> s+"."+s2).get();
    }


    private static String decodeOp(String xmlTag) {
        String hqlOperation = " = ";
        switch (xmlTag.toUpperCase(Locale.ROOT)){
            case "EQ":
                hqlOperation = " = ";
                break;
            case "LT":
                hqlOperation = " < ";
                break;
            case "GT":
                hqlOperation = " > ";
                break;
            case "NE":
                hqlOperation = " !\" ";
                break;
            case "LIKE":
                hqlOperation = " like ";
                break;
        }
        return hqlOperation;
    }
}
