<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
<!--     <meta charset="utf-8"> -->
    <title>ueditor demo</title>
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-1.9.1.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.form.js"></script> 
    <script type="text/javascript" src="${pageContext.request.contextPath}/basic/js/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/basic/js/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script>
	<script type="text/javascript">
	$(function(){
		 //jquery.form image1
		 $("#upimage").bind("click",function(){
		 if($("#upfile").val()==""){
		  alert("请选择一个图片文件,再点击");
		  return;
		 }
		 
		var file = document.getElementById("upfile").value;
		 $("#form1").ajaxSubmit({
			 url:"${pageContext.request.contextPath}/news/upload",
			 contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			 type:"POST",
			  success:function(response){
				  var message = response;
				  alert(message);
				  alert(response);
				  $("#ln").empty();
				  $("#ln").append("<img src='/photo/"+response+"' width='250' height='140'/>");
				  $("#carouselimg").val(response);
				  $("#im1").val(response);
			  },
			  error:function(msg){
			  alert("出错了");
			  }
		 	});
		 });
		 //jquery.form image2
		});
	
	
	function formsubmit(){
		alert("提交表单")
		document.getElementById('form2').submit();
	};
</script>
</head>


<style>
.selectpicker{
	width: 100%;
    height: 38px;
    border-radius: 6px;
}
.newsContent{
	width: 100%;
}
</style>
<body>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					iSupport <small>新闻发布</small>
				</h1>
			</div>
		</div>
	</div>
	
	<div class="row clearfix">
		<div class="col-md-3 column">
		</div>
		<div class="col-md-6 column">
			<form role="form" id="form2" action="${pageContext.request.contextPath}/news/insertnews" method="post">
				<div class="form-group">
				<label for="exampleInputEmail1">新闻类别</label>
				<select class="selectpicker" data-style="btn-white" name="pkColumn" required>
				<c:forEach items="${clist}" var="column">
					<option value="${column.pkColumn}">${column.columnname}</option>
				</c:forEach>
				</select>
				</div>
				<div class="form-group">
					 <label for="exampleInputEmail1">题目</label><input type="text" class="form-control" name="newstitle" required/>
				</div>
				
				
				<div class="form-group">
				<div class="form-group">
					<label for="name">新闻简介</label>
					<textarea class="form-control" rows="3" name="newsremarks" required  placeholder="输入新闻简介，字数不超过200字" maxlength="200"></textarea>
				</div>
				</div>
				<div id="ueditor-input" class="newsContent">
				<script id="container" name="newscontent" type="text/plain">
        			
    			</script>
    			</div>
    			<br>
    			<div class="form-group">
					<label for="name">允许评论</label>
					<select class="form-control" name="iscomment" required>
						<option value="0">是</option>
						<option value="1">否</option>
					</select>
				</div>
				<div class="form-group">
					<label for="name">新闻置顶</label>
					<select class="form-control" name="istop" required>
						<option value="0">是</option>
						<option value="1">否</option>
					</select>
				</div>
				<div class="form-group">
					 <label for="exampleInputEmail1">序号</label><input type="text" class="form-control" name="sort" required/>
				</div>
				<div class="form-group">
					<label for="name">发布到外部新闻网站</label>
					<select class="form-control" name="toout" required>
						<option value="0">是</option>
						<option value="1">否</option>
					</select>
				</div>
				<div class="form-group">
					 <input type="hidden"  name="carouselimg" id="carouselimg" value="" />
				</div>
				<div class="form-group">
					<label for="name">是否轮播展示</label>
					<select class="form-control" name="iscarousel" required>
						<option value="0">是</option>
						<option value="1">否</option>
					</select>
				</div>
    			<br>
			</form>
				<div class="form-group">
				<label for="name">选择轮播图片</label>
					<form enctype="multipart/form-data" id="form1" method="post" action="${pageContext.request.contextPath}/news/upload">
					文件:
					 <input type="file" name="upfile" id="upfile"><br><input type="button" id="upimage" value="图片上传">
					 <input type="text" name="im1" id="im1" value="" />
					</form>
					<div id="ln"></div><br>
			</div>
			<input type="button" value="保存" onclick="formsubmit()" class="btn btn-default"/>
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
        var editor = new UE.ui.Editor({initialFrameHeight:400,initialFrameWidth:460 });
        editor.render("container");   
//         var ue = UE.getEditor('container');
	</script> 
</body>
</html>