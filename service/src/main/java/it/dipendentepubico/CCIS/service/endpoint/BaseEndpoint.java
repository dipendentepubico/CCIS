package it.dipendentepubico.CCIS.service.endpoint;

import it.dipendentepubico.CCIS.usecase.mapper.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public abstract class BaseEndpoint {
    @Autowired
    @Qualifier("serviceMapper")
    protected Mapper mapper;
}
