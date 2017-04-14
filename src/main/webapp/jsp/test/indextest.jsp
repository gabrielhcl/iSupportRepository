<%@page import="com.yonyou.context.ContextWrap"%>
<%@page import="com.yonyou.context.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="no-js css-menubar" lang="en">
<head>
    <meta charset="utf-8">
    <jsp:include page="/jsp/embed/common.jsp"></jsp:include>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
    <meta name="description" content="bootstrap admin template">
    <meta name="author" content="">
    <link rel="shortcut icon" href="favicon.ico" type="images/x-icon"/>
    <link rel="Bookmark" href="favicon.ico">
    <link rel="icon" href="favicon.png" type="images/png"/>
    <title>贵阳院统一门户首页</title>
    <!-- Stylesheets -->
    <link rel="stylesheet" href="${pageContext.request.contextPath }/trd/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/demo.css">
	<link rel="stylesheet" href="${pageContext.request.contextPath }/trd/uui/css/u.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/trd/skintools/skintools.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/index.css" rel="stylesheet">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/assets/header/head.css" type="text/css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/assets/header/font/head-iconfont.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/trd/ztree/zTreeStyle/zTreeStyle.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/multiPage/portal-tabs.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/trd/workindex/css/workIndexlayout.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath }/trd/dragger/widgetbox_drag.css">

    <!--[if lt IE 9]>
    <script src="${pageContext.request.contextPath }/trd/vendor/html5shiv/html5shiv.min.js"></script>
    <script src="${pageContext.request.contextPath }/trd/es5-shim/4.5.7/es5-shim.min.js"></script>
    <script src="${pageContext.request.contextPath }/trd/es5-shim/4.5.7/es5-sham.min.js"></script>
    <script src="${pageContext.request.contextPath }/trd/vendor/respond/respond.min.js"></script>
    <![endif]-->
    <!-- Scripts -->
    <script src="${pageContext.request.contextPath }/trd/vendor/modernizr/modernizr.min.js"></script>
    <script src="${pageContext.request.contextPath }/trd/jquery/jquery-1.11.2.min.js"></script>
</head>
<body class="dashboard site-navbar-small site-menubar-fd">
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<nav class="navbar navbar-default" role="navigation">
				<div class="navbar-header">
					 <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button> <a class="navbar-brand" href="#">Brand</a>
				</div>
				
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav">
						<li class="active">
							 <a href="#">Link</a>
						</li>
						<li>
							 <a href="#">Link</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">Action</a>
								</li>
								<li>
									 <a href="#">Another action</a>
								</li>
								<li>
									 <a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">Separated link</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">One more separated link</a>
								</li>
							</ul>
						</li>
					</ul>
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<input type="text" class="form-control" />
						</div> <button type="submit" class="btn btn-default">Submit</button>
					</form>
					<ul class="nav navbar-nav navbar-right">
						<li>
							 <a href="#">Link</a>
						</li>
						<li class="dropdown">
							 <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong class="caret"></strong></a>
							<ul class="dropdown-menu">
								<li>
									 <a href="#">Action</a>
								</li>
								<li>
									 <a href="#">Another action</a>
								</li>
								<li>
									 <a href="#">Something else here</a>
								</li>
								<li class="divider">
								</li>
								<li>
									 <a href="#">Separated link</a>
								</li>
							</ul>
						</li>
					</ul>
				</div>
				
			</nav>
		</div>
	</div>
</div>
</body>
</html>