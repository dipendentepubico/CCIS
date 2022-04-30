package it.dipendentepubico.CCIS.usecase.repository;

import it.dipendentepubico.CCIS.usecase.domain.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Interfaccia di accesso ai dati che deve essere implementata da ogni vendor.
 * Non è corretto che il tag @Transactional sia qui ma nel caso si tratti di accesso a db con JPA sono certo che chi implementa l'adapter del vendor avrà un accesso readonly.
 * @param <M>
 */
@Transactional(readOnly = true)
public interface IAdapterRepository<M extends BaseDomain> {
    List<Mandato> searchMandati(String theQuery, PagingData pagingData);

    List<FlussoSdi> searchFlussi(String queryHQL, PagingData pagingData);


}
