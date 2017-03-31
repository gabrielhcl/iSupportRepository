package com.yongyou.iSupport.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("menu")
public class MenuController {

	/*
	 * 根据menuid向iframe内容区返回不同的页面
	 */
	@RequestMapping("selectmenu")
	public String selectMenu(HttpServletRequest request,HttpServletResponse response,Model model){
		String menuid = request.getParameter("menuid");
		if(menuid.equals("1")){
			model.addAttribute("iframesrc",request.getContextPath() + "/dWeekPlane.jsp");
			return "page/index";
		}else if(menuid.equals("0")){
			model.addAttribute("iframesrc",request.getContextPath() + "/yonyou-map.jsp");
			return "page/index";
		}else if(menuid.equals("2")){
			model.addAttribute("iframesrc",request.getContextPath() + "/proImplPlane.jsp");
			return "page/index";
		}
		return menuid;
	}
}
