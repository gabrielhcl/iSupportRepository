package com.yongyou.iSupport.service.impl;


import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yongyou.iSupport.dao.IsCommentDao;
import com.yongyou.iSupport.entity.IsComment;
import com.yongyou.iSupport.entity.User;
import com.yongyou.iSupport.service.CommentService;
import com.yongyou.iSupport.utils.TimeUtil;

@Service("commentService")
public class CommentServiceImpl implements CommentService {

	@Autowired
	private IsCommentDao isCommentDao;
	
	@Override
	public int insert(IsComment record) {
		// TODO Auto-generated method stub
		return this.isCommentDao.insert(record);
	}
	
	@Override
	public IsComment saveComment(String newstitle,HttpSession httpsession,IsComment comment,Integer pkNews,HttpServletRequest request,HttpServletResponse response){
		User user = (User) httpsession.getAttribute("user");
		comment.setPkNews(pkNews);
		comment.setNewstitle(newstitle);
		comment.setUsercode(user.getUsercode());
		comment.setUsername(user.getUsercnname());
		comment.setCreatedate(TimeUtil.parseDateHms(TimeUtil.getNowTime()));
		UUID uuid = UUID.randomUUID();
		String commentcode = uuid.toString().substring(0, 8);
		comment.setCommentcode(commentcode);
		isCommentDao.insert(comment);
		return comment;
	}

	@Override
	public List<IsComment> findList(IsComment comment){
		return this.isCommentDao.findList(comment);
	}
	
	@Override
	public List<IsComment> selectByPkNews(Integer pkNews){
		return this.isCommentDao.selectByPkNews(pkNews);
	}
}
