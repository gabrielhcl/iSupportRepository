package com.yongyou.iSupport.controller;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.yongyou.iSupport.entity.IsColumn;
import com.yongyou.iSupport.entity.IsComment;
import com.yongyou.iSupport.entity.IsNews;
import com.yongyou.iSupport.entity.User;
import com.yongyou.iSupport.service.ColumnService;
import com.yongyou.iSupport.service.CommentService;
import com.yongyou.iSupport.service.NewsService;
import com.yongyou.iSupport.service.UserService;
import com.yongyou.iSupport.utils.TimeUtil;

@Controller
@RequestMapping("news")
public class NewsController {

	@Autowired
	private NewsService newsService;
	@Autowired
	private ColumnService columnService;
	@Autowired
	private CommentService commentService;
	@Autowired
	private UserService userService;
	
	/*
	 * 跳转信息插入页面
	 */
	@RequestMapping("addnews")
	public String addNews(Model model,HttpServletRequest request,HttpServletResponse response,IsColumn column){
		List<IsColumn> clist = columnService.findList(column);
		model.addAttribute("clist",clist);
		return "ueditor";
	}
	
	/*
	 * 插入信息
	 */
//	@RequestMapping("insertnews")
//	public String insertNews(HttpSession session, HttpServletRequest request,HttpServletResponse response,Model model,IsNews record){
//		newsService.insert(record);
//		System.out.println(record.getNewscontent());
//		return "redirect:newslist";
//	}
	
	@RequestMapping("newslist")
	public String newsList( HttpServletRequest request,HttpServletResponse response,Model model,IsNews record){
		List<IsNews> nlist = newsService.findList(record);
		model.addAttribute("nlist",nlist);
		return "newsList";
	}
	
	@RequestMapping("selectnews")
	public String selectNews(HttpServletRequest request,HttpServletResponse response,Model model,IsNews record){
		List<IsNews> nlist = newsService.findList(record);
		IsColumn column = new IsColumn();
		List<IsColumn> clist = columnService.findListBySort(column);
		model.addAttribute("nlist",nlist);
		model.addAttribute("clist",clist);
		return "newsMain";
	}
	

	@RequestMapping("delete")
	public String delete(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkNews){
		newsService.deleteByPrimaryKey(pkNews);
		return "redirect:newslist";
	}
	
	@RequestMapping("newsdetail")
	public String newsDetail(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkNews,IsComment comment){
		IsNews news = newsService.selectByPrimaryKey(pkNews);
		User user = userService.selectByUserCode(news.getCreateby());
		model.addAttribute("user",user);
		model.addAttribute("news",news);
		List<IsComment> clist = commentService.findList(comment);
		model.addAttribute("clist",clist);
		return "newsDetail";
//		return "pagingTest";
	}
	
	@RequestMapping("update")
	public String newsUpdate(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkNews){
		IsNews news = newsService.selectByPrimaryKey(pkNews);
		model.addAttribute("news",news);
		IsColumn column = new IsColumn();
		List<IsColumn> clist = columnService.findList(column);
		model.addAttribute("clist",clist);
		model.addAttribute("news",news);
		return "newsUpdateForm";
	}
	
	@RequestMapping("savenews")
	public String saveNews(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkNews,IsNews record){
		newsService.updateByPrimaryKey(record);
		System.out.println(record);
		return "redirect:newslist";
	}
	
	
//	@RequestMapping("insertnews")
//	public String insertNews(HttpSession httpSession,IsNews news, HttpServletRequest request, HttpServletResponse response, Model model) {
//		User user =  (User) httpSession.getAttribute("user");
//		news.setCreateby(user.getUsercode());
//		String date = TimeUtil.getNowTime();
//		Date newsdate = TimeUtil.parseDateHms(date);
//		UUID uuid = UUID.randomUUID();
//		String newscode = uuid.toString().substring(0, 8);
//		news.setNewscode(newscode);
//		news.setNewsdate(newsdate);
//		newsService.insertNews(news);
//		System.out.println(news.getIscomment());
//		System.out.println(news.getNewscontent());
//		System.out.println(news.getNewstitle());
//		return "redirect:newslist";
//	}
	
	@RequestMapping("newsmain")
	public String newsMain( HttpServletRequest request,HttpServletResponse response,Model model,IsNews news,IsColumn column){
//		List<IsNews> nlist = newsService.findList(news);
		List<IsNews> nlist = newsService.findListByIstop(news);
		List<IsColumn> clist = columnService.findListBySort(column);
		List<IsNews> carlist = newsService.findImgListOrderDate(news);
		
		List<String> itemactive = new ArrayList<String>();
		for(int i = 0; i<carlist.size(); i++){
		 if(i==0){
			 carlist.get(i).setItemactive("item active");
		 }else{
			 carlist.get(i).setItemactive("item");
		 }
		}
		model.addAttribute("carlist",carlist);
		model.addAttribute("itemactive",itemactive);
		model.addAttribute("nlist",nlist);
		model.addAttribute("clist",clist);
		return "newsMain";
	}
	
	
	@RequestMapping("allnews")
	public String allNews( HttpServletRequest request,HttpServletResponse response,Model model,IsNews news,IsColumn column){
		
		List<IsNews> carlist = newsService.findImgListOrderDate(news);
		List<IsNews> nlist = newsService.findListByIstop(news);
		List<IsColumn> clist = columnService.findListBySort(column);
		
		List<String> itemactive = new ArrayList<String>();
		for(int i = 0; i<carlist.size(); i++){
		 if(i==0){
			 carlist.get(i).setItemactive("item active");
		 }else{
			 carlist.get(i).setItemactive("item");
		 }
		}
		model.addAttribute("itemactive",itemactive);
		model.addAttribute("carlist",carlist);
		model.addAttribute("nlist",nlist);
		model.addAttribute("clist",clist);
		return "newsMain";
	}
	
	@RequestMapping("selectbypkcolumn")
	public String selectByPkColumn( HttpServletRequest request,HttpServletResponse response,IsNews news,Model model,Integer pkColumn){
		
		List<IsNews> carlist = newsService.findImgListOrderDate(news);
		
		List<IsNews> nlist = newsService.selectByPkColumn(pkColumn);
		IsColumn column = new IsColumn();
		List<IsColumn> clist = columnService.findListBySort(column);
		
		List<String> itemactive = new ArrayList<String>();
		for(int i = 0; i<carlist.size(); i++){
		 if(i==0){
			 carlist.get(i).setItemactive("item active");
		 }else{
			 carlist.get(i).setItemactive("item");
		 }
		}
		model.addAttribute("itemactive",itemactive);
		model.addAttribute("carlist",carlist);
		model.addAttribute("nlist",nlist);
		model.addAttribute("clist",clist);
		return "newsMain";
	}
	
	@RequestMapping("innews")
	public String innews(HttpServletRequest request,HttpServletResponse response,Model model,User user,HttpSession newsession){
		String usercnname = user.getUsercnname();
		User newsuser = new User();
		newsuser.setUsercnname(usercnname);
		newsession.setAttribute("newsuser", newsuser);
		return "redirect:newslist";
	}
	
	
	@RequestMapping("insertnews")
	public String insertNews(HttpSession newsession,IsNews news, HttpServletRequest request, HttpServletResponse response, Model model) {
		User user =  (User) newsession.getAttribute("user");
		news.setCreateby(user.getUsercnname());
		String date = TimeUtil.getNowTime();
		Date newsdate = TimeUtil.parseDateHms(date);
		UUID uuid = UUID.randomUUID();
		String newscode = uuid.toString().substring(0, 8);
		news.setNewscode(newscode);
		news.setNewsdate(newsdate);
		newsService.insertNews(news);
		System.out.println(news.getIscomment());
		System.out.println(news.getNewscontent());
		System.out.println(news.getNewstitle());
		return "redirect:newslist";
	}

	/*
	 * 新闻统计信息
	 * 饼状图
	 */
	@RequestMapping("getpiedata")
	@ResponseBody
	public Map<String, Object> getpiedata(HttpServletRequest request,HttpServletResponse response){
		IsColumn column = new IsColumn();
		List<IsColumn> columnlist = columnService.findList(column);
		String[] columnnamelist = new String[columnlist.size()];
		String[] categories = new String[columnlist.size()];
		String[] values = new String[columnlist.size()];
		
		for (int i = 0; i < columnlist.size(); i++) {
			String columnname = columnlist.get(i).getColumnname();
			Integer pk_column = columnlist.get(i).getPkColumn();
			
			int newscount = newsService.selectcountbycolumncode(pk_column);
		    String count = String.valueOf(newscount);
		    
		    values[i]=count;
		    categories[i]=columnname;
		    columnnamelist[i]=columnname;
		}
		
		 Map<String, Object> json = new HashMap<String, Object>();    
	        json.put("categories", categories);    
	        json.put("values", values);    
	        json.put("columnnamelist", columnnamelist);
	        return json;
	}
	
	
	/*
	 * 上传新闻图片
	 */
		@RequestMapping(value = "/upload", method = RequestMethod.POST, produces = "text/html; charset=UTF-8") 
		@ResponseBody
	    public String upload(HttpServletRequest request,@RequestParam(value = "upfile", required = false) MultipartFile upfile) {
	        String path = "F:/iSupportFile/uploadfile/images";  
	        String fileName = upfile.getOriginalFilename();  
	        System.out.println(path);  
	        File targetFile = new File(path, fileName);  
	        if(!targetFile.exists()){  
	            targetFile.mkdirs();  
	        }   try {  
	        	upfile.transferTo(targetFile);
	        } catch (Exception e) {  
	            e.printStackTrace();  
	        }  
	           return fileName;
	    } 
}
