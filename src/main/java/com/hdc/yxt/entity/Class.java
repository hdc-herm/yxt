package com.hdc.yxt.entity;

import java.util.Date;

public class Class {
    private Integer id;

    private String classname;

    private Integer sortid;

    private String classimpl;

    private Integer watchnum;

    private Long price;

    private Date classtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname == null ? null : classname.trim();
    }

    public Integer getSortid() {
        return sortid;
    }

    public void setSortid(Integer sortid) {
        this.sortid = sortid;
    }

    public String getClassimpl() {
        return classimpl;
    }

    public void setClassimpl(String classimpl) {
        this.classimpl = classimpl == null ? null : classimpl.trim();
    }

    public Integer getWatchnum() {
        return watchnum;
    }

    public void setWatchnum(Integer watchnum) {
        this.watchnum = watchnum;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Date getClasstime() {
        return classtime;
    }

    public void setClasstime(Date classtime) {
        this.classtime = classtime;
    }
}