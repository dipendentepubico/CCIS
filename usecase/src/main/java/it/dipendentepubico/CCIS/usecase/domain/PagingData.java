package it.dipendentepubico.CCIS.usecase.domain;

public class PagingData {
    public final static int MAX_PAGE_SIZE = 50;
    private Integer offset;
    private Integer pageSize;

    public PagingData(Integer offset, Integer pageSize) {
        offset = offset != null ? offset : 0;
        pageSize = pageSize != null ? pageSize : MAX_PAGE_SIZE;
        this.offset = offset;
        this.pageSize = pageSize;
    }

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
