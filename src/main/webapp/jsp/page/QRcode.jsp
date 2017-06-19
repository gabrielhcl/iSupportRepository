<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">
		<div class="row clearfix">
			<div class="col-md-12 column">
				<div class="page-header">
					<h1>
						二维码测试<small>QR code</small>
					</h1>
				</div>
				进入isupport登录页
				<img src="${pageContext.request.contextPath}/qrcode/code?type=666"/>
				进入isupport新闻
				<img src="${pageContext.request.contextPath}/qrcode/controllercode?type=66"/>
			</div>
		</div>

	</div>



</body>
</html>