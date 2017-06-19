<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
					运维问题录入
				</h1>
			</div>
			<br>
			<div class="row">
				<div class="col-md-12">
					<form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/problem/saveproblem" method="post" modelAttribute="problem">
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">问题编码</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="" name="problemcode">
							</div>
							<small class="col-md-1 control-label">项目名称</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="" name="projectname">
							</div>
							<small class="col-md-1 control-label">客户名称</small>
							<div class="col-md-3">
								<input type="text" class="form-control" disabled="" value="" name="customername">
							</div>
							
						</div>
						
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">所属集团</small>
							<div class="col-md-3">
								<input type="text" class="form-control" disabled="" value="" name="companyrelated">
							</div>
							<small class="col-md-1 control-label">对应产品</small>
							<div class="col-md-3">
								<input type="text" class="form-control" disabled="" value="" name="productrelated">
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
								<input type="text" class="form-control"  value="" name="corpname">
							</div>
							<small class="col-md-1 control-label">账套名称</small>
							<div class="col-md-3">
								<input type="text" class="form-control"  value="" name="accountname">
							</div>
							<small class="col-md-1 control-label">节点名称</small>
							<div class="col-md-3">
								<input type="text" class="form-control"  value="" name="nodename">
							</div>
						</div>
						
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">单据编号</small>
							<div class="col-md-3">
								<input type="text" class="form-control"   value="" name="billcode">
							</div>
							<small class="col-md-1 control-label">问题级别</small>
							<div class="col-md-3">
								<select class="form-control" name="problempriority">
									<option value="1">一般</option>
									<option value="2">紧急</option>
								</select>
							</div>
							<small class="col-md-1 control-label">问题类型</small>
							<div class="col-md-3">
								<select class="form-control" name="problemtype">
									<option value="1">日常操作</option>
									<option value="2">环境问题</option>
									<option value="3">数据库问题</option>
									<option value="4">打印问题</option>
									<option value="5">需求问题</option>
									<option value="6">其他问题</option>
								</select>
							</div>
						</div>
						
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">提交人</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="" name="submitter">
							</div>
							<small class="col-md-1 control-label">联系方式</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="" name="contact">
							</div>
							<small class="col-md-1 control-label">提交时间</small>
							<div class="col-md-3 input-daterange input-group" id="date-range">
								<input type="date" class="form-control" id="planestartdate"  name="submitdate">
								<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
							</div>
						</div>
						
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">负责人</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="" name="officerincharge">
							</div>
							<small class="col-md-1 control-label">处理状态</small>
							<div class="col-md-3">
								<select class="form-control" name="problemstatus">
									<option value="1">未处理</option>
									<option value="2">处理中</option>
									<option value="3">已完成</option>
								</select>
							</div>
							<small class="col-md-1 control-label">完成时间</small>
							<div class="col-md-3 input-daterange input-group" id="date-range">
								<input type="date" class="form-control" id="finishdate"  name="finishdate">
								<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
							</div>
						</div>
						
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">处理时长</small>
							<div class="col-md-3">
								<input type="text" class="form-control" disabled="" placeholder="..分钟" value="" name="processingtime" >
							</div>
							<small class="col-md-1 control-label">支持方式</small>
							<div class="col-md-3">
								<select class="form-control" name="supportmethod">
									<option value="1">顾问电话支持</option>
									<option value="2">400热线支持</option>
									<option value="3">远程支持</option>
									<option value="4">在线支持</option>
									<option value="5">现场支持</option>
								</select>
							</div>
						</div>
						
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">问题描述</small>
							<div class="col-md-11">
								<input type="text" class="form-control" value="" name="problemdescription">
							</div> 
						</div>
						<div class="form-group" class="col-md-12">
							<small class="col-md-1 control-label">详细描述</small>
							<textarea class="summernote" name="detaileddescription" class="form-control"></textarea>
						</div>
						<div  class="form-group" class="col-sm-12">
							<small class="col-md-1 control-label">解决方案</small>
							<div class="col-md-11">
								<textarea required class="form-control" name="solution"></textarea>
							</div> 
						</div>
						<button type="submit" class="btn btn-default">保存</button>
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