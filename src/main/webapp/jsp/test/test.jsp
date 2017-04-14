<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>

<style>
.button1{
  width:50px;
  height:25px;
}
</style>
<body>
<table border="1" width="300" height="50">
<form action="javascipt:;">
<tr>
<td><input id="myDate" type="date"></td>
<td><input id="a1" type="date"></td>
<td><input id="a2" type="date"></td>
<td><input id="a3" type="text"></td>
</tr>
</table>
</form>


<button onclick="sumday()" class="button1"></button>



<script type="text/javascript">

  function V(id) {
        return document.getElementById(id);
    }
function sumday(){
//根据id取日期	
var x = document.getElementById("myDate").value;
var dat1 =  document.getElementById("a1").value;
var dat2 =   document.getElementById("a2").value;


alert(x);
alert(dat1);
alert(dat2);
//日期格式转化
var date1 = new Date(dat1)
var date2 = new Date(dat2)
//转化为小时
var s1 = date1.getTime(),s2 = date2.getTime();

var total = (s2 - s1)/1000;
alert(s1); 
//计算相差天数
var day = parseInt(total / (24*60*60));
 V('a3').value = day
}

</script>

</body>
</html>

