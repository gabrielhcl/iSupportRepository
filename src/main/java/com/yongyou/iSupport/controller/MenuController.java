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
			model.addAttribute("iframesrc",request.getContextPath() + "/dweekplanehlist");
			return "index";
		}else if(menuid.equals("0")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/yonyou-map.jsp");
			return "index";
		}else if(menuid.equals("2")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/proImplPlane.jsp");
			return "index";
		}else if(menuid.equals("11")){
			model.addAttribute("iframesrc",request.getContextPath() + "/area/arealist");
			List<Area> alist =  areaService.findList(area);
			model.addAttribute("alist",alist);
			return "index";
//			return "redirect:/area/arealist";
		}else if(menuid.equals("33")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/ueditor.jsp");
			return "index";
		}else if(menuid.equals("4")){
			model.addAttribute("iframesrc",request.getContextPath() + "/group/grouplist");
			return "index";
		}else if(menuid.equals("12")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/newsDetail.jsp");
			return "index";
		}else if(menuid.equals("5")){
			model.addAttribute("iframesrc",request.getContextPath() + "/corp/corplist");
			return "index";
		}else if(menuid.equals("6")){
			model.addAttribute("iframesrc",request.getContextPath() + "/project/projectlist");
			return "index";
		}else if(menuid.equals("7")){
			model.addAttribute("iframesrc",request.getContextPath() + "/news/newslist");
			return "index";
		}else if(menuid.equals("8")){
			model.addAttribute("iframesrc",request.getContextPath() + "/column/columnlist");
			return "index";
		}else if(menuid.equals("44")){
			model.addAttribute("iframesrc",request.getContextPath() + "/news/newsmain");
			return "index";
		}else if(menuid.equals("9")){
			model.addAttribute("iframesrc",request.getContextPath() + "/link/linklist");
			return "index";
		}else if(menuid.equals("10")){
			model.addAttribute("iframesrc",request.getContextPath() + "/link/linkmain");
			return "index";
		}
		return menuid;
	}
}
