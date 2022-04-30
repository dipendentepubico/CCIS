package it.dipendentepubico.CCIS.service.spring;

import it.dipendentepubico.CCIS.usecase.mapper.MapperImpl;
import it.dipendentepubico.CCIS.usecase.mapper.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;

@Configuration("serviceMapperConfiguration")
public class MapperConfiguration {
    @Bean(name = "serviceMapper")
    public Mapper mapper(@Qualifier("serviceConversionService") ConversionService conversionService){
        MapperImpl mapperImpl = new MapperImpl(conversionService);
        return mapperImpl;
    }
}
