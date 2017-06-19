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