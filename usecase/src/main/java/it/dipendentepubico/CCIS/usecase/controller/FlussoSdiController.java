package it.dipendentepubico.CCIS.usecase.controller;


import it.dipendentepubico.CCIS.domain.model.*;
import it.dipendentepubico.CCIS.usecase.domain.*;
import it.dipendentepubico.CCIS.usecase.repository.IAdapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.ByteArrayOutputStream;
import java.util.List;

import static it.dipendentepubico.CCIS.domain.Constants.FLUSSO_SDI_REQUEST;
import static it.dipendentepubico.CCIS.domain.Constants.NAMESPACE_URI;

@Service
public class FlussoSdiController extends BaseController{

    private IAdapterRepository repository;

    public FlussoSdiController(@Autowired IAdapterRepository repository) {
        this.repository = repository;
    }

    @Override
    protected String getRequestElement() {
        return FLUSSO_SDI_REQUEST;
    }


    public SearchListResponseServiceBean<FlussoSdi> searchFlussoSdiXml(FatturaElettronicaRequest request) {
        SearchListResponseServiceBean<FlussoSdi> response = new SearchListResponseServiceBean();

        PagingData pagingData = parsePagingData(request);

        ByteArrayOutputStream baos = null;
        try {
            baos = toBaos(request, FatturaElettronicaRequest.class);
            String queryHQL = getQueryHQL(baos);

            List<FlussoSdi> mandatoList = repository.searchFlussi(queryHQL, pagingData);

            response.setResultList(mandatoList);

        } catch (JAXBException e) {
            e.printStackTrace();
        }

        return response;



    }


}
