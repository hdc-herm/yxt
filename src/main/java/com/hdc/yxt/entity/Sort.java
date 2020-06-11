package com.hdc.yxt.entity;

public class Sort {
    private Integer id;

    private Integer directionid;

    private String sortimpl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getDirectionid() {
        return directionid;
    }

    public void setDirectionid(Integer directionid) {
        this.directionid = directionid;
    }

    public String getSortimpl() {
        return sortimpl;
    }

    public void setSortimpl(String sortimpl) {
        this.sortimpl = sortimpl == null ? null : sortimpl.trim();
    }
}