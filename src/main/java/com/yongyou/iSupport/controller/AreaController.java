package com.yongyou.iSupport.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import com.yongyou.iSupport.entity.Area;
import com.yongyou.iSupport.service.AreaService;

@Controller
@RequestMapping("/area")
public class AreaController {

	@Autowired
	private AreaService areaService;
	
	
	@RequestMapping("addarea")
	public String addArea(Area area, HttpServletRequest request, HttpServletResponse response,Model model){
		return "areaForm";
	}
	
	
	@RequestMapping("insertarea")
	public String insertArea(Area area, HttpServletRequest request, HttpServletResponse response,Model model){
		
		areaService.insertArea(area);
		System.out.println(area);
		return "redirect:/area/arealist";
	}
	
	@RequestMapping("arealist")
	public String areaList(Area area, HttpServletRequest request, HttpServletResponse response,Model model){
		List<Area> arealist = areaService.findList(area);
		String areacode = arealist.get(0).toString();
		System.out.println(areacode);
		model.addAttribute("alist", arealist);
		return "areaList1";
	}
	
	@RequestMapping("delete")
	public String deleteArea(Integer pk_area, Area area, HttpServletRequest request, HttpServletResponse response,Model model){
		areaService.deleteByPrimaryKey(pk_area);
		return "redirect:/area/arealist";
	}
	
	
	@RequestMapping("update")
	public String updateArea(Integer pk_area,HttpServletRequest request, HttpServletResponse response,Model model){
		Area area =  areaService.selectByPrimaryKey(pk_area);
		model.addAttribute("area",area);
		return "updateAreaForm";
	}
	
	@RequestMapping("savearea")
	public String saveArea(Integer pk_area,Area area ,HttpServletRequest request, HttpServletResponse response,Model model){
		areaService.updateByPrimaryKey(area);
		return "redirect:/area/arealist";
	}
}
