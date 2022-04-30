package it.dipendentepubico.CCIS.usecase.mapper;


import org.springframework.core.convert.ConversionService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapperImpl implements Mapper {
    private ConversionService conversionService;

    public MapperImpl(ConversionService conversionService) {
        this.conversionService = conversionService;
    }

    @Override
    public <S, T> T map(S source, Class<T> destinationClass) {
        return conversionService.convert(source, destinationClass);
    }


    /**
     * Maps {@code sources} list to a list of {@code destinationClass}
     * @param sources               source list of objects
     * @param destinationClass      data type of inner destination object
     * @param <T>                   class of data type of inner destination object
     * @return                      list containing object of destination type
     */
    @Override
    public <S, T> List<T> mapAsList(Iterable<S> sources, Class<T> destinationClass) {
        //can add validation methods to check if the object is iterable
        ArrayList<T> targets = new ArrayList<>();
        for (Object source : sources) {
            targets.add(conversionService.convert(source, destinationClass));
        }
        return targets;
    }

    /**
     * Maps {@code sources} map to a map of {@code destinationKeyClass} key and value of type {@code destinationValueClass}
     * @param sources                   source map of objects
     * @param destinationKeyClass       data type of key of the destination map
     * @param destinationValueClass     data type of value of the destination map
     * @param <DK>                       class of data type of key destination object
     * @param <DV>                       class of data type of value destination object
     * @return                          map containing object of destinations types
     */
    @Override
    public <SK, SV, DK, DV> Map<DK, DV> mapAsMap(Map<SK, SV> sources, Class<DK> destinationKeyClass, Class<DV> destinationValueClass){
        HashMap<DK, DV> targets = new HashMap<>();
        for(Map.Entry<?,?> entry : sources.entrySet()){
            targets.put(conversionService.convert(entry.getKey(), destinationKeyClass), conversionService.convert(entry.getValue(), destinationValueClass));
        }
        return targets;
    }

}
