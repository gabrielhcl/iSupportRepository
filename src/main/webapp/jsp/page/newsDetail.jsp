<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>新闻详情</title>
<!-- 	引入bootstrap -->
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="${pageContext.request.contextPath}/assets/plugins/utf8-jsp/ueditor.parse.js"></script>
<script type="text/javascript">
    uParse('.content', {
        rootPath: '${pageContext.request.contextPath}/assets/plugins/utf8-jsp'
    })
    </script>
<script
	src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script
	src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<!--    引入jquery -->
<script
	src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<style>
.col-center-block {
	float: none;
	display: block;
	margin-left: auto;
	margin-right: auto;
}

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
</style>
<!-- 强制刷新页面 -->
<script type="text/javascript">
	if (window != "shuaxin") {
		location.reload;
		window.name = "shuaxin";
	} else {
		window.name = "";
	}

	function clickFabulous(articleId) {

		$
				.ajax({
					url : "${pageContext.request.contextPath}/userArticle/articleFabulous",
					data : {
						"articleId" : articleId
					},
					dataType : "json",
					type : "post",

					success : function(data) {
						if (data.status == "success") {
							// 						alert(articleId);
							$("#showResult").html(data.fabulous);
						} else {
							$("#showResult").html(
									"<font color='red'>系统错误</font>");
						}
					}
				});
	}
</script>
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
				<c:if test="${news.iscomment==0}">
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
				</c:if>
				</div>

				<table class="table table-condensed ">
					<tbody>
					<c:forEach items="${clist}" var="comment">
						<tr>
								<td>${comment.username}</td>
								<td>${comment.content}</td>
								<td><fmt:formatDate
 										value="${comment.createdate}" pattern="yyyy年MM月dd日" /></td> 
							</tr>

					</c:forEach>


					</tbody>
				</table>
				
				
				
				
				
<!--------------------------------------------------------------------------------------------------------------- -->
				
				
				
<!-- 				<div class="card-box"> -->
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
<!-- 											<th   data-sortable="true"> </th> -->
<!-- 											<th   data-sortable="true"> </th> -->
<!-- 											<th   data-sortable="true"> </th> -->
<!-- 										</tr> -->
<!-- 									</thead> -->

<!-- 									<tbody> -->
<%-- 									<c:forEach items="${clist}" var="comment"> --%>
<!-- 						<tr> -->
<%-- 								<td>${comment.username}</td> --%>
<%-- 								<td>${comment.content}</td> --%>
<%-- 								<td><fmt:formatDate --%>
<%-- 										value="${comment.createdate}" pattern="yyyy年MM月dd日" /></td>  --%>
<!-- 							</tr> -->

<%-- 					</c:forEach> --%>
<!-- 									</tbody> -->
<!-- 								</table> -->
<!-- 							</div> -->
<!-- 						</div> -->
<!-- 					</div> -->
<!-- 				</form> -->
<!-- 			</div> -->
				
				
<!--------------------------------------------------------------------------------------------------------------- -->
				
				
				
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
</body>
</html>
