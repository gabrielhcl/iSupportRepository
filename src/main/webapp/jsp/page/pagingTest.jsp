<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
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
	
<style>	
body {
/* 	background-image: url(${pageContext.request.contextPath}/images/001.jpg); */
	background-color:#EBEBEB;
	background-size: cover;
	background-repeat: no-repeat;
}

.a1 {
	resize: none;
	width: 122%;
	height: 100%;
	max-width: 500px;
	max-height: 300px;
}

.b1 {
	background-color: #FFFFFF;
}

.blogDetail-title {
	font-size: 20px;
	line-height: 30px;
	margin: 0;
	padding: 0;
	color: #333;
	font-weight: bold;
	margin-top: -5px;
	padding-bottom: 15px;
	border-bottom: 1px solid #ccc;
}

.blogDetail-box {
	height: auto;
	float: left;
	background: #fff;
	padding: 20px 0;
	border: 1px solid #ddd;
	border-radius: 7px;
	 padding-left :20px;
	 padding-top : 20px;
	 padding-right :20px;
}
.p1{
        width:70px; 
        height:70px; 
        border-radius:200px;
}
.p2{
	width:30px; 
        height:30px;
}
.username{
	    font-size: smaller;
}
.commentdate{
font-size: smaller;
	color: darkgray;
}
</style>

</head>
<body>

<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="page-header">
					<h1>
						新闻详情<small>news detail</small>
					</h1>
				</div>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-3 column"></div>
			<div class="col-md-6 column b1">
				<br>
				<br>
				<h2 class="blogDetail-title">${news.newstitle}</h2>
				<br>
				<p>作者:${user.usercnname}</p>
				<br>
<%-- 				<p>${userArticle.content}</p> --%>

				<div id="content">
				${news.newscontent}
				</div>
			</div>
			<div class="col-md-3 column">
				<div class="blogDetail-box">
					<h5 class="text-error">作者:${user.usercnname}</h5>
<%-- 					<h5 class="text-error">日期:<fmt:formatDate value="${userArticle.createDate}" pattern="yyyy年MM月dd日"/></h5> --%>
					<h5 class="text-error">
					日期:<fmt:formatDate value="${news.newsdate}" pattern="yyyy年MM月dd日"/>
					</h5>
				</div>

			</div>
		</div>

		<div class="row clearfix">
			<div class="col-md-3 column"></div>
			<div class="col-md-6 column b1">
			<br> <br>
				<div class="panel-group" id="panel-584638 ">
<%-- 				<c:if test="${news.iscomment==0}"> --%>
					<div class="panel panel-default">
						<div class="panel-heading">
							<a class="panel-title collapsed" data-toggle="collapse"
								data-parent="#panel-584638" href="#panel-element-814366" style="text-decoration: none;">&nbsp&nbsp评论</a>
						</div>
						<div id="panel-element-814366" class="panel-collapse collapse">
							<div class="panel-body">
							<form  class="form-signin"
					action="${pageContext.request.contextPath}/comment/savecomment?pkNews=${news.pkNews}&newstitle=${news.newstitle}"
					method="post" id="form">
					<input type="hidden" name="pkNews" value="${news.pkNews }">
					<input type="hidden" name="newstitle" value="${news.newstitle }">
								<div class="form-group">
									<div class="col-sm-10">
										<textarea name="content" placeholder="" class="a1"></textarea>
									</div>
								</div>
								<div class="form-group">

									<div class="col-sm-offset-2 col-sm-10"
										style="width: 50%; padding: 0; margin: 0; float: left;">
										<br> &nbsp&nbsp
										<button type="submit" class="btn btn-default">发表评论</button>
									</div>
								</div>
								</form>
							</div>
						</div>
					</div>
<%-- 				</c:if> --%>
				</div>
			
				<div class="card-box">
				<form>
					<div class="row">
						<div class="col-sm-12">
<!-- 							<div class="card-box"> -->
								<table id="demo-custom-toolbar" data-toggle="table"
									data-toolbar="#demo-delete-row" data-search="true"
									data-show-refresh="true" data-show-toggle="true"
									data-sort-name="id" data-page-list="[5, 10, 20]"
									data-page-size="10" data-pagination="true"
									data-show-pagination-switch="true" class="table-bordered ">
									<thead>
										<tr>
											<th   data-sortable="true"> </th>
											<th   data-sortable="true"> </th>
											<th   data-sortable="true"> </th>
										</tr>
									</thead>

									<tbody>
									<c:forEach items="${clist}" var="comment">
										<tr>
											<td class="username">${comment.username}</td>
											<td>${comment.content}</td>
											<td class="commentdate"><fmt:formatDate
 										value="${comment.createdate}" pattern="yyyy/MM/dd" /></td>
									</c:forEach>
									</tbody>
								</table>
<!-- 							</div> -->
						</div>
					</div>
				</form>
			</div>
			</div>
			<div class="col-md-3 column"></div>
		</div>
		<br>
		<br>
		<br>
		<br>
		<br>
		<br>
		<div class="row clearfix">
			<div class="col-md-4 column">
				<dl>
					<dt>Description lists</dt>
					<dd>A description list is perfect for defining terms.</dd>
					<dt>Euismod</dt>
					<dd>Vestibulum id ligula porta felis euismod semper eget
						lacinia odio sem nec elit.</dd>
					<dd>Donec id elit non mi porta gravida at eget metus.</dd>
					<dt>Malesuada porta</dt>
					<dd>Etiam porta sem malesuada magna mollis euismod.</dd>
					<dt>Felis euismod semper eget lacinia</dt>
					<dd>Fusce dapibus, tellus ac cursus commodo, tortor mauris
						condimentum nibh, ut fermentum massa justo sit amet risus.</dd>
				</dl>
			</div>
			<div class="col-md-4 column">
				<address>
					<strong>Twitter, Inc.</strong><br /> 795 Folsom Ave, Suite 600<br />
					San Francisco, CA 94107<br /> <abbr title="Phone">P:</abbr> (123)
					456-7890
				</address>
			</div>
			<div class="col-md-4 column"></div>
		</div>
	</div>









<!-- 	<div class="row"> -->
<!-- 		<div class="col-md-12"> -->
<!-- 			<div class="card-box"> -->
<!-- 				<div class="page-header"> -->
<!-- 					<h1>区域</h1> -->
<!-- 					<small>列表</small> -->
<!-- 				</div> -->
<!-- 				<button id="button" -->
<%-- 					class="btn btn-default  waves-light"  onclick="location='${pageContext.request.contextPath}/area/addarea'"> --%>
<!-- 					添加 -->
<!-- 				</button> -->
<!-- 				<br> -->
<%-- 				<form modelAttribute="area" action="${pageContext.request.contextPath}/area/arealist" method="post" id="searchForm" name="searchForm" class="form-inline searchForm"> --%>
<!-- 					<div class="row"> -->
<!-- 						<div class="col-sm-12"> -->
<!-- 							<div class="card-box"> -->
<!-- 								<table id="demo-custom-toolbar" data-toggle="table" -->
<!-- 									data-toolbar="#demo-delete-row" data-search="true" -->
<!-- 									data-show-refresh="true" data-show-toggle="true" -->
<!-- 									data-sort-name="id" data-page-list="[5, 10, 20]" -->
<!-- 									data-page-size="10" data-pagination="true" -->
<!-- 									data-show-pagination-switch="true" class="table-bordered "> -->
<!-- 									<thead> -->
<!-- 										<tr> -->
<!-- 											<th   data-sortable="true">区域编码</th> -->
<!-- 											<th   data-sortable="true">区域名</th> -->
<!-- 											<th   data-sortable="true">操作</th> -->
<!-- 										</tr> -->
<!-- 									</thead> -->

<!-- 									<tbody> -->
<%-- 									<c:forEach items="${alist}" var="area"> --%>
<!-- 										<tr> -->
<%-- 											<td>${area.areacode}</td> --%>
<%-- 											<td>${area.areaname}</td> --%>
<!-- 											<td><a -->
<%-- 												href="${pageContext.request.contextPath}/area/update?pk_area=${area.pk_area}" --%>
<!-- 												onclick="return confirmx('确认要修改该数据吗？', this.href)" -->
<!-- 												class="btn btn-info btn-xs"> <i class="fa fa-trash"></i>修改 -->
<!-- 											</a> <a -->
<%-- 												href="${pageContext.request.contextPath}/area/delete?pk_area=${area.pk_area}" --%>
<!-- 												onclick="return confirmx('确认要删除该数据吗？', this.href)" -->
<!-- 												class="btn btn-danger btn-xs"> <i class="fa fa-trash"></i>删除 -->
<!-- 											</a></td> -->
<%-- 									</c:forEach> --%>
<!-- 									</tbody> -->
<!-- 								</table> -->
<!-- 							</div> -->
<!-- 						</div> -->
<!-- 					</div> -->
<!-- 				</form> -->
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	</div> -->

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