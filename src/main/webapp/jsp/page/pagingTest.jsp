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


<script type="text/javascript">


function testreturn(){
// 	获取输入框输入的userName
	alert("in testreturn");
	$.ajax({
		url:"http://localhost/workbench-integration-gyy/loginValidate/testcontroller",  
		data:'',
		dataType:"json",
		type:"post",
		success : function(data) {
			if (data.status == "success") {
				alert("success");
				alert(data.fabulous);
				$("#showResult").html(data.fabulous);
				document.getElementById("usercnname").value = data.fabulous;
			} else {
				$("#showResult").html("<font color='red'>系统错误</font>");
			}
		}
		
// 		success:function(data){
// 			if(data=="success"){
// 				alert("12312");
// 				$("#showResult").html("<font color='green'>密码正确</font>");  
// 			}else{
// 				$("#oldpassword").val("").focus();
// 				$("#showResult").html("<font color='red'>密码错误,请重新输入</font>");  
// 			}
// 		}
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
						测试跨域取值<small>news detail</small>
					</h1>
				</div>
				<button onclick="testreturn();">测试return</button>
				<span id="showResult"></span>  
			</div>
		</div>
		<div class="row clearfix">
			<div class="col-md-3 column"></div>
			<div class="col-md-6 column b1">
			<form action="${pageContext.request.contextPath}/news/innews" role="form" method="post">
			<input type="hidden" name="usercnname" id="usercnname">
			<button type="submit">submit</button>
			</form>
			</div>
			<div class="col-md-3 column">

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