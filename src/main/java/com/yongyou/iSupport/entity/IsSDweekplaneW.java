package com.yongyou.iSupport.entity;

public class IsSDweekplaneW {
    private Integer pkSDweekplaneW;

    private Integer pkSDweekplaneH;

    private String notfinishtask;

    private String personliable;

    private String notfinishreason;

    private String concretemeasure;

    public Integer getPkSDweekplaneW() {
        return pkSDweekplaneW;
    }

    public void setPkSDweekplaneW(Integer pkSDweekplaneW) {
        this.pkSDweekplaneW = pkSDweekplaneW;
    }

    public Integer getPkSDweekplaneH() {
        return pkSDweekplaneH;
    }

    public void setPkSDweekplaneH(Integer pkSDweekplaneH) {
        this.pkSDweekplaneH = pkSDweekplaneH;
    }

    public String getNotfinishtask() {
        return notfinishtask;
    }

    public void setNotfinishtask(String notfinishtask) {
        this.notfinishtask = notfinishtask == null ? null : notfinishtask.trim();
    }

    public String getPersonliable() {
        return personliable;
    }

    public void setPersonliable(String personliable) {
        this.personliable = personliable == null ? null : personliable.trim();
    }

    public String getNotfinishreason() {
        return notfinishreason;
    }

    public void setNotfinishreason(String notfinishreason) {
        this.notfinishreason = notfinishreason == null ? null : notfinishreason.trim();
    }

    public String getConcretemeasure() {
        return concretemeasure;
    }

    public void setConcretemeasure(String concretemeasure) {
        this.concretemeasure = concretemeasure == null ? null : concretemeasure.trim();
    }
}