package com.yongyou.iSupport.entity;

import java.util.Date;

public class IsComment {
    private Integer pkComment;

    private Integer pkNews;

    private String newstitle;

    private String commentcode;

    private String content;

    private String usercode;

    private String username;

    private Date createdate;

    public Integer getPkComment() {
        return pkComment;
    }

    public void setPkComment(Integer pkComment) {
        this.pkComment = pkComment;
    }

    public Integer getPkNews() {
        return pkNews;
    }

    public void setPkNews(Integer pkNews) {
        this.pkNews = pkNews;
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public String getCommentcode() {
        return commentcode;
    }

    public void setCommentcode(String commentcode) {
        this.commentcode = commentcode == null ? null : commentcode.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getUsercode() {
        return usercode;
    }

    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}