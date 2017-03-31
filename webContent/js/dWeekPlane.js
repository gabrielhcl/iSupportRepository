

    $(document).ready(function(){
  	  $("#sumdaytime").focus(function(){
  		  aletr("12321");
  		var projectmanagerdaytime = parseInt(V('projectmanagerdaytime').value);
        var impconsultantdaytime = parseInt(V('impconsultantdaytime').value);
        var devconsultantdaytime = parseInt(V('devconsultantdaytime').value);
        V('sumdaytime').value = projectmanagerdaytime + impconsultantdaytime + devconsultantdaytime;
  	  });
  	});
