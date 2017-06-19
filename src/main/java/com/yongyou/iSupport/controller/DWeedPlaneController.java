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
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yongyou.iSupport.entity.IsBProject;
import com.yongyou.iSupport.entity.IsMainplanH;
import com.yongyou.iSupport.entity.IsSDweekplaneH;
import com.yongyou.iSupport.entity.IsSDweekplaneN;
import com.yongyou.iSupport.entity.IsSDweekplaneP;
import com.yongyou.iSupport.entity.IsSDweekplaneT;
import com.yongyou.iSupport.entity.IsSDweekplaneW;
import com.yongyou.iSupport.form.WeekPlaneForm;
import com.yongyou.iSupport.service.IsBProjectService;
import com.yongyou.iSupport.service.IsMainPlanHService;
import com.yongyou.iSupport.service.IsSDweekplaneHService;
import com.yongyou.iSupport.service.IsSDweekplaneNService;
import com.yongyou.iSupport.service.IsSDweekplanePService;
import com.yongyou.iSupport.service.IsSDweekplaneTService;
import com.yongyou.iSupport.service.IsSDweekplaneWService;
import com.yongyou.iSupport.utils.TimeUtil;

@RequestMapping("dweekplane")
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
	@Autowired
	private IsBProjectService isBProjectService;
	@Autowired
	private IsMainPlanHService isMainPlanHService;
	
	@RequestMapping("adddweekplane")
	public String addDWeekPlane(HttpServletRequest request,HttpServletResponse reponse){
		return "dWeekPlane";
	}
	
	
	@ResponseBody
	@RequestMapping("savedweekplane")
	public ModelAndView saveDWeekPlane(WeekPlaneForm form, HttpServletRequest request, HttpServletResponse response, Model model) {
//		鎿嶄綔涓昏〃锛岃幏鍙杅orm鍊硷紝鍒涘缓涓昏〃entity瀹炰綋锛岃皟鐢╟opy鏂规硶灏唂orm涓殑鍊糲opy鍒颁富琛ㄥ疄浣撲腑
//		鐢变簬form涓殑鏃ユ湡涓簊tring鍨嬫暟鎹紝璋冪敤宸ュ叿绫诲皢string鍨嬫棩鏈熻浆鍖栦负date鍨嬫棩鏈�
//		鍚戜富琛ㄤ腑鎻掑叆鏁版嵁
		
//		注意
//		IsSDweekplaneH record = new IsSDweekplaneH();
		
		
		IsSDweekplaneH isSDweekplaneH = new IsSDweekplaneH();
		
		BeanUtils.copyProperties(form, isSDweekplaneH);
		isSDweekplaneH.setFilldate(TimeUtil.parseDate(form.getFilldate()));
		isSDweekplaneH.setPlanestartdate(TimeUtil.parseDate(form.getPlanestartdate()));
		isSDweekplaneH.setStartprojectdate(TimeUtil.parseDate(form.getStartprojectdate()));
		isSDweekplaneH.setPlanefinishdate(TimeUtil.parseDate(form.getPlanefinishdate()));
		
		isSDweekplaneH.setProplstarttime(TimeUtil.parseDate(form.getProplstarttime()));
		isSDweekplaneH.setBpdesignstarttime(TimeUtil.parseDate(form.getBpdesignstarttime()));
		isSDweekplaneH.setSysbuildstarttime(TimeUtil.parseDate(form.getSysbuildstarttime()));
		isSDweekplaneH.setOnlineswitchstarttime(TimeUtil.parseDate(form.getOnlineswitchstarttime()));
		isSDweekplaneH.setSusupportstarttime(TimeUtil.parseDate(form.getSusupportstarttime()));
		isSDweekplaneHService.insert(isSDweekplaneH);
		
		String projectmanager = form.getProjectmanager();
		

		/*
		 *  鍒涘缓鍙屽懆鎶ユ湰鍛ㄦ姤鍛婂疄浣撴帴鏀舵暟鎹�
		 */
		IsSDweekplaneT isSDweekplaneT = new IsSDweekplaneT();
//		灏嗗墠鍙版帴鏀跺埌鐨刦orm鏁版嵁杞崲涓簂ist
		List<String> weekworktaskList = form.getWeekworktask();
		List<String> weekworkstarttimeList = form.getWeekworkstarttime();
		List<String> weekworkfinishtimeList = form.getWeekworkfinishtime();
		List<String> weekpersonliableList = form.getWeekpersonliable();
		List<String> weekworkexplainList = form.getWeekworkexplain();
//		寰幆灏嗘暟鎹彃鍏ュ瓙琛� 锛岃嫢涓虹┖鍊艰烦鍑哄惊鐜�
		if(!StringUtils.isEmpty(weekworktaskList)){
//			灏嗗弻鍛ㄦ姤涓昏〃涓婚敭鎻掑叆瀛愯〃
				Integer id = isSDweekplaneH.getPkDweekplaneH();
			for (int i = 0; i < weekworktaskList.size(); i++) {
				String weekworktask = weekworktaskList.get(i);
//				杞崲鏃堕棿鏍煎紡
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
		 * 鍙屽懆鎶ユ湭瀹屾垚鎶ュ憡鏁版嵁鎻掑叆
		 */
//		鑾峰彇form鍙傛暟鍊硷紝骞跺皢鍙傛暟鍊艰浆鍖栦负list
		List<String> notfinishtaskList = form.getNotfinishtask();
		List<String> personliableList = form.getPersonliable();
		List<String> notfinishreasonList = form.getNotfinishreason();
		List<String> concretemeasureList = form.getConcretemeasure();
		
//		鍒涘缓鍙屽懆鎶ユ湭瀹屾垚鎶ュ憡涓讳綋
		IsSDweekplaneW isSDweekplaneW = new IsSDweekplaneW();
		
//		寰幆鎻掑叆鏁版嵁
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
		 * 鍙屽懆鎶ラ棶棰樹笌鍥伴毦鏁版嵁鎻掑叆
		 */
		
//		鍒涘缓鍙屽懆鎶ラ棶棰樺疄浣撶敤鏉ユ帴鏀跺苟瀛樺偍鏁版嵁
		
		IsSDweekplaneP isSDweekplaneP = new IsSDweekplaneP();
		Integer id = isSDweekplaneH.getPkDweekplaneH();
//		鑾峰彇form閲岀殑鏁版嵁骞惰浆鎹负list
		List<String> problemList = form.getProblem();
		List<String> needhelpList = form.getNeedhelp();
		List<String> hopefinishtimeList = form.getHopefinishtime();
		
//		寰幆鎻掑叆鏁版嵁
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
		 * 鍙屽懆鎶ヤ笅鍛ㄥ疄鏂借鍒掓暟鎹彃鍏�
		 */
		
		
//		鍒涘缓涓嬪懆瀹炴柦璁″垝涓讳綋
		
		IsSDweekplaneN isSDweekplaneN = new IsSDweekplaneN();
		
//		鎺ユ敹form鏁版嵁骞惰浆鎹㈡垜list
		List<String> nextweektaskList = form.getNextweektask();
		List<String> nextpersonliableList = form.getNextpersonliable();
		List<String> nextweekstarttimeList = form.getNextweekstarttime();
		List<String> nextweekfinishtimeList = form.getNextweekfinishtime();
		List<String> explainList = form.getNextweekexplain();
		
		
//		寰幆鎻掑叆鏁版嵁
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
		
		

//		椤圭洰缁忕悊鍚嶇О灞曠ず娴嬭瘯
		System.out.println("==========================" + projectmanager);
		System.out.println(form.toString());
//		return "redirect:/dweekplane/dweekplanehlist";
//		使用ModelAndView实现controller之间的跳转
		return new ModelAndView("redirect:/dweekplane/dweekplanehlist");
	}
	
	@RequestMapping("dweekplanehlist")
	public String findList(HttpServletRequest request,HttpServletResponse response,Model model,IsSDweekplaneH record){
		List<IsSDweekplaneH> hlist = isSDweekplaneHService.findList(record);
		model.addAttribute("hlist",hlist);
		return "dWeekPlaneList";
	}
	
	@RequestMapping("delete")
	public String deleteDWeekPlane(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkDweekplaneH,IsSDweekplaneH isSDweekplaneH){
		isSDweekplaneHService.deleteDWeekPlane(pkDweekplaneH, isSDweekplaneH);
		return "redirect:/dweekplane/dweekplanehlist";
	}
	
	
	@RequestMapping("dweekplanedetail")
	public String dWeekPlaneDetail(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkDweekplaneH,IsSDweekplaneH isSDweekplaneH,String projectname){
		
		isSDweekplaneHService.selectdweekplanedetail(pkDweekplaneH, isSDweekplaneH ,model);
		IsMainplanH mainplanh = isMainPlanHService.selectByProjectName(projectname);
		IsBProject project = isBProjectService.selectByProjectName(projectname);
		
		String date = TimeUtil.getNowTime();
		Date nowtime = TimeUtil.parseDateHms(date);
		
		model.addAttribute("nowtime",nowtime);
		model.addAttribute("mainplanh",mainplanh);
		model.addAttribute("project",project);
		return "dWeekPlaneDetail";
	}
	
	
	/*
	 * 跳转双周报生成页面，将项目列表数据加载到页面中供用户选择
	 */
	@RequestMapping("selectproject")
	public String selectProjectForDWeekPlan(HttpServletRequest request,HttpServletResponse response,Model model,IsBProject record){
		List<IsBProject> plist = isBProjectService.findList(record);
		model.addAttribute("plist",plist);
		return "CreateDWeekPlan";
	}
	
	
	/*
	 * 根据选择的项目名搜索项目信息和项目主计划，并将信息加载到双周报form中
	 */
	@RequestMapping("createdweekform")
	public String createdweekform(HttpServletRequest request,HttpServletResponse response,Model model,IsBProject record){
		String projectname = record.getProjectname();
		IsMainplanH mainplanh = isMainPlanHService.selectByProjectName(projectname);
		IsBProject project = isBProjectService.selectByProjectName(projectname);
		
		String date = TimeUtil.getNowTime();
		Date nowtime = TimeUtil.parseDateHms(date);
		
		model.addAttribute("nowtime",nowtime);
		model.addAttribute("mainplanh",mainplanh);
		model.addAttribute("project",project);
		return "dWeekPlane";
	}
	
	
	/*
	 * 从主计划列表添加双周报
	 */
	@RequestMapping("createdweekfrommainplan")
	public String createdweekfrommainplan(HttpServletRequest request,HttpServletResponse response,Model model,Integer pkMainplanH){
		IsMainplanH mainplanH = isMainPlanHService.selectByPrimaryKey(pkMainplanH);
		String projectname = mainplanH.getProjectname();
		IsBProject project = isBProjectService.selectByProjectName(projectname);
		String date = TimeUtil.getNowTime();
		Date nowtime = TimeUtil.parseDateHms(date);
		
		String Pstartdate = null;
		String pstartdate = TimeUtil.newconvertDate(mainplanH.getPstartdate(), Pstartdate);
		String Penddate = null;
		String penddate = TimeUtil.newconvertDate(mainplanH.getPenddate(), Penddate);
		model.addAttribute("pstartdate",pstartdate);
		model.addAttribute("penddate",penddate);
		model.addAttribute("nowtime",nowtime);
		model.addAttribute("mainplanH",mainplanH);
		model.addAttribute("project",project);
		return "dWeekPlane";
		
	}
	
	@RequestMapping("update")
	public  String update (HttpServletRequest request,HttpServletResponse response,Model model,Integer pkDweekplaneH,IsSDweekplaneH isSDweekplaneH,String projectname){
		isSDweekplaneHService.selectdweekplanedetail(pkDweekplaneH, isSDweekplaneH ,model);
		IsMainplanH mainplanh = isMainPlanHService.selectByProjectName(projectname);
		IsBProject project = isBProjectService.selectByProjectName(projectname);
		
		String date = TimeUtil.getNowTime();
		Date nowtime = TimeUtil.parseDateHms(date);
		
		model.addAttribute("nowtime",nowtime);
		model.addAttribute("mainplanh",mainplanh);
		model.addAttribute("project",project);
		return "updatedWeekPlan";
	}
}
