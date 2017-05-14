<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>生成双周报</title>
    <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<style type="text/css">
		.s1{
			width: 454;
		    height: 40;
		    border-radius: 5px;
		}
	</style>
</head>
<body>
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					生成双周报 <small>create DWEEKPLAN</small>
				</h1>
			</div>
		</div>
	</div>
		<div class="row clearfix">
			<div class="col-md-3 column">
			</div>
			<div class="col-md-6 column">
				<form action="${pageContext.request.contextPath}/dweekplane/createdweekform" method="post">
				<div class="form-group">
				<label for="exampleInputEmail1" style="font-size: x-large;">选择项目</label>
					<select class="selectpicker s1" data-style="btn-white" name="projectname" required>
						<c:forEach items="${plist}" var="project">
							<option value="${project.projectname}">${project.projectname}</option>
						</c:forEach>
					</select>
				</div>
				<div class="form-group">
				<button class="btn btn-lg btn-primary btn-block" type="submit">生成双周报</button>
				</div>
				</form>
			</div>
			<div class="col-md-3 column">
			</div>
		</div>
	</div>
</body>
</html>