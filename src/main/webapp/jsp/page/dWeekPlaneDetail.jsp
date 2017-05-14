<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
<meta name="author" content="Coderthemes">

<link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/favicon_1.ico">

<title></title>
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
<%-- <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script> --%>



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
				<div class="col-md-3 column"></div>
				<div class="col-md-6 column" align="center">
				<br><br><br><br>
				<h2>${project.customername}</h2>
				<h2>${project.projectname}</h2>
				<h3>项目双周计划及项目状态报告</h3>
				<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
				<br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
					<h3>用友网络科技股份有限公司建筑行业公司</h3>
					<h4><fmt:formatDate value="${nowtime}" pattern="yyyy年MM月dd日"/></h4>
				</div>
				<div class="col-md-3 column"></div>
			</div>
			<br><br><br><br><br><br><br><br><br><br><br><br><br><br>
			<div>
				<form role="form" action="${pageContext.request.contextPath}/dweekplane/savedweekplane" method="post"  >	
					<table data-toggle="table" data-show-columns="false" data-page-list="[5, 10, 20]"
						data-page-size="5" data-pagination="true" data-show-pagination-switch="true"
						class="table-bordered">
						<thead></thead>
						<tbody>
							<tr>
								<td style="background-color: #F4F8FB" >报告日期</td>
								<td colspan="2">
									<div class="input-group">
										<fmt:formatDate value="${dweekplaneh.filldate}" pattern="yyyy年MM月dd日"/>
									</div>
								</td>
								<td class="tableColor">计划开工日期</td>
								<td colspan="2">
									<div class="input-group">
										<fmt:formatDate value="${dweekplaneh.planestartdate}" pattern="yyyy年MM月dd日"/>
									</div>
								</td>
							</tr>
							<tr>
								<td class="tableColor">实际开工日期</td>
								<td colspan="2">
									<div class="input-group">
										<fmt:formatDate value="${dweekplaneh.startprojectdate}" pattern="yyyy年MM月dd日"/>
									</div>
								</td>
								<td class="tableColor">计划完工日期</td>
								<td colspan="2">
									<div class="input-group">
										<fmt:formatDate value="${dweekplaneh.planefinishdate}" pattern="yyyy年MM月dd日"/>
									</div>
								</td>
							</tr>
							<tr>
								<td class="tableColor">项目经理</td>
								<td colspan="2"><input type="text" name="projectmanager" id="projectmanager"
									class="form-control"   disabled="disabled" value="${dweekplaneh.projectmanager}"/></td>
								<td class="tableColor">项目经理投入人天总数</td>
								<td colspan="2"><input type="text" name="projectmanagerdaytime"
									id="projectmanagerdaytime" class="form-control" disabled="disabled" value="${dweekplaneh.projectmanagerdaytime}"/></td>
							</tr>
							<tr>
								<td class="tableColor">实施顾问</td>
								<td colspan="2"><input type="text" name="impconsultant" id="impconsultant"
									class="form-control" disabled="disabled" value="${dweekplaneh.impconsultant}"/></td>
								<td class="tableColor">实施顾问投入人天总数</td>
								<td colspan="2"><input type="text" name="impconsultantdaytime"
									id="impconsultantdaytime" class="form-control" disabled="disabled" value="${dweekplaneh.impconsultantdaytime}"/></td>
							</tr>
							<tr>
								<td class="tableColor">开发顾问</td>
								<td colspan="2"><input type="text" name="devconsultant" id="devconsultant"
									class="form-control" disabled="disabled" value="${dweekplaneh.devconsultant}"/></td>
								<td class="tableColor">开发顾问投入人天总数</td>
								<td colspan="2"><input type="text" name="devconsultantdaytime"
									id="devconsultantdaytime" class="form-control" disabled="disabled" value="${dweekplaneh.devconsultantdaytime}"/></td>
							</tr>
							<tr>
								<td class="tableColor">总人天数</td>
								<td colspan="5"><input type="text" name="sumdaytime" id="sumdaytime" class="form-control" disabled="disabled" value="${dweekplaneh.sumdaytime}"/></td>
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
								<td><input type="text" name="stagein" id="stagein" class="form-control" disabled="disabled" value="${dweekplaneh.stagein}"/></td>
								<td>乙方项目经理</td>
								<td colspan="2"><input type="text" name="yiprojectmanager" id="yiprojectmanager"
									class="form-control" disabled="disabled" value="${dweekplaneh.yiprojectmanager}"/></td>
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
									class="form-control" disabled="disabled" value="${dweekplaneh.riskwarning}"/></td>
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
								<td><input type="date" class="form-control" name="proplstarttime" disabled="disabled"></td>
<!-- 								<td><input type="date" class="form-control" name="proplstarttime"></td> -->
								<td><fmt:formatDate value="${dweekplaneh.proplstarttime}" pattern="yyyy年MM月dd日"/></td>
<!-- 								<td><input type="date" class="form-control" name="bpdesignstarttime"></td> -->
								<td><fmt:formatDate value="${dweekplaneh.bpdesignstarttime}" pattern="yyyy年MM月dd日"/></td>
<!-- 								<td><input type="date" class="form-control" name="sysbuildstarttime"></td> -->
								<td><fmt:formatDate value="${dweekplaneh.sysbuildstarttime}" pattern="yyyy年MM月dd日"/></td>
<!-- 								<td><input type="date" class="form-control" name="onlineswitchstarttime"></td> -->
								<td><fmt:formatDate value="${dweekplaneh.onlineswitchstarttime}" pattern="yyyy年MM月dd日"/></td>
<!-- 								<td><input type="date" class="form-control" name="susupportstarttime"></td> -->
								<td><fmt:formatDate value="${dweekplaneh.susupportstarttime}" pattern="yyyy年MM月dd日"/></td>
							</tr>
							<tr>
								<td>项目规格</td>
								<td>
<!-- 								<select class="form-control" name="proplstatus"> -->
<!-- 									<option value="1">未开始</option> -->
<!-- 									<option value="2">开始</option> -->
<!-- 									<option value="3">完成</option> -->
<!-- 									<option value="4">未完成</option> -->
<!-- 								</select> -->
								<input value="${dweekplaneh.proplstatus}" disabled="disabled"/>
								</td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>蓝图设计</td>
								<td></td>
								<td>
<!-- 								<select class="form-control" name="bpdesignstatus"> -->
<!-- 									<option value="1">未开始</option> -->
<!-- 									<option value="2">开始</option> -->
<!-- 									<option value="3">完成</option> -->
<!-- 									<option value="4">未完成</option> -->
<!-- 								</select> -->
								<input value="${dweekplaneh.bpdesignstatus}" disabled="disabled"/>
								</td>
								<td></td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>系统建设</td>
								<td></td>
								<td></td>
								<td>
<!-- 								<select class="form-control" name="sysbuildstatus"> -->
<!-- 									<option value="1">未开始</option> -->
<!-- 									<option value="2">开始</option> -->
<!-- 									<option value="3">完成</option> -->
<!-- 									<option value="4">未完成</option> -->
<!-- 								</select> -->
								<input value="${dweekplaneh.sysbuildstatus}" disabled="disabled"/>
								</td>
								<td></td>
								<td></td>
							</tr>
							<tr>
								<td>上线切换</td>
								<td></td>
								<td></td>
								<td></td>
								<td>
<!-- 								<select class="form-control" name="onlineswitchstatus"> -->
<!-- 									<option value="1">未开始</option> -->
<!-- 									<option value="2">开始</option> -->
<!-- 									<option value="3">完成</option> -->
<!-- 									<option value="4">未完成</option> -->
<!-- 								</select> -->
								<input value="${dweekplaneh.onlineswitchstatus}" disabled="disabled"/>
								</td>
								<td></td>
							</tr>
							<tr>
								<td>持续支持</td>
								<td></td>
								<td></td>
								<td></td>
								<td></td>
								<td>
<!-- 								<select class="form-control" name="susupportstatus"> -->
<!-- 									<option value="1">未开始</option> -->
<!-- 									<option value="2">开始</option> -->
<!-- 									<option value="3">完成</option> -->
<!-- 									<option value="4">未完成</option> -->
<!-- 								</select> -->
								<input value="${dweekplaneh.susupportstatus}" disabled="disabled"/>
								</td>
							</tr>

							<!-- 本周工作完成情况 -->
							<tr>
								<td colspan="6"></td>
							</tr>
							<tr>
								<td colspan="6" width="100" class="tablehead">三、本周工作完成情况</td>
							</tr>

							<tr>
								<td></td>
								<td>工作任务</td>
								<td>负责人</td>
								<td>开始时间</td>
								<td>结束时间</td>
								<td>说明</td>
							</tr>
							<c:forEach items="${tlist}" var="isSDweekplaneT">
							<tr>
								<td></td>
								<td>${isSDweekplaneT.weekworktask}</td>
								<td>${isSDweekplaneT.weekpersonliable}</td>
								<td>
									<div class="input-group">
										<fmt:formatDate value="${isSDweekplaneT.weekworkstarttime}" pattern="yyyy年MM月dd日"/>
									</div>
								</td>
								<td>
									<div class="input-group">
										<fmt:formatDate value="${isSDweekplaneT.weekworkfinishtime}" pattern="yyyy年MM月dd日"/>
									</div>
								</td>
								<td>${isSDweekplaneT.weekworkexplain}</td>
							</tr>
							</c:forEach>

							<!-- 计划未完成工作列表及原因分析 -->
							<tr>
								<td colspan="6"></td>
							</tr>
							<tr>
								<td colspan="6" width="100" class="tablehead">四、计划未完成工作列表及原因分析</td>
							</tr>

							<tr>
								<td></td>
								<td>工作任务</td>
								<td>负责人</td>
								<td colspan="2">未完成原因</td>
								<td>具体措施</td>
							</tr>
							<c:forEach items="${wlist}" var="isSDweekplaneW">
							<tr>
								<td></td>
								<td>${isSDweekplaneW.notfinishtask}</td>
								<td>${isSDweekplaneW.personliable}</td>
								<td colspan="2">${isSDweekplaneW.notfinishreason}</td>
								<td>${isSDweekplaneW.concretemeasure}</td>
							</tr>
							</c:forEach>

							<!-- 存在的问题与困难 -->
							<tr>
								<td colspan="6"></td>
							</tr>
							<tr>
								<td colspan="6" width="100" class="tablehead">五、存在的问题与困难</td>
							</tr>

							<tr>
								<td></td>
								<td colspan="2">问题与困难</td>
								<td colspan="2">需要的相应/支持</td>
								<td>期望完成时间</td>
							</tr>
							<c:forEach items="${plist}" var="isSDweekplaneP">
							<tr>
								<td></td>
								<td colspan="2">${isSDweekplaneP.problem}</td>
								<td colspan="2">${isSDweekplaneP.needhelp}</td>
								<td>
									<div class="input-group">
										<fmt:formatDate value="${isSDweekplaneP.hopefinishtime}" pattern="yyyy年MM月dd日"/>
									</div>
								</td>
							</tr>
							</c:forEach>
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
								<td></td>
								<td>工作任务</td>
								<td>负责人</td>
								<td>开始时间</td>
								<td>结束时间</td>
								<td>说明</td>
							</tr>
							<c:forEach items="${nlist}" var="isSDweekplaneN">
							<tr>
								<td></td>
								<td>${isSDweekplaneN.nextweektask}</td>
								<td>${isSDweekplaneN.nextpersonliable}</td>
								<td>
									<div class="input-group">
										<fmt:formatDate value="${isSDweekplaneN.nextweekstarttime}" pattern="yyyy年MM月dd日"/>
									</div>
								</td>
								<td>
									<div class="input-group">
										<fmt:formatDate value="${isSDweekplaneN.nextweekfinishtime}" pattern="yyyy年MM月dd日"/>
									</div>
								</td>
								<td>${isSDweekplaneN.nextweekexplain}</td>
							</tr>
							</c:forEach>
							<tr>
								<td colspan="2">甲方签字</td>
								<td colspan="4"></td>
							</tr>
							<tr>
								<td colspan="2">乙方签字</td>
								<td colspan="4"></td>
							</tr>
							<tr>
<!-- 								<td><input type ="button" value = "提交" id="tracysubmit" /></td> -->
							</tr>
						</tbody>
					</table>
<!-- 					<input type="submit" value="提交"> -->
<input name ="Button"  value="打印" type="button" onclick="window.print()" />  

				</form>
			</div>
		</div>
	</div>
	<script>
		$(function() {
// 			$("#tracysubmit").click(function() {
// 				alert("666");
// 				$('form').submit();
// 				alert("777");
// 			});
			
// 			$("#sumdaytime").focus(	function() {
// 				var projectmanagerdaytime = parseInt(V('projectmanagerdaytime').value);
// 				var impconsultantdaytime = parseInt(V('impconsultantdaytime').value);
// 				var devconsultantdaytime = parseInt(V('devconsultantdaytime').value);
// 				V('sumdaytime').value = projectmanagerdaytime + impconsultantdaytime + devconsultantdaytime;
// 			});
		});
		
		function V(id) {
			return document.getElementById(id);
		}
	</script>
</body>
</html>