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
						Example page header <small>Subtext for header</small>
					</h1>
				</div>
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-3 column"></div>
			<div class="col-md-6 column b1">
				<br>
				<br>
				<h2 class="blogDetail-title">学生给老师制作表情包被劝退 校方称不知此事</h2>
				<br>
				<p>作者:阿文</p>
				<br>
<%-- 				<p>${userArticle.content}</p> --%>

				<div id="content">
				    <p style="padding: 6px 0px; margin: 0px auto; border: 0px; color: rgb(51, 51, 51); font-family: Arial, Geneva, Helvetica, sans-serif, 宋体; font-size: 14px; white-space: normal;">
    <em><strong>日前，《桂林市教育事业发展“十三五”规划》正式出台。未来5年，我市将通过实施教育“十大工程”，助力解决“入学难”、“大班额”问题。其中，5年内，全市新建乡镇幼儿园45所，市区新建义务教育学校24所，集中力量新建5所城区普通高中，在阳朔、全州、恭城各新建1所公办普通高中。</strong></em>
</p>
<p style="padding: 6px 0px; margin: 0px auto; border: 0px; color: rgb(51, 51, 51); font-family: Arial, Geneva, Helvetica, sans-serif, 宋体; font-size: 14px; white-space: normal;">
    　　近些年来，尤其是“十二五”以来，我市教育事业的改革和发展始终走在全区的前列，但也面临着严峻的挑战，其中，学前教育“入园难”、“入园贵”问题仍然存在。义务教育存在农村空、城镇挤和“大班额”问题，义务教育均衡问题仍需要进一步解决。
</p>
<p style="padding: 6px 0px; margin: 0px auto; border: 0px; color: rgb(51, 51, 51); font-family: Arial, Geneva, Helvetica, sans-serif, 宋体; font-size: 14px; white-space: normal;">
    　<span style="color: rgb(0, 176, 80);">　据市教育局有关负责人介绍，“十三五”期间，我市将推进各级各类教育协调发展，不断提升教育质量，促进教育公平，满足人民群众多元化教育需求，率先在全区基本实现教育现代化。具体举措将突出教育“十大工程”对规划的支撑作用，进一步改善办学条件，增加学位，缓解入学压力。</span>
</p>
<p style="padding: 6px 0px; margin: 0px auto; border: 0px; color: rgb(51, 51, 51); font-family: Arial, Geneva, Helvetica, sans-serif, 宋体; font-size: 14px; white-space: normal;">
    　　未来五年，通过实施“全面改薄”专项工程，全市规划投资42.5亿元，改扩建校舍面积2647737平米。其中，为缓解市区义务教育“入学难”问题，城区新校建设工程“动作”较大。未来5年里，市区新建义务教育学校24所，新增校舍面积485026平米;改扩建义务教育学校项目26个，改造校舍面积191195平米。重点推进桂林市复兴小学，象山区崇善小学迎宾分校、凯风小学万福分校，七星区漓东小学、三联实验学校，叠彩区城北小学，雁山区一小，临桂区四小、临桂四中建设。
</p>
<p>
    <br/>
</p>
				</div>
			</div>
			<div class="col-md-3 column">
				<div class="blogDetail-box">
					<h5 class="text-error">作者:阿文</h5>
<%-- 					<h5 class="text-error">日期:<fmt:formatDate value="${userArticle.createDate}" pattern="yyyy年MM月dd日"/></h5> --%>
					<h5 class="text-error">日期:2017/4/21</h5>
				</div>

			</div>
		</div>

		<div class="row clearfix">
			<div class="col-md-3 column"></div>
			<div class="col-md-6 column b1">
				<br> <br>
				<div class="panel-group" id="panel-584638 ">
					<div class="panel panel-default">
						<div class="panel-heading">
							<a class="panel-title collapsed" data-toggle="collapse"
								data-parent="#panel-584638" href="#panel-element-814366" style="text-decoration: none;">&nbsp&nbsp评论</a>
						</div>
						<div id="panel-element-814366" class="panel-collapse collapse">
							<div class="panel-body">
							<form modelAttribute="userArticle" class="form-signin"
					action="${pageContext.request.contextPath}/articleComment/saveComment"
					method="post" id="form">
<%-- 					<input type="hidden" name="id" value="${userArticle.id }"> --%>
<%-- 					<input type="hidden" name="userId" value="${userArticle.userId }"> --%>
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

				</div>

				<table class="table table-condensed ">
					<tbody>
<%-- 					<c:forEach items="${list}" var="articleCommentTemp"> --%>
<!-- 						<tr> -->
<%-- 								<td>${articleCommentTemp.userNickname}</td> --%>
<%-- 								<td>${articleCommentTemp.content}</td> --%>
<%-- 								<td><fmt:formatDate --%>
<%-- 										value="${articleCommentTemp.createDate}" pattern="yyyy年MM月dd日" /></td> --%>
<!-- 							</tr> -->

<!-- 						<tr> -->
<!-- 								<td>阿绿</td> -->
<!-- 								<td>这老师是傻逼吧</td> -->
<!-- 								<td>2017/4/12</td> -->
<!-- 							</tr> -->
<%-- 					</c:forEach> --%>


<tr>
								<td>阿绿</td>
								<td>这老师是傻逼吧</td>
								<td>2017/4/12</td>
							</tr>
					</tbody>
				</table>
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
