package com.yongyou.iSupport.entity;

import java.util.Date;

public class IsNews {
    private Integer pkNews;

    private Integer pkColumn;

    private String newscode;

    private String newstitle;

    private Date newsdate;

    private String createby;

    private String newscontent;

    private String newspicture;

    private String newsremarks;

    private String iscomment;

    private String istop;

    public Integer getPkNews() {
        return pkNews;
    }

    public void setPkNews(Integer pkNews) {
        this.pkNews = pkNews;
    }

    public Integer getPkColumn() {
        return pkColumn;
    }

    public void setPkColumn(Integer pkColumn) {
        this.pkColumn = pkColumn;
    }

    public String getNewscode() {
        return newscode;
    }

    public void setNewscode(String newscode) {
        this.newscode = newscode == null ? null : newscode.trim();
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public Date getNewsdate() {
        return newsdate;
    }

    public void setNewsdate(Date newsdate) {
        this.newsdate = newsdate;
    }

    public String getCreateby() {
        return createby;
    }

    public void setCreateby(String createby) {
        this.createby = createby == null ? null : createby.trim();
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent == null ? null : newscontent.trim();
    }

    public String getNewspicture() {
        return newspicture;
    }

    public void setNewspicture(String newspicture) {
        this.newspicture = newspicture == null ? null : newspicture.trim();
    }

    public String getNewsremarks() {
        return newsremarks;
    }

    public void setNewsremarks(String newsremarks) {
        this.newsremarks = newsremarks == null ? null : newsremarks.trim();
    }

    public String getIscomment() {
        return iscomment;
    }

    public void setIscomment(String iscomment) {
        this.iscomment = iscomment == null ? null : iscomment.trim();
    }

    public String getIstop() {
        return istop;
    }

    public void setIstop(String istop) {
        this.istop = istop == null ? null : istop.trim();
    }
}