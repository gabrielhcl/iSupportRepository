package com.yongyou.iSupport.form;

import java.util.List;

public class WeekPlaneForm {
	private String planestartdate; // 计划开工日期
	private String startprojectdate; // 实际开工日期
	private String planefinishdate; // 计划完工日期
	private String projectmanager; // 项目经理
	private String projectmanagerdaytime; // 项目经理投入人天总数
	private String impconsultant; // 实施顾问
	private String impconsultantdaytime; // 实施顾问总人天
	private String devconsultant; // 开发顾问
	private String devconsultantdaytime; // 开发顾问总人天
	private String sumdaytime; // 总人天
	private String stagein; // 所处阶段
	private String yiprojectmanager; // 乙方项目经理
	private String radio; // 总体状态

	private String radio6; // 进度滞后>10天
	private String radio4; // 进度滞后<=10天

	// 进度正常表单中没有

	private String riskwarning; // 风险提示

	//////////// 本周工作完成情况 /////////
	private List<String> weekworktask; // 工作任务
	private List<String> weekpersonliable; //
	private List<String> weekworkstarttime; //
	private List<String> weekworkfinishtime; //
	private List<String> weekworkexplain; //

	//////////// 计划未完成工作列表及原因分析 /////////
	private List<String> notfinishtask; // 未完成任务
	private List<String> personliable; // 责任人
	private List<String> notfinishreason; // 未完成原因
	private List<String> concretemeasure; // 具体措施

	////////// 存在的问题与困难 ///////
	private List<String> problem; //
	private List<String> needhelp; //
	private List<String> hopefinishtime; //

	////////// 下周工作计划安排 ///////
	private List<String> nextweektask; //
	private List<String> nextpersonliable; //
	private List<String> nextweekstarttime; //
	private List<String> nextweekfinishtime; //
	private List<String> explain;
	
	
	public List<String> getNextweektask() {
		return nextweektask;
	}

	public void setNextweektask(List<String> nextweektask) {
		this.nextweektask = nextweektask;
	}

	public List<String> getNextpersonliable() {
		return nextpersonliable;
	}

	public void setNextpersonliable(List<String> nextpersonliable) {
		this.nextpersonliable = nextpersonliable;
	}

	public List<String> getNextweekstarttime() {
		return nextweekstarttime;
	}

	public void setNextweekstarttime(List<String> nextweekstarttime) {
		this.nextweekstarttime = nextweekstarttime;
	}

	public List<String> getNextweekfinishtime() {
		return nextweekfinishtime;
	}

	public void setNextweekfinishtime(List<String> nextweekfinishtime) {
		this.nextweekfinishtime = nextweekfinishtime;
	}

	public List<String> getProblem() {
		return problem;
	}

	public void setProblem(List<String> problem) {
		this.problem = problem;
	}

	public List<String> getNeedhelp() {
		return needhelp;
	}

	public void setNeedhelp(List<String> needhelp) {
		this.needhelp = needhelp;
	}

	public List<String> getHopefinishtime() {
		return hopefinishtime;
	}

	public void setHopefinishtime(List<String> hopefinishtime) {
		this.hopefinishtime = hopefinishtime;
	}

	public List<String> getNotfinishtask() {
		return notfinishtask;
	}

	public void setNotfinishtask(List<String> notfinishtask) {
		this.notfinishtask = notfinishtask;
	}

	public List<String> getPersonliable() {
		return personliable;
	}

	public void setPersonliable(List<String> personliable) {
		this.personliable = personliable;
	}

	public List<String> getNotfinishreason() {
		return notfinishreason;
	}

	public void setNotfinishreason(List<String> notfinishreason) {
		this.notfinishreason = notfinishreason;
	}

	public List<String> getConcretemeasure() {
		return concretemeasure;
	}

	public void setConcretemeasure(List<String> concretemeasure) {
		this.concretemeasure = concretemeasure;
	}

	public List<String> getWeekworkfinishtime() {
		return weekworkfinishtime;
	}

	public void setWeekworkfinishtime(List<String> weekworkfinishtime) {
		this.weekworkfinishtime = weekworkfinishtime;
	}

	public List<String> getWeekworktask() {
		return weekworktask;
	}

	public void setWeekworktask(List<String> weekworktask) {
		this.weekworktask = weekworktask;
	}

	public List<String> getWeekpersonliable() {
		return weekpersonliable;
	}

	public void setWeekpersonliable(List<String> weekpersonliable) {
		this.weekpersonliable = weekpersonliable;
	}

	public List<String> getWeekworkstarttime() {
		return weekworkstarttime;
	}

	public void setWeekworkstarttime(List<String> weekworkstarttime) {
		this.weekworkstarttime = weekworkstarttime;
	}

	public List<String> getWeekworkexplain() {
		return weekworkexplain;
	}

	public void setWeekworkexplain(List<String> weekworkexplain) {
		this.weekworkexplain = weekworkexplain;
	}

	public String getPlanestartdate() {
		return planestartdate;
	}

	public void setPlanestartdate(String planestartdate) {
		this.planestartdate = planestartdate;
	}

	public String getStartprojectdate() {
		return startprojectdate;
	}

	public void setStartprojectdate(String startprojectdate) {
		this.startprojectdate = startprojectdate;
	}

	public String getPlanefinishdate() {
		return planefinishdate;
	}

	public void setPlanefinishdate(String planefinishdate) {
		this.planefinishdate = planefinishdate;
	}

	public String getProjectmanager() {
		return projectmanager;
	}

	public void setProjectmanager(String projectmanager) {
		this.projectmanager = projectmanager;
	}

	public String getProjectmanagerdaytime() {
		return projectmanagerdaytime;
	}

	public void setProjectmanagerdaytime(String projectmanagerdaytime) {
		this.projectmanagerdaytime = projectmanagerdaytime;
	}

	public String getImpconsultant() {
		return impconsultant;
	}

	public void setImpconsultant(String impconsultant) {
		this.impconsultant = impconsultant;
	}

	public String getImpconsultantdaytime() {
		return impconsultantdaytime;
	}

	public void setImpconsultantdaytime(String impconsultantdaytime) {
		this.impconsultantdaytime = impconsultantdaytime;
	}

	public String getDevconsultant() {
		return devconsultant;
	}

	public void setDevconsultant(String devconsultant) {
		this.devconsultant = devconsultant;
	}

	public String getDevconsultantdaytime() {
		return devconsultantdaytime;
	}

	public void setDevconsultantdaytime(String devconsultantdaytime) {
		this.devconsultantdaytime = devconsultantdaytime;
	}

	public String getSumdaytime() {
		return sumdaytime;
	}

	public void setSumdaytime(String sumdaytime) {
		this.sumdaytime = sumdaytime;
	}

	public String getStagein() {
		return stagein;
	}

	public void setStagein(String stagein) {
		this.stagein = stagein;
	}

	public String getYiprojectmanager() {
		return yiprojectmanager;
	}

	public void setYiprojectmanager(String yiprojectmanager) {
		this.yiprojectmanager = yiprojectmanager;
	}

	public String getRadio() {
		return radio;
	}

	public void setRadio(String radio) {
		this.radio = radio;
	}

	public String getRadio6() {
		return radio6;
	}

	public void setRadio6(String radio6) {
		this.radio6 = radio6;
	}

	public String getRadio4() {
		return radio4;
	}

	public void setRadio4(String radio4) {
		this.radio4 = radio4;
	}

	public String getRiskwarning() {
		return riskwarning;
	}

	public void setRiskwarning(String riskwarning) {
		this.riskwarning = riskwarning;
	}

	public List<String> getExplain() {
		return explain;
	}

	public void setExplain(List<String> explain) {
		this.explain = explain;
	}

	
	
}
