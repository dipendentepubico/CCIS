package it.dipendentepubico.CCIS.usecase.xhmapping;

import java.util.Map;

public class RequestInfo {
    /**
     * nome entity hibernate che mappa la tabella
     */
    private String fromMap;
    /**
     * chiave: xpath da elemento mandato
     * valore: hql fino a colonna di interesse, tipo hql
     */
    private Map<String, MapInfo> pathToInfo;

    public Map<String, MapInfo> getPathToInfo() {
        return pathToInfo;
    }

    public void setPathToInfo(Map<String, MapInfo> pathToInfo) {
        this.pathToInfo = pathToInfo;
    }

    public String getFromMap() {
        return fromMap;
    }

    public void setFromMap(String fromMap) {
        this.fromMap = fromMap;
    }
}
