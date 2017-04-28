package com.yongyou.iSupport.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongyou.iSupport.entity.IsColumn;
import com.yongyou.iSupport.service.ColumnService;

@Controller
@RequestMapping("column")
public class ColumnController {

	@Autowired
	private ColumnService columnService;
	
	@RequestMapping("addcolumn")
	public String addColumn(Model model,HttpServletRequest request,HttpServletResponse response,IsColumn record){
		return "columnForm";
	}
	
	@RequestMapping("insertcolumn")
	public String insertColumn(Model model,HttpServletRequest request,HttpServletResponse response,IsColumn record){
		UUID uuid = UUID.randomUUID();
		String columncode = uuid.toString().substring(0, 8);
		record.setColumncode(columncode);
		columnService.insert(record);
		System.out.println(record.getColumnname());
		return "redirect:columnlist";
	}
	
	@RequestMapping("columnlist")
	public String columnList(Model model,HttpServletRequest request,HttpServletResponse response,IsColumn column){
		List<IsColumn> clist = columnService.findList(column);
		model.addAttribute("clist",clist);
		return "columnList";
	}
	
	@RequestMapping("update")
	public String update(Model model,HttpServletRequest request,HttpServletResponse response,Integer pkColumn){
		IsColumn column = columnService.selectByPrimaryKey(pkColumn);
		model.addAttribute("column",column);
		return "updateColumnForm";
	}
	
	@RequestMapping("savecolumn")
	public String save(Model model,HttpServletRequest request,HttpServletResponse response,IsColumn column){
		columnService.updateByPrimaryKey(column);
		return "redirect:columnlist";
	}
	
	@RequestMapping("delete")
	public String delete(Model model,HttpServletRequest request,HttpServletResponse response,Integer pkColumn){
		columnService.deleteByPrimaryKey(pkColumn);
		return "redirect:columnlist";
	}
}
