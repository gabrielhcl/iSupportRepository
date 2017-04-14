package com.yongyou.iSupport.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("mapController")
@Controller
public class MapController {

	@RequestMapping("vectorMap")
	public String vectormap(HttpServletRequest request,HttpServletResponse response,Model model){
		String jsp = "map-vector.jsp";
		model.addAttribute("map-vector.jsp",request.getContextPath()+"/"+jsp);
		System.out.println(request.getContextPath()+jsp);
		return "index";
	}
}
