package it.dipendentepubico.CCIS.service.spring;

import it.dipendentepubico.CCIS.service.converter.ServiceConversionServiceAdapter;
import org.mapstruct.MapperConfig;
import org.mapstruct.extensions.spring.SpringMapperConfig;

@MapperConfig(componentModel = "spring", uses = ServiceConversionServiceAdapter.class)
@SpringMapperConfig(conversionServiceAdapterPackage ="it.dipendentepubico.CCIS.service.converter",
           conversionServiceAdapterClassName ="ServiceConversionServiceAdapter"
)
public interface MapperSpringConfig {
}
