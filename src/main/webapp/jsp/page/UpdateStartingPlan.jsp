<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>修改主计划</title>
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

<script type="text/javascript">
	  	
	function btn_human(number)
	{
		var num = parseInt(number)
		if(num == 11){
			changevalue('plancycle11','manager11','managerhuman11','adviser11','adviserhuman11','totaldays11')
		}
		if(num == 12){
			changevalue('plancycle12','manager12','managerhuman12','adviser12','adviserhuman12','totaldays12')
		}
		if(num == 13){
			changevalue('plancycle13','manager13','managerhuman13','adviser13','adviserhuman13','totaldays13')
		}
		if(num == 14){
			changevalue('plancycle14','manager14','managerhuman14','adviser14','adviserhuman14','totaldays14')
		}
		if(num == 15){
			changevalue('plancycle15','manager15','managerhuman15','adviser15','adviserhuman15','totaldays15')
		}
		if(num == 16){
			changevalue('plancycle16','manager16','managerhuman16','adviser16','adviserhuman16','totaldays16')
		}

		if(num == 21){
			changevalue('plancycle21','manager21','managerhuman21','adviser21','adviserhuman21','totaldays21')
		}
		if(num == 22){
			changevalue('plancycle22','manager22','managerhuman22','adviser22','adviserhuman22','totaldays22')
		}
		if(num == 23){
			changevalue('plancycle23','manager23','managerhuman23','adviser23','adviserhuman23','totaldays23')
		}
		if(num == 24){
			changevalue('plancycle24','manager24','managerhuman24','adviser24','adviserhuman24','totaldays24')
		}
		if(num == 25){
			changevalue('plancycle25','manager25','managerhuman25','adviser25','adviserhuman25','totaldays25')
		}
		if(num == 26){
			changevalue('plancycle26','manager26','managerhuman26','adviser26','adviserhuman26','totaldays26')
		}
		
		if(num == 31){
			changevalue('plancycle31','manager31','managerhuman31','adviser31','adviserhuman31','totaldays31')
		}
		if(num == 32){
			changevalue('plancycle32','manager32','managerhuman32','adviser32','adviserhuman32','totaldays32')
		}
		if(num == 33){
			changevalue('plancycle33','manager33','managerhuman33','adviser33','adviserhuman33','totaldays33')
		}
		if(num == 34){
			changevalue('plancycle34','manager34','managerhuman34','adviser34','adviserhuman34','totaldays34')
		}
		if(num == 35){
			changevalue('plancycle35','manager35','managerhuman35','adviser35','adviserhuman35','totaldays35')
		}
		if(num == 36){
			changevalue('plancycle36','manager36','managerhuman36','adviser36','adviserhuman36','totaldays36')
		}
		if(num == 37){
			changevalue('plancycle37','manager37','managerhuman37','adviser37','adviserhuman37','totaldays37')
		}
		if(num == 38){
			changevalue('plancycle38','manager38','managerhuman38','adviser38','adviserhuman38','totaldays38')
		}
		
		if(num == 41){
			changevalue('plancycle41','manager41','managerhuman41','adviser41','adviserhuman41','totaldays41')
		}
		if(num == 42){
			changevalue('plancycle42','manager42','managerhuman42','adviser42','adviserhuman42','totaldays42')
		}
		if(num == 43){
			changevalue('plancycle43','manager43','managerhuman43','adviser43','adviserhuman43','totaldays43')
		}
		if(num == 44){
			changevalue('plancycle44','manager44','managerhuman44','adviser44','adviserhuman44','totaldays44')
		}
		if(num == 45){
			changevalue('plancycle45','manager45','managerhuman45','adviser45','adviserhuman45','totaldays45')
		}
		if(num == 46){
			changevalue('plancycle46','manager46','managerhuman46','adviser46','adviserhuman46','totaldays46')
		}
		if(num == 47){
			changevalue('plancycle47','manager47','managerhuman47','adviser47','adviserhuman47','totaldays47')
		}
		
		if(num == 51){
			changevalue('plancycle51','manager51','managerhuman51','adviser51','adviserhuman51','totaldays51')
		}
		if(num == 52){
			changevalue('plancycle52','manager52','managerhuman52','adviser52','adviserhuman52','totaldays52')
		}
		if(num == 53){
			changevalue('plancycle53','manager53','managerhuman53','adviser53','adviserhuman53','totaldays53')
		}
	} 

	function changevalue(plancycle,manager,managerhuman,adviser,adviserhuman,totaldays){
		var plancycle = parseInt(document.getElementById(plancycle).value)
		var manager = parseInt(document.getElementById(manager).value)
		var adviser = parseInt(document.getElementById(adviser).value)
		
		document.getElementById(managerhuman).value = manager * plancycle
		document.getElementById(adviserhuman).value = adviser * plancycle
		document.getElementById(totaldays).value = manager * plancycle + adviser * plancycle	
	}
	
</script>



</head>
<body style="background-color: #FFFFFF">
	<div class="content">
		<div class="container">
			<div class="page-header">
				<h1>
					修改主计划 
				</h1>
			</div>
			<br>
			<div class="row">
				<div class="col-md-12">
					<form class="form-horizontal" role="form"  action="${pageContext.request.contextPath}/mainplan/update?pkMainplanH=${mainplanh.pkMainplanH}" method="post">

						<!-- 项目总人天 -->
						<div class="card-box">
							<div class="form-group" class="col-md-6">
								<h3>计划基本信息</h3>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label" name="sp_code" id="sp_code">计划编码</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  name="mainplancode"  value="${mainplanh.mainplancode }">
								</div>
								<small class="col-md-1 control-label">计划名称</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="mainplanname" value="${mainplanh.mainplanname }">
								</div>
								<small class="col-md-1 control-label">项目名称</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="projectname" value="${mainplanh.projectname }">
								</div>
								<small class="col-md-1 control-label">编制人</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="compiler" value="${mainplanh.compiler }">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">编制日期</small>
								<div class="col-md-2">
									<input type="date" class="form-control"  
										name="compiledate" value="${compiledate}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input   class="form-control" type="date"   name="pstartdate" value="${pstartdate}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  name="penddate" type="date" value="${penddate}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   name="plancycle" value="${mainplanh.plancycle }" >
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="sumdaytime" value="${mainplanh.sumdaytime }" >
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="pmnum" value="${mainplanh.pmnum }" >
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="pmdays" value="${mainplanh.pmdays }" >
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="imnum" value="${mainplanh.imnum }">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   name="imdays" value="${mainplanh.imdays }" >
								</div>
							</div>
						</div>

						<!-- 1、项目规划 -->
						<div class="card-box">
							<div class="form-group" class="col-md-6">
								<h3>1 项目规划</h3>
							</div>
							
							<input type="hidden" name="plancode" value="1">
							<input type="hidden" name="planname" value="项目规划">
							<input type="hidden" name="pkmainplanb" value="${plancode1.pkMainplanB}">
							
							
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input class="form-control"  type="date"  name="spstartdate" value="${pstartdate1}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${penddate1}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="splancycle" value="${plancode1.splancycle}" >
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  name="alldays" value="${plancode1.alldays}" >
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   name="spmnum" value="${plancode1.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="spmdays" value="${plancode1.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   name="simnum" value="${plancode1.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="simdays" value="${plancode1.simdays}">
								</div>
								<input type="hidden" name="ufrole" >
								<input type="hidden" name="custrole" >
								<input type="hidden" name="servicecontent" >
								<input type="hidden" name="ufdocument" >
								<input type="hidden" name="sremark" >
							</div>

							<!-- 1.1、组件用友顾问团队 -->
							<div class="form-group" class="col-md-6">
								<h4>1.1 组建用友顾问团队</h4>
							</div>
							
							<input type="hidden" name="plancode" value="1.1">
							<input type="hidden" name="planname" value="组建用友顾问团队">
							<input type="hidden" name="pkmainplanb" value="${plancode11.pkMainplanB}">
							
							
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate11}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate11}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="splancycle" value="${plancode11.splancycle}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"     value="${plancode11.alldays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode11.spmnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode11.spmdays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode11.simnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"  value="${plancode11.simdays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" placeholder="项目经理、实施顾问" name=ufrole id="yonyourole11" value="${plancode11.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name="custrole" id="customerrole11" value="${plancode11.custrole}" >
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode11.servicecontent}"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode11.ufdocument}" ></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode11.sremark}" name="sremark" id="memo11">
								</div>
							</div>

							<!-- 1.2 组建客户实施组织 -->
							<div class="form-group" class="col-md-6">
								<h4>1.2 组建客户实施组织</h4>
							</div>
							
							<input type="hidden" name="plancode" value="1.2">
							<input type="hidden" name="planname" value="组建客户实施组织">
							<input type="hidden" name="pkmainplanb" value="${plancode12.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate12}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate12}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode12.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode12.alldays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode12.spmnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"  value="${plancode12.spmdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode12.simnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode12.simdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" placeholder="项目经理、实施顾问" name=ufrole id="yonyourole11" value="${plancode12.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode12.custrole}" name="custrole" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode12.servicecontent}"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode12.ufdocument}"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode12.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							

							<!-- 1.3 制定项目主计划 -->
							<div class="form-group" class="col-md-6">
								<h4>1.3 制定项目主计划</h4>
							</div>
							<input type="hidden" name="plancode" value="1.3">
							<input type="hidden" name="planname" value="制定项目主计划">
							<input type="hidden" name="pkmainplanb" value="${plancode13.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate13}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate13}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode13.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode13.alldays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode13.spmnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode13.spmdays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode13.simnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode13.simdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" placeholder="项目经理、实施顾问" name=ufrole id="yonyourole11" value="${plancode13.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode13.custrole}" name="custrole" id="customerrole11" placeholder="项目负责人">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode13.servicecontent}" placeholder="制定主计划"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode13.ufdocument}"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode13.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							

							<!-- 1.4 与关键用户确认实施主计划 -->
							<div class="form-group" class="col-md-6">
								<h4>1.4 与关键用户确认实施主计划</h4>
							</div>
							<input type="hidden" name="plancode" value="1.4">
							<input type="hidden" name="planname" value="与关键用户确认实施主计划">
							<input type="hidden" name="pkmainplanb" value="${plancode14.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate14}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate14}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"     value="${plancode14.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode14.alldays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode14.spmnum}"  >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode14.spmdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode14.simnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode14.simdays}"   >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" placeholder="项目经理、实施顾问" name=ufrole id="yonyourole11" value="${plancode14.ufrole}" >
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode14.custrole}" name="custrole" id="customerrole11" placeholder="项目负责人">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode14.servicecontent}" placeholder="制定实施主计划，并与客户项目负责人确认" ></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode14.ufdocument}" placeholder="《项目实施计划书》"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode14.sremark}" name="sremark" id="memo11">
								</div>
							</div>

							<!-- 1.5 项目启动会 -->
							<div class="form-group" class="col-md-6">
								<h4>1.5 项目启动会</h4>
							</div>
							<input type="hidden" name="plancode" value="1.5">
							<input type="hidden" name="planname" value="项目启动会">
							<input type="hidden" name="pkmainplanb" value="${plancode15.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate15}" >
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate15}" >
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode15.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode15.alldays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode15.spmnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode15.spmdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode15.simnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode15.simdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" placeholder="项目经理、实施顾问" name=ufrole id="yonyourole11" value="${plancode15.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode15.custrole}" name="custrole" id="customerrole11" placeholder="项目负责人">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode15.servicecontent}" placeholder="召开项目启动会，向各级用户宣贯本次项目实施目标" ></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode15.ufdocument}" ></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"  value="${plancode15.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							
							
							
							

							<!-- 1.6 里程碑回顾与评估 -->
							<div class="form-group" class="col-md-6">
								<h4>1.6 里程碑回顾与评估</h4>
							</div>
							<input type="hidden" name="plancode" value="1.6">
							<input type="hidden" name="planname" value="里程碑回顾与评估">
							<input type="hidden" name="pkmainplanb" value="${plancode16.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate16}" >
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate16}" >
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode16.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode16.alldays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode16.spmnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode16.spmdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode16.simnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode16.simdays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" placeholder="项目经理、实施顾问" name=ufrole id="yonyourole11" value="${plancode16.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode16.custrole}" name="custrole" id="customerrole11" placeholder="项目负责人">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode16.servicecontent}" ></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode16.ufdocument}" placeholder="《项目实施进度里程碑确认单》" ></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode16.sremark}" name="sremark" id="memo11">
								</div>
							</div>
						</div>
							
							
							

						<!-- 2、蓝图设计 -->
						<div class="card-box">
							<div class="form-group" class="col-md-6">
								<h3>2 蓝图设计</h3>
							</div>
							<input type="hidden" name="plancode" value="2">
							<input type="hidden" name="planname" value="蓝图设计">
							<input type="hidden" name="pkmainplanb" value="${plancode2.pkMainplanB}">
							
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input class="form-control"  type="date"  name="spstartdate" value="${spstartdate2}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate2}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="splancycle" value="${plancode2.splancycle}">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  name="alldays" value="${plancode2.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   name="spmnum" value="${plancode2.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="spmdays" value="${plancode2.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   name="simnum" value="${plancode2.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="simdays" value="${plancode2.simdays}">
								</div>
								<input type="hidden" name="ufrole" >
								<input type="hidden" name="custrole" >
								<input type="hidden" name="servicecontent" >
								<input type="hidden" name="ufdocument" >
								<input type="hidden" name="sremark" >
							</div>

							<!-- 2.1 业务需求调研与基础档案收集规划 -->
							<div class="form-group" class="col-md-6">
								<h4>2.1 业务需求调研与基础档案收集规划</h4>
							</div>
							<input type="hidden" name="plancode" value="2.1">
							<input type="hidden" name="planname" value="业务需求调研与基础档案收集规划">
							<input type="hidden" name="pkmainplanb" value="${plancode21.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate21}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate21}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode21.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"   value="${plancode21.alldays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode21.spmnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode21.spmdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode21.simnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode21.simdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" placeholder="实施顾问" name=ufrole id="yonyourole11" value="${plancode21.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode21.custrole}" name="custrole" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode21.servicecontent}" placeholder="1、向客户提供基础档案收集资料表，重要档案收集工作提前展开
2、成都建工现有系统应用调研，了解成都建工集团未来需求"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode21.ufdocument}" ></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode21.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							
							
							

							<!-- 2.2 需求调研与需求报告确认 -->
							<div class="form-group" class="col-md-6">
								<h4>2.2 需求调研与需求报告确认</h4>
							</div>
							<input type="hidden" name="plancode" value="2.2">
							<input type="hidden" name="planname" value="需求调研与需求报告确认">
							<input type="hidden" name="pkmainplanb" value="${plancode22.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate22}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate22}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode22.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode22.alldays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)"  value="${plancode22.spmnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode22.spmdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)"value="${plancode22.simnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode22.simdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" placeholder="实施顾问" name=ufrole id="yonyourole11" value="${plancode22.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode22.custrole}" name="custrole" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode22.servicecontent}" placeholder="1、撰写财务与资金需求调研报告"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode22.ufdocument}" placeholder="《调研报告》"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode22.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							
							
							
							

							<!-- 2.3 业务解决方案设计 -->
							<div class="form-group" class="col-md-6">
								<h4>2.3 业务解决方案设计</h4>
							</div>
							<input type="hidden" name="plancode" value="2.3">
							<input type="hidden" name="planname" value="业务解决方案设计">
							<input type="hidden" name="pkmainplanb" value="${plancode23.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate23}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate"value="${spenddate23}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode23.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"   value="${plancode23.alldays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode23.spmnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode23.spmdays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode23.simnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode23.simdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" placeholder="实施顾问" name=ufrole id="yonyourole11" value="${plancode23.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode23.custrole}" name="custrole" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode23.servicecontent}" placeholder="1、搭建成都建工集团资金与财务测试环境
2、资金与财务业务解决方案"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode23.ufdocument}" placeholder="《业务解决方案》"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode23.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							
							

							<!-- 2.4 业务方案初步验证 -->
							<div class="form-group" class="col-md-6">
								<h4>2.4 业务方案初步验证</h4>
							</div>
							<input type="hidden" name="plancode" value="2.4">
							<input type="hidden" name="planname" value="业务方案初步验证">
							<input type="hidden" name="pkmainplanb" value="${plancode24.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate24}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate24}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode24.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode24.alldays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode24.spmnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode24.spmdays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode24.simnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode24.simdays}"  >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" placeholder="实施顾问" name=ufrole id="yonyourole11" value="${plancode24.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode24.custrole}" name="custrole" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode24.servicecontent}" placeholder="1、财务业务验证
2、资金业务验证"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode24.ufdocument}" ></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode24.sremark}"  name="sremark" id="memo11">
								</div>
							</div>
							
							
							

							<!-- 2.5 方案评估 -->
							<div class="form-group" class="col-md-6">
								<h4>2.5 方案评估</h4>
							</div>
							<input type="hidden" name="plancode" value="2.5">
							<input type="hidden" name="planname" value="方案评估">
							<input type="hidden" name="pkmainplanb" value="${plancode25.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate25}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate25}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"     value="${plancode25.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode25.alldays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode25.spmnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode25.spmdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)"  value="${plancode25.simnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode25.simdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" placeholder="实施顾问" name=ufrole id="yonyourole11" value="${plancode25.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode25.custrole}" name="custrole" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode25.servicecontent}"  placeholder="项目阶段确认"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode25.ufdocument}" placeholder="《项目实施进度里程碑确认单》"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode25.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							

							<!-- 2.6 里程碑回顾与评估 -->
							<div class="form-group" class="col-md-6">
								<h4>2.6 里程碑回顾与评估</h4>
							</div>
							<input type="hidden" name="plancode" value="2.6">
							<input type="hidden" name="planname" value="里程碑回顾与评估">
							<input type="hidden" name="pkmainplanb" value="${plancode26.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate26}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate26}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode26.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"  value="${plancode26.alldays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode26.spmnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"    value="${plancode26.spmdays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode26.simnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode26.simdays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" placeholder="实施顾问" name=ufrole id="yonyourole11" value="${plancode26.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode26.custrole}" name="custrole" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode26.servicecontent}" placeholder="项目阶段确认"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode26.ufdocument}" placeholder="《项目实施进度里程碑确认单》"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode26.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							</div>
							
							

						<!-- 3、系统建设 -->
						<div class="card-box">
							<div class="form-group" class="col-md-6">
								<h3>3 系统建设</h3>
							</div>
							<input type="hidden" name="plancode" value="3">
							<input type="hidden" name="planname" value="系统建设">
							<input type="hidden" name="pkmainplanb" value="${plancode3.pkMainplanB}">
							
							
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input class="form-control"  type="date"  name="spstartdate" value="${spstartdate3}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate3}"> 
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="splancycle" value="${plancode3.splancycle}">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  name="alldays" value="${plancode3.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   name="spmnum" value="${plancode3.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="spmdays" value="${plancode3.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   name="simnum" value="${plancode3.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="simdays" value="${plancode3.simdays}">
								</div>
								<input type="hidden" name="ufrole" >
								<input type="hidden" name="custrole" >
								<input type="hidden" name="servicecontent" >
								<input type="hidden" name="ufdocument" >
								<input type="hidden" name="sremark" >
							</div>
							

							<!-- 3.1 新系统硬件安装 -->
							<div class="form-group" class="col-md-6">
								<h4>3.1 新系统硬件安装</h4>
							</div>
							<input type="hidden" name="plancode" value="3.1">
							<input type="hidden" name="planname" value="新系统硬件安装">
							<input type="hidden" name="pkmainplanb" value="${plancode31.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate31}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate31}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode31.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"  value="${plancode31.alldays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode31.spmnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode31.spmdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode31.simnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode31.simdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" value="${plancode31.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode31.custrole}" name="custrole" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode31.servicecontent}" placeholder="1、硬件厂商安装服务器设备
2、硬件厂商安装数据库环境"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode31.ufdocument}" ></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode31.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							

							<!-- 3.2 技术顾问安装部署新产品环境 -->
							<div class="form-group" class="col-md-6">
								<h4>3.2 技术顾问安装部署新产品环境</h4>
							</div>
							<input type="hidden" name="plancode" value="3.2">
							<input type="hidden" name="planname" value="技术顾问安装部署新产品环境">
							<input type="hidden" name="pkmainplanb" value="${plancode32.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate32}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate32}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode32.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode32.alldays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode32.spmnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"  value="${plancode32.spmdays}"  >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode32.simnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode32.simdays}"  >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="实施顾问"  value="${plancode32.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode32.custrole}" name="custrole" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode32.servicecontent}" ></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode32.ufdocument}" placeholder="《业务解决方案测试计划》、《测试报告》"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode32.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							

							<!-- 3.3 将收集整理后，并且确认的基础档案导入到新系统中 -->
							<div class="form-group" class="col-md-6">
								<h4>3.3 将收集整理后，并且确认的基础档案导入到新系统中</h4>
							</div>
							<input type="hidden" name="plancode" value="3.3">
							<input type="hidden" name="planname" value="将收集整理后，并且确认的基础档案导入到新系统中">
							<input type="hidden" name="pkmainplanb" value="${plancode33.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate33}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate33}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode33.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode33.alldays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode33.spmnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode33.spmdays}"  >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode33.simnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"  value="${plancode33.simdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" value="${plancode33.ufrole}" placeholder="实施顾问">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" name="custrole" id="customerrole11" value="${plancode33.custrole}" >
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode33.servicecontent}" placeholder="1、建立业务单元
2、导入基础档案
3、导入结果检查确认
4、其他初始化工作配置
5、测试工作准备"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode33.ufdocument}" placeholder="《业务解决方案测试计划》"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control"value="${plancode33.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							

							<!-- 3.4 将初始化完成的系统导出，建立方案测试系统 -->
							<div class="form-group" class="col-md-6">
								<h4>3.4 将初始化完成的系统导出，建立方案测试系统</h4>
							</div>
							<input type="hidden" name="plancode" value="3.4">
							<input type="hidden" name="planname" value="将初始化完成的系统导出，建立方案测试系统">
							<input type="hidden" name="pkmainplanb" value="${plancode34.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate34}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate34}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode34.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode34.alldays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode34.spmnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode34.spmdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode34.simnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode34.simdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="实施顾问" value="${plancode34.ufrole}" >
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode34.custrole}" name="custrole" id="customerrole11">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode34.servicecontent}" placeholder="1、搭建方案测试环境
2、关键用户测试培训"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode34.ufdocument}"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode34.sremark}"  name="sremark" id="memo11">
								</div>
							</div>
							
							

							<!-- 3.5 关键用户测试验证业务解决方案 -->
							<div class="form-group" class="col-md-6">
								<h4>3.5 关键用户测试验证业务解决方案</h4>
							</div>
							<input type="hidden" name="plancode" value="3.5">
							<input type="hidden" name="planname" value="关键用户测试验证业务解决方案">
							<input type="hidden" name="pkmainplanb" value="${plancode35.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate35}>
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate35}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode35.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"   value="${plancode35.alldays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode35.spmnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode35.spmdays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode35.simnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"  value="${plancode35.simdays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="项目经理、实施顾问" value="${plancode35.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode35.custrole}" name="custrole" id="customerrole11" placeholder="项目负责人">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode35.servicecontent}" placeholder="1、财务系统方案测试
2、资金系统方案测试
3、测试报告签署确认"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode35.ufdocument}" placeholder="《测试报告》"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode35.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							

							<!-- 3.6 财务与资金业务解决方案验收 -->
							<div class="form-group" class="col-md-6">
								<h4>3.6 财务与资金业务解决方案验收</h4>
							</div>
							<input type="hidden" name="plancode" value="3.6">
							<input type="hidden" name="planname" value="财务与资金业务解决方案验收">
							<input type="hidden" name="pkmainplanb" value="${plancode36.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate36}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate36}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode36.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"  value="${plancode36.alldays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode36.spmnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode36.spmdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode36.simnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode36.simdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="实施顾问" value="${plancode36.ufrole}" >
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode36.custrole}" name="custrole" id="customerrole11"placeholder="项目负责人
关键用户">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode36.servicecontent}" placeholder="方案签字验收"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode36.ufdocument}" placeholder="《业务解决方案》"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode36.sremark}"  name="sremark" id="memo11">
								</div>
							</div>
							
							

							<!-- 3.7 编制财务与资金管理操作手册 -->
							<div class="form-group" class="col-md-6">
								<h4>3.7 编制财务与资金管理操作手册</h4>
							</div>
							<input type="hidden" name="plancode" value="3.7">
							<input type="hidden" name="planname" value="编制财务与资金管理操作手册">
							<input type="hidden" name="pkmainplanb" value="${plancode37.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate37}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate37}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode37.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode37.alldays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode37.spmnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"  value="${plancode37.spmdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode37.simnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode37.simdays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="实施顾问" value="${plancode37.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"value="${plancode37.custrole}" name="custrole" id="customerrole11" placeholder="关键用户">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode37.servicecontent}" placeholder="与关键用户一起完成操作手册编写工作"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode37.ufdocument}" placeholder="《最终客户操作手册》"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode37.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							

							<!-- 3.8 里程碑回顾与评估 -->
							<div class="form-group" class="col-md-6">
								<h4>3.8 里程碑回顾与评估</h4>
							</div>
							<input type="hidden" name="plancode" value="3.8">
							<input type="hidden" name="planname" value="里程碑回顾与评估">
							<input type="hidden" name="pkmainplanb" value="${plancode38.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate38}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate38}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode38.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode38.alldays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode38.spmnum}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode38.spmdays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode38.simnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode38.simdays}" >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="项目经理" value="${plancode38.ufrole}" >
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode38.custrole}" name="custrole" id="customerrole11" placeholder="项目负责人">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode38.servicecontent}" placeholder="项目阶段确认"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode38.ufdocument}" ></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode38.sremark}" name="sremark" id="memo11">
								</div>
							</div>
						</div>
							

						<!-- 4 上线切换 -->
						<div class="card-box">
							<div class="form-group" class="col-md-6">
								<h3>
									4 上线切换</small>
								</h3>
							</div>
							<input type="hidden" name="plancode" value="4">
							<input type="hidden" name="planname" value="上线切换">
							<input type="hidden" name="pkmainplanb" value="${plancode4.pkMainplanB}">
							
							
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input class="form-control"  type="date"  name="spstartdate" value="${spstartdate4}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate4}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="splancycle" value="${plancode4.splancycle}">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  name="alldays" value="${plancode4.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   name="spmnum" value="${plancode4.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="spmdays" value="${plancode4.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   name="simnum" value="${plancode4.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="simdays" value="${plancode4.simdays}">
								</div>
								<input type="hidden" name="ufrole" >
								<input type="hidden" name="custrole" >
								<input type="hidden" name="servicecontent" >
								<input type="hidden" name="ufdocument" >
								<input type="hidden" name="sremark" >
							</div>
							
							
							
							
							
							
							
							
							
							
							
							
							

							<!-- 4.1 生产环境初始化 -->
							<div class="form-group" class="col-md-6">
								<h4>4.1 生产环境初始化</h4>
							</div>
							<input type="hidden" name="plancode" value="4.1">
							<input type="hidden" name="planname" value=" 生产环境初始化">
							<input type="hidden" name="pkmainplanb" value="${plancode41.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate41}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate41}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode41.splancycle}" name="splancycle">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode41.alldays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)"  value="${plancode41.spmnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode41.spmdays}"  >
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode41.simnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"  value="${plancode41.simdays}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="实施顾问" value="${plancode41.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode41.custrole}" name="custrole" id="customerrole11" placeholder="关键用户">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode41.servicecontent}" placeholder="1、会计科目导入及检测
2、核算基础档案导入及检测
3、资金系统初始设置检查
4、期初导入工具制作并下发
5、联行号信息等复杂基础档案初始化"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode41.ufdocument}"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode41.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							
							
							
							
							
							
							
							
							
							
							

							<!-- 4.2 报表系统初始化设置 -->
							<div class="form-group" class="col-md-6">
								<h4>4.2 报表系统初始化设置</h4>
							</div>
							<input type="hidden" name="plancode" value="4.2">
							<input type="hidden" name="planname" value="  报表系统初始化设置">
							<input type="hidden" name="pkmainplanb" value="${plancode42.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate42}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate42}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode42.splancycle}" name="splancycle">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"   value="${plancode42.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode42.spmnum}">
									<span class="font-13 text-muted">e.g. "9,999"</span>
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode42.spmdays}"  >
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode42.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode42.simdays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="实施顾问" value="${plancode42.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode42.custrole}" name="custrole" id="customerrole11" placeholder="关键用户">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode42.servicecontent}" placeholder="1、编制集团报表表样
2、配合关键用户完成报表公式定义工作
3、财务报表下发
4、部分管理报表定义
5、合并报表初始化"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode42.ufdocument}"  ></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode42.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							

							<!-- 4.3 期初数据收集工作指导 -->
							<div class="form-group" class="col-md-6">
								<h4>4.3 期初数据收集工作指导</h4>
							</div>
							<input type="hidden" name="plancode" value="4.3">
							<input type="hidden" name="planname" value="期初数据收集工作指导">
							<input type="hidden" name="pkmainplanb" value="${plancode43.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate43}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate43}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode43.splancycle}" name="splancycle">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"  value="${plancode43.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode43.spmnum}" >
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode43.spmdays}" >
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode43.simnum}" >
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode43.simdays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="实施顾问" value="${plancode43.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode43.custrole}" name="custrole" id="customerrole11" placeholder="关键用户">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode43.servicecontent}" placeholder="1、指导最终用户如何使用期初数据收集模板
2、上报数据导入
3、凭证录入等简单工作指导"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode43.ufdocument}" ></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode43.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							
							

							<!-- 4.4 备份生产环境，生成培训环境，制定最终用户培训计划和培训PPT -->
							<div class="form-group" class="col-md-6">
								<h4>4.4 备份生产环境，生成培训环境，制定最终用户培训计划和培训PPT</h4>
							</div>
							<input type="hidden" name="plancode" value="4.4">
							<input type="hidden" name="planname" value="备份生产环境，生成培训环境，制定最终用户培训计划和培训PPT">
							<input type="hidden" name="pkmainplanb" value="${plancode44.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate44}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate44}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode44.splancycle}" name="splancycle">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode44.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode44.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays" value="${plancode44.spmdays}" >
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode44.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"  value="${plancode44.simdays}" >
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="项目经理、实施顾问" value="${plancode44.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode44.custrole}" name="custrole" id="customerrole11" placeholder="关键用户">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode44.servicecontent}" placeholder="1、导出生产环境，备份为培训环境
2、完成最终用户登录操作及权限检查，确保培训操作过程中客户应用正常"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode44.ufdocument}" placeholder="《培训计划》
《培训课件》"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode44.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							

							<!-- 4.5 培训环境检查，确保培训效果 -->
							<div class="form-group" class="col-md-6">
								<h4>4.5 培训环境检查，确保培训效果</h4>
							</div>
							<input type="hidden" name="plancode" value="4.5">
							<input type="hidden" name="planname" value="培训环境检查，确保培训效果">
							<input type="hidden" name="pkmainplanb" value="${plancode45.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate45}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate45}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  value="${plancode45.splancycle}" name="splancycle">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"  value="${plancode45.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode45.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"  value="${plancode45.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode45.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"  value="${plancode45.simdays}" >
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="实施顾问" value="${plancode45.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode45.custrole}" name="custrole" id="customerrole11" placeholder="关键用户">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode45.servicecontent}" placeholder="1、培训环境外网访问检查
2、培训设备使用检查（投影、话筒、培训机器等）
3、培训客户座位排定"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode45.ufdocument}"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode45.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							
							

							<!-- 4.6 最终用户培训及上线确认 -->
							<div class="form-group" class="col-md-6">
								<h4>4.6 最终用户培训及上线确认</h4>
							</div>
							<input type="hidden" name="plancode" value="4.6">
							<input type="hidden" name="planname" value="最终用户培训及上线确认">
							<input type="hidden" name="pkmainplanb" value="${plancode46.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate46}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate46}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode46.splancycle}" name="splancycle">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays" value="${plancode46.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode46.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode46.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode46.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"  value="${plancode46.simdays}" >
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="实施顾问" value="${plancode46.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode46.custrole}" name="custrole" id="customerrole11" placeholder="关键用户">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode46.servicecontent}" placeholder="1、分为三期对最终用进行培训，一周为一期
2、每期培训完成后，必须完成1月凭证录入、1月报表生成、资金业务数据录入"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode46.ufdocument}"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode46.sremark}" name="sremark" id="memo11">
								</div>
							</div>

							<!-- 4.7 里程碑回顾与评估 -->
							<div class="form-group" class="col-md-6">
								<h4>4.7 里程碑回顾与评估</h4>
							</div>
							<input type="hidden" name="plancode" value="4.7">
							<input type="hidden" name="planname" value="里程碑回顾与评估">
							<input type="hidden" name="pkmainplanb" value="${plancode47.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate47}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2"> 
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate47}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode47.splancycle}" name="splancycle">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"  value="${plancode47.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode47.spmnum}" >
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode47.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode47.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode47.simdays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="实施顾问" value="${plancode47.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode47.custrole}" name="custrole" id="customerrole11" placeholder="关键用户">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode47.servicecontent}" placeholder="项目阶段确认"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" id="yonyoufile11" value="${plancode47.ufdocument}"  placeholder="《系统切换工作检查报告》、《上线报告》、《项目实施进度里程碑确认单》"></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode47.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							</div>

						<!-- 5 持续支持 -->
						<div class="card-box">
							<div class="form-group" class="col-md-6">
								<h3>
									5 持续支持</small>
								</h3>
							</div>
							<input type="hidden" name="plancode" value="5">
							<input type="hidden" name="planname" value="持续支持">
							<input type="hidden" name="pkmainplanb" value="${plancode5.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input class="form-control"  type="date"  name="spstartdate" value="${spstartdate5}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="splancycle" value="${plancode5.splancycle}">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"  name="alldays" value="${plancode5.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   name="spmnum" value="${plancode5.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="spmdays"value="${plancode5.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   name="simnum" value="${plancode5.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    name="simdays" value="${plancode5.simdays}">
								</div>
								<input type="hidden" name="ufrole" >
								<input type="hidden" name="custrole" >
								<input type="hidden" name="servicecontent" >
								<input type="hidden" name="ufdocument" >
								<input type="hidden" name="sremark" >
							</div>
							
							
							

							<!-- 5.1 运行支持及优化 -->
							<div class="form-group" class="col-md-6">
								<h4>5.1 运行支持及优化</h4>
							</div>
							<input type="hidden" name="plancode" value="5.1">
							<input type="hidden" name="planname" value="运行支持及优化">
							<input type="hidden" name="pkmainplanb" value="${plancode51.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate51}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate51}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode51.splancycle}" name="splancycle">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode51.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode51.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode51.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode51.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode51.simdays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="实施顾问" value="${plancode51.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode51.custrole}" name="custrole" id="customerrole11" placeholder="关键用户">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode51.servicecontent}" placeholder="应用问题支持、技术问题支持"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" value="${plancode51.ufdocument}" id="yonyoufile11"  ></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode51.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							

							<!-- 5.2 项目总结及收尾 -->
							<div class="form-group" class="col-md-6">
								<h4>5.2 项目总结及收尾</h4>
							</div>
								<input type="hidden" name="plancode" value="5.2">
							<input type="hidden" name="planname" value="项目总结及收尾">
							<input type="hidden" name="pkmainplanb" value="${plancode52.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate52}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate52}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"   value="${plancode52.splancycle}" name="splancycle">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode52.alldays}" >
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode52.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode52.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode52.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode52.simdays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="实施顾问" value="${plancode52.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  value="${plancode52.custrole}" name="custrole" id="customerrole11" placeholder="关键用户">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" id="servicecontent11" value="${plancode52.servicecontent}" placeholder="项目总结"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" value="${plancode52.ufdocument}" id="yonyoufile11"  ></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode52.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							
							

							<!-- 5.3 里程碑回顾与评估 -->
							<div class="form-group" class="col-md-6">
								<h4>5.3 里程碑回顾与评估</h4>
							</div>
							<input type="hidden" name="plancode" value="5.3">
							<input type="hidden" name="planname" value="里程碑回顾与评估">
							<input type="hidden" name="pkmainplanb" value="${plancode53.pkMainplanB}">
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">计划开始时间</small>
								<div class="col-md-2">
									<input type="date" class="form-control"   name="spstartdate" value="${spstartdate}">
								</div>
								<small class="col-md-1 control-label">计划结束时间</small>
								<div class="col-md-2">
									<input  class="form-control"  type="date"  name="spenddate" value="${spenddate}">
								</div>
								<small class="col-md-1 control-label">计划周期</small>
								<div class="col-md-2">
									<input type="text" class="form-control"    value="${plancode53.splancycle}" name="splancycle">
								</div>
								<small class="col-md-1 control-label">合计人天</small>
								<div class="col-md-2">
									<input type="text" class="form-control" name="alldays"    value="${plancode53.alldays}">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">项目经理投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber" 
									id="manager11" name="spmnum" onclick="btn_human(11)" value="${plancode53.spmnum}">
								</div>
								<small class="col-md-1 control-label">项目经理投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="managerhuman11" name="spmdays"   value="${plancode53.spmdays}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入量</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviser11" name="simnum" onclick="btn_human(11)" value="${plancode53.simnum}">
								</div>
								<small class="col-md-1 control-label">实施顾问投入人天</small>
								<div class="col-md-2">
									<input type="text" placeholder="" data-v-max="9999" data-v-min="0" class="form-control autonumber"
									id="adviserhuman11" name="simdays"   value="${plancode53.simdays}" >
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">用友角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control"  name=ufrole id="yonyourole11" placeholder="实施顾问" value="${plancode53.ufrole}">
								</div>
								<small class="col-md-1 control-label">客户角色</small>
								<div class="col-md-5">
									<input type="text" class="form-control" value="${plancode53.custrole}" name="custrole" id="customerrole11" placeholder="关键用户">
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">服务内容</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="servicecontent" value="${plancode53.servicecontent}" id="servicecontent11" placeholder="项目阶段确认"></textarea>
								</div>
								<small class="col-md-1 control-label">用友文档</small>
								<div class="col-md-5">
									<textarea class="form-control" rows="2" name="ufdocument" value="${plancode53.ufdocument}" id="yonyoufile11"  ></textarea>
								</div>
							</div>
							<div class="form-group" class="col-md-6">
								<small class="col-md-1 control-label">备注</small>
								<div class="col-md-11">
									<input type="text" class="form-control" value="${plancode53.sremark}" name="sremark" id="memo11">
								</div>
							</div>
							</div>
							
							
							
						</div>
						<input type="submit" value="提交">
					</form>
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
			src="${pageContext.request.contextPath}/assets/plugins/bootstrap-inputmask/bootstrap-inputmask.min.js"
			type="text/javascript"></script>
		<script
			src="${pageContext.request.contextPath}/assets/plugins/autoNumeric/autoNumeric.js"
			type="text/javascript"></script>
		<script
			src="${pageContext.request.contextPath}/assets/pages/jquery.bs-table.js"></script>

		<script
			src="${pageContext.request.contextPath}/assets/plugins/select2/select2.min.js"
			type="text/javascript"></script>
			
		<script type="text/javascript">
			jQuery(function($) {
			    $('.autonumber').autoNumeric('init');    
			});
        </script>
</body>
</html>