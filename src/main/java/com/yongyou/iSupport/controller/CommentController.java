package com.yongyou.iSupport.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongyou.iSupport.entity.IsComment;
import com.yongyou.iSupport.entity.IsNews;
import com.yongyou.iSupport.service.CommentService;
import com.yongyou.iSupport.service.NewsService;

@Controller
@RequestMapping("comment")
public class CommentController {

	@Autowired
	private CommentService commentService;
	@Autowired
	private NewsService newsService;
	
	@RequestMapping("savecomment")
	public String saveComment(IsComment comment,HttpSession httpsession,HttpServletRequest request,HttpServletResponse response,Model model,Integer pkNews,String newstitle) throws UnsupportedEncodingException{
		commentService.saveComment(newstitle, httpsession, comment, pkNews, request, response);
		String url  = "pkNews="+pkNews+"&newstitle="+newstitle;
		System.out.println(url);
		newstitle = new String(newstitle.getBytes("ISO-8859-1"),"UTF-8");
		newstitle=java.net.URLDecoder.decode(newstitle, "UTF-8");
		return "redirect:newsdetail?pkNews="+pkNews;
	}
	
	
	
	@RequestMapping("newsdetail")
	public String newsDetail(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkNews){
		List<IsComment> clist = commentService.selectByPkNews(pkNews);
		IsNews news = newsService.selectByPrimaryKey(pkNews);
		model.addAttribute("news",news);
//		List<IsComment> clist = commentService.findList(comment);
		model.addAttribute("clist",clist);
		return "newsDetail";
	}
}
