<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>动态监听事件测试</title>
<!-- 	引入bootstrap -->
<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>


<script type="text/javascript">
// 	根据传入的主计划子表编码判断向主计划主表传递什么参数
	function btn_human(number){
// 		获取编码值
		var num = parseInt(number);
		if(num == 11){
// 			调用修改数值的具体方法
		changevalue('plancycle11','manager11','managerhuman11','adviser11','adviserhuman11','totaldays11');
		}
		if(num == 12){
		changevalue('plancycle12','manager12','managerhuman12','adviser12','adviserhuman12','totaldays12');
		}
	}
	
	function V(id) {
        return document.getElementById(id);
    }
	
	
// 	计算项目经理投入人天，计算实施顾问投入人天，计算总人天
	function changevalue(plancycle,manager,managerhuman,adviser,adviserhuman,totaldays){
// 		获取主计划子表插入的值
		var plancycle = document.getElementById(plancycle).value;
		var manager = document.getElementById(manager).value;
		var adviser = document.getElementById(adviser).value;
		
//         计算主计划子表项目经理总人天，开发顾问总人天，投入总人天，并将值填入输入框
		document.getElementById(managerhuman).value = manager * plancycle
		document.getElementById(adviserhuman).value = adviser * plancycle
		document.getElementById(totaldays).value = manager * plancycle + adviser * plancycle
// 		计算主计划主表项目经理总人天，开发顾问总人天，投入总人天，并将值填入输入框
		document.getElementById("managerhuman").value = manager * plancycle
		document.getElementById("adviserhuman").value = adviser * plancycle
		document.getElementById("totaldays").value = manager * plancycle + adviser * plancycle
		
		document.getElementById("plancycle").value = plancycle;
		document.getElementById("manager").value = manager;
		document.getElementById("adviser").value = adviser;
		
// 		var totaldays = document.getElementById("totaldays").value;
// 		alert(totaldays);
		V('totaldays').value = mainplanHnum;
		V(totaldays).value = mainplanBnum;
	}
		
</script>
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