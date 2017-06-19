<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>修改密码</title>
<!-- 	引入bootstrap -->
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript">
	function checkPwd(){
		var oldpassword = $.trim($("#oldpassword").val()); 
// 		alert(oldpassword);
		
		$.ajax({
			url:"${pageContext.request.contextPath}/user/checkPwd",
			data:{"oldpassword":oldpassword},
			dataType:"json",
			type:"post",
			
			
			success:function(data){
				if(data=="success"){
					alert("12312");
					$("#showResult").html("<font color='green'>密码正确</font>");  
				}else{
					$("#oldpassword").val("").focus();
					$("#showResult").html("<font color='red'>密码错误,请重新输入</font>");  
				}
			}
		});
	}
	
	function clearCss() {  
	    $("#showResult").html("");    
	}  
</script>
<script type="text/javascript">
	function confirmpassword(){
		alert("111");
		var newpassword = $.trim($("#password").val()); 
		var confirmpassword = $.trim($("#confirmpassword").val()); 
		
		alert(newpassword);
		alert(confirmpassword);
	}
</script>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					密码修改 <small>update password</small>
				</h1>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-3 column">
		</div>
		<div class="col-md-6 column">
			<form role="form" action="${pageContext.request.contextPath}/user/changepassword">
				<div class="form-group">
					 <label for="exampleInputPassword1">原密码</label><input type="password" class="form-control" id="oldpassword" name="oldpassword" placeholder="输入原密码" onblur="checkPwd();" required/>
					 <site:required />  
                	 <span id="showResult"></span>
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">新密码</label><input type="password" class="form-control" id="password"  name="password" minlength="8" placeholder="输入新密码" required/>
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">新密码</label><input type="password" class="form-control" id="confirmpassword"  name="confirmpassword" minlength="8"  equalTo="#password" placeholder="再次输入新密码" required onblur="confirmpassword();"/>
				</div>
				<button type="submit" class="btn btn-default">修改密码</button>
			</form>
		</div>
		<div class="col-md-3 column">
		</div>
	</div>
</div>
</body>
</html>