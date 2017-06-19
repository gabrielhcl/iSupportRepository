// 	根据传入的主计划子表编码判断向主计划主表传递什么参数
	function btn_human(number){
// 		获取编码值
		var num = parseInt(number);
		if(num == 11){
			changevalue('plancycle11','pmnum11','pmdays11','imnum11','imdays11','sumdaytime11')
		}
		if(num == 12){
			changevalue('plancycle12','pmnum12','pmdays12','imnum12','imdays12','sumdaytime12')
		}
		if(num == 13){
			changevalue('plancycle13','pmnum13','pmdays13','imnum13','imdays13','sumdaytime13')
		}
		if(num == 14){
			changevalue('plancycle14','pmnum14','pmdays14','imnum14','imdays14','sumdaytime14')
		}
		if(num == 15){
			changevalue('plancycle15','pmnum15','pmdays15','imnum15','imdays15','sumdaytime15')
		}
		if(num == 16){
			changevalue('plancycle16','pmnum16','pmdays16','imnum16','imdays16','sumdaytime16')
		}

		if(num == 21){
			changevalue('plancycle21','pmnum21','pmdays21','imnum21','imdays21','sumdaytime21')
		}
		if(num == 22){
			changevalue('plancycle22','pmnum22','pmdays22','imnum22','imdays22','sumdaytime22')
		}
		if(num == 23){
			changevalue('plancycle23','pmnum23','pmdays23','imnum23','imdays23','sumdaytime23')
		}
		if(num == 24){
			changevalue('plancycle24','pmnum24','pmdays24','imnum24','imdays24','sumdaytime24')
		}
		if(num == 25){
			changevalue('plancycle25','pmnum25','pmdays25','imnum25','imdays25','sumdaytime25')
		}
		if(num == 26){
			changevalue('plancycle26','pmnum26','pmdays26','imnum26','imdays26','sumdaytime26')
		}
		
		if(num == 31){
			changevalue('plancycle31','pmnum31','pmdays31','imnum31','imdays31','sumdaytime31')
		}
		if(num == 32){
			changevalue('plancycle32','pmnum32','pmdays32','imnum32','imdays32','sumdaytime32')
		}
		if(num == 33){
			changevalue('plancycle33','pmnum33','pmdays33','imnum33','imdays33','sumdaytime33')
		}
		if(num == 34){
			changevalue('plancycle34','pmnum34','pmdays34','imnum34','imdays34','sumdaytime34')
		}
		if(num == 35){
			changevalue('plancycle35','pmnum35','pmdays35','imnum35','imdays35','sumdaytime35')
		}
		if(num == 36){
			changevalue('plancycle36','pmnum36','pmdays36','imnum36','imdays36','sumdaytime36')
		}
		if(num == 37){
			changevalue('plancycle37','pmnum37','pmdays37','imnum37','imdays37','sumdaytime37')
		}
		if(num == 38){
			changevalue('plancycle38','pmnum38','pmdays38','imnum38','imdays38','sumdaytime38')
		}
		
		if(num == 41){
			changevalue('plancycle41','pmnum41','pmdays41','imnum41','imdays41','sumdaytime41')
		}
		if(num == 42){
			changevalue('plancycle42','pmnum42','pmdays42','imnum42','imdays42','sumdaytime42')
		}
		if(num == 43){
			changevalue('plancycle43','pmnum43','pmdays43','imnum43','imdays43','sumdaytime43')
		}
		if(num == 44){
			changevalue('plancycle44','pmnum44','pmdays44','imnum44','imdays44','sumdaytime44')
		}
		if(num == 45){
			changevalue('plancycle45','pmnum45','pmdays45','imnum45','imdays45','sumdaytime45')
		}
		if(num == 46){
			changevalue('plancycle46','pmnum46','pmdays46','imnum46','imdays46','sumdaytime46')
		}
		if(num == 47){
			changevalue('plancycle47','pmnum47','pmdays47','imnum47','imdays47','sumdaytime47')
		}
		
		if(num == 51){
			changevalue('plancycle51','pmnum51','pmdays51','imnum51','imdays51','sumdaytime51')
		}
		if(num == 52){
			changevalue('plancycle52','pmnum52','pmdays52','imnum52','imdays52','sumdaytime52')
		}
		if(num == 53){
			changevalue('plancycle53','pmnum53','pmdays53','imnum53','imdays53','sumdaytime53')
		}
	}
	
	function V(id) {
        return document.getElementById(id);
    }
	
	
// 	计算项目经理投入人天，计算实施顾问投入人天，计算总人天
	function changevalue(plancycle,pmnum,pmdays,imnum,imdays,sumdaytime){
// 		获取主计划子表插入的值
		var plancycle = document.getElementById(plancycle).value;
		var pmnum = document.getElementById(pmnum).value;
		var imnum = document.getElementById(imnum).value;
		
//         计算主计划子表项目经理总人天，开发顾问总人天，投入总人天，并将值填入输入框
		document.getElementById(pmdays).value = pmnum * plancycle
		document.getElementById(imdays).value = imnum * plancycle
		document.getElementById(sumdaytime).value = pmnum * plancycle + imnum * plancycle
// 		计算主计划主表项目经理总人天，开发顾问总人天，投入总人天，并将值填入输入框
		document.getElementById("pmdays").value = pmnum * plancycle
		document.getElementById("imdays").value = imnum * plancycle
		document.getElementById("sumdaytime").value = pmnum * plancycle + imnum * plancycle
		
		document.getElementById("plancycle").value = plancycle;
		document.getElementById("pmnum").value = pmnum;
		document.getElementById("imnum").value = imnum;
		
// 		var sumdaytime = document.getElementById("sumdaytime").value;
// 		alert(sumdaytime);
		V('sumdaytime').value = mainplanHnum;
		V(sumdaytime).value = mainplanBnum;
	}