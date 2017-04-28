package com.yongyou.iSupport.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.yongyou.iSupport.entity.IsComment;

public interface CommentService {
	
	int insert(IsComment record);
	
	public IsComment saveComment(String newstitle,HttpSession httpsession,IsComment comment,Integer pkNews,HttpServletRequest request,HttpServletResponse response);

	public List<IsComment> findList(IsComment comment);
	
	List<IsComment> selectByPkNews(Integer pkNews);
}
