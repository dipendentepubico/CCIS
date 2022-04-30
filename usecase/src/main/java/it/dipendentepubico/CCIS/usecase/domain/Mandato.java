package it.dipendentepubico.CCIS.usecase.domain;

public class Mandato extends BaseDomain{
    private String codice;
    private String anno;

    public String getCodice() {
        return codice;
    }

    public void setCodice(String codice) {
        this.codice = codice;
    }

    public String getAnno() {
        return anno;
    }

    public void setAnno(String anno) {
        this.anno = anno;
    }
}
