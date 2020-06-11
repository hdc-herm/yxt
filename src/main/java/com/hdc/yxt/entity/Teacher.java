package com.hdc.yxt.entity;

public class Teacher {
    private Integer id;

    private String teachername;

    private String expertise;

    private String expindustry;

    private String addressall;

    private Integer agreenum;

    private Integer comscore;

    private Integer teacherleaval;

    private String teacherimpl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername == null ? null : teachername.trim();
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise == null ? null : expertise.trim();
    }

    public String getExpindustry() {
        return expindustry;
    }

    public void setExpindustry(String expindustry) {
        this.expindustry = expindustry == null ? null : expindustry.trim();
    }

    public String getAddressall() {
        return addressall;
    }

    public void setAddressall(String addressall) {
        this.addressall = addressall == null ? null : addressall.trim();
    }

    public Integer getAgreenum() {
        return agreenum;
    }

    public void setAgreenum(Integer agreenum) {
        this.agreenum = agreenum;
    }

    public Integer getComscore() {
        return comscore;
    }

    public void setComscore(Integer comscore) {
        this.comscore = comscore;
    }

    public Integer getTeacherleaval() {
        return teacherleaval;
    }

    public void setTeacherleaval(Integer teacherleaval) {
        this.teacherleaval = teacherleaval;
    }

    public String getTeacherimpl() {
        return teacherimpl;
    }

    public void setTeacherimpl(String teacherimpl) {
        this.teacherimpl = teacherimpl == null ? null : teacherimpl.trim();
    }
}