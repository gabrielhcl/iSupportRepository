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

import com.yongyou.iSupport.entity.IsProblem;
import com.yongyou.iSupport.form.IsProblemForm;
import com.yongyou.iSupport.service.ProblemService;
import com.yongyou.iSupport.utils.TimeUtil;

@RequestMapping("problem")
@Controller
public class ProblemController {

	@Autowired
	private ProblemService problemService;
	
	
	@RequestMapping("insertproblem")
	public String insertPoblem(HttpServletRequest request,HttpServletResponse response,Model model){
		return "problemForm";
	}
	
	
	@RequestMapping("saveproblem")
	public String saveProblem(HttpServletRequest request,HttpServletResponse response,Model model,IsProblemForm form){
		
		IsProblem problem = new IsProblem();
		
		BeanUtils.copyProperties(form, problem);
		
		problem.setSubmitdate(TimeUtil.parseDate(form.getSubmitdate()));
		problem.setFinishdate(TimeUtil.parseDate(form.getFinishdate()));
		
		problemService.insert(problem);
		
		return "redirect:problemlist";
	}
	
	
	@RequestMapping("problemlist")
	public String peoblemList(HttpServletRequest request,HttpServletResponse response,Model model,IsProblem record){
		List<IsProblem> plist = problemService.findList(record);
		model.addAttribute("plist",plist);
		return "ProblemList";
	}
	
	
	@RequestMapping("deleteproblem")
	public String deleteProblem(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkProblem){
		problemService.deleteByPrimaryKey(pkProblem);
		return "redirect:problemlist";
	}
	
	@RequestMapping("toupdateproblem")
	public String toUpdateForm(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkProblem){
		IsProblem problem = problemService.selectByPrimaryKey(pkProblem);
		String Submitdate = null;
		String submitdate = TimeUtil.newconvertDate(problem.getSubmitdate(), Submitdate);
		String Finishdate = null;
		String finishdate = TimeUtil.newconvertDate(problem.getFinishdate(), Finishdate);
		model.addAttribute("submitdate",submitdate);
		model.addAttribute("finishdate",finishdate);
		model.addAttribute("problem",problem);
		return "UpdateProblemForm";
	}
	
	@RequestMapping("updateproblem")
	public String updateProblem(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkProblem,IsProblemForm form ){
		IsProblem problem = problemService.selectByPrimaryKey(pkProblem);
		BeanUtils.copyProperties(form, problem);
		problem.setSubmitdate(TimeUtil.parseDate(form.getSubmitdate()));
		problem.setFinishdate(TimeUtil.parseDate(form.getFinishdate()));
		Date date = problem.getSubmitdate();
		System.out.println(date);
		problemService.updateByPrimaryKey(problem);
		return "redirect:problemlist";
	}
	
	@RequestMapping("problemdetail")
	public String problemDetail(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkProblem,IsProblem record){
		IsProblem problem = problemService.selectByPrimaryKey(pkProblem);
		model.addAttribute("problem",problem);
		
		String Submitdate = null;
		String submitdate = TimeUtil.newconvertDate(problem.getSubmitdate(), Submitdate);
		String Finishdate = null;
		String finishdate = TimeUtil.newconvertDate(problem.getFinishdate(), Finishdate);
		model.addAttribute("submitdate",submitdate);
		model.addAttribute("finishdate",finishdate);
		return "ProblemDetail";
	}
}
