<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>友情链接</title>
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
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
            <div class="row">
	           	<h3>
				友情链接
				</h3>
				<br><br><br>
				<tbody>
					<c:forEach items="${llist}" var="link">
						<div class="ab">
							<div class="col-md-4 abc">
								<div class="caption">
									<h4>${link.linkname}</h4>
									<p>
										<a><p>${link.linkurl}</p></a>
									</p>
								</div>
							</div>
						</div>
					</c:forEach>
				</tbody>
			</div>
		</div>
</div>
</body>
</html>