package it.dipendentepubico.CCIS.usecase.domain;

import java.util.List;

public class SearchListResponseServiceBean<T extends BaseDomain> {
    private List<T> resultList;

    public List<T> getResultList() {
        return resultList;
    }

    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }
}
