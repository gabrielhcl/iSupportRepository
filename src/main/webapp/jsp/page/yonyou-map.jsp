<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta name="description"
	content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
<meta name="author" content="Coderthemes">

<link rel="shortcut icon" href="${pageContext.request.contextPath}/assets/images/favicon_1.ico">

<title>iSupport</title>
</head>

<body>
	<!--Step:1 Prepare a dom for ECharts which (must) has size (width & hight)-->
	<!--Step:1 为ECharts准备一个具备大小（宽高）的Dom-->
	<div id="mainMap"
		style="height: 500px; border: 1px solid #ccc; padding: 10px;"></div>
	<!--Step:2 Import echarts.js-->
	<!--Step:2 引入echarts.js-->
	<script src="${pageContext.request.contextPath}/echarts_js/echarts.js"></script>
	<script type="text/javascript">  
    // Step:3 conifg ECharts's path, link to echarts.js from current page.  
    // Step:3 为模块加载器配置echarts的路径，从当前页面链接到echarts.js，定义所需图表路径  
    require.config({  
        paths: {  
//             echarts: './echarts_js'  
            echarts:'${pageContext.request.contextPath}/echarts_js'
        }  
    });  
      
    // Step:4 require echarts and use it in the callback.  
    // Step:4 动态加载echarts然后在回调函数中开始使用，注意保持按需加载结构定义图表路径  
    require(  
        [  
            //这里的'echarts'相当于'./js'  
            'echarts',  
            'echarts/chart/map'  
        ],  
        //创建ECharts图表方法  
        function (ec) {  
            // --- 地图 ---  
                //基于准备好的dom,初始化echart图表  
            var myChart = ec.init(document.getElementById('mainMap'));  
            //定义图表option  
            var option = {  
                //标题，每个图表最多仅有一个标题控件，每个标题控件可设主副标题  
                title: {  
                    //主标题文本，'\n'指定换行  
                    text: '项目情况分布一览',  
                    //副标题文本，'\n'指定换行  
                    subtext: '西部大区',  
                    //水平安放位置，默认为左侧，可选为：'center' | 'left' | 'right' | {number}（x坐标，单位px）  
                    x: 'center',  
                    //垂直安放位置，默认为全图顶端，可选为：'top' | 'bottom' | 'center' | {number}（y坐标，单位px）  
                    y: 'top'  
                },  
                //图例，每个图表最多仅有一个图例  
                tooltip : {  
                    //触发类型，默认（'item'）数据触发，可选为：'item' | 'axis'  
                    trigger: 'item',
                    formatter: function(params) {
                        var res = params.name+'<br/>';
                        var myseries = option.series;
                        for (var i = 0; i < myseries.length; i++) {
                            for(var j=0;j<myseries[i].data.length;j++){
                                if(myseries[i].data[j].name==params.name){
                                    res+=myseries[i].name +' : '+myseries[i].data[j].value+'</br>';
                                }
                            }
                        }
                        return res;
                    }
                },  
                //图例，每个图表最多仅有一个图例  
                legend: {  
                    //布局方式，默认为水平布局(即horizontal)，可选为：'horizontal' | 'vertical'  
                    orient: 'vertical',  
                    //水平安放位置，默认为全图居中，可选为：'center' | 'left' | 'right' | {number}（x坐标，单位px）  
                    x: 'left',  
                    //垂直安放位置，默认为全图顶端，可选为：'top' | 'bottom' | 'center' | {number}（y坐标，单位px）  
                    y: 'top',  
                    //legend的data: 用于设置图例，data内的字符串数组需要与sereis数组内每一个series的name值对应  
                    data:['在建项目','维护项目']  
                },  
                //值域选择，每个图表最多仅有一个值域控件  
                dataRange: {  
                    //布局方式，默认为垂直布局('vertical')，可选为：'horizontal' | 'vertical'  
                    orient: 'vertical',  
                    //指定的最小值，eg: 0，默认无(null)，必须参数  
                    min: 0,  
                    //指定的最大值，eg: 100，默认无(null)，必须参数  
                    max: 2500,  
                    //水平安放位置，默认为全图左对齐('left')，可选为：'center' | 'left' | 'right' | {number}（x坐标，单位px）  
                    x: 'left',  
                    //垂直安放位置，默认为全图底部('bottom')，可选为：'top' | 'bottom' | 'center' | {number}（y坐标，单位px）  
                    y: 'bottom',  
                    //值域文字显示，默认为数值文本  
                    text: ['高','低'],             
                    //是否启用值域漫游，默认为关闭(false)，启用后无视splitNumber，值域显示为线性渐变  
                    calculable: true  
                },  
                //工具箱，每个图表最多仅有一个工具箱  
                toolbox: {  
                    //显示策略，可选为：true（显示） | false（隐藏），默认值为false  
                    show: true,  
                    //布局方式，默认为水平布局('horizontal')，可选为：'horizontal' | 'vertical'  
                    orient: 'vertical',  
                    //水平安放位置，默认为全图右对齐('right')，可选为：'center' | 'left' | 'right' | {number}（x坐标，单位px）  
                    x: 'right',  
                    //垂直安放位置，默认为全图顶端，可选为：'top' | 'bottom' | 'center' | {number}（y坐标，单位px）  
                    y: 'center',  
                    //启用功能，目前支持feature，工具箱自定义功能回调处理  
                    feature: {  
                        //辅助线标志  
                        mark: {show: true},  
                        //数据视图，打开数据视图，可设置更多属性,readOnly 默认数据视图为只读(即值为true)，可指定readOnly为false打开编辑功能  
                        dataView: {show: true, readOnly: false},  
                        //restore，还原，复位原始图表  
                        restore: {show: true},  
                        //saveAsImage，保存图片（IE8-不支持）,图片类型默认为'png'  
                        saveAsImage: {show: true}  
                    }  
                },  
                //缩放漫游组件，仅对地图有效  
                roamController: {  
                    //显示策略，默认为显示(true),可选为：true（显示） | false（隐藏）。  
                    show: true,  
                    //水平安放位置，默认为左侧('letf')，可选为：'center' | 'left' | 'right' | {number}（x坐标，单位px）  
                    x: 'right',  
                    //垂直安放位置，默认为全图顶端，可选为：'top' | 'bottom' | 'center' | {number}（y坐标，单位px）  
                    y: 'top',  
                    //必须，默认无(null),指定漫游组件可控地图类型，如：{ china: true }  
                    mapTypeControl: {  
                        //指定地图类型  
                        'china': true  
                    }  
                },  
                //series(地图),驱动图表生成的数据内容数组，数组中每一项为一个系列的选项及数据  
                series : [  
                    {  
                        //系列名称，如果启用legend，该值将被legend.data索引相关  
                        name: '在建项目',  
                        //图表类型，必要参数！如为空或不支持类型，则该系列数据不被显示  
                        type: 'map',  
                        //地图类型，支持world，china及全国34个省市自治区。省市自治区的mapType直接使用简体中文：如'广东'  
                        mapType: 'china',  
                        //是否开启滚轮缩放和拖拽漫游，默认为false（关闭），其他有效输入为true（开启），'scale'（仅开启滚轮缩放），'move'（仅开启拖拽漫游）  
                        roam: 'scale',  
                        //图形样式，可设置图表内图形的默认样式和强调样式（悬浮时样式）  
                        itemStyle:{  
                            //正常时的样式  
                            normal:{  
                                //边框线宽，单位px  
                                borderWidth: 2,  
                                //边框颜色  
                                borderColor: 'lightgreen',  
                                //标签，饼图默认显示在外部，离饼图距离由labelLine.length决定，地图标签不可指定位置   
                                label: {show:true}  
                            },  
                            //鼠标经过时的样式  
                             emphasis: {  
                                //边框线宽，单位px  
                                borderWidth:2,  
                                //边框颜色  
                                borderColor:'#fff',  
                                //鼠标经过时区域的颜色  
                                color: '#32cd32',  
                                //标签  
                                label: {  
                                    show: true,  
                                    //文本样式  
                                    textStyle: {  
                                        //文本字体颜色  
                                        color: '#fff'  
                                    }  
                                }  
                            }  
                        },  
                        //当图表类型为地图时，需要说明每部分数据对应的省份，可设置选中状态，如 :{name: '北京',value: 1234,selected: true},  
                        data:[  
                            {name: '陕西',value: 6},  
                            {name: '甘肃',value: 10},  
                            {name: '宁夏',value: 3},  
                            {name: '青海',value: 4},  
                            {name: '新疆',value: 1},  
                            {name: '云南',value: 5},  
                            {name: '贵州',value: 2},  
                            {name: '四川',value: 5},  
                            {name: '重庆',value: 1},
                            {name: '西藏',value: 0} 
                        ],  
                    },  
                    {  
                        //系列名称，如果启用legend，该值将被legend.data索引相关  
                        name: '维护项目',  
                        //图表类型，必要参数！如为空或不支持类型，则该系列数据不被显示  
                        type: 'map',  
                        //地图类型，支持world，china及全国34个省市自治区。省市自治区的mapType直接使用简体中文：如'广东'  
                        mapType: 'china',  
                        //是否开启滚轮缩放和拖拽漫游，默认为false（关闭），其他有效输入为true（开启），'scale'（仅开启滚轮缩放），'move'（仅开启拖拽漫游）  
                        roam: 'scale',  
                        //图形样式，可设置图表内图形的默认样式和强调样式（悬浮时样式）  
                        itemStyle:{  
                            //正常时的样式  
                            normal:{  
                                //边框线宽，单位px  
                                borderWidth: 2,  
                                //边框颜色  
                                borderColor: 'lightgreen',  
                                //标签，饼图默认显示在外部，离饼图距离由labelLine.length决定，地图标签不可指定位置   
                                label: {show:true}  
                            },  
                            //鼠标经过时的样式  
                             emphasis: {  
                                //边框线宽，单位px  
                                borderWidth:2,  
                                //边框颜色  
                                borderColor:'#fff',  
                                //鼠标经过时区域的颜色  
                                color: '#32cd32',  
                                //标签  
                                label: {  
                                    show: true,  
                                    //文本样式  
                                    textStyle: {  
                                        //文本字体颜色  
                                        color: '#fff'  
                                    }  
                                }  
                            }  
                        },  
                        data:[  
                              {name: '陕西',value: Math.round(Math.random()*1000)},  
                              {name: '甘肃',value: Math.round(Math.random()*1000)},  
                              {name: '宁夏',value: Math.round(Math.random()*1000)},  
                              {name: '青海',value: 77},  
                              {name: '新疆',value: Math.round(Math.random()*1000)},  
                              {name: '云南',value: Math.round(Math.random()*1000)},  
                              {name: '贵州',value: Math.round(Math.random()*1000)},  
                              {name: '四川',value: Math.round(Math.random()*1000)},  
                              {name: '重庆',value: Math.round(Math.random()*1000)},
                              {name: '西藏',value: Math.round(Math.random()*1000)} 
                        ]  
                    } 
                ]  
            };  
            //为echarts对象加载数据     
            myChart.setOption(option);  
        }  
    );  
    </script>
</body>
</html>