package com.hdc.yxt.entity;

public class Sections extends SectionsKey {
    private String sectionsimpl;

    public String getSectionsimpl() {
        return sectionsimpl;
    }

    public void setSectionsimpl(String sectionsimpl) {
        this.sectionsimpl = sectionsimpl == null ? null : sectionsimpl.trim();
    }
}