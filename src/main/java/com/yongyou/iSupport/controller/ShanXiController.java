package com.yongyou.iSupport.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongyou.iSupport.entity.IsBShanxi;
import com.yongyou.iSupport.service.ShanXiService;

@Controller
@RequestMapping("shanxi")
public class ShanXiController {

	@Autowired
	private ShanXiService shanXiService;
	
	
	@RequestMapping("shanxilist")
	public String shanxiList(HttpServletRequest request,HttpServletResponse response,Model model,IsBShanxi record){
		List<IsBShanxi> slist = shanXiService.findList(record);
		model.addAttribute("slist",slist);
		return "ShanXiList";
	}
}
