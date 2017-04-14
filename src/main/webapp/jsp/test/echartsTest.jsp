<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>  
    <meta charset="utf-8">  
    <title>ECharts Test</title>  
     <script src="${pageContext.request.contextPath}/assets/plugins/Echarts/asset/js/esl/esl.js"></script>  
</head>  
<body>  
    <div id="picturePlace"></div>  
     <script type="text/javascript">  
        // 路径配置  
        require.config({  
            paths:{   
                'echarts' : 'js/echarts',  
                'echarts/chart/pie' : 'js/echarts'  
            }  
        });  
    </script>  
</body>  
</html>