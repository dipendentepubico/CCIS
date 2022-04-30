package it.dipendentepubico.CCIS.usecase.mapper;

import java.util.List;
import java.util.Map;

/**
 * Mapper used to convert domain and use case model classes between themselves.<br/>
 * It can be Dozer or Orika.<br/>
 * Simple types<br/>
 * S    Source Type<br/>
 * D    Destination Type<br/>
 * Maps<br/>
 * SK   Source Key Type<br/>
 * SV   Source Value Type<br/>
 * DK   Destination Key Type<br/>
 * DV   Destination Value Type<br/>
 */
public interface Mapper {
    <S, T> T map(S source, Class<T> destinationClass);
    <S, D> List<D> mapAsList(Iterable<S> sources, Class<D> destinationClass);
    <SK, SV, DK, DV> Map<DK, DV> mapAsMap(Map<SK, SV> sources, Class<DK> destinationKeyClass, Class<DV> destinationValueClass);
}
