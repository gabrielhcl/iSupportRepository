package com.yongyou.iSupport.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongyou.iSupport.entity.Area;
import com.yongyou.iSupport.entity.User;
import com.yongyou.iSupport.service.AreaService;
import com.yongyou.iSupport.service.UserService;

@Controller
@RequestMapping("menu")
public class MenuController {

	@Autowired
	private AreaService areaService;
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("selectmenu")
	public String selectMenu(Area area, HttpServletRequest request,HttpServletResponse response,Model model){
		String menuid = request.getParameter("menuid");
		User user = new User();
		List<User> ulist = userService.findList(user);
		if(menuid.equals("1")){
			model.addAttribute("iframesrc",request.getContextPath() + "/dweekplane/dweekplanehlist");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("0")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/yonyou-map.jsp");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("2")){
			model.addAttribute("iframesrc",request.getContextPath() + "/mainplan/mainplanlist");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("11")){
			model.addAttribute("iframesrc",request.getContextPath() + "/area/arealist");
			List<Area> alist =  areaService.findList(area);
			model.addAttribute("alist",alist);
			model.addAttribute("ulist",ulist);
			return "index";
//			return "redirect:/area/arealist";
		}else if(menuid.equals("33")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/ueditor.jsp");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("4")){
			model.addAttribute("iframesrc",request.getContextPath() + "/group/grouplist");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("12")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/newsDetail.jsp");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("5")){
			model.addAttribute("iframesrc",request.getContextPath() + "/corp/corplist");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("6")){
			model.addAttribute("iframesrc",request.getContextPath() + "/project/projectlist");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("7")){
			model.addAttribute("iframesrc",request.getContextPath() + "/news/newslist");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("8")){
			model.addAttribute("iframesrc",request.getContextPath() + "/column/columnlist");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("44")){
			model.addAttribute("iframesrc",request.getContextPath() + "/news/newsmain");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("9")){
			model.addAttribute("iframesrc",request.getContextPath() + "/link/linklist");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("10")){
			model.addAttribute("iframesrc",request.getContextPath() + "/link/linkmain");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("55")){
			model.addAttribute("iframesrc",request.getContextPath() + "/shanxi/shanxilist");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("19")){
			model.addAttribute("iframesrc",request.getContextPath() + "/problem/problemlist");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("98")){
			model.addAttribute("iframesrc",request.getContextPath() + "/product/productlist");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("23")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/areaAndProjectEcharts.jsp");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("24")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/pieAreaProject.jsp");
			model.addAttribute("ulist",ulist);
			return "index";
		}else if(menuid.equals("45")){
			model.addAttribute("iframesrc",request.getContextPath() + "/jsp/page/newsPieCount.jsp");
			model.addAttribute("ulist",ulist);
			return "index";
		}
		return menuid;
	}
}
