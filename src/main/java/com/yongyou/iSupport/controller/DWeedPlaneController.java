package com.yongyou.iSupport.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yongyou.iSupport.form.WeekPlaneForm;

@RequestMapping("/*")
@Controller
public class DWeedPlaneController {

	@ResponseBody
	@RequestMapping(value = "/test")
	public void aLittleCase(WeekPlaneForm form, HttpServletRequest req, HttpServletResponse response, Model model) {
		String projectmanager = form.getProjectmanager();

//		List<String> weekworktask = form.getWeekworktask();
//		List<String> weekworkstarttime = form.getWeekworkstarttime();
//		List<String> weekpersonliable = form.getWeekpersonliable();
//		List<String> weekworkexplain = form.getWeekworkexplain();
	/*	if (!StringUtils.isEmpty(weekworktask)) {
			for (String string : weekworktask) {
				System.out.println(string);
			}
		}*/
//		List<String> notfinishtask = form.getNotfinishtask();
//		List<String> personliable = form.getPersonliable();
//		List<String> notfinishreason = form.getNotfinishreason();
//		List<String> concretemeasure = form.getConcretemeasure();
		
//		List<String> problem = form.getProblem();
//		List<String> needhelp = form.getNeedhelp();
//		List<String> hopefinishtime = form.getHopefinishtime();
		
		List<String> nextweektask = form.getNextweektask();
		List<String> nextpersonliable = form.getNextpersonliable();
		List<String> nextweekstarttime = form.getNextweekstarttime();
		List<String> nextweekfinishtime = form.getNextweekfinishtime();
		

		System.out.println("==========================" + projectmanager);
		System.out.println(form.toString());
	}
}
