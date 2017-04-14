<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
		<meta name="author" content="Coderthemes">

		<link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/favicon_1.ico">

		<title>双周计划书</title>
		
		<link href="${pageContext.request.contextPath}/${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.css" rel="stylesheet" type="text/css" />

		<link href="${pageContext.request.contextPath}/assets/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/core.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/components.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/icons.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/pages.css" rel="stylesheet" type="text/css" />
        <link href="${pageContext.request.contextPath}/assets/css/responsive.css" rel="stylesheet" type="text/css" />
        <script src="https://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>

        <script src="${pageContext.request.contextPath}/assets/js/modernizr.min.js"></script>
		<script src="${pageContext.request.contextPath}/js/dWeekPlane.js"></script>


<!-- 		计算总人天数 -->
		<script type="text/javascript">
	    $(document).ready(function(){
	    	  $("#sumdaytime").focus(function(){
	    	  var projectmanagerdaytime = parseInt(V('projectmanagerdaytime').value);
	          var impconsultantdaytime = parseInt(V('impconsultantdaytime').value);
	          var devconsultantdaytime = parseInt(V('devconsultantdaytime').value);
	          V('sumdaytime').value = projectmanagerdaytime + impconsultantdaytime + devconsultantdaytime;
	    	  });
	    	  
	    	  $('#sub').click(function(){
	  	    	alert('666');
	  	    	var formArray = $("#weekForm").serializeArray();
	  	    	var data = formatArray(formArray, type);
	  	    	$('#weekForm').submit();
	  	    });
	    	  function formatArray(array, type) {
	    		    var dataArray = {};
	    		    $.each(array, function () {
	    		        if (dataArray[this.name]) {
	    		            if (!dataArray[this.name].push) {
	    		                dataArray[this.name] = [dataArray[this.name]];
	    		            }
	    		            dataArray[this.name].push(this.value || '');
	    		        } else {
	    		            dataArray[this.name] = this.value || '';
	    		        }
	    		    });
	    		    return ((type == "json") ? JSON.stringify(dataArray) : dataArray);
	    		}
	    	});
	    function V(id) {
	        return document.getElementById(id);
	    }
	    $('#sub').click(function(){
	    	alert('666');
	    	var formArray = $("#weekForm").serializeArray();
	    	var data = formatArray(formArray, type);
	    	$('#weekForm').submit();
	    });
		</script>
		
		<style>
			.tablehead{
				background-color: #F4F8FB;
			}
		
			.tableColor{
				background-color: #F4F8FB;
			}
/* 			.form-control{ */
/* 				 width:100%;    */
/* 				 height:100%; */
/*     			 padding:1px 3px 1px 3px;  */
/*    				 margin:0px;  */
/*     			 border:none;                 */
/*    				 font-family:Arial;  */
/* 			} */
		</style>
	</head>
	<body style="background-color: #FFFFFF">
            <div class="content">
            <div class="container">
	<div class="row clearfix">
	<div class="col-md-12 column">
	<br>
	<div class="dropdown">
	<button type="button" class="btn dropdown-toggle" id="dropdownMenu1" 
			data-toggle="dropdown">
		项目选择
		<span class="caret"></span>
	</button>
	<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
		<li role="presentation">
			<a role="menuitem" tabindex="-1" href="#">项目1</a>
		</li>
		<li role="presentation">
			<a role="menuitem" tabindex="-1" href="#">项目2</a>
		</li>
		<li role="presentation">
			<a role="menuitem" tabindex="-1" href="#">项目3</a>
		</li>
	</ul>
</div>
	
	
		</div>
		<div class="col-md-4 column">
		</div>
		<div class="col-md-4 column" align="center">
			<img alt="140x140" src="v3/default3.jpg"/>
			<h3>
				 青海公路工程建设总公司
			</h3>
			<h3>
				财务信息系统建设项目
			</h3>
			<h4>
				项目双周计划及项目状态报告
			</h4>
		</div>
		<div class="col-md-4 column">
		</div>
	</div>
	<br><br><br><br><br><br><br><br><br><br>
	<div class="row clearfix">
		<div class="col-md-4 column">
		</div>
		<div class="col-md-4 column" align="center">
			<img alt="140x140" src="v3/default3.jpg" />
			<h4>
				 用友网络科技股份有限公司建筑行业公司
			</h4>
			<h5>
				2017年02月24日
			</h5>
		</div>
		<div class="col-md-4 column">
		</div>
	</div>
			<div>
			<table data-toggle="table" data-show-columns="false" data-page-list="[5, 10, 20]" data-page-size="5" data-pagination="true" data-show-pagination-switch="true" class="table-bordered">
			<thead></thead>
			<tbody> 
			<tr>
				<td style="background-color: #F4F8FB" width="70%">报告日期</td>
				<td colspan="2">
				<div class="input-group">
					<input type="date" class="form-control" id="reportdate"  name="reportdate">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td class="tableColor">计划开工日期</td>
				<td colspan="2" >
				<div class="input-group">
					<input type="date" class="form-control" id="planestartdate"  name="planestartdate">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
			</tr>
			<tr>
				<td class="tableColor">实际开工日期</td>
				<td colspan="2" > 
				<div class="input-group">
					<input type="date" class="form-control" id="startprojectdate"  name="startprojectdate">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td class="tableColor">计划完工日期</td>
				<td colspan="2">
				<div class="input-group">
					<input type="date" class="form-control" id="planefinishdate"  name="planefinishdate">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
			</tr>
			<tr>
				<td class="tableColor">项目经理</td>
				<td colspan="2">
<!-- 				<input type="text" class="form-control" value="Some text value..."> -->

				<input type="text" name="projectmanager" id="projectmanager" class="form-control"/>
				</td>
				<td class="tableColor">项目经理投入人天总数</td>
				<td colspan="2">
				<input type="text" name="projectmanagerdaytime" id="projectmanagerdaytime" class="form-control"/>
				</td>
			</tr>
			<tr>
				<td class="tableColor">实施顾问</td>
				<td colspan="2" >
				<input type="text" name="impconsultant" id="impconsultant" class="form-control"/>
				</td>
				<td class="tableColor">实施顾问投入人天总数</td>
				<td colspan="2">
				<input type="text" name="impconsultantdaytime" id="impconsultantdaytime" class="form-control"/>
				</td>
			</tr>
			<tr>
				<td class="tableColor">开发顾问</td>
				<td colspan="2" >
				<input type="text" name="devconsultant" id="devconsultant" class="form-control"/>
				</td>
				<td class="tableColor">开发顾问投入人天总数</td>
				<td colspan="2" >
				<input type="text" name="devconsultantdaytime" id="devconsultantdaytime" class="form-control"/></td>
			</tr>
			<tr>
				<td class="tableColor">总共投入人天数</td>
				<td colspan="5">
				<input type="text" name="sumdaytime" id="sumdaytime" class="form-control"/>
				</td>
			</tr>
			<tr>
				<td colspan="6"></td>
			</tr>
			<tr>
				<td colspan="6" width="100" class="tablehead">第一部分：本周实施情况总结</td>
			</tr>
			<tr>
				<td colspan="6" width="100" class="tablehead">一、本周项目状态</td>
			</tr>
			<tr>
				<td colspan="2">所处阶段</td>
				<td>
				<input type="text" name="stagein" id="stagein" class="form-control"/>
				</td>
				<td>乙方项目经理</td>
				<td colspan="2">
				<input type="text" name="yiprojectmanager" id="yiprojectmanager" class="form-control"/>
				</td>
			</tr>
			
			
<!-- 			<tr> -->
<!--   <td  colspan="2" rowspan="3">总体状态</td> -->
<!--   <td rowspan="3" colspan="4"> -->
  
<!--   <div class="col-sm-6"> -->
<!-- 		                                                <div class="radio radio-danger"> -->
<!-- 		                                                    <input type="radio" name="radio" id="radio6" value="option6"> -->
<!-- 		                                                    <label for="radio6"> -->
<!-- 		                                                        进度滞后>10天 -->
<!-- 		                                                    </label> -->
<!-- 		                                                </div> -->
<!-- 		                                                <div class="radio radio-warning"> -->
<!-- 		                                                    <input type="radio" name="radio" id="radio7" value="option7"> -->
<!-- 		                                                    <label for="radio7"> -->
<!-- 		                                                        进度滞后<=10天 -->
<!-- 		                                                    </label> -->
<!-- 		                                                </div> -->
<!-- 		                                           <div class="radio radio-success"> -->
<!-- 		                                                    <input type="radio" name="radio" id="radio4" value="option4"> -->
<!-- 		                                                    <label for="radio4"> -->
<!-- 		                                                       项目状态正常 -->
<!-- 		                                                    </label> -->
<!-- 		                                                </div> -->
<!-- 		                                            </div> -->
  
  
<!--   </td> -->
<!-- </tr> -->
<!-- <tr> -->
 
<!-- </tr> -->
<!-- <tr> -->
 
<!-- </tr> -->
			
			
			<tr>
				<td colspan="2" rowspan="3">总体状态</td>
				<td rowspan="3">
<!-- 					 <div class="col-sm-6"> -->
<!--                           <div class="radio radio-danger"> -->
<!--                               <input type="radio" name="radio" id="radio3" value="option3"> -->
<!--                               <label for="radio3"> -->
<!--                                   Danger -->
<!--                               </label> -->
<!--                           </div> -->
<!--                           <div class="radio radio-warning"> -->
<!--                               <input type="radio" name="radio" id="radio7" value="option7"> -->
<!--                               <label for="radio7"> -->
<!--                                   Warning -->
<!--                               </label> -->
<!--                           </div> -->
<!--                      		 <div class="radio radio-success"> -->
<!--                               <input type="radio" name="radio" id="radio4" value="option4"> -->
<!--                               <label for="radio4"> -->
<!--                                   Success -->
<!--                               </label> -->
<!--                           </div> -->
<!--                       </div> -->
				</td>
				<td>
					<div class="radio radio-danger">
                        <input type="radio" name="radio" id="radio6" value="option6" checked>
                         <label for="radio6">
                         </label>
                     </div>
				</td>
				<td colspan="2">进度滞后>10天</td>
			</tr>
			<tr>
				<td>
					<div class="radio radio-warning">
                       <input type="radio" name="radio6" id="radio16" value="option6" checked>
                       <label for="radio16">
                       </label>
                   </div>
				</td>
				<td colspan="2">进度滞后<=10天</td>
			</tr>
			<tr>
				<td>
					<div class="radio radio-success">
                          <input type="radio" name="radio4" id="radio14" value="option4" checked>
                          <label for="radio14">
                          </label>
                      </div>
				</td>
				<td colspan="2">项目状态正常</td>
			</tr>
			<tr>
				<td colspan="2">风险提示</td>
				<td colspan="4">
					<input type="text" name="riskwarning" id="riskwarning" class="form-control"/>
				</td>
			</tr>
			<!-- 项目总体进度 -->
			<tr>
				<td colspan="6"></td>
			</tr>
			<tr>
				<td colspan="6" width="100" class="tablehead">二、项目总体进度</td>
			</tr>

			<tr>
				<td></td>
				<td>
				</td>
				<td>
				</td>
				<td>
				</td>
				<td>
				</td>
				<td>
				</td>
			</tr>
			<tr>
				<td>项目规格</td>
				<td style="background-color:#81C868"></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>蓝图设计</td>
				<td></td>
				<td style="background-color:#81C868"></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>系统建设</td>
				<td></td>
				<td></td>
				<td style="background-color:#81C868"></td>
				<td></td>
				<td></td>
			</tr>
			<tr>
				<td>上线切换</td>
				<td></td>
				<td></td>
				<td></td>
				<td style="background-color:#34D3EB"></td>
				<td></td>
			</tr>
			<tr>
				<td>持续支持</td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td style="background-color:#FFBD4A" ></td>
			</tr>

			<!-- 本周工作完成情况 -->
			<tr>
				<td colspan="6"></td>
			</tr>
			<tr>
				<td colspan="6" width="100" class="tablehead">三、本周工作完成情况</td>
			</tr>
			
			<tr class="weekworkfinished">
				<td>序号</td>
				<td>工作任务</td>
				<td>负责人</td>
				<td>开始时间</td>
				<td>结束时间</td>
				<td>说明</td>
			</tr>
			<tr class="weekworkfinished">
				<td>1</td>
				<td><input type="text" name="weekworktask1" id="weekworktask1" class="form-control"/></td>
				<td><input type="text" name="weekpersonliable1" id="weekpersonliable1" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkstarttime1"  name="weekworkstarttime1">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkfinishtime1"  name="weekworkfinishtime1">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="weekworkexplain1" id="weekworkexplain1" class="form-control"/></td>
			</tr>
			<tr class="weekworkfinished">
				<td>2</td>
				<td><input type="text" name="weekworktask2" id="weekworktask2" class="form-control"/></td>
				<td><input type="text" name="weekpersonliable2" id="weekpersonliable2" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkstarttime2"  name="weekworkstarttime2">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkfinishtime2"  name="weekworkfinishtime2">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="weekworkexplain2" id="weekworkexplain2" class="form-control"/></td>
			</tr>
			<tr class="weekworkfinished">
				<td>3</td>
				<td><input type="text" name="weekworktask3" id="weekworktask3" class="form-control"/></td>
				<td><input type="text" name="weekpersonliable3" id="weekpersonliable3" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkstarttime3"  name="weekworkstarttime3">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkfinishtime3"  name="weekworkfinishtime3">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="weekworkexplain3" id="weekworkexplain3" class="form-control"/></td>
			</tr>
			<tr class="weekworkfinished">
				<td>4</td>
				<td><input type="text" name="weekworktask4" id="weekworktask4" class="form-control"/></td>
				<td><input type="text" name="weekpersonliable4" id="weekpersonliable4" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkstarttime4"  name="weekworkstarttime4">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkfinishtime4"  name="weekworkfinishtime4">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="weekworkexplain4" id="weekworkexplain4" class="form-control"/></td>
			</tr>
			<tr class="weekworkfinished">
				<td>5</td>
				<td><input type="text" name="weekworktask5" id="weekworktask5" class="form-control"/></td>
				<td><input type="text" name="weekpersonliable5" id="weekpersonliable5" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkstarttime5"  name="weekworkstarttime5">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkfinishtime"  name="weekw5orkfinishtime5">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="weekworkexplain5" id="weekworkexplain5" class="form-control"/></td>
			</tr>
			<tr class="weekworkfinished">
				<td>6</td>
				<td><input type="text" name="weekworktask6" id="weekworktask6" class="form-control"/></td>
				<td><input type="text" name="weekpersonliable6" id="weekpersonliable6" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkstarttime6"  name="weekworkstarttime6">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkfinishtime6"  name="weekworkfinishtime6">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="weekworkexplain6" id="weekworkexplain6" class="form-control"/></td>
			</tr>
			<tr class="weekworkfinished">
				<td>7</td>
				<td><input type="text" name="weekworktask7" id="weekworktask7" class="form-control"/></td>
				<td><input type="text" name="weekpersonliable7" id="weekpersonliable7" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkstarttime7"  name="weekworkstarttime7">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="weekworkfinishtime7"  name="weekworkfinishtime7">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="weekworkexplain7" id="weekworkexplain7" class="form-control"/></td>
			</tr>
			<!-- 计划未完成工作列表及原因分析 -->
			<tr>
				<td colspan="6"></td>
			</tr>
			<tr>
				<td colspan="6" width="100" class="tablehead">四、计划未完成工作列表及原因分析</td>
			</tr>

			<tr>
				<td>序号</td>
				<td>工作任务</td>
				<td>负责人</td>
				<td colspan="2">未完成原因</td>
				<td>具体措施</td>
			</tr>
			<tr>
				<td>1</td>
				<td><input type="text" name="notfinishtask1" id="notfinishtask1" class="form-control"/></td>
				<td><input type="text" name="personliable1" id="personliable1" class="form-control"/></td>
				<td colspan="2"><input type="text" name="notfinishreason1" id="notfinishreason1" class="form-control"/></td>
				<td><input type="text" name="concretemeasure1" id="concretemeasure1" class="form-control"/></td>
			</tr>
			<tr>
				<td>2</td>
				<td><input type="text" name="notfinishtask2" id="notfinishtask2" class="form-control"/></td>
				<td><input type="text" name="personliable2" id="personliable2" class="form-control"/></td>
				<td colspan="2"><input type="text" name="notfinishreason2" id="notfinishreason2" class="form-control"/></td>
				<td><input type="text" name="concretemeasure2" id="concretemeasure2" class="form-control"/></td>
			</tr>
			<tr>
				<td>3</td>
				<td><input type="text" name="notfinishtask3" id="notfinishtask3" class="form-control"/></td>
				<td><input type="text" name="personliable3" id="personliable3" class="form-control"/></td>
				<td colspan="2"><input type="text" name="notfinishreason3" id="notfinishreason3" class="form-control"/></td>
				<td><input type="text" name="concretemeasure3" id="concretemeasure3" class="form-control"/></td>
			</tr>
			<tr>
				<td>4</td>
				<td><input type="text" name="notfinishtask4" id="notfinishtask4" class="form-control"/></td>
				<td><input type="text" name="personliable4" id="personliable4" class="form-control"/></td>
				<td colspan="2"><input type="text" name="notfinishreason4" id="notfinishreason4" class="form-control"/></td>
				<td><input type="text" name="concretemeasure4" id="concretemeasure4" class="form-control"/></td>
			</tr>
			<tr>
				<td>5</td>
				<td><input type="text" name="notfinishtask5" id="notfinishtask5" class="form-control"/></td>
				<td><input type="text" name="personliable5" id="personliable5" class="form-control"/></td>
				<td colspan="2"><input type="text" name="notfinishreason5" id="notfinishreason5" class="form-control"/></td>
				<td><input type="text" name="concretemeasure5" id="concretemeasure5" class="form-control"/></td>
			</tr>
			<tr>
				<td>6</td>
				<td><input type="text" name="notfinishtask6" id="notfinishtask6" class="form-control"/></td>
				<td><input type="text" name="personliable6" id="personliable6" class="form-control"/></td>
				<td colspan="2"><input type="text" name="notfinishreason6" id="notfinishreason6" class="form-control"/></td>
				<td><input type="text" name="concretemeasure6" id="concretemeasure6" class="form-control"/></td>
			</tr>
			<tr>
				<td>7</td>
				<td><input type="text" name="notfinishtask7" id="notfinishtask7" class="form-control"/></td>
				<td><input type="text" name="personliable7" id="personliable7" class="form-control"/></td>
				<td colspan="2"><input type="text" name="notfinishreason7" id="notfinishreason7" class="form-control"/></td>
				<td><input type="text" name="concretemeasure7" id="concretemeasure7" class="form-control"/></td>
			</tr>

			<!-- 存在的问题与困难 -->
			<tr>
				<td colspan="6"></td>
			</tr>
			<tr>
				<td colspan="6" width="100" class="tablehead">五、存在的问题与困难</td>
			</tr>

			<tr>
				<td>序号</td>
				<td colspan="2">问题与困难</td>
				<td colspan="2">需要的相应/支持</td>
				<td>期望完成时间</td>
			</tr>
			<tr>
				<td>1</td>
				<td colspan="2"><input type="text" name="problem1" id="problem1" class="form-control"/></td>
				<td colspan="2"><input type="text" name="needhelp1" id="needhelp1" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="hopefinishtime1"  name="hopefinishtime1">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
			</tr>
			<tr>
				<td>2</td>
				<td colspan="2"><input type="text" name="problem2" id="problem2" class="form-control"/></td>
				<td colspan="2"><input type="text" name="needhelp2" id="needhelp2" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="hopefinishtime2"  name="hopefinishtime2">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
			</tr>
			<tr>
				<td>3</td>
				<td colspan="2"><input type="text" name="problem3" id="problem3" class="form-control"/></td>
				<td colspan="2"><input type="text" name="needhelp3" id="needhelp3" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="hopefinishtime3"  name="hopefinishtime3">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
			</tr>
			<tr>
				<td>4</td>
				<td colspan="2"><input type="text" name="problem4" id="problem4" class="form-control"/></td>
				<td colspan="2"><input type="text" name="needhelp4" id="needhelp4" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="hopefinishtime4"  name="hopefinishtime4">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
			</tr>
			<tr>
				<td>5</td>
				<td colspan="2"><input type="text" name="problem5" id="problem5" class="form-control"/></td>
				<td colspan="2"><input type="text" name="needhelp5" id="needhelp5" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="hopefinishtime5"  name="hopefinishtime5">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
			</tr>
			<tr>
				<td>6</td>
				<td colspan="2"><input type="text" name="problem6" id="problem6" class="form-control"/></td>
				<td colspan="2"><input type="text" name="needhelp6" id="needhelp6" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="hopefinishtime6"  name="hopefinishtime6">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
			</tr>
			<tr>
				<td>7</td>
				<td colspan="2"><input type="text" name="problem7" id="problem7" class="form-control"/></td>
				<td colspan="2"><input type="text" name="needhelp7" id="needhelp7" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="hopefinishtime7"  name="hopefinishtime7">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
			</tr>
			<tr>
				<td colspan="6"></td>
			</tr>
			<tr>
				<td colspan="6" width="100" class="tablehead">第二部分：下周实施计划</td>
			</tr>
			<tr>
				<td colspan="6" width="100" class="tablehead">六、下周工作计划安排</td>
			</tr>

			<tr>
				<td>序号</td>
				<td>工作任务</td>
				<td>负责人</td>
				<td>开始时间</td>
				<td>结束时间</td>
				<td>说明</td>
			</tr>
			<tr>
				<td>1</td>
				<td><input type="text" name="nextweektask1" id="nextweektask1" class="form-control"/></td>
				<td><input type="text" name="nextpersonliable1" id="nextpersonliable1" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekstarttime1"  name="nextweekstarttime1">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekfinishtime1"  name="nextweekfinishtime1">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="nextweekexplain1" id="nextweekexplain1" class="form-control"/></td>
			</tr>
			<tr>
				<td>2</td>
				<td><input type="text" name="nextweektask2" id="nextweektask2" class="form-control"/></td>
				<td><input type="text" name="nextpersonliable2" id="nextpersonliable2" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekstarttime2"  name="nextweekstarttime2">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekfinishtime2"  name="nextweekfinishtime2">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="nextweekexplain2" id="nextweekexplain2" class="form-control"/></td>
			</tr>
			<tr>
				<td>3</td>
				<td><input type="text" name="nextweektask3" id="nextweektask3" class="form-control"/></td>
				<td><input type="text" name="nextpersonliable3" id="nextpersonliable3" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekstarttime3"  name="nextweekstarttime3">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekfinishtime3"  name="nextweekfinishtime3">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="nextweekexplain3" id="nextweekexplain3" class="form-control"/></td>
			</tr>
			<tr>
				<td>4</td>
				<td><input type="text" name="nextweektask4" id="nextweektask4" class="form-control"/></td>
				<td><input type="text" name="nextpersonliable4" id="nextpersonliable4" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekstarttime4"  name="nextweekstarttime4">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekfinishtime4"  name="nextweekfinishtime4">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="nextweekexplain4" id="nextweekexplain4" class="form-control"/></td>
			</tr>
			<tr>
				<td>5</td>
				<td><input type="text" name="nextweektask5" id="nextweektask5" class="form-control"/></td>
				<td><input type="text" name="nextpersonliable5" id="nextpersonliable5" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekstarttime5"  name="nextweekstarttime5">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekfinishtime5"  name="nextweekfinishtime5">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="nextweekexplain5" id="nextweekexplain5" class="form-control"/></td>
			</tr>
			<tr>
				<td>6</td>
				<td><input type="text" name="nextweektask6" id="nextweektask6" class="form-control"/></td>
				<td><input type="text" name="nextpersonliable6" id="nextpersonliable6" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekstarttime6"  name="nextweekstarttime6">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekfinishtime6"  name="nextweekfinishtime6">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="nextweekexplain6" id="nextweekexplain6" class="form-control"/></td>
			</tr>
			<tr>
				<td>7</td>
				<td><input type="text" name="nextweektask7" id="nextweektask7" class="form-control"/></td>
				<td><input type="text" name="nextpersonliable7" id="nextpersonliable7" class="form-control"/></td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekstarttime7"  name="nextweekstarttime7">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td>
				<div class="input-group">
					<input type="date" class="form-control" id="nextweekfinishtime7"  name="nextweekfinishtime7">
					<span class="input-group-addon bg-custom b-0 text-white"><i class="icon-calender"></i></span>
				</div>
				</td>
				<td><input type="text" name="nextweekexplain7" id="nextweekexplain7" class="form-control"/></td>
			</tr>
			


			<tr>
				<td colspan="2">甲方签字</td>
				<td colspan="4"></td>
			</tr>
			<tr>
				<td colspan="2">乙方签字</td>
				<td colspan="4"></td>
			</tr>



</tbody>
		</table>
		
		<input type="button" value="提交"  onclick="submitData()"/>
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
        
        <script src="${pageContext.request.contextPath}/assets/plugins/bootstrap-table/dist/bootstrap-table.min.js"></script>
        
        <script src="${pageContext.request.contextPath}/assets/pages/jquery.bs-table.js"></script>
	
	
	
	
	
	</body>
</html>