package it.dipendentepubico.CCIS.service.endpoint;

import it.dipendentepubico.CCIS.domain.model.MandatoRequest;
import it.dipendentepubico.CCIS.domain.model.MandatoResponse;
import it.dipendentepubico.CCIS.domain.model.MandatoType;
import it.dipendentepubico.CCIS.usecase.controller.MandatoController;
import it.dipendentepubico.CCIS.usecase.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import static it.dipendentepubico.CCIS.domain.Constants.MANDATO_REQUEST;
import static it.dipendentepubico.CCIS.domain.Constants.NAMESPACE_URI;

@Endpoint
public class MandatoEndpoint extends BaseEndpoint {

    private MandatoController mandatoController;

    @Autowired
    public MandatoEndpoint(MandatoController mandatoController) {
        this.mandatoController = mandatoController;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = MANDATO_REQUEST)
    @ResponsePayload
    public MandatoResponse searchMandati(@RequestPayload MandatoRequest request) {
        MandatoResponse response = new MandatoResponse();

        SearchListResponseServiceBean<Mandato> searchListResponseServiceBean = mandatoController.searchMandatoXml(request);
        response.getMandato().addAll(mapper.mapAsList(searchListResponseServiceBean.getResultList(), MandatoType.class));

        return response;
    }
}
