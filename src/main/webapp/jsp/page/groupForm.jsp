<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
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
					添加集团 <small>group form</small>
				</h1>
			</div>
			<form role="form" action="${pageContext.request.contextPath}/group/insertgroup" method="post" modelAttribute="group">
				<div class="form-group">
					 <label for="exampleInputEmail1">集团编码</label><input type="text" class="form-control" id="groupcode" name="groupcode" />
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">集团名称</label><input type="text" class="form-control" id="groupname" name="groupname" />
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">备注</label><input type="text" class="form-control" id="remark" name="remark" />
				</div>
				<button type="submit" class="btn btn-default">保存</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>