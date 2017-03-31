package com.yongyou.iSupport.controller;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongyou.iSupport.entity.User;
import com.yongyou.iSupport.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	
	
	/*
	 * �û���¼
	 */
	@RequestMapping("login")
	public String login(HttpServletRequest request,HttpServletResponse response,Model model,HttpSession httpsession){
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		user= userService.selectByNameAndPwd(user);
		if(user !=null){
			model.addAttribute("user",user);
			httpsession.setAttribute("user", user);
			model.addAttribute("iframesrc",request.getContextPath() + "/yonyou-map.jsp");
			System.out.println(request.getContextPath() + "/yonyou-map.jsp");
			return "page/index";
		}else{
			String loginfailed = "��½ʧ�ܣ�������û�������";
			model.addAttribute("loginfailed",loginfailed);
			return "page/login";
		}
	}
	
	
	@RequestMapping("regist")
	public String regist(HttpServletRequest request,HttpServletResponse response){
		return "page/userRegistForm";
	}
	/*
	 * �û�ע��
	 */
	@RequestMapping("insertuser")
	public String insertUser(User user,HttpServletRequest request,HttpServletResponse response,Model model){
		userService.insertUser(user);
		return "page/login";
	}
}
