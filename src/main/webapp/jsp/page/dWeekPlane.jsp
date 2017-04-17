<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
<meta name="author" content="Coderthemes">

<link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/favicon_1.ico">

<title>双周计划书</title>
<link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/core.css" rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/components.css" rel="stylesheet"
	type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/icons.css" rel="stylesheet"
	type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/pages.css" rel="stylesheet"
	type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/responsive.css" rel="stylesheet"
	type="text/css" />
<script src="${pageContext.request.contextPath}/assets/js/jquery-1.10.2.min.js"></script>
<script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>

<style>
.tablehead {
	background-color: #F4F8FB;
}
.table-bordered > thead > tr > th, .table-bordered > tbody > tr > th, .table-bordered > tfoot > tr > th, .table-bordered > thead > tr > td, .table-bordered > tbody > tr > td, .table-bordered > tfoot > tr > td{
    width: 75px;
}
.tableColor {
	background-color: #F4F8FB;
}
</style>
</head>
<body style="background-color: #FFFFFF">
	<div class="content">
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<br>
					<div class="dropdown">
						<button type="button" class="btn dropdown-toggle" id="dropdownMenu1" data-toggle="dropdown">
							项目选择 <span class="caret"></span>
						</button>
						<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
							<li role="presentation"><a role="menuitem" tabindex="-1" href="#">项目1</a></li>
							<li role="presentation"><a role="menuitem" tabindex="-1" href="#">项目2</a></li>
							<li role="presentation"><a role="menuitem" tabindex="-1" href="#">项目3</a></li>
						</ul>
					</div>
				</div>
				<div class="col-md-4 column"></div>
				<div class="col-md-4 column" align="center">
				</div>
				<div class="col-md-4 column"></div>
			</div>
			<div class="row clearfix">
				<div class="col-md-3 column"></div>
				<div class="col-md-4 column" align="center">
					<h4>用友网络科技股份有限公司建筑行业公司</h4>
					<h5>2017年02月24日</h5>
				</div>
				<div class="col-md-5 column"></div>
			</div>
			<div>
				<form id="iform" name="iform" method="post" action="${pageContext.request.contextPath}/test">
					<table data-toggle="table" data-show-columns="false" data-page-list="[5, 10, 20]"
						data-page-size="5" data-pagination="true" data-show-pagination-switch="true"
						class="table-bordered">
						<thead></thead>
						<tbody>
							<tr>
								<td style="background-color: #F4F8FB" width="70%">报告日期</td>
								<td colspan="2">
									<div class="input-group">
										<input type="date" class="form-control" id="reportdate" name="reportdate"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td class="tableColor">计划开工日期</td>
								<td colspan="2">
									<div class="input-group">
										<input type="date" class="form-control" id="planestartdate" name="planestartdate">
										<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
							</tr>
							<tr>
								<td class="tableColor">实际开工日期</td>
								<td colspan="2">
									<div class="input-group">
										<input type="date" class="form-control" id="startprojectdate" name="startprojectdate">
										<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td class="tableColor">计划完工日期</td>
								<td colspan="2">
									<div class="input-group">
										<input type="date" class="form-control" id="planefinishdate" name="planefinishdate">
										<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
							</tr>
							<tr>
								<td class="tableColor">项目经理</td>
								<td colspan="2"><input type="text" name="projectmanager" id="projectmanager"
									class="form-control" /></td>
								<td class="tableColor">项目经理投入人天总数</td>
								<td colspan="2"><input type="text" name="projectmanagerdaytime"
									id="projectmanagerdaytime" class="form-control" /></td>
							</tr>
							<tr>
								<td class="tableColor">实施顾问</td>
								<td colspan="2"><input type="text" name="impconsultant" id="impconsultant"
									class="form-control" /></td>
								<td class="tableColor">实施顾问投入人天总数</td>
								<td colspan="2"><input type="text" name="impconsultantdaytime"
									id="impconsultantdaytime" class="form-control" /></td>
							</tr>
							<tr>
								<td class="tableColor">开发顾问</td>
								<td colspan="2"><input type="text" name="devconsultant" id="devconsultant"
									class="form-control" /></td>
								<td class="tableColor">开发顾问投入人天总数</td>
								<td colspan="2"><input type="text" name="devconsultantdaytime"
									id="devconsultantdaytime" class="form-control" /></td>
							</tr>
							<tr>
								<td class="tableColor">总人天数</td>
								<td colspan="5"><input type="text" name="sumdaytime" id="sumdaytime" class="form-control" /></td>
							</tr>
							<tr>
								<td colspan="6"></td>
							</tr>
							<tr>
								<td colspan="6" width="100" class="tablehead">第一部分：本周实施情况总结</td>
							</tr>
							<tr>
								<td colspan="6" width="100" class="tablehead">一、本周项目状态</td>
							</tr>
							<tr>
								<td colspan="2">所处阶段</td>
								<td><input type="text" name="stagein" id="stagein" class="form-control" /></td>
								<td>乙方项目经理</td>
								<td colspan="2"><input type="text" name="yiprojectmanager" id="yiprojectmanager"
									class="form-control" /></td>
							</tr>

							<tr>
								<td colspan="2" rowspan="3">总体状态</td>
								<td rowspan="3"></td>
								<td>
									<div class="radio radio-danger">
										<input type="radio" name="radio" id="radio6" value="option6" checked> <label
											for="radio6"> </label>
									</div>
								</td>
								<td colspan="2">进度滞后>10天</td>
							</tr>
							<tr>
								<td>
									<div class="radio radio-warning">
										<input type="radio" name="radio6" id="radio16" value="option6" checked> <label
											for="radio16"> </label>
									</div>
								</td>
								<td colspan="2">进度滞后<=10天</td>
							</tr>
							<tr>
								<td>
									<div class="radio radio-success">
										<input type="radio" name="radio4" id="radio14" value="option4" checked> <label
											for="radio14"> </label>
									</div>
								</td>
								<td colspan="2">项目状态正常</td>
							</tr>
							<tr>
								<td colspan="2">风险提示</td>
								<td colspan="4"><input type="text" name="riskwarning" id="riskwarning"
									class="form-control" /></td>
							</tr>
							<!-- 项目总体进度 -->
							<tr>
								<td colspan="6"></td>
							</tr>
							<tr>
								<td colspan="6" width="100" class="tablehead">二、项目总体进度</td>
							</tr>

							<tr>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>项目规格</td>
								<td style="background-color: #81C868"></td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>蓝图设计</td>
								<td></td>
								<td style="background-color: #81C868"></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>系统建设</td>
								<td></td>
								<td></td>
								<td style="background-color: #81C868"></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>上线切换</td>
								<td></td>
								<td></td>
								<td></td>
								<td style="background-color: #34D3EB"></td>
								<td></td>
							</tr>
							<tr>
								<td>持续支持</td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td style="background-color: #FFBD4A"></td>
							</tr>

							<!-- 本周工作完成情况 -->
							<tr>
								<td colspan="6"></td>
							</tr>
							<tr>
								<td colspan="6" width="100" class="tablehead">三、本周工作完成情况</td>
							</tr>

							<tr>
								<td>序号</td>
								<td>工作任务</td>
								<td>负责人</td>
								<td>开始时间</td>
								<td>结束时间</td>
								<td>说明</td>
							</tr>
							<tr>
								<td>1</td>
								<td><input type="text" name="weekworktask" class="form-control" /></td>
								<td><input type="text" name="weekpersonliable" id="weekpersonliable1"
									class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="weekworkstarttime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="weekworkfinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="weekworkexplain" class="form-control" /></td>
							</tr>
							<tr>
								<div class = "xuhaodiv" ><td>2</td></div>
								<td><input type="text" name="weekworktask" class="form-control" /></td>
								<td><input type="text" name="weekpersonliable" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="weekworkstarttime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="weekworkfinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="weekworkexplain" class="form-control" /></td>
							</tr>
							<tr>
								<td>3</td>
								<td><input type="text" name="weekworktask" class="form-control" /></td>
								<td><input type="text" name="weekpersonliable" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="weekworkstarttime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="weekworkfinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="weekworkexplain" class="form-control" /></td>
							</tr>
							<tr>
								<td>4</td>
								<td><input type="text" name="weekworktask" class="form-control" /></td>
								<td><input type="text" name="weekpersonliable" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="weekworkstarttime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="weekworkfinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="weekworkexplain" class="form-control" /></td>
							</tr>
							<tr>
								<td>5</td>
								<td><input type="text" name="weekworktask" class="form-control" /></td>
								<td><input type="text" name="weekpersonliable" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" id="weekworkstarttime" name="weekworkstarttime">
										<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" id="weekworkfinishtime" name="weekworkfinishtime">
										<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="weekworkexplain" class="form-control" /></td>
							</tr>
							<tr>
								<td>6</td>
								<td><input type="text" name="weekworktask" class="form-control" /></td>
								<td><input type="text" name="weekpersonliable" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="weekworkstarttime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="weekworkfinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="weekworkexplain" class="form-control" /></td>
							</tr>
							<tr>
								<td>7</td>
								<td><input type="text" name="weekworktask" class="form-control" /></td>
								<td><input type="text" name="weekpersonliable" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="weekworkstarttime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="weekworkfinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="weekworkexplain" class="form-control" /></td>
							</tr>

							<!-- 计划未完成工作列表及原因分析 -->
							<tr>
								<td colspan="6"></td>
							</tr>
							<tr>
								<td colspan="6" width="100" class="tablehead">四、计划未完成工作列表及原因分析</td>
							</tr>

							<tr>
								<td>序号</td>
								<td>工作任务</td>
								<td>负责人</td>
								<td colspan="2">未完成原因</td>
								<td>具体措施</td>
							</tr>
							<tr>
								<td>1</td>
								<td><input type="text" name="notfinishtask" class="form-control" /></td>
								<td><input type="text" name="personliable" class="form-control" /></td>
								<td colspan="2"><input type="text" name="notfinishreason" class="form-control" /></td>
								<td><input type="text" name="concretemeasure" class="form-control" /></td>
							</tr>
							<tr>
								<td>2</td>
								<td><input type="text" name="notfinishtask" class="form-control" /></td>
								<td><input type="text" name="personliable" class="form-control" /></td>
								<td colspan="2"><input type="text" name="notfinishreason" class="form-control" /></td>
								<td><input type="text" name="concretemeasure" class="form-control" /></td>
							</tr>
							<tr>
								<td>3</td>
								<td><input type="text" name="notfinishtask" class="form-control" /></td>
								<td><input type="text" name="personliable" class="form-control" /></td>
								<td colspan="2"><input type="text" name="notfinishreason" class="form-control" /></td>
								<td><input type="text" name="concretemeasure" class="form-control" /></td>
							</tr>
							<tr>
								<td>4</td>
								<td><input type="text" name="notfinishtask" class="form-control" /></td>
								<td><input type="text" name="personliable" class="form-control" /></td>
								<td colspan="2"><input type="text" name="notfinishreason" class="form-control" /></td>
								<td><input type="text" name="concretemeasure" class="form-control" /></td>
							</tr>
							<tr>
								<td>5</td>
								<td><input type="text" name="notfinishtask" class="form-control" /></td>
								<td><input type="text" name="personliable" class="form-control" /></td>
								<td colspan="2"><input type="text" name="notfinishreason" class="form-control" /></td>
								<td><input type="text" name="concretemeasure" class="form-control" /></td>
							</tr>
							<tr>
								<td>6</td>
								<td><input type="text" name="notfinishtask" class="form-control" /></td>
								<td><input type="text" name="personliable" class="form-control" /></td>
								<td colspan="2"><input type="text" name="notfinishreason" class="form-control" /></td>
								<td><input type="text" name="concretemeasure" class="form-control" /></td>
							</tr>
							<tr>
								<td>7</td>
								<td><input type="text" name="notfinishtask" class="form-control" /></td>
								<td><input type="text" name="personliable" class="form-control" /></td>
								<td colspan="2"><input type="text" name="notfinishreason" class="form-control" /></td>
								<td><input type="text" name="concretemeasure" class="form-control" /></td>
							</tr>

							<!-- 存在的问题与困难 -->
							<tr>
								<td colspan="6"></td>
							</tr>
							<tr>
								<td colspan="6" width="100" class="tablehead">五、存在的问题与困难</td>
							</tr>

							<tr>
								<td>序号</td>
								<td colspan="2">问题与困难</td>
								<td colspan="2">需要的相应/支持</td>
								<td>期望完成时间</td>
							</tr>
							<tr>
								<td>1</td>
								<td colspan="2"><input type="text" name="problem" class="form-control" /></td>
								<td colspan="2"><input type="text" name="needhelp" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="hopefinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
							</tr>
							<tr>
								<td>2</td>
								<td colspan="2"><input type="text" name="problem" class="form-control" /></td>
								<td colspan="2"><input type="text" name="needhelp" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="hopefinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
							</tr>
							<tr>
								<td>3</td>
								<td colspan="2"><input type="text" name="problem" class="form-control" /></td>
								<td colspan="2"><input type="text" name="needhelp" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="hopefinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
							</tr>
							<tr>
								<td>4</td>
								<td colspan="2"><input type="text" name="problem" class="form-control" /></td>
								<td colspan="2"><input type="text" name="needhelp" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="hopefinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
							</tr>
							<tr>
								<td>5</td>
								<td colspan="2"><input type="text" name="problem" class="form-control" /></td>
								<td colspan="2"><input type="text" name="needhelp" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="hopefinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
							</tr>
							<tr>
								<td>6</td>
								<td colspan="2"><input type="text" name="problem" class="form-control" /></td>
								<td colspan="2"><input type="text" name="needhelp" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="hopefinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
							</tr>
							<tr>
								<td>7</td>
								<td colspan="2"><input type="text" name="problem" class="form-control" /></td>
								<td colspan="2"><input type="text" name="needhelp" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="hopefinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
							</tr>
							<tr>
								<td colspan="6"></td>
							</tr>
							<tr>
								<td colspan="6" width="100" class="tablehead">第二部分：下周实施计划</td>
							</tr>
							<tr>
								<td colspan="6" width="100" class="tablehead">六、下周工作计划安排</td>
							</tr>

							<tr>
								<td>序号</td>
								<td>工作任务</td>
								<td>负责人</td>
								<td>开始时间</td>
								<td>结束时间</td>
								<td>说明</td>
							</tr>
							<tr>
								<td>1</td>
								<td><input type="text" name="nextweektask" class="form-control" /></td>
								<td><input type="text" name="nextpersonliable" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="nextweekstarttime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="nextweekfinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="nextweekexplain1" id="nextweekexplain1"
									class="form-control" /></td>
							</tr>
							<tr>
								<td>2</td>
								<td><input type="text" name="nextweektask" class="form-control" /></td>
								<td><input type="text" name="nextpersonliable" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="nextweekstarttime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="nextweekfinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="nextweekexplain" class="form-control" /></td>
							</tr>
							<tr>
								<td>3</td>
								<td><input type="text" name="nextweektask" class="form-control" /></td>
								<td><input type="text" name="nextpersonliable" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="nextweekstarttime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="nextweekfinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="nextweekexplain" class="form-control" /></td>
							</tr>
							<tr>
								<td>4</td>
								<td><input type="text" name="nextweektask" class="form-control" /></td>
								<td><input type="text" name="nextpersonliable" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="nextweekstarttime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="nextweekfinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="nextweekexplain" class="form-control" /></td>
							</tr>
							<tr>
								<td>5</td>
								<td><input type="text" name="nextweektask" class="form-control" /></td>
								<td><input type="text" name="nextpersonliable" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="nextweekstarttime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="nextweekfinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="nextweekexplain" class="form-control" /></td>
							</tr>
							<tr>
								<td>6</td>
								<td><input type="text" name="nextweektask" class="form-control" /></td>
								<td><input type="text" name="nextpersonliable" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" id="nextweekstarttime6" name="nextweekstarttime6">
										<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="nextweekfinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="nextweekexplain" class="form-control" /></td>
							</tr>
							<tr>
								<td>7</td>
								<td><input type="text" name="nextweektask" class="form-control" /></td>
								<td><input type="text" name="nextpersonliable" class="form-control" /></td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="nextweekstarttime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td>
									<div class="input-group">
										<input type="date" class="form-control" name="nextweekfinishtime"> <span
											class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
									</div>
								</td>
								<td><input type="text" name="nextweekexplain" class="form-control" /></td>
							</tr>
							<tr>
								<td colspan="2">甲方签字</td>
								<td colspan="4"></td>
							</tr>
							<tr>
								<td colspan="2">乙方签字</td>
								<td colspan="4"></td>
							</tr>
							<tr>
								<td><input type="button" value="提交" id="tracysubmit" /></td>
							</tr>

						</tbody>
					</table>
				</form>
			</div>
		</div>
	</div>
	<script>
		$(function() {
			$("#tracysubmit").click(function() {
				alert("666");
				$('form').submit();
			});
			
			$("#sumdaytime").focus(	function() {
				var projectmanagerdaytime = parseInt(V('projectmanagerdaytime').value);
				var impconsultantdaytime = parseInt(V('impconsultantdaytime').value);
				var devconsultantdaytime = parseInt(V('devconsultantdaytime').value);
				V('sumdaytime').value = projectmanagerdaytime + impconsultantdaytime + devconsultantdaytime;
			});
		});
		
		function V(id) {
			return document.getElementById(id);
		}
	</script>
</body>
</html>