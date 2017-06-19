<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<title>注册页面</title>
<!-- 	引入bootstrap -->
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script> -->
<!-- 引入本地jquery -->
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/basic/js/jquery/jquery-3.1.1.js"></script> --%>
<!-- 引入jquery验证 -->
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/basic/js/jquery-validation-1.14.0/lib/jquery.js"></script> --%>
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/basic/js/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script> --%>
<!-- 验证中文提示 -->
<%-- <script type="text/javascript" src="${pageContext.request.contextPath}/basic/js/jquery-validation-1.14.0/dist/localization/messages_zh.js"></script> --%>
 <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery-1.9.1.js"></script>
 <script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/jquery.form.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
body{
/* 	background-color:#EBEBEB; */
/* 	background-image: url(${pageContext.request.contextPath}/images/green.jpg); */
	background-size:cover;
	background-repeat: no repeat;
}
.col-center-block {
	float: none;
	display: block;
	margin-left: auto;
	margin-right: auto;
}

.error{
	color:red;
}
</style>
<script type="text/javascript">
	if(window!="shuaxin"){
		location.reload;
		window.name = "shuaxin";
	}else{
		window.name="";
	}
</script>
<script type="text/javascript">
function checkIsExist(){
// 	获取输入框输入的userName
	var userName = $.trim($("#userName").val());  
// 	alert($("#userName").val());
	$.ajax({
		url:"${pageContext.request.contextPath}/user/checkExist",
// 		url:"<spring:url value="${pageContext.request.contextPath}/user/checkExist" />",
		data:{"userName":userName},
		dataType:"json",
		type:"post",
		
		success:function(data){
			if(data=="success"){
				$("#showResult").html("<font color='green'>账户名可用</font>");  
			}else{
				$("#userName").val("").focus();
				$("#showResult").html("<font color='red'>账户名已存在,请重新输入</font>");  
			}
		}
	});
}

function clearCss() {  
    $("#showResult").html("");    
}      

</script>
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
			 url:"${pageContext.request.contextPath}/user/upload",
			 contentType : "application/x-www-form-urlencoded; charset=UTF-8",
			 type:"POST",
			  success:function(response){
				  alert(response);
				  $("#ln").empty();
				  $("#ln").append("<img src='/portrait/"+response+"' width='250' height='140'/>");
				  $("#def1").val(response);
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
		document.getElementById('commentForm').submit();
	};
</script>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					iSupport <small>交付支持平台</small>
				</h1>
			</div>
		</div>
	</div>
	<br><br>
	<div class="row clearfix">
		<div class="col-md-4 column">
		</div>
		<div class="col-md-4 column">
			<form class="cmxform" id="commentForm" modelAttribute="user"  method="post" action="${pageContext.request.contextPath}/user/insertuser">
				 <fieldset>
				<div class="form-group">
					 <label for="userName">账号名</label><input type="text" id="username"    name="username"  placeholder="请在这里输入账户名" class="form-control" minlength="5" required  onblur="checkIsExist();" onfocus="clearCss();"/>
					 <site:required />  
                	 <span id="showResult"></span>  
				</div>
				<div class="form-group">
					 <label for="password">密码</label><input type="password" class="form-control" id="password" placeholder="请在这里输入密码" name="password" minlength="8" required/>
				</div>
				<div class="form-group">
					 <label for="confirm_password">确认密码</label><input type="password" class="form-control" id="confirm_password" placeholder="请确认密码" name="confirm_password" minlength="8" required equalTo="#password"/>
				</div>
				<div class="form-group">
					<label for="userNickname">昵称</label><input type="text" name="usercnname" class="form-control" id=""usercnname"" placeholder="请输入昵称" required minlength="1" />
				</div>
				<div class="form-group">
					<label for="age">电话</label><input type="text" class="form-control" name="userphone" id="userphone" required minlength="1" placeholder="请输入电话号码"/>
				</div>
				<div class="form-group">
					<label for="age">邮箱</label><input type="text" class="form-control" name="useremail" id="useremail" required minlength="1" placeholder="请输入邮箱"/>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">所在大区</label>
					<select class="form-control m-b" name="userarea" >
					<c:forEach items="${alist}" var="area">
						<option value="${area.areaname}">${area.areaname}</option>
					</c:forEach>
					</select>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">所在部门</label>
					<select class="form-control m-b" name="userdept" >
						<option value="0">技术部</option>
						<option value="1">业务部</option>
					</select>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">职位类型</label>
					<select class="form-control m-b" name="usertype" >
						<option value="0">领导</option>
						<option value="1">员工</option>
					</select>
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">性别</label>
					<select class="form-control m-b" name="usersex">
						<option value="0">男</option>
						<option value="1">女</option>
					</select>
				</div>
				<div class="form-group">
					 <input type="hidden"  name="def1" id="def1" value="" />
				</div>
<!-- 				<br> -->
<!-- 				<button class="btn btn-lg btn-primary btn-block" type="submit">注册</button> -->
				</fieldset>
			</form>
			<div class="form-group">
				<label for="name">上传头像</label>
					<form enctype="multipart/form-data" id="form1" method="post" action="${pageContext.request.contextPath}/user/upload">
					文件:
					 <input type="file" name="upfile" id="upfile"><br><input type="button" id="upimage" value="上传">
					 <input type="text" name="im1" id="im1" value="" />
					</form>
					<div id="ln"></div><br>
			</div>
			<br>
			<input type="button" value="保存" onclick="formsubmit()" class="btn btn-default"/>
		</div>
		<div class="col-md-4 column">
		</div>
	</div>
	<br><br><br><br><br><br>
	<div class="row clearfix">
		<div class="col-md-4 column">
			<dl>
				<dt>
					Description lists
				</dt>
				<dd>
					A description list is perfect for defining terms.
				</dd>
				<dt>
					Euismod
				</dt>
				<dd>
					Vestibulum id ligula porta felis euismod semper eget lacinia odio sem nec elit.
				</dd>
				<dd>
					Donec id elit non mi porta gravida at eget metus.
				</dd>
			</dl>
		</div>
		<div class="col-md-4 column">
			 <address> <strong>yonyou, Inc.</strong><br /> 795 Folsom Ave, Suite 600<br /> San Francisco, CA 94107<br /> <abbr title="Phone">P:</abbr> (123) 456-7890</address>
		</div>
		<div class="col-md-4 column">
		</div>
	</div>
</div>












































	<div class="container">
		<div class="row myCenter">
			<div class="col-xs-6 col-md-4 col-center-block">
<%-- 				<form modelAttribute="user" id="commentForm" class="cmxform" action="${pageContext.request.contextPath}/user/save" method="post" id="form"> --%>
<!-- 					 <fieldset> -->
<!-- 					<h2 class="form-signin-heading">请注册</h2>   -->
<!-- 					<div> -->
<!-- 						<span class="input-group-addon">用户名</span> <input id="cname" type="text"  class="form-control {required:true,minlength:5}" name="userName"  placeholder="用户名" > -->
<!-- 					</div> -->
<!-- 					<div> -->
<!-- 						<span class="input-group-addon">密码</span> <input type="password" class="form-control {required:true, minlength:5}"  id="password"  name="password"  placeholder="密码"> -->
<!-- 					</div> -->
<!-- 					<div> -->
<!-- 						<span class="input-group-addon">重新输入密码</span><input type="password" name="confirm_password" id="confirm_password" class="form-control {required:true,minlength:5,equalTo:'#password'}"> -->
<!-- 					</div> -->
<!-- 					<div> -->
<!-- 						<span class="input-group-addon">昵称</span> <input type="userNickname" class="form-control" name="userNickname"  placeholder="昵称"> -->
<!-- 					</div> -->
<!-- 					<div> -->
<!-- 						<span class="input-group-addon">年龄</span> <input type="text" class="form-control" name="age"  placeholder="年龄">					 -->
<!-- 					</div> -->
<!-- 					<br> -->
<!-- 					<button class="btn btn-lg btn-primary btn-block submit" type="submit" value="submit">注册</button>   -->
<!-- 				</fieldset> -->
<!-- 				</form> -->
<%-- 				<form class="cmxform" id="commentForm" modelAttribute="user"  method="post" action="${pageContext.request.contextPath}/user/save"> --%>
<!--   <fieldset> -->
<!--   <h2 class="form-signin-heading">请注册</h2> -->
<!--     <p> -->
<!--       <label for="cname">登录名</label> -->
<!--       <input id="cname" name="userName" minlength="6" type="text" required> -->
<!--     </p> -->
<!--     <p> -->
<!--       <label for="password">密码</label> -->
<!--       <input type="password" id="password" name="password" minlength="6"  required> -->
<!--     </p> -->
<!--     <p> -->
<!--       <label for="confirm_password">确认密码</label>   -->
<!--     <input type="password" id="confirm_password" name="confirm_password" required minlength="5" equalTo="#password"/> -->
<!--     </p> -->
<!--     <p> -->
<!--       <label for="userNickname">昵称</label> -->
<!--       <input id="userNickname" type="text" name="userNickname" required> -->
<!--     </p> -->
<!--     <p> -->
<!--       <label for="age">年龄</label> -->
<!--       <input id="age" name="age"  required  digits> -->
<!--     </p> -->
<!--     <p> -->
<!--       <input class="submit" type="submit" value="注册"> -->
<!--     </p> -->
<!--   </fieldset> -->
<!-- </form> -->
<script>
// jQuery.validator.setDefaults({
	
//   debug: true,
//   success: "valid"
// });
$( "#commentForm" ).validate({
	submitHandler:function(form){
        form.submit();
    }
});
</script>
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	</div> -->
</body>
</html>