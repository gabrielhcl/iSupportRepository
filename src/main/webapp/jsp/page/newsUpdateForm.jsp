<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>ueditor demo</title>
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
</head>


<style>
.selectpicker{
	width: 100%;
    height: 38px;
    border-radius: 6px;
}
</style>
<body>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					iSupport <small>新闻修改</small>
				</h1>
			</div>
		</div>
	</div>
	
	<div class="row clearfix">
		<div class="col-md-3 column">
		</div>
		<div class="col-md-6 column">
			<form role="form" action="${pageContext.request.contextPath}/news/savenews?pkNews=${news.pkNews}" method="post">
				<div class="form-group">
				<label for="exampleInputEmail1">新闻类别</label>
				<select class="selectpicker" data-style="btn-white" name="pkColumn">
					<c:forEach items="${clist}" var="column">
						<option value="${column.pkColumn}">${column.columnname}</option>
					</c:forEach>
				</select>
				</div>
				<div class="form-group">
					 <label for="exampleInputEmail1">题目</label><input type="text" class="form-control" name="newstitle" value="${news.newstitle}"/>
					 <input type="hidden" name="newscode" value="${news.newscode }">
					 <input type="hidden" name="newsdate" value="${news.newsdate }">
					 <input type="hidden" name="createby" value="${news.createby }">
				</div>
				
				
				<div class="form-group">
				<div class="form-group">
					<label for="name">新闻简介</label>
					<textarea class="form-control" rows="3" name="newsremarks">${news.newsremarks}</textarea>
				</div>
				</div>
				
				
				
<!-- 				<div class="form-group"> -->
<!-- 					 <label for="exampleInputFile">新闻展示图片</label><input type="file" id="exampleInputFile" /> -->
<!-- 				</div> -->
				<div id="ueditor-input">
				<script id="container" name="newscontent" type="text/plain">
        			${news.newscontent}
    			</script>
    			</div>
    			<br>
    			<div class="form-group">
					<label for="name">允许评论</label>
					<select class="form-control" name="iscomment">
						<option value="0">是</option>
						<option value="1">否</option>
					</select>
				</div>
				<div class="form-group">
					<label for="name">新闻置顶</label>
					<select class="form-control" name="istop">
						<option value="0">是</option>
						<option value="1">否</option>
					</select>
				</div>
    			<br>
				<button type="submit" class="btn btn-default">保存</button>
			</form>
		</div>
		<div class="col-md-3 column">
		</div>
	</div>
</div>

	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/utf8-jsp/ueditor.config.js" ></script>
    <!-- 编辑器源码文件 -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/utf8-jsp/ueditor.all.js"></script>
    <!-- 实例化编辑器 -->
    <script type="text/javascript">
        var ue = UE.getEditor('container');
	</script> 
</body>
</html>