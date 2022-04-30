package it.dipendentepubico.CCIS.service.converter;


import it.dipendentepubico.CCIS.domain.model.MandatoType;
import it.dipendentepubico.CCIS.service.spring.MapperSpringConfig;
import it.dipendentepubico.CCIS.usecase.domain.Mandato;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.core.convert.converter.Converter;

@Mapper( config = MapperSpringConfig.class)
public interface Mandato2MandatoType extends Converter<Mandato, MandatoType> {
    @Mapping(source = "codice", target = "codice.value")
    @Mapping(source = "anno", target = "anno.value" )
    MandatoType convert(Mandato s);
}
