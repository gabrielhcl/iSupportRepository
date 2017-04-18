<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
<meta name="author" content="Coderthemes">

<link rel="shortcut icon"
	href="${pageContext.request.contextPath}/assets/images/favicon_1.ico">

<title>Ubold - Responsive Admin Dashboard Template</title>

<!--Morris Chart CSS -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/assets/plugins/morris/morris.css">

<link
	href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/core.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath}/assets/css/components.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/icons.css"
	rel="stylesheet" type="text/css" />
<link href="${pageContext.request.contextPath}/assets/css/pages.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath}/assets/css/responsive.css"
	rel="stylesheet" type="text/css" />
<script
	src="${pageContext.request.contextPath}/assets/js/modernizr.min.js"></script>

<!-- 隐藏body滚动条 -->
<span style="font-size: 24px;">
	<style type="text/css">
body {
	overflow-x: hidden;
	overflow-y: hidden;
	margin:0; 
	padding:0;
}
</style>
</span>
</head>


<body class="fixed-left">
	<
	<!-- Begin page -->
	<div id="wrapper">

		<!-- Top Bar Start -->
		<div class="topbar">

			<!-- LOGO -->
			<div class="topbar-left">
				<div class="text-center">
					<a href="index.html" class="logo"><i
						class="icon-magnet icon-c-logo"></i><span>YONYOU<i
							class="md md-album">iSupport</i></span></a>
				</div>
			</div>

			<!-- Button mobile view to collapse sidebar menu -->
			<div class="navbar navbar-default" role="navigation">
				<div class="container">
					<div class="">
						<!-- 侧面菜单展开按钮 -->
						<div class="pull-left">
							<button class="button-menu-mobile open-left"
								style="margin-top: 20px">
								<i class="ion-navicon"></i>
							</button>
							<span class="clearfix"></span>
						</div>
						<ul class="nav navbar-nav navbar-right pull-right">
							<li class="dropdown hidden-xs">
								<ul class="dropdown-menu dropdown-menu-lg">
							</li>
						</ul>
						</li>
						<!-- 窗口最大化 -->
						<li class="hidden-xs" style="margin-top: 20px"><a href="#"
							id="btn-fullscreen" class="waves-effect waves-light"><i
								class="icon-size-fullscreen"></i></a></li>
						<!-- 通讯录联系人 -->
						<li class="hidden-xs" style="margin-top: 20px"><a href="#"
							class="right-bar-toggle waves-effect waves-light"><i
								class="icon-settings"></i></a></li>
						<!-- 个人操作及个人头像 -->
						<li class="dropdown" style="margin-top: 10px"><a href=""
							class="dropdown-toggle profile" data-toggle="dropdown"
							aria-expanded="true"><img
								src="${pageContext.request.contextPath}/assets/images/users/avatar-1.jpg"
								alt="user-img" class="img-circle"> </a>
							<ul class="dropdown-menu">
								<li><a href="javascript:void(0)"><i
										class="ti-user m-r-5"></i> 修改密码</a></li>
								<li><a href="javascript:void(0)"><i
										class="ti-power-off m-r-5"></i> 登出</a></li>
							</ul></li>
							<li class="hidden-xs" style="margin-top: 20px">${user.usercnname}</li>
						</ul>
					</div>
					<!--/.nav-collapse -->
				</div>
			</div>
		</div>
		<!-- 顶部菜单栏结束 -->


		<!-- ========== 右侧菜单栏 ========== -->

		<div class="left side-menu">
			<div class="sidebar-inner slimscrollleft">
				<!--- Divider -->
				<div id="sidebar-menu">
					<ul>

						<li class="text-muted menu-title">Navigation</li>
						<!-- 默认展开菜单 -->
						<li class="has_sub">
							<!--自动展开菜单<a href="#" class="waves-effect active"><i class="ti-home"></i> <span> 工作 </span> </a> -->
							<a href="#" class="waves-effect"><i class="ti-home"></i> <span>
									工作 </span> </a>
							<ul class="list-unstyled">
								<li class="active"><a href="${pageContext.request.contextPath}/menu/selectmenu?menuid=2">实施主计划</a></li>
								<li><a href="${pageContext.request.contextPath}/menu/selectmenu?menuid=1">工作双周报</a></li>
								<li><a href="dashboard_3.html">工作日志</a></li>
							</ul>
						</li>
						<!-- 默认关闭菜单 -->
						<li class="has_sub"><a href="#" class="waves-effect"><i
								class="ti-paint-bucket"></i> <span> 项目 </span> </a>
							<ul class="list-unstyled">
								<li><a href="ui-buttons.html">项目分析</a></li>
								<li><a href="ui-panels.html">项目回款</a></li>
								<li><a href="ui-portlets.html">项目回款预测</a></li>
								<li><a href="ui-checkbox-radio.html">项目回款汇总</a></li>
								<li><a href="ui-tabs.html">项目收入与资源投入分析</a></li>
								<li><a href="ui-modals.html">汇总分析</a></li>
							</ul></li>
						<!-- 提示信息条数菜单 -->
						<li class="has_sub"><a href="#" class="waves-effect"><i
								class="ti-light-bulb"></i><span> 运维 </span> </a>
							<ul class="list-unstyled">
								<li><a href="components-grid.html">运维问题录入</a></li>
								<li><a href="components-widgets.html">运维问题分析</a></li>
								<li><a href="components-nestable-list.html">生成分析报告</a></li>
							</ul></li>


						<!-- 菜单类型标识 -->
						<li class="text-muted menu-title">More</li>

						<li class="has_sub"><a href="#" class="waves-effect"><i
								class="ti-files"></i><span> 项目地图 </span></a>
							<ul class="list-unstyled">
								<li><a href="${pageContext.request.contextPath}/menu/selectmenu?menuid=0">项目情况分布一览</a></li>
								<li><a href="page-login.html">在建项目汇总展示</a></li>
								<li><a href="page-login-v2.html">运维项目汇总展示</a></li>
								<li><a
									href="${pageContext.request.contextPath}/mapController/vectorMap">地图示例</a></li>
							</ul></li>

						<li class="has_sub"><a href="#" class="waves-effect"><i
								class="ti-files"></i><span> 管理 </span></a>
							<ul class="list-unstyled">
								<li><a href="extra-profile.html">合同管理</a></li>
								<li><a href="${pageContext.request.contextPath}/menu/selectmenu?menuid=11">区域管理</a></li>
								<li><a href="${pageContext.request.contextPath}/menu/selectmenu?menuid=4">集团管理</a></li>
								<li><a href="${pageContext.request.contextPath}/menu/selectmenu?menuid=5">公司管理</a></li>
								<li><a href="${pageContext.request.contextPath}/menu/selectmenu?menuid=6">项目管理</a></li>
							</ul>
							</li>
							
							
							<li class="has_sub"><a href="#" class="waves-effect"><i
								class="ti-files"></i><span>测试 </span></a>
							<ul class="list-unstyled">
								<li><a href="${pageContext.request.contextPath}/group/selectByPrimaryKey?pk_group=2"> echarts测试</a></li>
								<li><a href="${pageContext.request.contextPath}/menu/selectmenu?menuid=12"> ueditor展示测试</a></li>
								<li><a href="${pageContext.request.contextPath}/menu/selectmenu?menuid=33">ueditor信息发布</a></li>
							</ul>
							</li>



					</ul>
					<div class="clearfix"></div>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<!-- 右侧菜单栏结束 -->

		<!--------内容区--------------------------------------------------------------------------------------------------------------------------------- -->

		<div class="content-page">
			<!-- Start content -->
			<div class="content">
				<!--                     <div class="container"> -->
				<iframe class="content-page" name="iframe_map" id="iframe_map" src="${iframesrc}" frameborder="0" width="99%" height="80%" style="margin-left: 20px ; margin-right: 0px"></iframe>
<%-- 				<iframe class="content-page" name="iframe_map" src="${pageContext.request.contextPath}/dWeekPlane.jsp" frameborder="0" width="1100px" height="500px" style="margin-left: 20px"></iframe> --%>
				
				
<%-- 				<iframe class="content-page" name="iframe_map" src="${map-vector.jsp}" frameborder="0" width="1100px" height="500px" style="margin-left: 20px"></iframe> --%>
			</div>
			<!--                 </div>   -->
		</div>


		<!--------内容区-------------------------------------------------------------------------------------------------------------------------------- -->

		<!-- 右侧信息展开栏（用户联系人列表） -->
		<div class="side-bar right-bar nicescroll">
			<h4 class="text-center">联系人</h4>
			<div class="contact-list nicescroll">
				<ul class="list-group contacts-list">
					<li class="list-group-item"><a href="#">
							<div class="avatar">
								<img
									src="${pageContext.request.contextPath}/assets/images/users/avatar-1.jpg"
									alt="">
							</div> <span class="name">张四川</span> <i class="fa fa-circle online"></i>
					</a> <span class="clearfix"></span></li>
					<li class="list-group-item"><a href="#">
							<div class="avatar">
								<img
									src="${pageContext.request.contextPath}/assets/images/users/avatar-2.jpg"
									alt="">
							</div> <span class="name">李上海</span> <i class="fa fa-circle online"></i>
					</a> <span class="clearfix"></span></li>
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
				</ul>
			</div>
		</div>
		<!-- 右侧菜单栏结束 -->

	</div>
	<!-- END wrapper -->



	<script>
            var resizefunc = [];
        </script>

	<!-- jQuery  -->
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/detect.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/fastclick.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.slimscroll.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.blockUI.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/waves.js"></script>
	<script src="${pageContext.request.contextPath}/assets/js/wow.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.nicescroll.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.scrollTo.min.js"></script>

	<script
		src="${pageContext.request.contextPath}/assets/plugins/peity/jquery.peity.min.js"></script>

	<!-- jQuery  -->
	<script
		src="${pageContext.request.contextPath}/assets/plugins/waypoints/lib/jquery.waypoints.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/plugins/counterup/jquery.counterup.min.js"></script>

	<script
		src="${pageContext.request.contextPath}/assets/plugins/morris/morris.min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/plugins/raphael/raphael-min.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/plugins/jquery-knob/jquery.knob.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/pages/jquery.dashboard.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.core.js"></script>
	<script
		src="${pageContext.request.contextPath}/assets/js/jquery.app.js"></script>
	<script type="text/javascript">
            jQuery(document).ready(function($) {
                $('.counter').counterUp({
                    delay: 100,
                    time: 1200
                });
                $(".knob").knob();
            });
        </script>
</body>
</html>