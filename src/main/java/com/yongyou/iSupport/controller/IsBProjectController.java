package com.yongyou.iSupport.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yongyou.iSupport.entity.IsBProject;
import com.yongyou.iSupport.form.IsBProjectForm;
import com.yongyou.iSupport.service.IsBProjectService;
import com.yongyou.iSupport.utils.TimeUtil;

@Controller
@RequestMapping("project")
public class IsBProjectController {
	
	@Autowired
	private IsBProjectService isBProjectService;
	
	/*
	 * 跳转projrct添加form表单 
	 */
	@RequestMapping("addproject")
	public String addProject(Model model,HttpServletRequest request,HttpServletResponse response,IsBProject record){
		return "projectForm";
	}
	
	
	/*
	 * 插入project数据
	 * 转换日期数据类型
	 * 实现类的复制
	 */
	@RequestMapping("insertproject")
	public String insertProject(Model model,HttpServletRequest request,HttpServletResponse response,IsBProjectForm record){
//		实体类复制（record复制到bean）
		IsBProject bean = new IsBProject();
		BeanUtils.copyProperties(record, bean);
//		调用工具类方法将字符串型时间转换为date型
		Date date = TimeUtil.parseDate(record.getServicestimef());
		System.out.println(date);
		bean.setServicestime(TimeUtil.parseDate(record.getServicestimef()));
		Date date2 = bean.getServicestime();
		System.out.println(date2);
		bean.setServiceftime(TimeUtil.parseDate(record.getServiceftimef()));
		bean.setCreatedate(TimeUtil.parseDate(record.getCreatedatef()));
		System.out.println(bean);
		isBProjectService.insert(bean);
		return "redirect:/project/projectlist";
	}
	
	/*
	 * 列表查询
	 * 模糊查询，返回project列表
	 */
	@RequestMapping("projectlist")
	public String projrctList(Model model,HttpServletRequest request,HttpServletResponse response,IsBProject record){
		List<IsBProject> plist = isBProjectService.findList(record);
		model.addAttribute("plist",plist);
		return "projectList";
	}
	
	/*
	 * 删除project数据
	 */
	@RequestMapping("delete")
	public String deleteProject(Model model,HttpServletRequest request,HttpServletResponse response,Integer pkProject){
		isBProjectService.deleteByPrimaryKey(pkProject);
		return "redirect:/project/projectlist";
	}
	
	
	
	
	/*
	 * 根据id查询project数据
	 * 返回project修改页面
	 */
	@RequestMapping("update")
	public String updateProject(Model model,HttpServletRequest request,HttpServletResponse response,Integer pkProject){
		IsBProject project = isBProjectService.selectByPrimaryKey(pkProject);
		model.addAttribute("project",project);
		return "updateProjectForm";
	}
	
	
	/*
	 * 修改project数据并返回列表
	 */
	@RequestMapping("saveproject")
	public String saveProject(Model model,HttpServletRequest request,HttpServletResponse response,IsBProject record){
		isBProjectService.updateByPrimaryKey(record);
		return "redirect:/project/projectlist";
	}
	
	/*
	 * 查询project详细信息
	 */
	@RequestMapping("projectdetail")
	public String projectDetail(Model model,HttpServletRequest request,HttpServletResponse response,Integer pkProject){
		IsBProject project = isBProjectService.selectByPrimaryKey(pkProject);
		model.addAttribute("project",project);
		return "projectDetail";
	}
}
