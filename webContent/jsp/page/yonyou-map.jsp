<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="A fully featured admin theme which can be used to build CRM, CMS, etc.">
        <meta name="author" content="Coderthemes">

        <link rel="shortcut icon" href="assets/images/favicon_1.ico">

        <title>Ubold - Responsive Admin Dashboard Template</title>

         <!-- jvectormap -->
        <link href="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-2.0.2.css" rel="stylesheet" />

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
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       
 
    <link href="${pageContext.request.contextPath}/assets/plugins/vectormap/js/jquery.vector-map.css" media="screen" rel="stylesheet" type="text/css" />
    <script src="${pageContext.request.contextPath}/assets/plugins/vectormap/js/jquery-1.6.min.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/vectormap/js/jquery.vector-map.js" type="text/javascript"></script>
    <script src="${pageContext.request.contextPath}/assets/plugins/vectormap/js/china-zh.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/assets/plugins/vectormap/js/beijing-zh.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/assets/plugins/vectormap/js/xinan-zh.js" type="text/javascript"></script>
	<script src="${pageContext.request.contextPath}/assets/plugins/vectormap/js/xibei-zh.js" type="text/javascript"></script>
    <script type="text/javascript">
        $(function () {
            //数据可以动态生成，格式自己定义，cha对应china-zh.js中省份的简称
            var dataStatus = [{ cha: 'HKG', name: '香港', des: '<br/>无活动点',tel:'13718187045' },
                             { cha: 'HAI', name: '海南', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'YUN', name: '云南', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'BEJ', name: '北京', des: '<br/>2个活动点' ,tel:'13718187045' },
                             { cha: 'TAJ', name: '天津', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'XIN', name: '新疆', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'TIB', name: '西藏', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'QIH', name: '青海', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'GAN', name: '甘肃', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'NMG', name: '内蒙古', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'NXA', name: '宁夏', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'SHX', name: '山西', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'LIA', name: '辽宁', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'JIL', name: '吉林', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'HLJ', name: '黑龙江', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'HEB', name: '河北', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'SHD', name: '山东', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'HEN', name: '河南', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'SHA', name: '陕西', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'SCH', name: '四川', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'CHQ', name: '重庆', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'HUB', name: '湖北', des: '<br/>1个活动点' ,tel:'13718187045' },
                             { cha: 'ANH', name: '安徽', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'JSU', name: '江苏', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'SHH', name: '上海', des: '<br/>1个活动点' ,tel:'13718187045' },
                             { cha: 'ZHJ', name: '浙江', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'FUJ', name: '福建', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'TAI', name: '台湾', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'JXI', name: '江西', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'HUN', name: '湖南', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'GUI', name: '贵州', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'GXI', name: '广西', des: '<br/>无活动点' ,tel:'13718187045' }, 
                             { cha: 'GUD', name: '广东', des: '<br/>无活动点',tel:'13718187045' }];
			
                          
                          
         var xinan =   [ { cha: 'YUN', name: '云南', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'GUI', name: '贵州', des: '<br/>无活动点' ,tel:'13718187045' },
                             { cha: 'SCH', name: '四川', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'CHQ', name: '重庆', des: '<br/>无活动点',tel:'13718187045'  },
                             { cha: 'TIB', name: '西藏', des: '<br/>无活动点' ,tel:'13718187045' },
                          ];   
         
         
         
         
         var xibei = [	 
                      { cha: 'SHA', name: '陕西', des: '<br/>无活动点',tel:'13718187045'  },
                      { cha: 'GAN', name: '甘肃', des: '<br/>无活动点' ,tel:'13718187045' },
                      { cha: 'NXA', name: '宁夏', des: '<br/>无活动点' ,tel:'13718187045' },
                      { cha: 'QIH', name: '青海', des: '<br/>无活动点',tel:'13718187045'  },
                      { cha: 'XIN', name: '新疆', des: '<br/>无活动点' ,tel:'13718187045' },
                   ];

$('#container_xibei').vectorMap({ map: 'xibei-zh',
         color: "#5D9CEC", //地图颜色
         onLabelShow: function (event, label, code) {//动态显示内容
             $.each(xibei, function (i, items) {
                 if (code == items.cha) {
                     label.html(items.name + items.des +"<br/>"+ items.tel);
                 }
             });
         }
			
     })

			
            $('#container').vectorMap({ map: 'china_zh',
                color: "#B4B4B4", //地图颜色
                onLabelShow: function (event, label, code) {//动态显示内容
                    $.each(dataStatus, function (i, items) {
                        if (code == items.cha) {
                            label.html(items.name + items.des +"<br/>"+ items.tel);
                        }
                    });
                }
				
            })
            
            
            
            
            
            
            	$('#container_xinan').vectorMap({ map: 'xinan-zh',
                color: "#FB6D9D", //地图颜色
                onLabelShow: function (event, label, code) {//动态显示内容
                    $.each(xinan, function (i, items) {
                        if (code == items.cha) {
                            label.html(items.name + items.des +"<br/>"+ items.tel);
                        }
                    });
                }
				
            })
			
            $.each(dataStatus, function (i, items) {
                if (items.des.indexOf('个') != -1) {//动态设定颜色，此处用了自定义简单的判断
                    var josnStr = "{" + items.cha + ":'#00FF00'}";
                    $('#container').vectorMap('set', 'colors', eval('(' + josnStr + ')'));
                }
            });
            $('.jvectormap-zoomin').click(); //放大
        });
      
    </script>
        
    </head>

<body >
                <!-- Start content -->
                <div class="content">
                    <div class="container">

                        <!-- Page-Title -->
                        <div class="row">
                            <div class="col-sm-12">
                                <h4 class="page-title">地图</h4>
                            </div>
                        </div>
                        
                        <br>
                        
                        <div class="row">
							<div class="col-lg-12">
								<div class="card-box">
									<h4 class="m-t-0 m-b-20 header-title"><b>中国地图</b></h4>
									
									 <div id="container" style="height: 400px">
   								 </div>
								</div>
							</div>
						</div>
						
						
						
						<div class="row">
							<div class="col-lg-6">
								<div class="card-box">
									<h4 class="m-t-0 m-b-20 header-title"><b>西南区</b></h4>
									<div id="container_xinan" style="height: 400px">
    								</div>
								</div>
							</div>
							<div class="col-lg-6">
								<div class="card-box">
									<h4 class="m-t-0 m-b-20 header-title"><b>西北区</b></h4>
									<div id="container_xibei" style="height: 400px">
    </div>
								</div>
							</div>
						</div>
						
						

                    </div> <!-- container -->
                               
                </div> <!-- content -->

	<script>
            var resizefunc = [];
        </script>

	 <!-- jQuery  -->
<%--         <script src="${pageContext.request.contextPath}/assets/js/jquery.min.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/js/bootstrap.min.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/js/detect.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/js/fastclick.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/js/jquery.slimscroll.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/js/jquery.blockUI.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/js/waves.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/js/wow.min.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/js/jquery.nicescroll.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/js/jquery.scrollTo.min.js"></script> --%>


<%--         <script src="${pageContext.request.contextPath}/assets/js/jquery.core.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/js/jquery.app.js"></script> --%>





				


<%--         <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-2.0.2.min.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/gdp-data.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-us-aea-en.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-uk-mill-en.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-au-mill.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-us-il-chicago-mill-en.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-ca-lcc.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-de-mill.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-in-mill.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/jquery-jvectormap-asia-mill.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/plugins/jvectormap/china-en.js"></script> --%>
<%--         <script src="${pageContext.request.contextPath}/assets/pages/jvectormap.init.js"></script> --%>
</body>
</html>