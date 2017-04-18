package com.yongyou.iSupport.entity;

public class IsBProvince {
    private Integer pkProvince;

    private String procode;

    private String proname;

    private String areaname;

    public Integer getPkProvince() {
        return pkProvince;
    }

    public void setPkProvince(Integer pkProvince) {
        this.pkProvince = pkProvince;
    }

    public String getProcode() {
        return procode;
    }

    public void setProcode(String procode) {
        this.procode = procode == null ? null : procode.trim();
    }

    public String getProname() {
        return proname;
    }

    public void setProname(String proname) {
        this.proname = proname == null ? null : proname.trim();
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname == null ? null : areaname.trim();
    }
}