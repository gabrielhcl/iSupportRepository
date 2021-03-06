<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>公司列表</title>

<link
	href="${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.css"
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

        
        
        <script type="text/javascript">
         function search(){
        	 $("#searchForm").submit();
         }
        
        </script>
        
</head>
<body>
<div class="row">
		<div class="col-md-12">
			<div class="card-box">
				<div class="page-header">
					<h1>公司</h1>
					<small>列表</small>
				</div>
				<button id="addbutton"
					class="btn btn-default  waves-light addbutton"  onclick="location='${pageContext.request.contextPath}/corp/addcorp'">
					添加
				</button>
				<br>
				<form modelAttribute="corp" action="${pageContext.request.contextPath}/corp/corplist" method="post" id="searchForm" name="searchForm" class="form-inline searchForm">
					<div class="row">
						<div class="col-sm-12">
							<div class="card-box">
								<table id="demo-custom-toolbar" data-toggle="table"
									data-toolbar="#demo-delete-row" data-search="true"
									data-show-refresh="true" data-show-toggle="true"
									data-sort-name="id" data-page-list="[5, 10, 20]"
									data-page-size="10" data-pagination="true"
									data-show-pagination-switch="true" class="table-bordered ">
									<thead>
										<tr>
											<th   data-sortable="true">公司名称</th>
											<th   data-sortable="true">所属集团名称</th>
											<th   data-sortable="true">备注</th>
											<th   data-sortable="true">操作</th>
										</tr>
									</thead>

									<tbody>
									<c:forEach items="${clist}" var="corp">
										<tr>
											<td>${corp.corpname}</td>
											<td>${corp.groupname}</td>
											<td>${corp.remark}</td>
											<td>
											<a href="${pageContext.request.contextPath}/corp/update?pk_corp=${corp.pk_corp}"onclick="return confirmx('确认要修改该数据吗？', this.href)"
								class="btn btn-info btn-xs"> <i class="fa fa-trash"></i>修改</a>
								<a href="${pageContext.request.contextPath}/corp/delete?pk_corp=${corp.pk_corp}" onclick="return confirmx('确认要删除该数据吗？', this.href)"
								class="btn btn-danger btn-xs"> <i class="fa fa-trash"></i>删除 </a>
											</td>
									</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
					</div>
				</form>
			</div>
		</div>
	</div>



















<!-- <div class="container"> -->
<!-- 	<div class="row clearfix"> -->
<!-- 		<div class="col-md-12 column"> -->
		
		
		
<!-- 		<div class="page-header"> -->
<!-- 				<h1> -->
<!-- 					公司列表 <small>corp list</small> -->
<!-- 				</h1> -->
<!-- 			</div> -->
<%-- 			<form modelAttribute="corp" action="${pageContext.request.contextPath}/corp/corplist" method="post" id="searchForm" name="searchForm" class="form-inline searchForm"> --%>
							
<!-- 							<div class="form-group"> -->
<!-- 								<label class="control-label">公司名称</label> -->
<%-- 								<input name="corpname" value="${corp.corppname}" class="input-sm form-control" /> --%>
<!-- 							</div> -->
<!-- 							<div class="form-group"> -->
<!-- 								<button  class="btn btn-sm btn-primary" onclick="search()"> -->
<!-- 									<i class="fa fa-search"></i> -->
<!-- 									&nbsp;查询 -->
<!-- 								</button> -->
<!-- 								<button type="reset"" class="btn btn-sm btn-primary"> -->
<!-- 									<i class="fa fa-search"></i> -->
<!-- 									&nbsp;重置 -->
<!-- 								</button> -->
								
<!-- 								<button type="button" class="btn btn-sm btn-white" -->
<%-- 										 onclick="location='${pageContext.request.contextPath}/corp/addcorp'"> --%>
<!-- 										<i class="fa fa-plus"></i> -->
<!-- 										&nbsp;添加 -->
<!-- 									</button> -->
<!-- 							</div> -->
<!-- 						<br> -->
<!-- 						<br> -->
<!-- 			<div class="table-responsive"> -->
<!-- 			<table class="table table-bordered"> -->
<!-- 				<thead> -->
<!-- 					<tr> -->
<!-- 						<th>公司编码</th> -->
<!-- 						<th>公司名称</th> -->
<!-- 						<th>所属集团名称</th> -->
<!-- 						<th>备注</th> -->
<!-- 						<th>操作</th> -->
<!-- 					</tr> -->
<!-- 				</thead> -->
<!-- 				<tbody> -->
<%-- 					<c:forEach items="${clist}" var="corp"> --%>
<!-- 						<tr> -->
<%-- 							<th>${corp.corpcode}</th> --%>
<%-- 							<th>${corp.corpname}</th> --%>
<%-- 							<th>${corp.groupname}</th> --%>
<%-- 							<th>${corp.remark}</th> --%>
<!-- 							<td> -->
<%-- 								<a href="${pageContext.request.contextPath}/corp/update?pk_corp=${corp.pk_corp}"onclick="return confirmx('确认要修改该数据吗？', this.href)" --%>
<!-- 								class="btn btn-info btn-xs"> <i class="fa fa-trash"></i>修改</a> -->
<%-- 								<a href="${pageContext.request.contextPath}/corp/delete?pk_corp=${corp.pk_corp}" onclick="return confirmx('确认要删除该数据吗？', this.href)" --%>
<!-- 								class="btn btn-danger btn-xs"> <i class="fa fa-trash"></i>删除 </a> -->
<!-- 							</td> -->
<!-- 						</tr> -->
<%-- 					</c:forEach> --%>
<!-- 				</tbody> -->
<!-- 			</table> -->
<!-- 					<div > -->
<!-- 					<span id="serchResult"></span>   -->
<!-- 					</div> -->
<!-- 			</div> -->
<!-- 			</form> -->
<!-- 		</div> -->
<!-- 	</div> -->
<!-- </div> -->






<script>
		var resizefunc = [];
	</script>

	<!-- jQuery  -->
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/detect.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/fastclick.js"></script>
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
</body>
</html>