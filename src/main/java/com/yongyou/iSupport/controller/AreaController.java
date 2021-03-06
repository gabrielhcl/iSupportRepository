package com.yongyou.iSupport.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

import com.yongyou.iSupport.entity.Area;
import com.yongyou.iSupport.form.AreaForm;
import com.yongyou.iSupport.service.AreaService;

@Controller
@RequestMapping("/area")
public class AreaController {

	@Autowired
	private AreaService areaService;

	@RequestMapping("addarea")
	public String addArea(Area area, HttpServletRequest request, HttpServletResponse response, Model model) {
		return "areaForm";
	}

	@RequestMapping("insertarea")
	public String insertArea(Area area, HttpServletRequest request, HttpServletResponse response, Model model) {
		areaService.insertArea(area);
		return "redirect:/area/arealist";
	}
	
	/*
	 * 测试form表单一次提交多条数据
	 */
	@RequestMapping("insertareaformtest")
	public String insertAreaFormTest(AreaForm form, HttpServletRequest request, HttpServletResponse response, Model model) {
		Area area = new Area();
		List<String> areacodeList = form.getAreacode();
		List<String> areanameList = form.getAreaname();
		if (!StringUtils.isEmpty(areacodeList)) {
			for (int i = 0; i < areacodeList.size(); i++) {
				String areacode = areacodeList.get(i);
				String areaname = areanameList.get(i);
				if (StringUtils.isEmpty(areacode) || StringUtils.isEmpty(areaname)) {
					continue;
				}
				area.setAreaname(areaname);
				area.setAreacode(areacode);
				System.out.println(area);
				areaService.insertArea(area);
			}
		}
		return "redirect:/area/arealist";
	}
	
	

	@RequestMapping("arealist")
	public String areaList(Area area, HttpServletRequest request, HttpServletResponse response, Model model) {
		List<Area> arealist = areaService.findList(area);
		String areacode = arealist.get(0).toString();
		System.out.println(areacode);
		model.addAttribute("alist", arealist);
		return "areaList1";
	}

	@RequestMapping("delete")
	public String deleteArea(Integer pk_area, Area area, HttpServletRequest request, HttpServletResponse response,
			Model model) {
		areaService.deleteByPrimaryKey(pk_area);
		return "redirect:/area/arealist";
	}

	@RequestMapping("update")
	public String updateArea(Integer pk_area, HttpServletRequest request, HttpServletResponse response, Model model) {
		Area area = areaService.selectByPrimaryKey(pk_area);
		model.addAttribute("area", area);
		return "updateAreaForm";
	}

	@RequestMapping("savearea")
	public String saveArea(Integer pk_area, Area area, HttpServletRequest request, HttpServletResponse response,
			Model model) {
		areaService.updateByPrimaryKey(area);
		return "redirect:/area/arealist";
	}
}
