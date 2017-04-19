package com.yongyou.iSupport.entity;

import java.util.Date;

public class IsSDweekplaneN {
    private Integer pkSDweekplaneN;

    private Integer pkSDweekplaneT;

    private Date weekplstarttime;

    private Date weekplfinishtime;

    private String nextweektask;

    private String nextpersonliable;

    private Date nextweekstarttime;

    private Date nextweekfinishtime;

    private String explain;

    public Integer getPkSDweekplaneN() {
        return pkSDweekplaneN;
    }

    public void setPkSDweekplaneN(Integer pkSDweekplaneN) {
        this.pkSDweekplaneN = pkSDweekplaneN;
    }

    public Integer getPkSDweekplaneT() {
        return pkSDweekplaneT;
    }

    public void setPkSDweekplaneT(Integer pkSDweekplaneT) {
        this.pkSDweekplaneT = pkSDweekplaneT;
    }

    public Date getWeekplstarttime() {
        return weekplstarttime;
    }

    public void setWeekplstarttime(Date weekplstarttime) {
        this.weekplstarttime = weekplstarttime;
    }

    public Date getWeekplfinishtime() {
        return weekplfinishtime;
    }

    public void setWeekplfinishtime(Date weekplfinishtime) {
        this.weekplfinishtime = weekplfinishtime;
    }

    public String getNextweektask() {
        return nextweektask;
    }

    public void setNextweektask(String nextweektask) {
        this.nextweektask = nextweektask == null ? null : nextweektask.trim();
    }

    public String getNextpersonliable() {
        return nextpersonliable;
    }

    public void setNextpersonliable(String nextpersonliable) {
        this.nextpersonliable = nextpersonliable == null ? null : nextpersonliable.trim();
    }

    public Date getNextweekstarttime() {
        return nextweekstarttime;
    }

    public void setNextweekstarttime(Date nextweekstarttime) {
        this.nextweekstarttime = nextweekstarttime;
    }

    public Date getNextweekfinishtime() {
        return nextweekfinishtime;
    }

    public void setNextweekfinishtime(Date nextweekfinishtime) {
        this.nextweekfinishtime = nextweekfinishtime;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }
}