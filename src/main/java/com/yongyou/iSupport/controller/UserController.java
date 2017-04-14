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
	 * 登录功能
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
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/yonyou-map.jsp");
			System.out.println(request.getContextPath() + "/yonyou-map.jsp");
			return "index";
		}else{
			String loginfailed = "登陆失败，请重新输入用户名与密码";
			model.addAttribute("loginfailed",loginfailed);
			return "login";
		}
	}
	
	/*
	 * 点击注册跳转注册功能
	 */
	@RequestMapping("regist")
	public String regist(HttpServletRequest request,HttpServletResponse response){
		return " userRegistForm";
	}
	/*
	 * 注册完成返回登录页
	 */
	@RequestMapping("insertuser")
	public String insertUser(User user,HttpServletRequest request,HttpServletResponse response,Model model){
		userService.insertUser(user);
		return "login";
	}
}
