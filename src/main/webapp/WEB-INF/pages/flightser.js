$(function(){
    $.ajax({
        type: 'post',
        url: 'selallcity',
        data: param,
        dataType:'json',
        //traditional: true,
        success: function (data){
            var cityarr =  data.split(',');
            console.log(cityarr);
            for( j = 0,len=cityarr.length; j < len; j++){
                var selHtml = '<option value="'+cityarr[i]+'">'+cityarr[i]+'</option>';
                document.getElementById("starCity").innerHTML = htmllet;
                document.getElementById("endCity").innerHTML = htmllet;
            }

        },
        error: function(XMLHttpRequest, textStatus, errorThrown){
            console.log(errorThrown);
        }
    });
    // $(".rememberpass span").click(function(){
    //     $(this).siblings("input").click();
    // })
})