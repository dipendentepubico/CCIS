package it.dipendentepubico.CCIS.usecase.controller;

import it.dipendentepubico.CCIS.domain.model.FatturaElettronicaRequest;
import it.dipendentepubico.CCIS.domain.model.MandatoRequest;
import it.dipendentepubico.CCIS.domain.model.PagingType;
import it.dipendentepubico.CCIS.usecase.domain.Mandato;
import it.dipendentepubico.CCIS.usecase.domain.PagingData;
import it.dipendentepubico.CCIS.usecase.domain.SearchListResponseServiceBean;
import it.dipendentepubico.CCIS.usecase.repository.IAdapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.ByteArrayOutputStream;
import java.util.List;

import static it.dipendentepubico.CCIS.domain.Constants.MANDATO_REQUEST;


@Service
public class MandatoController extends BaseController {


    @Autowired
    private IAdapterRepository repository;



    public SearchListResponseServiceBean<Mandato> searchMandatoXml(MandatoRequest request) {
        SearchListResponseServiceBean<Mandato> response = new SearchListResponseServiceBean();

        PagingData pagingData = parsePagingData(request);

        ByteArrayOutputStream baos = null;
        try {
            baos = toBaos(request, MandatoRequest.class);

            String queryHQL = getQueryHQL(baos);

            List<Mandato> mandatoList = repository.searchMandati(queryHQL, pagingData);
            response.setResultList(mandatoList);


        } catch (JAXBException e) {
            e.printStackTrace();
            // TODO ritornare errore
        }






        return response;
    }



    @Override
    protected String getRequestElement() {
        return MANDATO_REQUEST;
    }
}
