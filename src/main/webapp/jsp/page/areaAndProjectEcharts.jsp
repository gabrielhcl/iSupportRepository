<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>区域项目数量</title>
    <!-- 引入 echarts.js -->
    <script src="${pageContext.request.contextPath}/echarts_js/echarts.min.js"></script>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
</head>
<body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 1000px;height:600px;"></div>
    <script type="text/javascript">
    $(function(){  
        var url = '${pageContext.request.contextPath}/project/getdata';  
    var id = 'main';  
    setChartBar(url);  
    });  
      
    function setChartBar(url){  
      
     var Chart=echarts.init(document.getElementById("main"));  
     Chart.showLoading(  
             {text: 'Loding...'  }  
    );  
     var categories=[];  
     var values=[];  
     $.ajax({  
            url:url,  
            dataType:"json",  
            type:'post',  
            success:function(json){  
              
                categories = json.categories;    
               values = json.values;   
                
            var option = {   
            		   color: ['#4b1267'],
                    tooltip: {    
                        show: true    
                    },    
                    legend: {    
                        data: ['销量']    
                    },    
                    xAxis: [    
                        {    
                            type: 'category',    
                            data: categories    
                        }    
                    ],    
                    yAxis: [    
                        {    
                            type: 'value'    
                        }    
                    ],    
                    series: [    
                        {    
                            'name': '销量',    
                            'type': 'bar',    
                            'data': values    
                        }    
                    ]    
                };  
            Chart.hideLoading();  
            Chart.setOption(option);    
            }  
            });  
    }   
      
    </script>

</body>
</html>