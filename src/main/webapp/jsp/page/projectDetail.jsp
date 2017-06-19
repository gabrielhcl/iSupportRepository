<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>项目信息修改</title>
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
					项目详细信息 <small>project detail</small>
				</h1>
			</div>
			<br>
			<div class="row">
				<div class="col-md-12">
					<form class="form-horizontal" role="form" action="${pageContext.request.contextPath}/project/saveproject?pkProject=${project.pkProject}" method="post" modelAttribute="project">
					
						<div class="form-group" class="col-md-6">
							<h4 class="col-md-6">项目基本信息</h4>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">单据编码</small>
							<div class="col-md-3">
								<input disabled="disabled" type="text" class="form-control" value="${project.billcode}" name="billcode">
							</div>
							<small class="col-md-1 control-label">项目名称</small>
							<div class="col-md-3">
								<input disabled="disabled" type="text" class="form-control" value="${project.projectname}" name="projectname">
							</div>
							<small class="col-md-1 control-label">客户名称</small>
							<div class="col-md-3">
							<input disabled="disabled" type="text" class="form-control" value="${project.customername}">
<!-- 								<select class="form-control" name="customername"> -->
<!-- 									<option value="1">1</option> -->
<!-- 									<option value="2">2</option> -->
<!-- 									<option value="3">3</option> -->
<!-- 									<option value="4">4</option> -->
<!-- 									<option value="5">5</option> -->
<!-- 								</select> -->
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">所属集团</small>
							<div class="col-md-3">
							<input disabled="disabled" type="text" class="form-control" value="${group.groupname}">
<!-- 								<select class="form-control"  name="groupcode"> -->
<!-- 									<option value="1">1</option> -->
<!-- 									<option value="2">2</option> -->
<!-- 									<option value="3">3</option> -->
<!-- 									<option value="4">4</option> -->
<!-- 									<option value="5">5</option> -->
<!-- 								</select> -->
							</div>
							<small class="col-md-1 control-label">服务时间</small>
							<div class="col-md-7">
								<div class="input-daterange input-group" id="date-range">
									<input  class="form-control" type="date" name="servicestimef" value="${servicestime}"/>
<%-- 									<fmt:formatDate value="${project.servicestime}" pattern="yyyy/MM/dd"/> --%>
									<span class="input-group-addon bg-custom b-0 text-white">to</span>
<!-- 									<span><h3>to</h3></span> -->
									<input   class="form-control" type="date" name="serviceftimef" value="${serviceftime}"/>
<!-- 										&nbsp to &nbsp -->
<%-- 									<fmt:formatDate value="${project.serviceftime}" pattern="yyyy/MM/dd"/> --%>
								</div>
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<div class="col-md-1"></div>
							<div class="col-md-3">
								<div class="checkbox checkbox-primary">
                                    <input id="checkbox1" type="checkbox" name="isimplement" <c:if test="${project.isimplement==1}">checked="checked"</c:if>>
                                    <label for="checkbox1">
                                       	 是否按照合同签订服务期间执行
                                    </label>
								</div>
							</div>
							<small class="col-md-1 control-label">合同编码</small>
							<div class="col-md-3">
								<input disabled="disabled"  type="text" class="form-control" value="${project.contractcode}" name="contractcode">
							</div>
							<small class="col-md-1 control-label">合同名称</small>
							<div class="col-md-3">
								<input  disabled="disabled" type="text" class="form-control" value="${project.contractname}" name="contractname">
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">所属区域</small>
							<div class="col-md-3">
							<input disabled="disabled" type="text" class="form-control" value="${area.areaname}">
<!-- 								<select class="form-control" name="areacode"> -->
<!-- 									<option value="1">西北区</option> -->
<!-- 									<option value="2">西南区</option> -->
<!-- 									<option value="3">四川省区</option> -->
<!-- 								</select> -->
							</div> 
							<small class="col-md-1 control-label">项目地址</small>
							<div class="col-md-7">
								<input disabled="disabled"  type="text" class="form-control" value="${project.address}" name="address">
							</div> 
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">对应产品</small>
							<div class="col-md-3">
							<input disabled="disabled" type="text" class="form-control" value="${project.productcode}">
<!-- 								<select class="form-control" name="productcode"> -->
<!-- 									<option value="1">V5</option> -->
<!-- 									<option value="2">V6</option> -->
<!-- 									<option value="3">V5营改增</option> -->
<!-- 									<option value="4">V6营改增</option> -->
<!-- 								</select> -->
							</div>
							<small class="col-md-1 control-label">模块信息</small>
							<div class="col-md-7">
								<input  disabled="disabled" type="text" class="form-control" value="${project.modulemessage}" name="modulemessage">
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">备注</small>
							<div class="col-md-11">
								<input  disabled="disabled" type="text" class="form-control" value="${project.remark}" name="remark">
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">创建人</small>
							<div class="col-md-3">
								<input disabled="disabled"  type="text" class="form-control" value="${project.createby}" name="createby">
							</div>
							<small class="col-md-1 control-label">创建日期</small>
							<div class="col-md-3 input-daterange input-group" id="date-range">
								<input type="date" class="form-control" id="planestartdate"  name="createdatef" value="${createdate}">
<%-- 								<fmt:formatDate value="${project.createdate}" pattern="yyyy/MM/dd"/> --%>
								<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
							</div>
						</div>
						
						
						<div class="form-group" class="col-md-6">
							<h4 class="col-md-6">应用服务器</h4>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">操作系统</small>
							<div class="col-md-3">
								<input disabled="disabled"  type="text" class="form-control" value="${project.appos}" name="appos">
							</div>
							<small class="col-md-1 control-label">系统版本</small>
							<div class="col-md-3">
								<input  disabled="disabled"  type="text" class="form-control" value="${project.appsysversion}" name="appsysversion">
							</div>
							<small class="col-md-1 control-label">品牌</small>
							<div class="col-md-3">
								<input  disabled="disabled" type="text" class="form-control" value="${project.appbrand}" name="appbrand">
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">CPU类型</small>
							<div class="col-md-3">
								<input  disabled="disabled"  type="text" class="form-control" value="${project.appcpu}" name="appcpu">
							</div>
							<small class="col-md-1 control-label">CPU个数</small>
							<div class="col-md-3">
								<input  disabled="disabled" type="text" class="form-control" value="${project.appcpu}" name="appcpunum">
							</div>
							<small class="col-md-1 control-label">内存</small>
							<div class="col-md-3">
								<input  disabled="disabled" type="text" class="form-control" value="${project.appram}" name="appram">
							</div>
						</div>
						
						
						<div class="form-group" class="col-md-6">
							<h4 class="col-md-6">数据库服务器</h4>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">操作系统</small>
							<div class="col-md-3">
								<input  disabled="disabled" type="text" class="form-control" value="${project.dbos}" name="dbos">
							</div>
							<small class="col-md-1 control-label">系统版本</small>
							<div class="col-md-3">
								<input  disabled="disabled" type="text" class="form-control" value="${project.dbosversion}" name="dbosversion">
							</div>
							<small class="col-md-1 control-label">品牌</small>
							<div class="col-md-3">
								<input disabled="disabled"  type="text" class="form-control" value="${project.dbbrand}" name="dbbrand">
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">CPU类型</small>
							<div class="col-md-3">
								<input  disabled="disabled" type="text" class="form-control" value="${project.dbcpu}" name="dbcpu"> 
							</div>
							<small class="col-md-1 control-label">CPU个数</small>
							<div class="col-md-3">
								<input  disabled="disabled" type="text" class="form-control" value="${project.dbcpunum}" name="dbcpunum">
							</div>
							<small class="col-md-1 control-label">内存</small>
							<div class="col-md-3">
								<input  disabled="disabled" type="text" class="form-control" value="${project.dbram}" name="dbram">
							</div>
						</div>
						
						<div class="form-group" class="col-md-6">
							<h4 class="col-md-6">环境信息</h4>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">WAS情况</small>
							<div class="col-md-3">
								<input  disabled="disabled" type="text" class="form-control" value="${project.wasstarus}" name="wasstarus">
							</div>
							<small class="col-md-1 control-label">服务器地址</small>
							<div class="col-md-3">
								<input  disabled="disabled" type="text" class="form-control" value="${project.serveraddress}" name="serveraddress">
							</div>
							<small class="col-md-1 control-label">网络带宽</small>
							<div class="col-md-3">
								<input  disabled="disabled" type="text" class="form-control" value="${project.typewidth}" name="typewidth">
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">杀毒软件</small>
							<div class="col-md-3">
								<input  disabled="disabled" type="text" class="form-control" value="${project.antivirussoftware}" name="antivirussoftware">
							</div>
							<small class="col-md-1 control-label">日常在线数</small>
							<div class="col-md-3">
								<input disabled="disabled"  type="text" class="form-control" value="${project.onlinenum}" name="onlinenum">
							</div>
							<small class="col-md-1 control-label">客户端总数</small>
							<div class="col-md-3">
								<input  disabled="disabled"  type="text" class="form-control" value="${project.clientnum}" name="clientnum">
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
			src="${pageContext.request.contextPath}/assets/pages/jquery.bs-table.js"></script>
			
        <script src="${pageContext.request.contextPath}/assets/plugins/select2/select2.min.js" type="text/javascript"></script>
</body>
</html>