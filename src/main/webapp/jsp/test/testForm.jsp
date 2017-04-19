<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>测试表单</title>
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
        <link href="${pageContext.request.contextPath}/${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.css" rel="stylesheet" type="text/css" />

		<link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
		<div class="page-header">
				<h1>
					测试表单<small>test form</small>
				</h1>
			</div>
			<form role="form" action="${pageContext.request.contextPath}/area/insertareaformtest" method="post" modelAttribute="area">
			<table>
				<tr>
					<td>区域编码</td>
					<td>区域名称</td>
				</tr>
				<tr>
					<td><input type="text" class="form-control" id="areacode" name="areacode"/></td>
					<td><input type="text" class="form-control" id="areaname" name="areaname" /></td>
				</tr>
				<tr>
					<td><input type="text" class="form-control" id="areacode" name="areacode"/></td>
					<td><input type="text" class="form-control" id="areaname" name="areaname" /></td>
				</tr>
				<tr>
					<td><input type="text" class="form-control" id="areacode" name="areacode"/></td>
					<td><input type="text" class="form-control" id="areaname" name="areaname" /></td>
				</tr>
			</table>
			<button type="submit" class="btn btn-default">保存</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>