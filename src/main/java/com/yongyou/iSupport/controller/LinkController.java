package com.yongyou.iSupport.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongyou.iSupport.entity.IsLink;
import com.yongyou.iSupport.service.LinkService;

@Controller
@RequestMapping("link")
public class LinkController {

	@Autowired
	private LinkService linkService;
	
	@RequestMapping("linklist")
	public String linkList(HttpServletRequest request,HttpServletResponse response,Model model,IsLink link){
		List<IsLink> llist = linkService.findList(link);
		model.addAttribute("llist",llist);
		return "linkList";
	}
	
	
	@RequestMapping("linkmain")
	public String linkMain(HttpServletRequest request,HttpServletResponse response,Model model,IsLink link){
		List<IsLink> llist = linkService.findList(link);
		model.addAttribute("llist",llist);
		return "linkMain";
	}
	
	@RequestMapping("addlink")
	public String addLink(HttpServletRequest request,HttpServletResponse response,Model model,IsLink link){
		return "linkForm";
	}
	
	@RequestMapping("savelink")
	public String saveLink(HttpServletRequest request,HttpServletResponse response,Model model,IsLink link){
		UUID uuid = UUID.randomUUID();
		String linkcode = uuid.toString().substring(0, 8);
		link.setLinkcode(linkcode);
		linkService.insert(link);
		return "redirect:linklist";
	}
	
	@RequestMapping("delete")
	public String delete(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkLink){
		linkService.deleteByPrimaryKey(pkLink);
		return "redirect:linklist";
	}
	
	@RequestMapping("update")
	public String update(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkLink){
		IsLink link = linkService.selectByPrimaryKey(pkLink);
		model.addAttribute("link",link);
		return "linkUpdateForm";
	}
	
	@RequestMapping("updatelink")
	public String updateLink(HttpServletRequest request,HttpServletResponse response,Model model,IsLink link){
		linkService.updateByPrimaryKey(link);
		return "redirect:linklist";
	}
	
	@RequestMapping("linktest")
	public String linkTest(HttpServletRequest request,HttpServletResponse response,Model model,IsLink link){
		List<IsLink> llist = linkService.findList(link);
		model.addAttribute("llist",llist);
		return "linktest";
	}
}
