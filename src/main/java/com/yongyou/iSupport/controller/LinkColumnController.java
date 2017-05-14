package com.yongyou.iSupport.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongyou.iSupport.entity.IsLinkcolumn;
import com.yongyou.iSupport.service.LinkColumnService;

@RequestMapping("linkcolumn")
@Controller
public class LinkColumnController {

	@Autowired
	private LinkColumnService  linkColumnService;
	
	@RequestMapping("addlinkcolumn")
	public String addLinkColumn(HttpServletRequest request,HttpServletResponse response){
		return "LinkColumnForm";
	}
	
	@RequestMapping("savelinkcolumn")
	public String savelinkcolumn(HttpServletRequest request,HttpServletResponse response,Model model,IsLinkcolumn record){
		linkColumnService.insert(record);
		return "redirect:linkcolumnlist";
	}
	
	@RequestMapping("linkcolumnlist")
	public String linkColumnList(HttpServletRequest request,HttpServletResponse response,Model model,IsLinkcolumn record){
		List<IsLinkcolumn> lclist = linkColumnService.findList(record);
		model.addAttribute("lclist",lclist);
		return "LinkColumnList";
	}
	
	@RequestMapping("deletelinkcolumn")
	public String deleteLinkColumn(HttpServletRequest request,HttpServletResponse response,Model model,IsLinkcolumn record,Integer pkColumn){
		linkColumnService.deleteByPrimaryKey(pkColumn);
		return "redirect:linkcolumnlist";
	}
	
	
	@RequestMapping("toupdate")
	public String toUpdate(HttpServletRequest request,HttpServletResponse response,Model model,IsLinkcolumn record,Integer pkColumn){
		IsLinkcolumn linkcolumn = linkColumnService.selectByPrimaryKey(pkColumn);
		model.addAttribute("linkcolumn",linkcolumn);
		return "UpdateLinkColumn";
	}
	
	
	@RequestMapping("saveupdate")
	public String saveUpdate(HttpServletRequest request,HttpServletResponse response,Model model,IsLinkcolumn record,Integer pkColumn){
		linkColumnService.updateByPrimaryKey(record);
		return "redirect:linkcolumnlist";
	}
}
