package it.dipendentepubico.CCIS.usecase.domain;

import java.util.Date;

public class FatturaElettronica extends BaseDomain{
    private FlussoSdi flussoSdi;
    private String numero;
    private Date data;

    public FlussoSdi getFlussoSdi() {
        return flussoSdi;
    }

    public void setFlussoSdi(FlussoSdi flussoSdi) {
        this.flussoSdi = flussoSdi;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
