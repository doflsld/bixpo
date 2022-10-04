    var delay = 5000; // 1000ms = 1 second

    function hum(){
    var humidity = Math.floor((Math.random() * (60-40)) + 40);
    return humidity+"%";
}
    function temp(){
    var temp = (Math.random() * (29-27)) + 27;
    temp = temp.toFixed(1);
    return temp+"℃";
}

    function pulse(){
    $(".hum").each(function(){
        var color = hum();
        $(this).text(color);
    });
    $(".temp").each(function(){
    var color = temp();
    $(this).text(color);
});
}


    var fire = setInterval(pulse, delay);