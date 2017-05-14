<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>添加链接</title>
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
					添加链接 <small>link form</small>
				</h1>
			</div>
			<form role="form"   method="post" action="${pageContext.request.contextPath}/link/savelink">
				<div class="form-group">
				<label for="exampleInputEmail1">分类</label>
				<select class="selectpicker" data-style="btn-white" name="pkColumn" required>
				<c:forEach items="${clist}" var="column">
					<option value="${column.pkColumn}">${column.columnname}</option>
				</c:forEach>
				</select>
				</div>
				<div class="form-group">
					 <label>链接名称</label><input type="text" class="form-control" id="linkname" name="linkname" />
				</div>
				<div class="form-group">
					 <label>url</label><input type="text" class="form-control" id="linkurl" name="linkurl" />
				</div>
				<div class="form-group">
					 <label>排序</label><input type="text" class="form-control" id="sort" name="sort" />
				</div>
				<div class="form-group">
					<label for="name">是否有效</label>
					<select class="form-control" name="iseffective" required>
						<option value="0">是</option>
						<option value="1">否</option>
					</select>
				</div>
				<button type="submit" class="btn btn-default">保存</button>
			</form>
		</div>
	</div>
</div>
</body>
</html>