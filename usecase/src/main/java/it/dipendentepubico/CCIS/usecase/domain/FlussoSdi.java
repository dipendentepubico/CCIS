package it.dipendentepubico.CCIS.usecase.domain;

import java.math.BigInteger;
import java.util.List;

public class FlussoSdi extends BaseDomain {
    private BigInteger identificativoSdi;
    private List<FatturaElettronica> fatturaElettronicaList;

    public BigInteger getIdentificativoSdi() {
        return identificativoSdi;
    }

    public void setIdentificativoSdi(BigInteger identificativoSdi) {
        this.identificativoSdi = identificativoSdi;
    }

    public List<FatturaElettronica> getFatturaElettronicaList() {
        return fatturaElettronicaList;
    }

    public void setFatturaElettronicaList(List<FatturaElettronica> fatturaElettronicaList) {
        this.fatturaElettronicaList = fatturaElettronicaList;
    }
}
