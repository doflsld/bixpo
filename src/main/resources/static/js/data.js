function test(){

    $.getJSON('http://121.178.2.4/api/batsens_api.php?modem=srcb00004_t',
        function (data){
            $.each(data,function (){
                $('.sensTemp').prepend(this.temp);
                $('.sensHumi').prepend(this.humi);
            });
        });

    $.getJSON('http://121.178.2.4/api/batsens_api.php?modem=srcb00005_t',
        function (data){
            $.each(data,function (){
                $('.sensCO').prepend(this.co);
                $('.sensH2').prepend(this.h2);
            });
        });

    $('.sensTemp').empty()
    $('.sensHumi').empty()
    $('.sensCO').empty()
    $('.sensH2').empty()
}

$(document).ready(test());

    var delay = 5000;
    var fire = setInterval(test, delay);
