// 获取所有消息，并讲数据传输到后台
		function submitData(){
			//  获取本周工作完成情况
			var data1 = getWeekWorkFinishedData();
			console.log("7777");
			// 创建form表单，进行数据传输
		    var tempForm = document.createElement("form");
		    tempForm.id = "tempForm1";
		    tempForm.method = "post";
		    tempForm.action = "/iSupport/test/testtable";
		    console.log("10==="+window.location.href+"/test/testtable");
//		    tempForm.target="_blank"; //打开新页面
		    var hideInput1 = document.createElement("input");
		    hideInput1.type = "hidden";
		    hideInput1.name="opid"; //后台要接受这个参数来取值
		    hideInput1.value = data1; //后台实际取到的值
		    tempForm.appendChild(hideInput1);
		    if(document.all){
		        tempForm.attachEvent("onsubmit",function(){});        //IE
		    }else{
		        var subObj = tempForm.addEventListener("submit",function(){},false);    //firefox
		    }
		    document.body.appendChild(tempForm);
		    if(document.all){
		        tempForm.fireEvent("onsubmit");
		    }else{
		        tempForm.dispatchEvent(new Event("submit"));
		    }
		    tempForm.submit();
		    document.body.removeChild(tempForm);
		}
		// 获取本周工作完成情况
		function getWeekWorkFinishedData(){
			// 通过层级选择器获取所有数据 
			var size = $(".weekworkfinished td").size();
			var eles = $(".weekworkfinished td");
			console.log(size);// size=36
			// 定义一个map,将所有的数据进行聚集
			var map = {};
			for ( var i =0 ; i < size; i++) {// 1-5 为标题
					var text = "";
					var order = i % 6;
					// 表格说明栏
					if (i <= 6) {
						text = $(eles[i]).get(0).innerHTML;
						console.log(text);
					}
					// 具体数据栏
					else {
						// 获取第一列的数据 --序号 
						if (order == 0) {
							text = $(eles[i]).get(0).innerHTML;
							console.log(text);
						} 
						// 获取第2、3、6列 : 2-任务 3-负责人  6 - 说明
						else if (order == 1 || order == 2 || order == 5) {
							text = $(eles[i]).find("input").val();
							if (text != "")
								console.log(text);
						}
						// 获取第 4、5列数据 ：4 -开始时间 5- 结束时间
						else if (order == 3 || order == 4) {
							text = $(eles[i]).find("div input").get(0).value;
							console.log(text);
						}
					}
					// 将所有数据封装到map集合中
					map[i]=text;
				}
				var jsonStr = "{"; 
				// 0-order 1- task 2 -charging 3- starttime 4-endtime 5-illustration
				// 将 map集合转换为 json格式的字符串
				for(key in map){
					switch(key%6){
					    // 拼接序号
						case 0:
							jsonStr +=("{'order'='"+map[key]+"',");
						break;
						// 拼接任务
						case 1:
							jsonStr +=("'task'='"+map[key]+"',");
						break;
						// 拼接责任人
						case 2:
							jsonStr +=("'charging'='"+map[key]+"',");
						break;
						// 拼接开始时间
						case 3:
							jsonStr +=("'starttime'='"+map[key]+"',");
						break;
						// 拼接结束时间
						case 4:
							jsonStr +=("'endtime'='"+map[key]+"',");
						break;
						// 拼接说明
						case 5:
							jsonStr +=("'illustration'='"+map[key]+"'}");
						break;
					}
				}
				jsonStr +="}";
				console.log(jsonStr);
				return jsonStr;
			}
		