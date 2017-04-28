package com.yongyou.iSupport.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongyou.iSupport.entity.IsBCorp;
import com.yongyou.iSupport.service.CorpService;

@Controller
@RequestMapping("corp")
public class CorpController {

	@Autowired
	private CorpService corpService;
	
	@RequestMapping("addcorp")
	public String addCorp(Model model,IsBCorp record,HttpServletRequest request,HttpServletResponse response){
		return "corpForm";
	}
	
	
	@RequestMapping("insertcorp")
	public String insertCorp(Model model,IsBCorp record,HttpServletRequest request,HttpServletResponse response){
		corpService.insert(record);
		return "redirect:/corp/corplist";
	}
	
	
	@RequestMapping("corplist")
	public String corpList(IsBCorp record, HttpServletRequest request, HttpServletResponse response,Model model){
		List<IsBCorp> corplist = corpService.findList(record);
		model.addAttribute("clist", corplist);
		return "corpList";
	}
	
	@RequestMapping("delete")
	public String deleteCorp(Integer pk_corp, IsBCorp record, HttpServletRequest request, HttpServletResponse response,Model model){
		corpService.deleteByPrimaryKey(pk_corp);
		return "redirect:/corp/corplist";
	}
	
	
	@RequestMapping("update")
	public String updateCorp(Integer pk_corp,HttpServletRequest request, HttpServletResponse response,Model model){
		IsBCorp corp =  corpService.selectByPrimaryKey(pk_corp);
		model.addAttribute("corp",corp);
		return "updateCorpForm";
	}
	
	@RequestMapping("savecorp")
	public String saveCorp(Integer pk_corp,IsBCorp record,HttpServletRequest request, HttpServletResponse response,Model model){
		corpService.updateByPrimaryKey(record);
		return "redirect:/corp/corplist";
	}
	
}
