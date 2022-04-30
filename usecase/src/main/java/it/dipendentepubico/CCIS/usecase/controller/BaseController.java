package it.dipendentepubico.CCIS.usecase.controller;

import it.dipendentepubico.CCIS.domain.model.PagedSearchRequest;
import it.dipendentepubico.CCIS.usecase.Interpreter;
import it.dipendentepubico.CCIS.usecase.domain.PagingData;
import it.dipendentepubico.CCIS.usecase.xhmapping.MapInfo;
import it.dipendentepubico.CCIS.usecase.xhmapping.Xml2HQLMapping;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Map;

public abstract class BaseController {
    @Autowired
    protected Interpreter interpreter;

    @Autowired
    protected Xml2HQLMapping xml2HQLMapping;

    /**
     * tipo Object perchè le request generate non hannno nulla in comune
     * @param request
     * @param clazz
     * @return
     * @throws JAXBException
     */
    protected ByteArrayOutputStream toBaos(Object request, Class clazz) throws JAXBException {
        JAXBContext jaxbContext;
        jaxbContext = JAXBContext.newInstance( clazz );
        Marshaller jaxbMarshaller = jaxbContext.createMarshaller();
        jaxbMarshaller.marshal(request, System.out );
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        jaxbMarshaller.marshal(request, baos);
        return baos;
    }

    protected PagingData parsePagingData(PagedSearchRequest request) {
        PagingData pagingData = new PagingData(request.getPaging().getOffset().intValue(), request.getPaging().getPageSize().intValue());
        return pagingData;
    }

    protected abstract String getRequestElement();


    protected String getQueryHQL(ByteArrayOutputStream baos) {
        // xpath da elemento mandato, hql fino a colonna di interesse
        Map<String, MapInfo> mappingWhere = xml2HQLMapping.getRequestMap().get(getRequestElement()).getPathToInfo();

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(baos.toByteArray());

        String queryHQL = interpreter.generateHQLFromXML(getRequestElement(), byteArrayInputStream, xml2HQLMapping.getRequestMap().get(getRequestElement()).getFromMap(), mappingWhere);
        return queryHQL;
    }

}
