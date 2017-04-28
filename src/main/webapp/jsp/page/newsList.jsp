<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>信息列表</title>
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
					<h1>新闻列表</h1>
				</div>
				<button id="addbutton"
					class="btn btn-default  waves-light addbutton"  onclick="location='${pageContext.request.contextPath}/news/addnews'">
					添加
				</button>
				<br>
				<form modelAttribute="project" action="${pageContext.request.contextPath}/news/newslist" method="post" id="searchForm" name="searchForm" class="form-inline searchForm">
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
											<th   data-sortable="true">题目</th>
											<th   data-sortable="true">日期</th>
											<th   data-sortable="true">操作</th>
										</tr>
									</thead>

									<tbody>
									<c:forEach items="${nlist}" var="news">
										<tr>
											<td>${news.newstitle}</td>
											<td><fmt:formatDate value="${news.newsdate}" pattern="yyyy年MM月dd日hh:mm"/></td>
											<td>
											<a
												href="${pageContext.request.contextPath}/news/newsdetail?pkNews=${news.pkNews}&newstitle=${news.newstitle}"
												onclick="return confirmx('确认要删除该数据吗？', this.href)"
												class="btn btn-success btn-xs"> <i class="fa fa-trash"></i>查看
											</a>
											<a
												href="${pageContext.request.contextPath}/news/update?pkNews=${news.pkNews}"
												onclick="return confirmx('确认要修改该数据吗？', this.href)"
												class="btn btn-info btn-xs"> <i class="fa fa-trash"></i>修改
											</a> <a
												href="${pageContext.request.contextPath}/news/delete?pkNews=${news.pkNews}"
												onclick="return confirmx('确认要删除该数据吗？', this.href)"
												class="btn btn-danger btn-xs"> <i class="fa fa-trash"></i>删除
											</a>
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