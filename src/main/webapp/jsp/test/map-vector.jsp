<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
        <meta name="author" content="Coderthemes">

        <link rel="shortcut icon" href="assets/images/favicon_1.ico">

        <title>Ubold - Responsive Admin Dashboard Template</title>

         <!-- jvectormap -->
        <link href="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-2.0.2.css" rel="stylesheet" />

        <link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/core.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/components.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/icons.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/pages.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/responsive.css" rel="stylesheet" type="text/css" />

        <!-- HTML5 Shiv and Respond.js IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js"></script>
        <![endif]-->

        <script src="${pageContext.request.contextPath}/assets/js/modernizr.min.js"></script>
        
    </head>

<body >
                <!-- Start content -->
                <div class="content">
                    <div class="container">

                        <!-- Page-Title -->
                        <div class="row">
                            <div class="col-sm-12">
                                <h4 class="page-title">地图</h4>
                            </div>
                        </div>
                        
                        <br>
                        
                        <div class="row">
							<div class="col-lg-12">
								<div class="card-box">
									<h4 class="m-t-0 m-b-20 header-title"><b>中国地图</b></h4>
									
									<div id="china" style="height: 400px"></div>
								</div>
							</div>
						</div>
						
						
						
						<div class="row">
							<div class="col-lg-6">
								<div class="card-box">
									<h4 class="m-t-0 m-b-20 header-title"><b>美国地图</b></h4>
									<div id="usa" style="height: 400px"></div>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="card-box">
									<h4 class="m-t-0 m-b-20 header-title"><b>印度地图</b></h4>
									<div id="india" style="height: 400px"></div>
								</div>
							</div>
						</div>
						
						
						<div class="row">
							<div class="col-lg-6">
								<div class="card-box">
									<h4 class="m-t-0 m-b-20 header-title"><b>英国地图</b></h4>
									<div id="uk" style="height: 400px"></div>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="card-box">
									<h4 class="m-t-0 m-b-20 header-title"><b>芝加哥地图</b></h4>
									<div id="chicago" style="height: 400px"></div>
								</div>
							</div>
						</div>
						
						
						
						<div class="row">
							<div class="col-lg-6">
								<div class="card-box">
									<h4 class="m-t-0 m-b-20 header-title"><b>澳大利亚地图</b></h4>
									
									<div id="australia" style="height: 400px"></div>
								</div>
							</div>
							
							<div class="col-lg-6">
								<div class="card-box">
									<h4 class="m-t-0 m-b-20 header-title"><b>加拿大地图</b></h4>
									
									<div id="canada" style="height: 400px"></div>
								</div>
							</div>
						</div>
						
						
						
						<div class="row">
							<div class="col-lg-6">
								<div class="card-box">
									<h4 class="m-t-0 m-b-20 header-title"><b>德国地图</b></h4>
									
									<div id="germany" style="height: 400px"></div>
								</div>
							</div>
							
							<div class="col-lg-6">
								<div class="card-box">
									<h4 class="m-t-0 m-b-20 header-title"><b>亚洲地图</b></h4>
									
									<div id="asia" style="height: 400px"></div>
								</div>
							</div>
						</div>

                    </div> <!-- container -->
                               
                </div> <!-- content -->

	<script>
            var resizefunc = [];
        </script>

	 <!-- jQuery  -->
        <script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/detect.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/fastclick.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.slimscroll.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.blockUI.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/waves.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/wow.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.nicescroll.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.scrollTo.min.js"></script>


        <script src="${pageContext.request.contextPath}/assets/js/jquery.core.js"></script>
        <script src="${pageContext.request.contextPath}/assets/js/jquery.app.js"></script>


<%-- 		<link href="${pageContext.request.contextPath}/assets/plugins/vectormap/js/jquery.vector-map.css" rel="stylesheet" type="text/css" /> --%>
<%-- 		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/vectormap/js/jquery-1.8.3.min.js"></script> --%>
<%-- 		<script type="text/javascript" src="${pageContext.request.contextPath}/assets/plugins/vectormap/js/jquery.vector-map.js"></script> --%>
		




        <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-2.0.2.min.js"></script>
        <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
        <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/gdp-data.js"></script>
        <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-us-aea-en.js"></script>
        <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-uk-mill-en.js"></script>
        <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-au-mill.js"></script>
        <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-us-il-chicago-mill-en.js"></script>
        <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-ca-lcc.js"></script>
        <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-de-mill.js"></script>
        <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-in-mill.js"></script>
        <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-asia-mill.js"></script>
        <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/china-en.js"></script>
        <script src="${pageContext.request.contextPath}/assets/pages/jvectormap.init.js"></script>
</body>
</html>