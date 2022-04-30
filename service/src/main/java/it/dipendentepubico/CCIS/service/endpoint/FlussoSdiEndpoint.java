package it.dipendentepubico.CCIS.service.endpoint;

import it.dipendentepubico.CCIS.domain.model.*;
import it.dipendentepubico.CCIS.usecase.controller.FlussoSdiController;
import it.dipendentepubico.CCIS.usecase.domain.FatturaElettronica;
import it.dipendentepubico.CCIS.usecase.domain.FlussoSdi;
import it.dipendentepubico.CCIS.usecase.domain.Mandato;
import it.dipendentepubico.CCIS.usecase.domain.SearchListResponseServiceBean;
import it.gov.agenziaentrate.ivaservizi.fatturaelettronica.FatturaElettronicaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import static it.dipendentepubico.CCIS.domain.Constants.FLUSSO_SDI_REQUEST;
import static it.dipendentepubico.CCIS.domain.Constants.NAMESPACE_URI;

@Endpoint
public class FlussoSdiEndpoint extends BaseEndpoint {

    private FlussoSdiController flussoSdiController;

    @Autowired
    public FlussoSdiEndpoint(FlussoSdiController flussoSdiController) {
        this.flussoSdiController = flussoSdiController;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = FLUSSO_SDI_REQUEST)
    @ResponsePayload
    public FatturaElettronicaResponse searchFatture(@RequestPayload FatturaElettronicaRequest request) {
        FatturaElettronicaResponse response = new FatturaElettronicaResponse();

        SearchListResponseServiceBean<FlussoSdi> searchListResponseServiceBean = flussoSdiController.searchFlussoSdiXml(request);
        response.getFattura().addAll(mapper.mapAsList(searchListResponseServiceBean.getResultList(), FlussoSdiType.class));

        return response;
    }
}
