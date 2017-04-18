package com.yongyou.iSupport.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongyou.iSupport.entity.Area;
import com.yongyou.iSupport.service.AreaService;

@Controller
@RequestMapping("menu")
public class MenuController {

	@Autowired
	private AreaService areaService;
	
	
	@RequestMapping("selectmenu")
	public String selectMenu(Area area, HttpServletRequest request,HttpServletResponse response,Model model){
		String menuid = request.getParameter("menuid");
		if(menuid.equals("1")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/dWeekPlane.jsp");
			return "index";
		}else if(menuid.equals("0")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/yonyou-map.jsp");
			return "index";
		}else if(menuid.equals("2")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/proImplPlane.jsp");
			return "index";
		}else if(menuid.equals("11")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/areaList1.jsp");
			List<Area> alist =  areaService.findList(area);
			model.addAttribute("alist",alist);
			return "index";
//			return "redirect:/area/arealist";
		}else if(menuid.equals("33")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/ueditor.jsp");
			return "index";
		}else if(menuid.equals("4")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/groupList.jsp");
			return "index";
		}else if(menuid.equals("12")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/newsDetail.jsp");
			return "index";
		}else if(menuid.equals("5")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/corpList.jsp");
			return "index";
		}else if(menuid.equals("6")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/projectList.jsp");
			return "index";
		}
		return menuid;
	}
}
