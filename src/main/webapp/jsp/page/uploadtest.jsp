<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="multipart/form-data; charset=utf-8" />
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
		 
		alert("进入方法");
		var file = document.getElementById("upfile").value;
		alert(file); 
		alert("s");
		 $("#form1").ajaxSubmit({
			 url:"${pageContext.request.contextPath}/news/upload",
			 type:"POST",
			  success:function(response){
				  alert(response);
				  $("#ln").empty();
				  $("#ln").append("<img src='/photo/"+response+"' width='100' height='60'/>");
				  $("#im1").val(response);
				  alert("<img src='/photo/"+response);
			  },
			  error:function(msg){
			  alert("出错了");
			  }
		 	});
		 });
		 //jquery.form image2
		});
</script>

<style>
.selectpicker{
	width: 100%;
    height: 38px;
    border-radius: 6px;
}
</style>
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
					iSupport <small>新闻发布</small>
				</h1>
			</div>
		</div>
	</div>
	
	<div class="row clearfix">
		<div class="col-md-3 column">
		</div>
		<div class="col-md-6 column">
    			<br>
    			<form role="form" id="form2" enctype="multipart/form-data" action="${pageContext.request.contextPath}/news/insertnews" method="post">
    			</form>
				<div class="form-group">
					<form enctype="multipart/form-data" id="form1" method="post" action="${pageContext.request.contextPath}/news/upload">
					文件:
					 <input type="file" name="upfile" id="upfile"><input type="button" id="upimage" value="图片上传1">
					 <input type="text" name="im1" id="im1" value="" />
					</form>
					<div id="ln"></div><br>
				</div>
    			<br>
		</div>
		<div class="col-md-3 column">
		</div>
	</div>
</div>

</body>
</html>