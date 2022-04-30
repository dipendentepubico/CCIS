package it.dipendentepubico.CCIS.usecase;


import it.dipendentepubico.CCIS.domain.model.*;
import it.dipendentepubico.CCIS.domain.model.ObjectFactory;
import it.dipendentepubico.CCIS.domain.model.OperationStringEnumType;
import it.dipendentepubico.CCIS.usecase.spring.UsecaseSpringConfig;
import it.dipendentepubico.CCIS.usecase.xhmapping.MapInfo;
import it.dipendentepubico.CCIS.usecase.xhmapping.Xml2HQLMapping;
import it.gov.agenziaentrate.ivaservizi.fatturaelettronica.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Map;

import static it.dipendentepubico.CCIS.domain.Constants.FLUSSO_SDI_REQUEST;
import static it.dipendentepubico.CCIS.domain.Constants.MANDATO_REQUEST;

@SpringJUnitConfig(UsecaseSpringConfig.class)
public class UseCaseTest {

        @Autowired
    private Xml2HQLMapping xml2HQLMapping;

    @Autowired
    private Interpreter interpreter;

    private ByteArrayOutputStream getByteArrayOutputStream(Object xmlObject, Class clazz) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance( clazz );
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.marshal(xmlObject, System.out );
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        jaxbMarshaller.marshal(xmlObject, baos);
        return baos;
    }

    @Test
    public void parseMandatoTest() throws Exception{
        ObjectFactory objectFactory = new ObjectFactory();
        MandatoRequest mandatoRicerca = objectFactory.createMandatoRequest();
        MandatoType m1 = objectFactory.createMandatoType();
        MandatoType.Anno anno = objectFactory.createMandatoTypeAnno();
        anno.setOp(OperationNumberEnumType.EQ);
        anno.setValue(new BigInteger("2021"));
        m1.setAnno(anno);
        mandatoRicerca.setAnd(new MandatoRequest.And());
        mandatoRicerca.getAnd().getMandato().add(m1);
        MandatoType m2 = objectFactory.createMandatoType();
        MandatoType.Codice codice = objectFactory.createMandatoTypeCodice();
        codice.setOp(OperationNumberEnumType.GT);
        codice.setValue(new BigInteger("55"));
        m2.setCodice(codice);
        mandatoRicerca.getAnd().getMandato().add(m2);

        mandatoRicerca.setOr(new MandatoRequest.Or());
        MandatoType m3 = objectFactory.createMandatoType();
        BeneficiarioType b3 = objectFactory.createBeneficiarioType();
        CodiceFiscaleType cf1 = objectFactory.createCodiceFiscaleType();
        cf1.setOp(OperationStringEnumType.EQ);
        cf1.setValue("RSSMRA80A01H501U");
        b3.setCodiceFiscale(cf1);
        m3.setBeneficiario(b3);
        mandatoRicerca.getOr().getMandato().add(m3);

        ByteArrayOutputStream baos = getByteArrayOutputStream(mandatoRicerca, MandatoRequest.class);

        // xpath da elemento mandato, hql fino a colonna di interesse
        Map<String, MapInfo> mappingWhere  = xml2HQLMapping.getRequestMap().get(MANDATO_REQUEST).getPathToInfo();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(baos.toByteArray());
        String finalQuery = interpreter.generateHQLFromXML(MANDATO_REQUEST, byteArrayInputStream, xml2HQLMapping.getRequestMap().get(MANDATO_REQUEST).getFromMap(),  mappingWhere);

        Assertions.assertTrue(finalQuery.equals(" FROM MandatoTESTImpl as theEntity  WHERE 1=1  OR (  theEntity.benefic.codFiscale  =   'RSSMRA80A01H501U'  OR 1=1 )  AND (  theEntity.anno  =  2021 AND theEntity.codMandato  >   '55'  AND 1=1 ) "));
    }



    @Test
    public void parseFatturaTest() throws Exception{
        ObjectFactory ofCCIS = new ObjectFactory();
        it.gov.agenziaentrate.ivaservizi.fatturaelettronica.ObjectFactory ofFE = new it.gov.agenziaentrate.ivaservizi.fatturaelettronica.ObjectFactory();
        FatturaElettronicaRequest request = ofCCIS.createFatturaElettronicaRequest();
        FlussoSdiType flussoSdi = ofCCIS.createFlussoSdiType();
        FlussoSdiType.IdentificativoSdi identificativoSdi = ofCCIS.createFlussoSdiTypeIdentificativoSdi();
        identificativoSdi.setOp(OperationNumberEnumType.GT);
        identificativoSdi.setValue(new BigInteger("12345"));
        flussoSdi.setIdentificativoSdi(identificativoSdi);
        FatturaElettronicaType fatturaElettronica = ofFE.createFatturaElettronicaType();
        FatturaElettronicaBodyType fatturaElettronicaBody = ofFE.createFatturaElettronicaBodyType();
        DatiGeneraliType datiGenerali = ofFE.createDatiGeneraliType();
        DatiGeneraliDocumentoType datiGeneraliDocumento = ofFE.createDatiGeneraliDocumentoType();
        String20Type numero = ofFE.createString20Type();
        numero.setOp(OperationStringEnumType.EQ);
        numero.setValue("0259820");
        datiGeneraliDocumento.setNumero(numero);
        datiGenerali.setDatiGeneraliDocumento(datiGeneraliDocumento);
        fatturaElettronicaBody.setDatiGenerali(datiGenerali);
        fatturaElettronica.getFatturaElettronicaBody().add(fatturaElettronicaBody);
        FatturaElettronicaRequest.And and = ofCCIS.createFatturaElettronicaRequestAnd();
        flussoSdi.getFatturaElettronica().add(fatturaElettronica);
        and.getFattura().add(flussoSdi);
        request.setAnd(and);

        ByteArrayOutputStream baos = getByteArrayOutputStream(request, FatturaElettronicaRequest.class);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(baos.toByteArray());
        String query = interpreter.generateHQLFromXML(FLUSSO_SDI_REQUEST, byteArrayInputStream, xml2HQLMapping.getRequestMap().get(FLUSSO_SDI_REQUEST).getFromMap(), xml2HQLMapping.getRequestMap().get(FLUSSO_SDI_REQUEST).getPathToInfo());
        Assertions.assertTrue(query.equals(" FROM FattureTESTImpl as theEntity  WHERE 1=1  AND (  theEntity.flusso.identificativoSdi  >  12345 AND theEntity.numero  =   '0259820'  AND 1=1 ) "));
    }

}
