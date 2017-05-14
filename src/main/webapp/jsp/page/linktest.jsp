<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>贵阳院统一门户首页</title>
<style type="text/css">
*{margin:0;padding:0;list-style-type:none;}
a,img{border:0;}
body{background:#eeeeee;color:#333333;font-family:'宋体',Verdana, Geneva, sans-serif;}
.zxx_test_list{width:80%;margin:40px auto;}
.zxx_test_list{border-bottom:0; padding-bottom:40px;}
.zxx_test_list h3{margin-top:15px;margin-bottom:1px;}
</style>

<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/link/css/lava_lamp_demo.css" type="text/css" />

<script src="${pageContext.request.contextPath}/assets/link/jQuery/jquery.lavalamp.min.js" type="text/javascript"></script>

</head>
<body>


<div class="zxx_test_list">
		<h3 id="pk_column">1.栏目一</h3>
		<ul class="lava_with_border fix" id="dx">
		<c:forEach items="${llist}" var="link">
			<li class="current"><a href="${link.linkurl}">${link.linkname}</a></li>
		</c:forEach>
		</ul>
		<div class="dashed-line"></div>
	<h3>2.栏目二</h3>
	<ul class="lava_with_border fix" id="dx">
		<li class="current"><a href="#zhangxinxu">圣诞节</a></li>
		<li><a href="#zhangxinxu">地震</a></li>
		<li><a href="#zhangxinxu">股市</a></li>
		<li><a href="#zhangxinxu">《十月围城》</a></li>
		<li><a href="#zhangxinxu">无线音乐咪咕汇</a></li>
	</ul>
	<div class="dashed-line"></div>
	
	<h3>3.栏目三</h3>
	<ul class="lava_with_border fix" id="dx">
		<li class="current"><a href="#zhangxinxu">圣诞节</a></li>
		<li><a href="#zhangxinxu">地震</a></li>
		<li><a href="#zhangxinxu">股市</a></li>
		<li><a href="#zhangxinxu">《十月围城》</a></li>
		<li><a href="#zhangxinxu">无线音乐咪咕汇</a></li>
		<li class="current"><a href="#zhangxinxu">圣诞节</a></li>
		<li><a href="#zhangxinxu">地震</a></li>
		<li><a href="#zhangxinxu">股市</a></li>
		<li><a href="#zhangxinxu">《十月围城》</a></li>
	</ul>
	<div class="dashed-line"></div>
	
	<h3>4.栏目四</h3>
	<ul class="lava_with_border fix" id="dx">
		<li class="current"><a href="#zhangxinxu">圣诞节</a></li>
		<li><a href="#zhangxinxu">地震</a></li>
		<li><a href="#zhangxinxu">股市</a></li>
		<li><a href="#zhangxinxu">《十月围城》</a></li>
		<li><a href="#zhangxinxu">无线音乐咪咕汇</a></li>
		<li class="current"><a href="#zhangxinxu">圣诞节</a></li>
		<li><a href="#zhangxinxu">地震</a></li>
		<li><a href="#zhangxinxu">股市</a></li>
		<li><a href="#zhangxinxu">《十月围城》</a></li>
	</ul>
	<div class="dashed-line"></div>
	
</div>


<script type="text/javascript">
$(function(){
	$(dx).lavaLamp({
		fx: "backout", //缓动类型
		speed: 700, //缓动时间
		click: function(event, menuItem) {
			return false; //单击触发事件
		}
	});
});
</script>
</body>
</html>