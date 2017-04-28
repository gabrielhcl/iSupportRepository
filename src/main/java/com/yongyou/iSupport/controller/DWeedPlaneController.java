package com.yongyou.iSupport.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yongyou.iSupport.entity.IsSDweekplaneH;
import com.yongyou.iSupport.entity.IsSDweekplaneN;
import com.yongyou.iSupport.entity.IsSDweekplaneP;
import com.yongyou.iSupport.entity.IsSDweekplaneT;
import com.yongyou.iSupport.entity.IsSDweekplaneW;
import com.yongyou.iSupport.form.WeekPlaneForm;
import com.yongyou.iSupport.service.IsSDweekplaneHService;
import com.yongyou.iSupport.service.IsSDweekplaneNService;
import com.yongyou.iSupport.service.IsSDweekplanePService;
import com.yongyou.iSupport.service.IsSDweekplaneTService;
import com.yongyou.iSupport.service.IsSDweekplaneWService;
import com.yongyou.iSupport.utils.TimeUtil;

@RequestMapping(value="/*")
@Controller
public class DWeedPlaneController {

	@Autowired
	private IsSDweekplaneHService isSDweekplaneHService;
	@Autowired
	private IsSDweekplaneTService isSDweekplaneTService;
	@Autowired
	private IsSDweekplaneWService isSDweekplaneWService;
	@Autowired
	private IsSDweekplanePService isSDweekplanePService;
	@Autowired
	private IsSDweekplaneNService isSDweekplaneNService;
	
	@RequestMapping("adddweekplane")
	public String addDWeekPlane(HttpServletRequest request,HttpServletResponse reponse){
		return "dWeekPlane";
	}
	
	
	@ResponseBody
	@RequestMapping(value="savedweekplane")
	public String saveDWeekPlane(WeekPlaneForm form, HttpServletRequest request, HttpServletResponse response, Model model,IsSDweekplaneH record) {
//		操作主表，获取form值，创建主表entity实体，调用copy方法将form中的值copy到主表实体中
//		由于form中的日期为string型数据，调用工具类将string型日期转化为date型日期
//		向主表中插入数据
		
		IsSDweekplaneH isSDweekplaneH = new IsSDweekplaneH();
		
		BeanUtils.copyProperties(form, isSDweekplaneH);
		isSDweekplaneH.setFilldate(TimeUtil.parseDate(form.getFilldate()));
		isSDweekplaneH.setPlanestartdate(TimeUtil.parseDate(form.getPlanestartdate()));
		isSDweekplaneH.setStartprojectdate(TimeUtil.parseDate(form.getStartprojectdate()));
		isSDweekplaneH.setPlanefinishdate(TimeUtil.parseDate(form.getPlanefinishdate()));
		isSDweekplaneHService.insert(isSDweekplaneH);
		
		String projectmanager = form.getProjectmanager();
		

		/*
		 * 创建双周报本周报告实体接收数据
		 */
		IsSDweekplaneT isSDweekplaneT = new IsSDweekplaneT();
//		将前台接收到的form数据转换为list
		List<String> weekworktaskList = form.getWeekworktask();
		List<String> weekworkstarttimeList = form.getWeekworkstarttime();
		List<String> weekworkfinishtimeList = form.getWeekworkfinishtime();
		List<String> weekpersonliableList = form.getWeekpersonliable();
		List<String> weekworkexplainList = form.getWeekworkexplain();
//		循环将数据插入子表 ，若为空值跳出循环
		if(!StringUtils.isEmpty(weekworktaskList)){
//			将双周报主表主键插入子表
				Integer id = isSDweekplaneH.getPkDweekplaneH();
			for (int i = 0; i < weekworktaskList.size(); i++) {
				String weekworktask = weekworktaskList.get(i);
//				转换时间格式
				Date weekworkstarttime=TimeUtil.parseDate(weekworkstarttimeList.get(i));
				Date weekworkfinishtime=TimeUtil.parseDate(weekworkfinishtimeList.get(i));
				String weekpersonliable = weekpersonliableList.get(i);
				String weekworkexplain = weekworkexplainList.get(i);
				if(StringUtils.isEmpty(weekworktaskList.get(i))||StringUtils.isEmpty(weekpersonliableList.get(i))||StringUtils.isEmpty(weekworkexplainList.get(i))){
					continue;
				}
				isSDweekplaneT.setWeekworktask(weekworktask);
				isSDweekplaneT.setWeekworkstarttime(weekworkstarttime);
				isSDweekplaneT.setWeekworkfinishtime(weekworkfinishtime);
				isSDweekplaneT.setWeekpersonliable(weekpersonliable);
				isSDweekplaneT.setWeekworkexplain(weekworkexplain);
				isSDweekplaneT.setPkSDweekplaneH(id);
				isSDweekplaneTService.insert(isSDweekplaneT);
			}
		}		
		
		
		/*
		 * 双周报未完成报告数据插入
		 */
//		获取form参数值，并将参数值转化为list
		List<String> notfinishtaskList = form.getNotfinishtask();
		List<String> personliableList = form.getPersonliable();
		List<String> notfinishreasonList = form.getNotfinishreason();
		List<String> concretemeasureList = form.getConcretemeasure();
		
//		创建双周报未完成报告主体
		IsSDweekplaneW isSDweekplaneW = new IsSDweekplaneW();
		
//		循环插入数据
		if(!StringUtils.isEmpty(notfinishreasonList)){
			for (int i = 0; i < notfinishreasonList.size(); i++) {
				Integer id = isSDweekplaneH.getPkDweekplaneH();
				String notfinishtask = notfinishtaskList.get(i);
				String personliable = personliableList.get(i);
				String notfinishreason = notfinishreasonList.get(i);
				String concretemeasure = concretemeasureList.get(i);
				if(StringUtils.isEmpty(notfinishtaskList.get(i))||StringUtils.isEmpty(personliableList.get(i))||StringUtils.isEmpty(notfinishreasonList.get(i))||StringUtils.isEmpty(concretemeasureList.get(i))){
					continue;
				}
				isSDweekplaneW.setNotfinishtask(notfinishtask);
				isSDweekplaneW.setPersonliable(personliable);
				isSDweekplaneW.setNotfinishreason(notfinishreason);
				isSDweekplaneW.setConcretemeasure(concretemeasure);
				isSDweekplaneW.setPkSDweekplaneH(id);
				isSDweekplaneWService.insert(isSDweekplaneW);
			}
		}
		
		
		/*
		 * 双周报问题与困难数据插入
		 */
		
//		创建双周报问题实体用来接收并存储数据
		
		IsSDweekplaneP isSDweekplaneP = new IsSDweekplaneP();
		Integer id = isSDweekplaneH.getPkDweekplaneH();
//		获取form里的数据并转换为list
		List<String> problemList = form.getProblem();
		List<String> needhelpList = form.getNeedhelp();
		List<String> hopefinishtimeList = form.getHopefinishtime();
		
//		循环插入数据
		if(!StringUtils.isEmpty(problemList)){
			for (int i = 0; i < problemList.size(); i++) {
				String problem = problemList.get(i);
				String needhelp = needhelpList.get(i);
				String hopefinishtime = hopefinishtimeList.get(i);
				if(StringUtils.isEmpty(problemList.get(i))||StringUtils.isEmpty(needhelpList.get(i))||StringUtils.isEmpty(hopefinishtimeList.get(i))){
					continue;
				}
				isSDweekplaneP.setProblem(problem);
				isSDweekplaneP.setNeedhelp(needhelp);
				isSDweekplaneP.setHopefinishtime(TimeUtil.parseDate(hopefinishtime));
				isSDweekplaneP.setPkSDweekplaneH(id);
				isSDweekplanePService.insert(isSDweekplaneP);
			}
		}
		
		/*
		 * 双周报下周实施计划数据插入
		 */
		
		
//		创建下周实施计划主体
		
		IsSDweekplaneN isSDweekplaneN = new IsSDweekplaneN();
		
//		接收form数据并转换我list
		List<String> nextweektaskList = form.getNextweektask();
		List<String> nextpersonliableList = form.getNextpersonliable();
		List<String> nextweekstarttimeList = form.getNextweekstarttime();
		List<String> nextweekfinishtimeList = form.getNextweekfinishtime();
		List<String> explainList = form.getNextweekexplain();
		
		
//		循环插入数据
		if(!StringUtils.isEmpty(nextweektaskList)){
			for (int i = 0; i < nextweektaskList.size(); i++) {
				String nextweektask = nextweektaskList.get(i);
				String nextpersonliable = nextpersonliableList.get(i);
				String nextweekstarttime = nextweekstarttimeList.get(i);
				String nextweekfinishtime = nextweekfinishtimeList.get(i);
				String explain = explainList.get(i);
				if(StringUtils.isEmpty(nextweektaskList.get(i))||StringUtils.isEmpty(nextpersonliableList.get(i))||StringUtils.isEmpty(nextweekstarttimeList.get(i))||StringUtils.isEmpty(nextweekfinishtimeList.get(i))||StringUtils.isEmpty(explainList.get(i))){
					continue;
				}
				isSDweekplaneN.setNextweektask(nextweektask);
				isSDweekplaneN.setNextpersonliable(nextpersonliable);
				isSDweekplaneN.setNextweekstarttime(TimeUtil.parseDate(nextweekstarttime));
				isSDweekplaneN.setNextweekfinishtime(TimeUtil.parseDate(nextweekfinishtime));
				isSDweekplaneN.setNextweekexplain(explain);
				isSDweekplaneN.setPkSDweekplaneH(id);
				System.out.println(isSDweekplaneN);
				System.out.println(isSDweekplaneN.getNextweekstarttime());
				System.out.println(isSDweekplaneN.getNextweekfinishtime());
				System.out.println(isSDweekplaneN.getNextweekexplain());
				isSDweekplaneNService.insert(isSDweekplaneN);
			}
		}
		
		

//		项目经理名称展示测试
		System.out.println("==========================" + projectmanager);
		System.out.println(form.toString());
		return "redirect:/dweekplane/dweekplanehlist";
	}
	
	@RequestMapping("dweekplanehlist")
	public String findList(HttpServletRequest request,HttpServletResponse response,Model model,IsSDweekplaneH record){
		List<IsSDweekplaneH> hlist = isSDweekplaneHService.findList(record);
		model.addAttribute("hlist",hlist);
		return "dWeekPlaneList";
	}
}
