package com.yongyou.iSupport.entity;

import java.util.Date;

public class IsMainplanH {
    private Integer pkMainplanH;

    private String mainplancode;

    private String mainplanname;

    private String projectname;

    private String compiler;

    private Date compiledate;

    private Date pstartdate;

    private Date penddate;

    private String plancycle;

    private String sumdaytime;

    private String pmnum;

    private String pmdays;

    private String imnum;

    private String imdays;

    public Integer getPkMainplanH() {
        return pkMainplanH;
    }

    public void setPkMainplanH(Integer pkMainplanH) {
        this.pkMainplanH = pkMainplanH;
    }

    public String getMainplancode() {
        return mainplancode;
    }

    public void setMainplancode(String mainplancode) {
        this.mainplancode = mainplancode == null ? null : mainplancode.trim();
    }

    public String getMainplanname() {
        return mainplanname;
    }

    public void setMainplanname(String mainplanname) {
        this.mainplanname = mainplanname == null ? null : mainplanname.trim();
    }

    public String getProjectname() {
        return projectname;
    }

    public void setProjectname(String projectname) {
        this.projectname = projectname == null ? null : projectname.trim();
    }

    public String getCompiler() {
        return compiler;
    }

    public void setCompiler(String compiler) {
        this.compiler = compiler == null ? null : compiler.trim();
    }

    public Date getCompiledate() {
        return compiledate;
    }

    public void setCompiledate(Date compiledate) {
        this.compiledate = compiledate;
    }

    public Date getPstartdate() {
        return pstartdate;
    }

    public void setPstartdate(Date pstartdate) {
        this.pstartdate = pstartdate;
    }

    public Date getPenddate() {
        return penddate;
    }

    public void setPenddate(Date penddate) {
        this.penddate = penddate;
    }

    public String getPlancycle() {
        return plancycle;
    }

    public void setPlancycle(String plancycle) {
        this.plancycle = plancycle == null ? null : plancycle.trim();
    }

    public String getSumdaytime() {
        return sumdaytime;
    }

    public void setSumdaytime(String sumdaytime) {
        this.sumdaytime = sumdaytime == null ? null : sumdaytime.trim();
    }

    public String getPmnum() {
        return pmnum;
    }

    public void setPmnum(String pmnum) {
        this.pmnum = pmnum == null ? null : pmnum.trim();
    }

    public String getPmdays() {
        return pmdays;
    }

    public void setPmdays(String pmdays) {
        this.pmdays = pmdays == null ? null : pmdays.trim();
    }

    public String getImnum() {
        return imnum;
    }

    public void setImnum(String imnum) {
        this.imnum = imnum == null ? null : imnum.trim();
    }

    public String getImdays() {
        return imdays;
    }

    public void setImdays(String imdays) {
        this.imdays = imdays == null ? null : imdays.trim();
    }
}