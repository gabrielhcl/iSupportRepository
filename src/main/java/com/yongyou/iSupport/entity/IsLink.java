package com.yongyou.iSupport.entity;

import java.util.Date;

public class IsLink {
    private Integer pkLink;

    private Integer pkColumn;

    private String linkcode;

    private String linkname;

    private String linkurl;

    private String createby;

    private Date createdate;

    private String remark;

    private String columnname;

    private String iseffective;

    private String sort;

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

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getColumnname() {
        return columnname;
    }

    public void setColumnname(String columnname) {
        this.columnname = columnname == null ? null : columnname.trim();
    }

    public String getIseffective() {
        return iseffective;
    }

    public void setIseffective(String iseffective) {
        this.iseffective = iseffective == null ? null : iseffective.trim();
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }
}