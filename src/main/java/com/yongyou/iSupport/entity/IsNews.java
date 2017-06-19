package com.yongyou.iSupport.entity;

import java.util.Date;

public class IsNews {
    private Integer pkNews;

    private Integer pkColumn;

    private String newscode;

    private String newstitle;

    private Date newsdate;

    private String createby;

    private String newspicture;

    private String newsremarks;

    private String iscomment;

    private String istop;

    private String sort;

    private String toout;

    private String iscarousel;

    private String carouselimg;

    private String newscontent;
    
    private String itemactive;

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

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort == null ? null : sort.trim();
    }

    public String getToout() {
        return toout;
    }

    public void setToout(String toout) {
        this.toout = toout == null ? null : toout.trim();
    }

    public String getIscarousel() {
        return iscarousel;
    }

    public void setIscarousel(String iscarousel) {
        this.iscarousel = iscarousel == null ? null : iscarousel.trim();
    }

    public String getCarouselimg() {
        return carouselimg;
    }

    public void setCarouselimg(String carouselimg) {
        this.carouselimg = carouselimg == null ? null : carouselimg.trim();
    }

    public String getNewscontent() {
        return newscontent;
    }

    public void setNewscontent(String newscontent) {
        this.newscontent = newscontent == null ? null : newscontent.trim();
    }

	public String getItemactive() {
		return itemactive;
	}

	public void setItemactive(String itemactive) {
		this.itemactive = itemactive;
	}
    
    
}