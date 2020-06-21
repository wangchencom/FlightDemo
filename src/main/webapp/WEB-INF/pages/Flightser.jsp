<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
hello
<form id="cityForm" class="form-horizontal" action="flightsel">
    起飞城市:<select name="starCity" id="starCity">

</select>
    到达城市:<select name="endCity" id="endCity">

</select>
    <button type="submit">查询</button>
</form>
<script>
    console.log(${citylist});
    var cityarr =  '${city}'.substr(1);
    cityarr= cityarr.substring(0, cityarr.length-1).split(',');
    console.log(cityarr);
    var selHtml = "";
    for( j = 0,len=cityarr.length; j < len; j++){
        selHtml = selHtml+'<option value="'+cityarr[j].trim()+'">'+cityarr[j].trim()+'</option>';

    }
    document.getElementById("starCity").innerHTML = selHtml;
    document.getElementById("endCity").innerHTML = selHtml;


    function subclick(){
        var slt=document.getElementsByName("cityForm");
        var slts=document.getElementsByName("endCity");
        if(slt.value=="" || slts.value == "") {
            alert("请选择一个项目");
            location.reload()
        }
        if(slt.value == slts.value){
            alert("出发地和目的地不能相同");
            location.reload()
        }
    }

</script>

</body>

</html>
