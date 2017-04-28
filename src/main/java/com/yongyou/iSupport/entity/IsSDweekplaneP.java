package com.yongyou.iSupport.entity;

import java.util.Date;

public class IsSDweekplaneP {
    private Integer pkSDweekplaneP;

    private Integer pkSDweekplaneH;

    private String problem;

    private String needhelp;

    private Date hopefinishtime;

    public Integer getPkSDweekplaneP() {
        return pkSDweekplaneP;
    }

    public void setPkSDweekplaneP(Integer pkSDweekplaneP) {
        this.pkSDweekplaneP = pkSDweekplaneP;
    }

    public Integer getPkSDweekplaneH() {
        return pkSDweekplaneH;
    }

    public void setPkSDweekplaneH(Integer pkSDweekplaneH) {
        this.pkSDweekplaneH = pkSDweekplaneH;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem == null ? null : problem.trim();
    }

    public String getNeedhelp() {
        return needhelp;
    }

    public void setNeedhelp(String needhelp) {
        this.needhelp = needhelp == null ? null : needhelp.trim();
    }

    public Date getHopefinishtime() {
        return hopefinishtime;
    }

    public void setHopefinishtime(Date hopefinishtime) {
        this.hopefinishtime = hopefinishtime;
    }
}