package com.yongyou.iSupport.entity;

import java.util.Date;

public class IsMainplanB {
    private Integer pkMainplanB;

    private Integer pkMainplanH;

    private String plancode;

    private String planname;

    private Date spstartdate;

    private Date spenddate;

    private String splancycle;

    private String spmnum;

    private String spmdays;

    private String simnum;

    private String simdays;

    private String alldays;

    private String ufrole;

    private String ufmember;

    private String custrole;

    private String servicecontent;

    private String ufdocument;

    private String sremark;

    public Integer getPkMainplanB() {
        return pkMainplanB;
    }

    public void setPkMainplanB(Integer pkMainplanB) {
        this.pkMainplanB = pkMainplanB;
    }

    public Integer getPkMainplanH() {
        return pkMainplanH;
    }

    public void setPkMainplanH(Integer pkMainplanH) {
        this.pkMainplanH = pkMainplanH;
    }

    public String getPlancode() {
        return plancode;
    }

    public void setPlancode(String plancode) {
        this.plancode = plancode == null ? null : plancode.trim();
    }

    public String getPlanname() {
        return planname;
    }

    public void setPlanname(String planname) {
        this.planname = planname == null ? null : planname.trim();
    }

    public Date getSpstartdate() {
        return spstartdate;
    }

    public void setSpstartdate(Date spstartdate) {
        this.spstartdate = spstartdate;
    }

    public Date getSpenddate() {
        return spenddate;
    }

    public void setSpenddate(Date spenddate) {
        this.spenddate = spenddate;
    }

    public String getSplancycle() {
        return splancycle;
    }

    public void setSplancycle(String splancycle) {
        this.splancycle = splancycle == null ? null : splancycle.trim();
    }

    public String getSpmnum() {
        return spmnum;
    }

    public void setSpmnum(String spmnum) {
        this.spmnum = spmnum == null ? null : spmnum.trim();
    }

    public String getSpmdays() {
        return spmdays;
    }

    public void setSpmdays(String spmdays) {
        this.spmdays = spmdays == null ? null : spmdays.trim();
    }

    public String getSimnum() {
        return simnum;
    }

    public void setSimnum(String simnum) {
        this.simnum = simnum == null ? null : simnum.trim();
    }

    public String getSimdays() {
        return simdays;
    }

    public void setSimdays(String simdays) {
        this.simdays = simdays == null ? null : simdays.trim();
    }

    public String getAlldays() {
        return alldays;
    }

    public void setAlldays(String alldays) {
        this.alldays = alldays == null ? null : alldays.trim();
    }

    public String getUfrole() {
        return ufrole;
    }

    public void setUfrole(String ufrole) {
        this.ufrole = ufrole == null ? null : ufrole.trim();
    }

    public String getUfmember() {
        return ufmember;
    }

    public void setUfmember(String ufmember) {
        this.ufmember = ufmember == null ? null : ufmember.trim();
    }

    public String getCustrole() {
        return custrole;
    }

    public void setCustrole(String custrole) {
        this.custrole = custrole == null ? null : custrole.trim();
    }

    public String getServicecontent() {
        return servicecontent;
    }

    public void setServicecontent(String servicecontent) {
        this.servicecontent = servicecontent == null ? null : servicecontent.trim();
    }

    public String getUfdocument() {
        return ufdocument;
    }

    public void setUfdocument(String ufdocument) {
        this.ufdocument = ufdocument == null ? null : ufdocument.trim();
    }

    public String getSremark() {
        return sremark;
    }

    public void setSremark(String sremark) {
        this.sremark = sremark == null ? null : sremark.trim();
    }
}