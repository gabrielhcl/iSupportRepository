<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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

<script
	src="${pageContext.request.contextPath}/assets/js/modernizr.min.js"></script>
<script src="${pageContext.request.contextPath}/js/dWeekPlane.js"></script>

</head>
<body style="background-color: #FFFFFF">
	<div class="content">
		<div class="container">
			<div class="page-header">
				<h1>
					添加项目信息 <small>area form</small>
				</h1>
			</div>
			<br>
			<div class="row">
				<div class="col-md-12">
					<form class="form-horizontal" role="form">
					
						<div class="form-group" class="col-md-6">
							<h4 class="col-md-6">项目基本信息</h4>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">单据编码</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">项目名称</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">客户名称</small>
							<div class="col-md-3">
								<select class="form-control">
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
								</select>
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">所属集团</small>
							<div class="col-md-3">
								<select class="form-control">
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
									<option>5</option>
								</select>
							</div>
							<small class="col-md-1 control-label">服务时间</small>
							<div class="col-md-7">
								<div class="input-daterange input-group" id="date-range">
									<input name="start" class="form-control" type="date"/>
									<span class="input-group-addon bg-custom b-0 text-white">to</span>
									<input name="end" class="form-control" type="date"/>
								</div>
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<div class="col-md-1"></div>
							<div class="col-md-3">
								<div class="checkbox checkbox-primary">
                                    <input id="checkbox1" type="checkbox">
                                    <label for="checkbox1">
                                       	 是否按照合同签订服务期间执行
                                    </label>
								</div>
							</div>
							<small class="col-md-1 control-label">合同编码</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">合同名称</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">所属区域</small>
							<div class="col-md-3">
								<select class="form-control">
									<option>西北区</option>
									<option>西南区</option>
									<option>四川省区</option>
								</select>
							</div> 
							<small class="col-md-1 control-label">项目地址</small>
							<div class="col-md-7">
								<input type="text" class="form-control" value="">
							</div> 
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">对应产品</small>
							<div class="col-md-3">
								<select class="form-control">
									<option>V5</option>
									<option>V6</option>
									<option>V5营改增</option>
									<option>V6营改增</option>
								</select>
							</div>
							<small class="col-md-1 control-label">模块信息</small>
							<div class="col-md-7">
								
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">备注</small>
							<div class="col-md-11">
								<input type="text" class="form-control" value="">
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">创建人</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">创建日期</small>
							<div class="col-md-3 input-daterange input-group" id="date-range">
								<input type="date" class="form-control" id="planestartdate"  name="planestartdate">
								<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
							</div>
						</div>
						
						
						<div class="form-group" class="col-md-6">
							<h4 class="col-md-6">应用服务器</h4>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">操作系统</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">系统版本</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">品牌</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">CPU类型</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">CPU个数</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">内存</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
						</div>
						
						
						<div class="form-group" class="col-md-6">
							<h4 class="col-md-6">数据库服务器</h4>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">操作系统</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">系统版本</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">品牌</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">CPU类型</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">CPU个数</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">内存</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
						</div>
						
						<div class="form-group" class="col-md-6">
							<h4 class="col-md-6">环境信息</h4>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">WAS情况</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">服务器地址</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">网络带宽</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
						</div>
						<div class="form-group" class="col-md-6">
							<small class="col-md-1 control-label">杀毒软件</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">日常在线数</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
							<small class="col-md-1 control-label">客户端总数</small>
							<div class="col-md-3">
								<input type="text" class="form-control" value="">
							</div>
						</div>
						
						
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