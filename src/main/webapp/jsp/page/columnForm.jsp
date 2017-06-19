<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>添加栏目</title>
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
					添加栏目 <small>column form</small>
				</h1>
			</div>
			<form role="form" action="${pageContext.request.contextPath}/column/insertcolumn" method="post" modelAttribute="column">
<!-- 				<div class="form-group"> -->
<!-- 					 <label for="exampleInputEmail1">栏目编码</label><input type="text" class="form-control" id="columncode" name="columncode" /> -->
<!-- 				</div> -->
				<div class="form-group">
					 <label for="exampleInputPassword1">栏目名称</label><input type="text" class="form-control" id="columnname" name="columnname" />
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">排序</label><input type="text" class="form-control" id="sort" name="sort" />
				</div>
				<div class="form-group">
					 <label for="exampleInputPassword1">备注</label><input type="text" class="form-control" id="columnremark" name="columnremark" />
				</div>
				<button type="submit" class="btn btn-default">保存</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>