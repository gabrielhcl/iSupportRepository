<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>动态监听事件测试</title>
<!-- 	引入bootstrap -->
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/valuechangeTest.js"></script>
</head>
<body>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<div class="page-header">
				<h1>
					动态监听事件测试 <small>valuechangeTest</small>
				</h1>
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-3 column">
		</div>
			<div class="col-md-6 column">
				<form role="form">
				<h3>1计划</h3>
					<div class="form-group">
						 <label for="exampleInputEmail1">周期</label><input type="text" class="form-control" id="plancycle" name="plancycle" disabled="disabled"/>
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">项目经理投入量</label><input type="text" class="form-control" id="manager" name="manager" disabled="disabled"/>
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">项目经理人天</label><input type="text" class="form-control" id="managerhuman" name="managerhuman" disabled="disabled"/>
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">实施顾问投入量</label><input type="text" class="form-control" id="adviser" name="adviser" disabled="disabled"/>
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">实施顾问人天</label><input type="text" class="form-control" id="adviserhuman" name="adviserhuman" disabled="disabled"/>
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">总人天</label><input type="text" class="form-control" id="totaldays" name="totaldays" disabled="disabled"/>
					</div>
					
					
					
					
					
					<h3>1.1计划</h3>
<!-- --------------------------------------------------------------------------------------------------------------------------------------------------------------------------					 -->
					<input type="hidden" class="form-control" id="plancode11" name="plancode"  value="11" number="11"/>
					<div class="form-group">
						 <label for="exampleInputEmail1">周期</label><input type="text" class="form-control" id="plancycle11" name="plancycle" />
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">项目经理投入量</label><input type="text" class="form-control" id="manager11" name="manager"/>
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">项目经理人天</label><input type="text" class="form-control" id="managerhuman11" name="managerhuman" disabled="disabled"/>
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">实施顾问投入量</label><input type="text" class="form-control" id="adviser11" name="adviser"/>
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">实施顾问人天</label><input type="text" class="form-control" id="adviserhuman11" name="adviserhuman" disabled="disabled"/>
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">总人天</label><input type="text" class="form-control" id="totaldays11" name="totaldays" disabled="disabled"/>
					</div>
					
					<input type="button" onclick="btn_human(11);" value="计算"/>
<!-- -----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------					 -->
					<h3>1.2计划</h3>
						<input type="hidden" class="form-control" id="plancode12" name="plancode"  value="12"/>
					<div class="form-group">
						 <label for="exampleInputEmail1">周期</label><input type="text" class="form-control" id="plancycle12" name="plancycle" />
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">项目经理投入量</label><input type="text" class="form-control" id="manager12" name="manager"/>
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">项目经理人天</label><input type="text" class="form-control" id="managerhuman12" name="managerhuman" disabled="disabled"/>
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">实施顾问投入量</label><input type="text" class="form-control" id="adviser12" name="adviser"/>
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">实施顾问人天</label><input type="text" class="form-control" id="adviserhuman12" name="adviserhuman" disabled="disabled"/>
					</div>
					<div class="form-group">
						 <label for="exampleInputEmail1">总人天</label><input type="text" class="form-control" id="totaldays12" name="totaldays" disabled="disabled"/>
					</div>
					<input type="button" onclick="btn_human(12);" value="计算"/>
				</form>
			</div>
		</div>
		<div class="col-md-3 column">
		</div>
	</div>
</div>
</body>
</html>