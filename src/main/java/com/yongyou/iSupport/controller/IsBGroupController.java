package com.yongyou.iSupport.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongyou.iSupport.entity.IsBGroup;
import com.yongyou.iSupport.service.IsBGroupService;

@RequestMapping("group")
@Controller
public class IsBGroupController {

	@Autowired
	private IsBGroupService isBGroupService;
	
	/*
	 * 跳转添加集团表单
	 */
	@RequestMapping("addgroup")
	public String addGroup(HttpServletRequest request, HttpServletResponse response,Model model){
		return "groupForm";
	}
	/*
	 * 插入数据
	 */
	@RequestMapping("insertgroup")
	public String insertGroup(IsBGroup record,HttpServletRequest request, HttpServletResponse response,Model model){
		UUID uuid = UUID.randomUUID();
		String groupcode = uuid.toString().substring(0, 8);
		record.setGroupcode(groupcode);
		isBGroupService.insert(record);
		return "redirect:/group/grouplist";
	}
	
	/*
	 * 查询列表，模糊查询
	 */
	@RequestMapping("grouplist")
	public String groupList(IsBGroup record,HttpServletRequest request, HttpServletResponse response,Model model){
		List<IsBGroup> glist = isBGroupService.findList(record);
		model.addAttribute("glist",glist);
		return "groupList";
	}
	
	/*
	 * 删除数据
	 */
	@RequestMapping("delete")
	public String deleteGroup(Integer pk_group, IsBGroup record,HttpServletRequest request, HttpServletResponse response,Model model){
		isBGroupService.deleteByPrimaryKey(pk_group);
		return "redirect:/group/grouplist";
	}
	
	/*
	 * 根据id搜索数据，跳转更新页面
	 */
	@RequestMapping("update")
	public String updateGroup(Integer pk_group, IsBGroup record,HttpServletRequest request, HttpServletResponse response,Model model){
		IsBGroup group = isBGroupService.selectByPrimaryKey(pk_group);
		model.addAttribute("group",group);
		return "updateGroupForm";
	}
	
	/*
	 * 更新数据
	 */
	@RequestMapping("savegroup")
	public String saveGroup(Integer pk_group,IsBGroup record ,HttpServletRequest request, HttpServletResponse response,Model model){
		isBGroupService.updateByPrimaryKey(record);
		return "redirect:/group/grouplist";
	}
	
	/*
	 * 测试echarts动态数据展示
	 */
	@RequestMapping("selectByPrimaryKey")
	public String selectByPrimaryKey(Integer pk_group,HttpServletRequest request, HttpServletResponse response,Model model){
		IsBGroup record=isBGroupService.selectByPrimaryKey(pk_group);
		model.addAttribute("group",record);
		return "echartsDemo";
	}
}
