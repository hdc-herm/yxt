package com.hdc.yxt.entity;

public class Chapters extends ChaptersKey {
    private String chaptersimpl;

    public String getChaptersimpl() {
        return chaptersimpl;
    }

    public void setChaptersimpl(String chaptersimpl) {
        this.chaptersimpl = chaptersimpl == null ? null : chaptersimpl.trim();
    }
}