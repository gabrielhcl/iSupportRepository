<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <meta charset="utf-8">
    <title>ECharts</title>
    <!-- 引入 echarts.js -->
    <script src="${pageContext.request.contextPath}/echarts_js/echarts.min.js"></script>
</head>
<body>
    <!-- 为ECharts准备一个具备大小（宽高）的Dom -->
    <div id="main" style="width: 1000px;height:600px;"></div>
    <script type="text/javascript">
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));

        function fetchData(cb) {
            // 通过 setTimeout 模拟异步加载
            setTimeout(function () {
                cb({
                    categories: ["${group.groupcode}","${group.groupname}","${group.remark}","四月","五月","六月"],
                    data: [5, 20, 36, 10, 10, 20]
                });
            }, 1000);
        }
        // 初始 option
        option = {
            title: {
                text: '异步数据加载示例'
            },
            tooltip: {},
            legend: {
                data:['销量']
            },
            xAxis: {
                data: []
            },
            yAxis: {},
            series: [{
                name: '销量',
                type: 'bar',
                data: []
            }]
        };

        fetchData(function (data) {
            myChart.setOption({
                xAxis: {
                    data: data.categories
                },
                series: [{
                    // 根据名字对应到相应的系列
                    name: '销量',
                    data: data.data
                }]
            });
        });

        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    </script>
</body>
</html>