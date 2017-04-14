<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
<meta name="author" content="Coderthemes">
<title>Ubold - Responsive Admin Dashboard Template</title>

<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<link href="${pageContext.request.contextPath}/assets/css/core.css" rel="stylesheet" type="text/css" />
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>


<body class="fixed-left">
	<div id="wrapper">
		<div class="topbar">
			<div class="navbar navbar-default" role="navigation">
				<div class="container">
					<ul class="nav navbar-nav navbar-right pull-right">
						<li class="dropdown hidden-xs">
							<ul class="dropdown-menu dropdown-menu-lg">
						</li>
					</ul>
					</li>
					<!-- 通讯录联系人 -->
					<li class="hidden-xs"><a class="right-bar-toggle waves-effect waves-light">通讯录</a></li>
				</div>
			</div>
		</div>

		<!-- 右侧信息展开栏（用户联系人列表） -->
		<div class="side-bar right-bar nicescroll sidebar-inner">
			<h4 class="text-center">联系人</h4>
			<div class="contact-list nicescroll sidebar-menu">
				<ul class="list-group contacts-list">
				
				
				<div class="panel panel-default">
		<div class="panel-heading">
			<h4 class="panel-title">
				<a data-toggle="collapse" data-parent="#accordion" 
				   href="#collapseOne">
					人事部
				</a>
			</h4>
		</div>
		<div id="collapseOne" class="panel-collapse collapse">
			<div class="panel-body">
				<li class="list-group-item"><a href="#">
							<div class="avatar">
								<img
									src="${pageContext.request.contextPath}/assets/images/users/avatar-3.jpg"
									alt="">
							</div> <span class="name">苏重庆</span> <i class="fa fa-circle online"></i>
					</a> <span class="clearfix"></span></li>
					<li class="list-group-item"><a href="#">
							<div class="avatar">
								<img
									src="${pageContext.request.contextPath}/assets/images/users/avatar-4.jpg"
									alt="">
							</div> <span class="name">孙意涵</span> <i class="fa fa-circle online"></i>
					</a> <span class="clearfix"></span></li>
					<li class="list-group-item"><a href="#">
							<div class="avatar">
								<img
									src="${pageContext.request.contextPath}/assets/images/users/avatar-5.jpg"
									alt="">
							</div> <span class="name">李海洋</span> <i class="fa fa-circle away"></i>
					</a> <span class="clearfix"></span></li>
					<li class="list-group-item"><a href="#">
							<div class="avatar">
								<img
									src="${pageContext.request.contextPath}/assets/images/users/avatar-6.jpg"
									alt="">
							</div> <span class="name">张绍忠</span> <i class="fa fa-circle away"></i>
					</a> <span class="clearfix"></span></li>
					<li class="list-group-item"><a href="#">
							<div class="avatar">
								<img
									src="${pageContext.request.contextPath}/assets/images/users/avatar-7.jpg"
									alt="">
							</div> <span class="name">易中天</span> <i class="fa fa-circle away"></i>
					</a> <span class="clearfix"></span></li>
			</div>
		</div>
	</div>
				
				
				
				
				<div class="panel panel-default">
		<div class="panel-heading">
			<h4 class="panel-title">
				<a data-toggle="collapse" data-parent="#accordion" 
				   href="#collapseTwo">
					财务部
				</a>
			</h4>
		</div>
		<div id="collapseTwo" class="panel-collapse collapse">
			<div class="panel-body">
				<li class="list-group-item"><a href="#">
							<div class="avatar">
								<img
									src="${pageContext.request.contextPath}/assets/images/users/avatar-3.jpg"
									alt="">
							</div> <span class="name">苏重庆</span> <i class="fa fa-circle online"></i>
					</a> <span class="clearfix"></span></li>
					<li class="list-group-item"><a href="#">
							<div class="avatar">
								<img
									src="${pageContext.request.contextPath}/assets/images/users/avatar-4.jpg"
									alt="">
							</div> <span class="name">孙意涵</span> <i class="fa fa-circle online"></i>
					</a> <span class="clearfix"></span></li>
			</div>
		</div>
	</div>
				<div class="panel panel-default">
		<div class="panel-heading">
			<h4 class="panel-title">
				<a data-toggle="collapse" data-parent="#accordion" 
				   href="#collapseThree">
					技术部
				</a>
			</h4>
		</div>
		<div id="collapseThree" class="panel-collapse collapse">
			<div class="panel-body">
				<li class="list-group-item"><a href="#">
							<div class="avatar">
								<img
									src="${pageContext.request.contextPath}/assets/images/users/avatar-3.jpg"
									alt="">
							</div> <span class="name">苏重庆</span> <i class="fa fa-circle online"></i>
					</a> <span class="clearfix"></span></li>
					<li class="list-group-item"><a href="#">
							<div class="avatar">
								<img
									src="${pageContext.request.contextPath}/assets/images/users/avatar-4.jpg"
									alt="">
							</div> <span class="name">孙意涵</span> <i class="fa fa-circle online"></i>
					</a> <span class="clearfix"></span></li>
			</div>
		</div>
	</div>
					
					
					
					
				</ul>
			</div>
		</div>
		<!-- 左侧菜单栏结束 -->

	</div>

	<script>
            var resizefunc = [];
    </script>

	<!-- jQuery  -->
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/fastclick.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/jquery.app.js"></script>
</body>
</html>