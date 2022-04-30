package it.dipendentepubico.CCIS.usecase.xhmapping;

import java.util.Map;

public class Xml2HQLMapping {

    public Xml2HQLMapping() {
    }

    /**
     * <request_tag>, RequestInfo
     */
    private Map<String, RequestInfo> requestMap;


    public Map<String, RequestInfo> getRequestMap() {
        return requestMap;
    }

    public void setRequestMap(Map<String, RequestInfo> requestMap) {
        this.requestMap = requestMap;
    }
}
