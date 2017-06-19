<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="utf-8">
    <title>新闻统计</title>
    <!-- 引入 echarts.js -->
    <script src="${pageContext.request.contextPath}/echarts_js/echarts.min.js"></script>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
<!-- 	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script> -->
	<script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
</head>
<body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 1000px;height:600px;"></div>
    <script type="text/javascript">
    $(function(){  
        var url = '${pageContext.request.contextPath}/news/getpiedata';  
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
                 areanamelist = json.areanamelist;
                 var areaname = JSON.stringify(areanamelist);
               var option = {  
            		 title : {
            		        text: '新闻统计',
            		        subtext: 'News Statistics',
            		        x:'center'
            		    },
            		    tooltip : {
            		        trigger: 'item',
            		        formatter: "{a} <br/>{b} : {c} ({d}%)"
            		    },
            		
            		    legend: {
            		        x : 'center',
            		        y : 'bottom',
            		        data: (function(){
                                var areaname = [];
                                var len = categories.length;
                                while (len--) {
                                	areaname.push(categories[len]);
                                }
                                console.log(areaname);
                                return areaname;
                                })()
            		    },
            		    toolbox: {
            		        show : true,
            		        feature : {
            		            mark : {show: true},
            		            dataView : {show: true, readOnly: false},
            		            magicType : {
            		                show: true,
            		                type: ['pie', 'funnel']
            		            },
            		            restore : {show: true},
            		            saveAsImage : {show: true}
            		        }
            		    },
            		    calculable : true,
            		    series : [
            		        {
            		            name:'新闻数',
            		            type:'pie',
            		            radius : [20, 110],
            		            center : ['40%', '50%'],
            		            roseType : 'radius',
            		            label: {
            		                normal: {
            		                    show: false
            		                },
            		                emphasis: {
            		                    show: true
            		                }
            		            },
            		            lableLine: {
            		                normal: {
            		                    show: false
            		                },
            		                emphasis: {
            		                    show: true
            		                }
            		            },
            		            data: (function(){
                                    var res = [];
                                    var len = categories.length;
                                    var message = null;
                                    while (len--) {
                                    	res.push({'name':categories[len],value:values[len]});
                                    }
                                    console.log(res);
                                    return res;
                                    })()
            		        }
            		        ,
            		        {
            		            name:'面积模式',
            		            type:'pie',
            		            radius : [30, 110],
            		            center : ['80%', '50%'],
            		            roseType : 'area',
            		            data:(function(){
                                    var res = [];
                                    var len = categories.length;
                                    var message = null;
                                    while (len--) {
                                    	res.push({'name':categories[len],value:values[len]});
                                    }
                                    console.log(res);
                                    return res;
                                    })()
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