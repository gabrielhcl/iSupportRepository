package com.yongyou.iSupport.entity;

import java.util.Date;

public class IsSDweekplaneN {
    private Integer pkSDweekplaneN;

    private Integer pkSDweekplaneH;

    private Date weekplstarttime;

    private Date weekplfinishtime;

    private String nextweektask;

    private String nextpersonliable;

    private Date nextweekstarttime;

    private Date nextweekfinishtime;

    private String nextweekexplain;

    public Integer getPkSDweekplaneN() {
        return pkSDweekplaneN;
    }

    public void setPkSDweekplaneN(Integer pkSDweekplaneN) {
        this.pkSDweekplaneN = pkSDweekplaneN;
    }

    public Integer getPkSDweekplaneH() {
        return pkSDweekplaneH;
    }

    public void setPkSDweekplaneH(Integer pkSDweekplaneH) {
        this.pkSDweekplaneH = pkSDweekplaneH;
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

	public String getNextweekexplain() {
		return nextweekexplain;
	}

	public void setNextweekexplain(String nextweekexplain) {
		this.nextweekexplain = nextweekexplain;
	}
    
}