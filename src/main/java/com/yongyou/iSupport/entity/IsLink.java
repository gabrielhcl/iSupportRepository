package com.yongyou.iSupport.entity;

public class IsLink {
    private Integer pkLink;

    private Integer pkColumn;

    private String linkcode;

    private String linkname;

    private String linkurl;

    public Integer getPkLink() {
        return pkLink;
    }

    public void setPkLink(Integer pkLink) {
        this.pkLink = pkLink;
    }

    public Integer getPkColumn() {
        return pkColumn;
    }

    public void setPkColumn(Integer pkColumn) {
        this.pkColumn = pkColumn;
    }

    public String getLinkcode() {
        return linkcode;
    }

    public void setLinkcode(String linkcode) {
        this.linkcode = linkcode == null ? null : linkcode.trim();
    }

    public String getLinkname() {
        return linkname;
    }

    public void setLinkname(String linkname) {
        this.linkname = linkname == null ? null : linkname.trim();
    }

    public String getLinkurl() {
        return linkurl;
    }

    public void setLinkurl(String linkurl) {
        this.linkurl = linkurl == null ? null : linkurl.trim();
    }
}