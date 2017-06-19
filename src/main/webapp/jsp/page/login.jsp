<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>iSupport支付平台</title>
<!-- 	引入bootstrap -->
<link rel="stylesheet"
	href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
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
	background-image:url(${pageContext.request.contextPath}/images/004.jpg);
	background-size: 100% 100%;
	background-repeat: no-repeat;
	background-color: #F8F8FF;
}
</style>
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
				<br>
				<br>
				<br>
				<br>
				<br>
				<div class="row clearfix">
					<div class="col-md-4 column"></div>
					<div class="col-md-4 column div1">
						<form role="form" action="${pageContext.request.contextPath}/user/login" class="form-signin" method="post">
							<div class="form-group">
								<label for="exampleInputEmail1">用户名</label>
								<input type="text" class="form-control" name="username" id="username"/>
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">密码</label>
								<input type="password" class="form-control" name="password" id="password"/>
							</div>
							<button class="btn btn-lg btn-primary btn-block" type="submit">登录</button>
							<br>
							<div align="center" style="color: #FF0000">${loginfailed}</div>
						</form>
													<button class="btn btn-lg btn-primary btn-block" onclick="location='${pageContext.request.contextPath}/user/regist'">注册</button>  
						
					</div>
					<div class="col-md-4 column"></div>
				</div>
				<div class="row clearfix">
					<div class="col-md-4 column"></div>
					<div class="col-md-4 column">
						<br>
						<br>
						<br>
						<br>
						<br>
						<br>
						<br>
						<br>
						<br>
						<br>
					</div>
					<div class="col-md-4 column"></div>
				</div>
				<div class="row clearfix">
					<div class="col-md-4 column">
						<dl>
							<dt>Company Description</dt>
							<dd>A description list is perfect for defining terms.</dd>
							<dt>Euismod</dt>
							<dd>Vestibulum id ligula porta felis euismod semper eget
								lacinia odio sem nec elit.</dd>
							<dd>Donec id elit non mi porta gravida at eget metus.</dd>
						</dl>
					</div>
					<div class="col-md-4 column">
						<address>
							<strong>YonYou, Inc.</strong><br /> 795 Folsom Ave, Suite 600<br />
							San Francisco, CA 94107<br /> <abbr title="Phone">P:</abbr>
							(123) 456-7890
						</address>
					</div>
					<div class="col-md-4 column"></div>
				</div>
			</div>
		</div>
	</div>

</body>
</html>