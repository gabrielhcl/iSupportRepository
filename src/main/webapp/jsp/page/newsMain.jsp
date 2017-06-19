<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>新闻首页</title>
<script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
<script
	src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
<link
	href="${pageContext.request.contextPath}/${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.css"
	rel="stylesheet" type="text/css" />

<link
	href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css"
	rel="stylesheet" type="text/css" />
<link
	href="${pageContext.request.contextPath}/${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.css"
	rel="stylesheet" type="text/css" />

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
<script src="${pageContext.request.contextPath}/js/dWeekPlane.js"></script>
</head>
<body style="background-color: #FFFFFF">
	<div class="content">
		<div class="container">
		<div class="row clearfix">
		<br><br>
		<div class="col-md-12 column">
			<div class="carousel slide" id="carousel-481942" style="width: 850; margin: auto;">
				<ol class="carousel-indicators">
				<c:forEach items="${carlist}" var="news">
					<li data-slide-to="${news.pkNews}" data-target="#carousel-481942">
					</li>
				</c:forEach>
				</ol>
				<div class="carousel-inner" style="width: 850; height:480;">
				<c:forEach items="${carlist}" var="news">
					<div class="${news.itemactive}">
						<img alt="" src="/photo/${news.carouselimg}" />
						<div class="carousel-caption">
							<h4>
								<a href="${pageContext.request.contextPath}/news/newsdetail?pkNews=${news.pkNews}&newstitle=${news.newstitle}">${news.newstitle}</a>
							</h4>
<!-- 							<p> -->
<%-- 								${news.newsremarks} --%>
<!-- 							</p> -->
						</div>
					</div>
					</c:forEach>
				</div> <a class="left carousel-control" href="#carousel-481942" data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control" href="#carousel-481942" data-slide="next"><span class="glyphicon glyphicon-chevron-right"></span></a>
			</div>
		
		
		
		
		
		
		
		
		
		
		
		
<!--=================分割线========================================================================================================================================================== -->
		
		</div>
		<br><br>
	</div>
		
		
		
		
						<div class="row">
							<div class="col-md-8 col-md-offset-2">
								<form  action="${pageContext.request.contextPath}/news/selectnews" method="post" >
								<div class="input-group m-t-10">
                                    <input type="text" id="newstitle" name="newstitle" class="form-control input-lg">
                                    <span class="input-group-btn">
                                    <button type="submit" class="btn waves-effect waves-light btn-default btn-lg"><i class="fa fa-search m-r-5"></i>搜索</button>
                                    </span>
                                </div>
                                </form>
                                <ul class="breadcrumb">
									<li>
										 <a href="${pageContext.request.contextPath}/news/allnews">所有</a>
									</li>
									<c:forEach items="${clist}" var="column">
									<li>
										 <a href="${pageContext.request.contextPath}/news/selectbypkcolumn?pkColumn=${column.pkColumn}">${column.columnname}</a>
									</li>
									</c:forEach>
								</ul>
							</div>
						</div>
						<div class="row">
							<div class="col-lg-12"> 
                                <div class="search-result-box m-t-40">
	                                <div class="tab-content"> 
	                                        <div class="row">
												<div class="col-md-12">
												<c:forEach items="${nlist}" var="news">
													<div class="search-item">
														<h3 class="h5 font-600 m-b-5"><a href="${pageContext.request.contextPath}/news/newsdetail?pkNews=${news.pkNews}&newstitle=${news.newstitle}"><c:if test="${news.istop==0}"><h5 style="color: red;">[置顶]</h5></c:if>${news.newstitle}</a></h3>
														<div class="font-13 text-success m-b-10">
														<fmt:formatDate value="${news.newsdate}"  pattern="yyyy年MM月dd日"/>
														</div>
														<p>
															${news.newsremarks}
														</p>
													</div>
												</c:forEach>
												</div>
											</div> 
	                                </div> 
                                </div>
                            </div>
						</div>
                    </div>
		<script>
            var resizefunc = [];
        </script>

		<!-- jQuery  -->
		<script
			src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script>
		<script src="${pageContext.request.contextPath}/assets/js/detect.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/js/fastclick.js"></script>
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
			src="${pageContext.request.contextPath}/assets/js/jquery.core.js"></script>
		<script
			src="${pageContext.request.contextPath}/assets/js/jquery.app.js"></script>

		<script
			src="${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>

		<script
			src="${pageContext.request.contextPath}/assets/pages/jquery.bs-table.js"></script>
			
        <script src="${pageContext.request.contextPath}/assets/plugins/select2/select2.min.js" type="text/javascript"></script>
</body>
</html>