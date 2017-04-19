package com.yongyou.iSupport.entity;

import java.util.Date;

public class IsSDweekplaneT {
    private Integer pkSDweekplaneT;

    private Integer pkSDweekplaneH;

    private Date weekstartdate;

    private Date weekfinishdate;

    private String weekworktask;

    private String weekpersonliable;

    private Date weekworkstarttime;

    private Date weekworkfinishtime;

    private String weekworkexplain;

    public Integer getPkSDweekplaneT() {
        return pkSDweekplaneT;
    }

    public void setPkSDweekplaneT(Integer pkSDweekplaneT) {
        this.pkSDweekplaneT = pkSDweekplaneT;
    }

    public Integer getPkSDweekplaneH() {
        return pkSDweekplaneH;
    }

    public void setPkSDweekplaneH(Integer pkSDweekplaneH) {
        this.pkSDweekplaneH = pkSDweekplaneH;
    }

    public Date getWeekstartdate() {
        return weekstartdate;
    }

    public void setWeekstartdate(Date weekstartdate) {
        this.weekstartdate = weekstartdate;
    }

    public Date getWeekfinishdate() {
        return weekfinishdate;
    }

    public void setWeekfinishdate(Date weekfinishdate) {
        this.weekfinishdate = weekfinishdate;
    }

    public String getWeekworktask() {
        return weekworktask;
    }

    public void setWeekworktask(String weekworktask) {
        this.weekworktask = weekworktask == null ? null : weekworktask.trim();
    }

    public String getWeekpersonliable() {
        return weekpersonliable;
    }

    public void setWeekpersonliable(String weekpersonliable) {
        this.weekpersonliable = weekpersonliable == null ? null : weekpersonliable.trim();
    }

    public Date getWeekworkstarttime() {
        return weekworkstarttime;
    }

    public void setWeekworkstarttime(Date weekworkstarttime) {
        this.weekworkstarttime = weekworkstarttime;
    }

    public Date getWeekworkfinishtime() {
        return weekworkfinishtime;
    }

    public void setWeekworkfinishtime(Date weekworkfinishtime) {
        this.weekworkfinishtime = weekworkfinishtime;
    }

    public String getWeekworkexplain() {
        return weekworkexplain;
    }

    public void setWeekworkexplain(String weekworkexplain) {
        this.weekworkexplain = weekworkexplain == null ? null : weekworkexplain.trim();
    }
}