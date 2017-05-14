<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>主计划详情</title>
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
<link
	href="${pageContext.request.contextPath}/${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.css"
	rel="stylesheet" type="text/css" />

<link
	href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath}/${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.css"
	rel="stylesheet" type="text/css" />

<link
	href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/core.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath}/assets/css/components.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/icons.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/pages.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath}/assets/css/responsive.css"
	rel="stylesheet" type="text/css" />

<script
	src="${pageContext.request.contextPath}/assets/js/modernizr.min.js"></script>
<script src="${pageContext.request.contextPath}/js/dWeekPlane.js"></script>

</head>
<body style="background-color: #FFFFFF">
	<div class="content">
		<div class="container">
			<div class="page-header">
				<h1>
					主计划详情 
				</h1>
			</div>
			<br>
			<div class="row">
				<div class="col-md-12">
					<form class="form-horizontal" role="form"  method="post">

						<!-- 项目总人天 -->
						<div class="card-box">
							<div class="form-group" class="col-md-6">
								<h3>计划基本信息</h3>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label" name="sp_code" id="sp_code">计划编码</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${mainplanh.mainplancode }">
								</div>
								<small class="col-md-1 control-label">计划名称</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${mainplanh.mainplanname }">
								</div>
								<small class="col-md-1 control-label">项目名称</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${mainplanh.projectname }">
								</div>
								<small class="col-md-1 control-label">编制人</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${mainplanh.compiler }">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">编制日期</small>
								<div class="col-md-2">
									<fmt:formatDate value="${mainplanh.compiledate}" pattern="yyyy/MM/dd"/>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${mainplanh.pstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${mainplanh.penddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${mainplanh.plancycle }">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${mainplanh.sumdaytime }">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${mainplanh.pmnum }">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${mainplanh.pmdays }">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${mainplanh.imnum }">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${mainplanh.imdays }">
								</div>
							</div>
						</div>

						<!-- 1、项目规划 -->
						<div class="card-box">
							<div class="form-group" class="col-md-6">
								<h3>1 项目规划</h3>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode1.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode1.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode1.splancycle}">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${plancode1.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode1.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode1.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode1.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode1.simdays}">
								</div>
							</div>

							<!-- 1.1、组件用友顾问团队 -->
							<div class="form-group" class="col-md-6">
								<h4>1.1 组建用友顾问团队</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode11.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode11.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode11.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode11.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode11.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode11.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode11.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode11.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode11.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode11.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode11.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode11.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode11.sremark}" id="memo11">
								</div>
							</div>

							<!-- 1.2 组建客户实施组织 -->
							<div class="form-group" class="col-md-6">
								<h4>1.2 组建客户实施组织</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode12.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode12.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode12.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode12.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode12.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode12.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode12.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode12.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode12.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode12.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode12.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode12.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode12.sremark}" id="memo11">
								</div>
							</div>
							

							<!-- 1.3 制定项目主计划 -->
							<div class="form-group" class="col-md-6">
								<h4>1.3 制定项目主计划</h4>
							</div>
							<<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode13.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode13.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode13.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode13.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode13.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode13.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode13.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode13.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode13.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode13.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode13.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode13.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode13.sremark}" id="memo11">
								</div>
							</div>
							

							<!-- 1.4 与关键用户确认实施主计划 -->
							<div class="form-group" class="col-md-6">
								<h4>1.4 与关键用户确认实施主计划</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode14.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode14.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode14.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode14.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode14.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode14.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode14.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode14.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode14.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode14.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode14.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode14.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode14.sremark}" id="memo11">
								</div>
							</div>
							
							
							

							<!-- 1.5 项目启动会 -->
							<div class="form-group" class="col-md-6">
								<h4>1.5 项目启动会</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode15.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode15.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode15.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode15.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode15.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode15.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode15.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode15.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode15.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode15.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode15.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode15.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode15.sremark}" id="memo11">
								</div>
							</div>
							
							

							<!-- 1.6 里程碑回顾与评估 -->
							<div class="form-group" class="col-md-6">
								<h4>1.6 里程碑回顾与评估</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode16.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode16.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode16.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode16.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode16.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode16.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode16.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode16.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode16.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode16.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode16.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode16.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode16.sremark}" id="memo11">
								</div>
							</div>
						</div>	
							
							
							

						<!-- 2、蓝图设计 -->
						<div class="card-box">
							<div class="form-group" class="col-md-6">
								<h3>2 蓝图设计</h3>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode2.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode2.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode2.splancycle}">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${plancode2.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode2.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode2.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode2.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode2.simdays}">
								</div>
							</div>

							
							
							
							
							

							<!-- 2.1 业务需求调研与基础档案收集规划 -->
							<div class="form-group" class="col-md-6">
								<h4>2.1 业务需求调研与基础档案收集规划</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode21.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode21.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode21.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode21.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode21.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode21.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode21.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode21.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode21.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode21.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode21.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode21.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode21.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							
							
							
							
							
							
							
							

							<!-- 2.2 需求调研与需求报告确认 -->
							<div class="form-group" class="col-md-6">
								<h4>2.2 需求调研与需求报告确认</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode22.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode22.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode22.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode22.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode22.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode22.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode22.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode22.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode22.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode22.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode22.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode22.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode22.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							

							<!-- 2.3 业务解决方案设计 -->
							<div class="form-group" class="col-md-6">
								<h4>2.3 业务解决方案设计</h4>
							</div>
						<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode23.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode23.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode23.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode23.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode23.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode23.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode23.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode23.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode23.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode23.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode23.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode23.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode23.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							

							<!-- 2.4 业务方案初步验证 -->
							<div class="form-group" class="col-md-6">
								<h4>2.4 业务方案初步验证</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode24.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode24.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode24.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode24.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode24.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode24.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode24.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode24.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode24.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode24.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode24.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode24.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode24.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							

							<!-- 2.5 方案评估 -->
							<div class="form-group" class="col-md-6">
								<h4>2.5 方案评估</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode25.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode25.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode25.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode25.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode25.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode25.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode25.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode25.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode25.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode25.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode25.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode25.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode25.sremark}" id="memo11">
								</div>
							</div>
							
							

							<!-- 2.6 里程碑回顾与评估 -->
							<div class="form-group" class="col-md-6">
								<h4>2.6 里程碑回顾与评估</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode26.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode26.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode26.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode26.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode26.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode26.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode26.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode26.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode26.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode26.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode26.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode26.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode26.sremark}" id="memo11">
								</div>
							</div>
						</div>
							

						<!-- 3、系统建设 -->
						<div class="card-box">
							<div class="form-group" class="col-md-6">
								<h3>3 系统建设</h3>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode3.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode3.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode3.splancycle}">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${plancode3.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode3.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode3.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode3.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode3.simdays}">
								</div>
							</div>

							

							<!-- 3.1 新系统硬件安装 -->
							<div class="form-group" class="col-md-6">
								<h4>3.1 新系统硬件安装</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode31.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode31.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode31.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode31.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode31.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode31.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode31.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode31.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode31.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode31.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode31.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode31.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode31.sremark}" id="memo11">
								</div>
							</div>
							
							

							<!-- 3.2 技术顾问安装部署新产品环境 -->
							<div class="form-group" class="col-md-6">
								<h4>3.2 技术顾问安装部署新产品环境</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode32.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode32.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode32.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode32.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode32.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode32.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode32.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode32.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode32.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode32.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode32.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode32.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode32.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							

							<!-- 3.3 将收集整理后，并且确认的基础档案导入到新系统中 -->
							<div class="form-group" class="col-md-6">
								<h4>3.3 将收集整理后，并且确认的基础档案导入到新系统中</h4>
							</div>
						<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode33.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode33.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode33.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode33.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode33.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode33.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode33.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode33.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode33.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode33.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode33.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode33.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode33.sremark}" id="memo11">
								</div>
							</div>
							
							
							

							<!-- 3.4 将初始化完成的系统导出，建立方案测试系统 -->
							<div class="form-group" class="col-md-6">
								<h4>3.4 将初始化完成的系统导出，建立方案测试系统</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode34.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode34.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode34.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode34.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode34.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode34.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode34.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode34.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode34.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode34.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode34.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode34.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode34.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							
							

							<!-- 3.5 关键用户测试验证业务解决方案 -->
							<div class="form-group" class="col-md-6">
								<h4>3.5 关键用户测试验证业务解决方案</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode35.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode35.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode35.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode35.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode35.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode35.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode35.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode35.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode35.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode35.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode35.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode35.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode35.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							

							<!-- 3.6 财务与资金业务解决方案验收 -->
							<div class="form-group" class="col-md-6">
								<h4>3.6 财务与资金业务解决方案验收</h4>
							</div>
								<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode36.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode36.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode36.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode36.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode36.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode36.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode36.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode36.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode36.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode36.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode36.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode36.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode36.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							
							
							
							

							<!-- 3.7 编制财务与资金管理操作手册 -->
							<div class="form-group" class="col-md-6">
								<h4>3.7 编制财务与资金管理操作手册</h4>
							</div>
								<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode37.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode37.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode37.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode37.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode37.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode37.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode37.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode37.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode37.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode37.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode37.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode37.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode37.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							
							

							<!-- 3.8 里程碑回顾与评估 -->
							<div class="form-group" class="col-md-6">
								<h4>3.8 里程碑回顾与评估</h4>
							</div>
								<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode38.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode38.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode38.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode38.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode38.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode38.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode38.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode38.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode38.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode38.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode38.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode38.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode38.sremark}" id="memo11">
								</div>
							</div>
							</div>
							
							
							
							
							
							
							
							
							

						<!-- 4 上线切换 -->
						<div class="card-box">
							<div class="form-group" class="col-md-6">
								<h3>
									4 上线切换</small>
								</h3>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode4.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode4.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode4.splancycle}">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${plancode4.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode4.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode4.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode4.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode4.simdays}">
								</div>
							</div>
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							

							<!-- 4.1 生产环境初始化 -->
							<div class="form-group" class="col-md-6">
								<h4>4.1 生产环境初始化</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode41.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode41.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode41.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode41.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode41.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode41.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode41.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode41.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode41.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode41.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode41.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode41.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode41.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							

							<!-- 4.2 报表系统初始化设置 -->
							<div class="form-group" class="col-md-6">
								<h4>4.2 报表系统初始化设置</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode42.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode42.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode42.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode42.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode42.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode42.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode42.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode42.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode42.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode42.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode42.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode42.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode42.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							
							
							
							
							
							

							<!-- 4.3 期初数据收集工作指导 -->
							<div class="form-group" class="col-md-6">
								<h4>4.3 期初数据收集工作指导</h4>
							</div>
								<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode43.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode43.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode43.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode43.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode43.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode43.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode43.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode43.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode43.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode43.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode43.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode43.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode43.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							
							
							
							
							
							

							<!-- 4.4 备份生产环境，生成培训环境，制定最终用户培训计划和培训PPT -->
							<div class="form-group" class="col-md-6">
								<h4>4.4 备份生产环境，生成培训环境，制定最终用户培训计划和培训PPT</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode44.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode44.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode44.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode44.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode44.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode44.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode44.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode44.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode44.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode44.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode44.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode44.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode44.sremark}" id="memo11">
								</div>
							</div>
							
							
							<!-- 4.5 培训环境检查，确保培训效果 -->
							<div class="form-group" class="col-md-6">
								<h4>4.5 培训环境检查，确保培训效果</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode45.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode45.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode45.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode45.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode45.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode45.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode45.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode45.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode45.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode45.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode45.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode45.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode45.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							

							<!-- 4.6 最终用户培训及上线确认 -->
							<div class="form-group" class="col-md-6">
								<h4>4.6 最终用户培训及上线确认</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode46.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode46.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode46.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode46.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode46.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode46.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode46.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode46.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode46.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode46.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode46.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode46.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode46.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							
							
							
							

							<!-- 4.7 里程碑回顾与评估 -->
							<div class="form-group" class="col-md-6">
								<h4>4.7 里程碑回顾与评估</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode47.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode47.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode47.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode47.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode47.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode47.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode47.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode47.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode47.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode47.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode47.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode47.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode47.sremark}" id="memo11">
								</div>
							</div>
						</div>	
						
							
							
							
							
							
							
							
							
							

						<!-- 5 持续支持 -->
						<div class="card-box">
							<div class="form-group" class="col-md-6">
								<h3>
									5 持续支持</small>
								</h3>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode5.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode5.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode5.splancycle}">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${plancode5.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode5.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode5.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode5.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode5.simdays}">
								</div>
							</div>

							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							

							<!-- 5.1 运行支持及优化 -->
							<div class="form-group" class="col-md-6">
								<h4>5.1 运行支持及优化</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode51.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode51.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode51.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode51.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode51.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode51.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode51.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode51.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode51.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode51.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode51.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode51.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode51.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							
							
							
							
							

							<!-- 5.2 项目总结及收尾 -->
							<div class="form-group" class="col-md-6">
								<h4>5.2 项目总结及收尾</h4>
							</div>
								<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode52.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode52.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode52.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode52.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode52.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode52.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode52.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode52.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode52.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode52.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode52.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode52.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode52.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							

							<!-- 5.3 里程碑回顾与评估 -->
							<div class="form-group" class="col-md-6">
								<h4>5.3 里程碑回顾与评估</h4>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode53.spstartdate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<fmt:formatDate value="${plancode53.spenddate}" pattern="yyyy/MM/dd"/>
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"      value="${plancode53.splancycle}">
									 
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" value="${plancode53.alldays}"   >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" value="${plancode53.spmnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" value="${plancode53.spmdays}"    >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" value="${plancode53.simnum}" onclick="btn_human(11)"  >
									 
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" value="${plancode53.simdays}"    >
									 
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode53.ufrole}" id="yonyourole11">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="" value="${plancode53.custrole}" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode53.servicecontent}" id="servicecontent11"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" value="${plancode53.ufdocument}" id="yonyoufile11"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode53.sremark}" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							
							</div>
						</div>
						<input name ="Button"  value="打印" type="button" onclick="window.print()" />  
					</form>
				</div>
			</div>

		</div>

		<script>
			var resizefunc = [];
		</script>

		<!-- jQuery  -->
		<script
			src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/detect.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/js/fastclick.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/js/jquery.slimscroll.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/js/jquery.blockUI.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/waves.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/wow.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/js/jquery.nicescroll.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/js/jquery.scrollTo.min.js"></script>


		<script
			src="${pageContext.request.contextPath}/assets/js/jquery.core.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/js/jquery.app.js"></script>

		<script
			src="${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>

		<script
			src="${pageContext.request.contextPath}/assets/plugins/bootstrap-inputmask/bootstrap-inputmask.min.js"
			type="text/javascript"></script>
		<script
			src="${pageContext.request.contextPath}/assets/plugins/autoNumeric/autoNumeric.js"
			type="text/javascript"></script>
		<script
			src="${pageContext.request.contextPath}/assets/pages/jquery.bs-table.js"></script>

		<script
			src="${pageContext.request.contextPath}/assets/plugins/select2/select2.min.js"
			type="text/javascript"></script>
			
		<script type="text/javascript">
			jQuery(function($) {
			    $('.autonumber').autoNumeric('init');    
			});
        </script>
</body>
</html>