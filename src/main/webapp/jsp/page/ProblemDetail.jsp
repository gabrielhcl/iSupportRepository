<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

<link 
	href="${pageContext.request.contextPath}/assets/plugins/summernote/dist/summernote.css" 
	rel="stylesheet" />
<script
	src="${pageContext.request.contextPath}/assets/js/modernizr.min.js"></script>
<script src="${pageContext.request.contextPath}/js/dWeekPlane.js"></script>

</head>
<body style="background-color: #FFFFFF">
	<div class="content">
		<div class="container">
			<div class="page-header">
				<h1>
					运维问题详情
				</h1>
			</div>
			<br>
			<div class="row">
				<div class="col-md-12">
					<form class="form-horizontal" role="form"  method="post" modelAttribute="problem">
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">问题编码</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="${problem.problemcode}" name="problemcode">
							</div>
							<small class="col-md-1 control-label">项目名称</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="${problem.projectname}" name="projectname">
							</div>
							<small class="col-md-1 control-label">客户名称</small>
							<div class="col-md-3">
								<input type="text" class="form-control" disabled="" value="${problem.customername}" name="customername">
							</div>
							
						</div>
						
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">所属集团</small>
							<div class="col-md-3">
								<input type="text" class="form-control" disabled="" value="${problem.companyrelated}" name="companyrelated">
							</div>
							<small class="col-md-1 control-label">对应产品</small>
							<div class="col-md-3">
								<input type="text" class="form-control" disabled="" value="${problem.productrelated}" name="productrelated">
							</div>
							<small class="col-md-1 control-label">对应模块</small>
							<div class="col-md-3">
								<select class="form-control"  name="modulerelated" disabled="disabled">
								<c:forEach items="${glist}" var="group">
									<option value="${group.groupcode}">${group.groupname}</option>
								</c:forEach>
								</select>
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">公司名称</small>
							<div class="col-md-3">
								<input type="text" class="form-control"  value="${problem.corpname}" name="corpname">
							</div>
							<small class="col-md-1 control-label">账套名称</small>
							<div class="col-md-3">
								<input type="text" class="form-control"  value="${problem.accountname}" name="accountname">
							</div>
							<small class="col-md-1 control-label">节点名称</small>
							<div class="col-md-3">
								<input type="text" class="form-control"  value="${problem.nodename}" name="nodename">
							</div>
						</div>
						
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">单据编号</small>
							<div class="col-md-3">
								<input type="text" class="form-control"   value="${problem.billcode}" name="billcode">
							</div>
							<small class="col-md-1 control-label">问题级别</small>
							<div class="col-md-3">
							<c:if test="${problem.problempriority==1}">
							<input type="text" class="form-control" value="一般">
							</c:if>
							<c:if test="${problem.problempriority==2}">
							<input type="text" class="form-control" value="紧急">
							</c:if>
							</div>
							<small class="col-md-1 control-label">问题类型</small>
							<div class="col-md-3">
							<c:if test="${problem.problemtype==1}">
							<input type="text" class="form-control" value="日常操作">
							</c:if>
							<c:if test="${problem.problemtype==2}">
							<input type="text" class="form-control" value="环境问题">
							</c:if>
							<c:if test="${problem.problemtype==3}">
							<input type="text" class="form-control" value="数据库问题">
							</c:if>
							<c:if test="${problem.problemtype==4}">
							<input type="text" class="form-control" value="打印问题">
							</c:if>
							<c:if test="${problem.problemtype==5}">
							<input type="text" class="form-control" value="需求问题">
							</c:if>
							<c:if test="${problem.problemtype==6}">
							<input type="text" class="form-control" value="其他问题">
							</c:if>
							</div>
						</div>
						
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">提交人</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="${problem.submitter}" name="submitter">
							</div>
							<small class="col-md-1 control-label">联系方式</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="${problem.contact}" name="contact">
							</div>
							
							<small class="col-md-1 control-label">提交时间</small>
							<div class="col-md-3 input-daterange input-group" id="date-range">
								<input type="date" class="form-control" id="planestartdate"  name="submitdate" value="${submitdate}" >
								<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
							</div>
							
						</div>
						
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">负责人</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="${problem.officerincharge}" name="officerincharge">
							</div>
							<small class="col-md-1 control-label">处理状态</small>
							<div class="col-md-3">
								<c:if test="${problem.problemstatus==1}">
								<input type="text" class="form-control" value="未处理">
								</c:if>
								<c:if test="${problem.problemstatus==2}">
								<input type="text" class="form-control" value="处理中">
								</c:if>
								<c:if test="${problem.problemstatus==3}">
								<input type="text" class="form-control" value="已完成">
								</c:if>
							</div>
							<small class="col-md-1 control-label">完成时间</small>
							<div class="col-md-3 input-daterange input-group" id="date-range">
								<input type="date" class="form-control" id="finishdate"  name="finishdate" value="${finishdate}">
								<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
							</div>
							
						</div>
						
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">处理时长</small>
							<div class="col-md-3">
								<input type="text" class="form-control" disabled="" placeholder="..分钟" value="${problem.processingtime}" name="processingtime" >
							</div>
							<small class="col-md-1 control-label">支持方式</small>
							<div class="col-md-3">
								<c:if test="${problem.supportmethod==1}">
								<input type="text" class="form-control" value="顾问电话支持">
								</c:if>
								<c:if test="${problem.supportmethod==2}">
								<input type="text" class="form-control" value="400热线支持">
								</c:if>
								<c:if test="${problem.supportmethod==3}">
								<input type="text" class="form-control" value="远程支持">
								</c:if>
								<c:if test="${problem.supportmethod==4}">
								<input type="text" class="form-control" value="在线支持">
								</c:if>
								<c:if test="${problem.supportmethod==5}">
								<input type="text" class="form-control" value="现场支持">
								</c:if>
							</div>
						</div>
						
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">问题描述</small>
							<div class="col-md-11">
								<input type="text" class="form-control" value="${problem.problemdescription}" name="problemdescription">
							</div> 
						</div>
						<div class="form-group" class="col-md-12">
							<small class="col-md-1 control-label">详细描述</small>
							<div class="summernote" name="detaileddescription">
							${problem.detaileddescription}
							</div>
						</div>
						<div  class="form-group" class="col-sm-12">
							<small class="col-md-1 control-label">解决方案</small>
							<div class="col-md-11">
								<textarea required class="form-control" name="solution">${problem.solution}</textarea>
							</div> 
						</div>
						<input name="Button" value="打印" type="button" onclick="window.print()"/>
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

		<script src="${pageContext.request.contextPath}/assets/plugins/summernote/dist/summernote.min.js"></script>
        <script>
            jQuery(document).ready(function(){
                $('.summernote').summernote({
                    height: 350,                 // set editor height
                    minHeight: null,             // set minimum height of editor
                    maxHeight: null,             // set maximum height of editor
                    focus: false                 // set focus to editable area after initializing summernote
                });
                $('.inline-editor').summernote({
                    airMode: true            
                });
            });
        </script>
         
		<script
			src="${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>

		<script
			src="${pageContext.request.contextPath}/assets/pages/jquery.bs-table.js"></script>
			
        <script src="${pageContext.request.contextPath}/assets/plugins/select2/select2.min.js" type="text/javascript"></script>
</body>
</html>