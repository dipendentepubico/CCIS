package it.dipendentepubico.CCIS.usecase.xhmapping;

public class MapInfo {
    private String hname;
    private String htype;

    public MapInfo(){}

    public MapInfo(String hname, String htype) {
        this.hname = hname;
        this.htype = htype;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }

    public String getHtype() {
        return htype;
    }

    public void setHtype(String htype) {
        this.htype = htype;
    }
}
