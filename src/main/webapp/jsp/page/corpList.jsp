<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>公司列表</title>

<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
        <link href="${pageContext.request.contextPath}/${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.css" rel="stylesheet" type="text/css" />

		<link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        
        
        <script type="text/javascript">
         function search(){
        	 $("#searchForm").submit();
         }
        
        </script>
        
</head>
<body>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
		
		
		
		<div class="page-header">
				<h1>
					公司列表 <small>corp list</small>
				</h1>
			</div>
			<form modelAttribute="corp" action="${pageContext.request.contextPath}/corp/corplist" method="post" id="searchForm" name="searchForm" class="form-inline searchForm">
							
							<div class="form-group">
								<label class="control-label">公司名称</label>
								<input name="corpname" value="${corp.corppname}" class="input-sm form-control" />
							</div>
							<div class="form-group">
								<button  class="btn btn-sm btn-primary" onclick="search()">
									<i class="fa fa-search"></i>
									&nbsp;查询
								</button>
								<button type="reset"" class="btn btn-sm btn-primary">
									<i class="fa fa-search"></i>
									&nbsp;重置
								</button>
								
								<button type="button" class="btn btn-sm btn-white"
										 onclick="location='${pageContext.request.contextPath}/corp/addcorp'">
										<i class="fa fa-plus"></i>
										&nbsp;添加
									</button>
							</div>
						<br>
						<br>
			<div class="table-responsive">
			<table class="table table-bordered">
				<thead>
					<tr>
						<th>公司编码</th>
						<th>公司名称</th>
						<th>所属集团名称</th>
						<th>备注</th>
						<th>操作</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${clist}" var="corp">
						<tr>
							<th>${corp.corpcode}</th>
							<th>${corp.corpname}</th>
							<th>${corp.groupname}</th>
							<th>${corp.remark}</th>
							<td>
								<a href="${pageContext.request.contextPath}/corp/update?pk_corp=${corp.pk_corp}"onclick="return confirmx('确认要修改该数据吗？', this.href)"
								class="btn btn-info btn-xs"> <i class="fa fa-trash"></i>修改</a>
								<a href="${pageContext.request.contextPath}/corp/delete?pk_corp=${corp.pk_corp}" onclick="return confirmx('确认要删除该数据吗？', this.href)"
								class="btn btn-danger btn-xs"> <i class="fa fa-trash"></i>删除 </a>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
					<div >
					<span id="serchResult"></span>  
					</div>
			</div>
			</form>
		</div>
	</div>
</div>
</body>
</html>