package com.hdc.yxt.entity;

public class Buissness {
    private Integer id;

    private Integer classid;

    private Integer sortid;

    private Integer directionid;

    private String buissnessimpl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getClassid() {
        return classid;
    }

    public void setClassid(Integer classid) {
        this.classid = classid;
    }

    public Integer getSortid() {
        return sortid;
    }

    public void setSortid(Integer sortid) {
        this.sortid = sortid;
    }

    public Integer getDirectionid() {
        return directionid;
    }

    public void setDirectionid(Integer directionid) {
        this.directionid = directionid;
    }

    public String getBuissnessimpl() {
        return buissnessimpl;
    }

    public void setBuissnessimpl(String buissnessimpl) {
        this.buissnessimpl = buissnessimpl == null ? null : buissnessimpl.trim();
    }
}