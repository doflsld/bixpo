    var delay = 5000; // 1000ms = 1 second

    function hum(){
    var humidity = Math.floor((Math.random() * (40-20)) + 20);
    return humidity+"%";
}
    function temp(){
    var temp = (Math.random() * (18-16)) + 15;
    temp = temp.toFixed(1);
    return temp+"℃";
}

    function pulse(){
    $(".humi").each(function(){
        var color = hum();
        $(this).text(color);
    });
    $(".temp").each(function(){
        var color = temp();
        $(this).text(color);
    });
}


    var fire = setInterval(pulse, delay);