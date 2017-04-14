<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
		<meta name="author" content="Coderthemes">

		<link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/favicon_1.ico">

		<title>项目启动计划</title>
		
		<link href="${pageContext.request.contextPath}/${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.css" rel="stylesheet" type="text/css" />

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
		<script src="https://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
		<style>
			.tablehead{
				background-color: #F4F8FB;
			}
		
			.tableColor{
				background-color: #F4F8FB;
			}
			.tableinput{
				 width:100%;   
				 height:100%;
    			 padding:1px 3px 1px 3px; 
   				 margin:0px; 
    			 border:none;                
   				 font-family:Arial; 
			}
		</style>
	</head>
<body style="background-color: #FFFFFF">
<div>
<form action="javascipt:;">
<table width="600" height="600" border="1">
<tr>
<td rowspan="2">计划开始日期</td>
<td rowspan="2">计划结束日期</td>
<td rowspan="2">计划周期</td>
<td colspan="4">实施投入</td>
<td rowspan="2">合计人天</td>
<td rowspan="2">用友角色</td>
<td rowspan="2">客户角色</td>
<td rowspan="2">服务内容</td>
<td rowspan="2">用友文档</td>
<td rowspan="2">备注</td>
</tr>
<tr>
<td>项目经理</td>
<td>经理人天</td>
<td>实施顾问</td>
<td>顾问人天</td>
</tr>
<tr>
<td>
<div class="input-group">
	<input type="date" class="form-control" id="planestartdate"  name="planestartdate">
</div>
</td>
<td>
<div class="input-group">
	<input type="date" class="form-control" id="planefinishdate"  name="planefinishdate">
</div>
</td>
<td><input type="text" id="planecycle" name="planecycle"></td>
<td><input type="text" id="projectmanager" name="projectmanager"></td>
<td><input type="text" id="managerdaytime" name="managerdaytime"></td>
<td><input type="text" id="imconsultant" name="imconsultant"></td>
<td><input type="text" id="imconsultantdaytime" name="imconsultantdaytime"></td>
<td><input type="text" id="sumdaytime" name="sumdaytime"></td>
<td><input type="text" id="planecycle" name="planecycle"></td>
<td><input type="text" id="planecycle" name="planecycle"></td>
<td><input type="text" id="planecycle" name="planecycle"></td>
<td><input type="text" id="planecycle" name="planecycle"></td>
<td><input type="text" id="planecycle" name="planecycle"></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr><tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<tr>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
<td></td>
</tr>
<!-- </tbody> -->
</table>
</form>
</div>
        
        <script>
            var resizefunc = [];
        </script>
<!--计算计划周期 -->
<script type="text/javascript">
$(document).ready(function(){
	  $("#planecycle").focus(function(){
			 var dat1 = document.getElementById("planestartdate").value;
			 var dat2 = document.getElementById("planefinishdate").value;
			 
			 var date1 = new Date(dat1)
			 var date2 = new Date(dat2)
			 
			 var s1 = date1.getTime(),s2 = date2.getTime();
			 
			 var total = (s2-s1)/1000;
			 
			 var day = parseInt(total/(24*60*60));
			 
			 V("planecycle").value=day;
	  });
	});

function V(id) {
    return document.getElementById(id);
}


$(document).ready(function(){
	$("#sumdaytime").focus(function(){
		var managerdaytime = parseInt(V('managerdaytime').value);
        var imconsultantdaytime = parseInt(V('imconsultantdaytime').value);
        V('sumdaytime').value = managerdaytime + imconsultantdaytime;
		
	});
});
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
        
        <script src="${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>
        
        <script src="${pageContext.request.contextPath}/assets/pages/jquery.bs-table.js"></script>
	
	</body>
</html>