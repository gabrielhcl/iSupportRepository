<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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

</head>
<body>
	<div class="row">
		<div class="col-md-12">
			<div class="card-box">
				<div class="page-header">
					<h1>栏目</h1>
					<small>列表</small>
				</div>
				<button id="button"
					class="btn btn-default  waves-light"  onclick="location='${pageContext.request.contextPath}/column/addcolumn'">
					添加
				</button>
				<br>
				<form modelAttribute="column" action="${pageContext.request.contextPath}/column/columnlist" method="post" id="searchForm" name="searchForm" class="form-inline searchForm">
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
											<th   data-sortable="true">栏目编码</th>
											<th   data-sortable="true">栏目名</th>
											<th   data-sortable="true">备注</th>
											<th   data-sortable="true">操作</th>
										</tr>
									</thead>

									<tbody>
									<c:forEach items="${clist}" var="column">
										<tr>
											<td>${column.columncode}</td>
											<td>${column.columnname}</td>
											<td>${column.columnremark}</td>
											<td><a
												href="${pageContext.request.contextPath}/column/update?pkColumn=${column.pkColumn}"
												onclick="return confirmx('确认要修改该数据吗？', this.href)"
												class="btn btn-info btn-xs"> <i class="fa fa-trash"></i>修改
											</a> <a
												href="${pageContext.request.contextPath}/column/delete?pkColumn=${column.pkColumn}"
												onclick="return confirmx('确认要删除该数据吗？', this.href)"
												class="btn btn-danger btn-xs"> <i class="fa fa-trash"></i>删除
											</a></td>
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