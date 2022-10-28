bar_data();

var arr_min;
var arr_max;
var arr_avg;

function bar_data() {
    $.ajax({
        type: 'GET',
        url: 'http://devba.kr/bsb/getData.php',
        async: false,
        data: {
            'modem': '0',
            'bar': '1',
        },
        success: function (data) {
            arr_avg=[parseFloat(data[0].SRCb00001_T.dv),parseFloat(data[1].SRCb00002_T.dv),parseFloat(data[2].SRCb00003_T.dv),parseFloat(data[3].SRCb00004_T.dv)];
            arr_min=[parseFloat(data[0].SRCb00001_T.di),parseFloat(data[1].SRCb00002_T.di),parseFloat(data[2].SRCb00003_T.di),parseFloat(data[3].SRCb00004_T.di)];
            arr_max=[parseFloat(data[0].SRCb00001_T.da),parseFloat(data[1].SRCb00002_T.da),parseFloat(data[2].SRCb00003_T.da),parseFloat(data[3].SRCb00004_T.da)];


        }
    });

}


Highcharts.chart('bar-chart', {
    chart: {
        type: 'column'
    },
    title: {
        text: 'Temperature in Battery Safety Box'
    },
    xAxis: {
        categories: [
            'Left',
            'Right',
            'Front',
            'Back',
        ],
        crosshair: true
    },
    yAxis: {
        min: 0,
        title: {
            text: 'Temperature (℃)'
        }
    },
    tooltip: {
        headerFormat: '<span style="font-size:10px">{point.key}</span><table>',
        pointFormat: '<tr><td style="color:{series.color};padding:0">{series.name}: </td>' +
            '<td style="padding:0"><b>{point.y:.1f} ℃</b></td></tr>',
        footerFormat: '</table>',
        shared: true,
        useHTML: true
    },
    plotOptions: {
        column: {
            pointPadding: 0.2,
            borderWidth: 0
        }
    },
    series: [{
        name: 'High',
        data: arr_max

    }, {
        name: 'Low',
        data: arr_min

    }, {
        name: 'Avg',
        data: arr_avg

    }]
});


var gaugeOptions = {
    chart: {
        type: 'solidgauge'
    },

    title: null,

    pane: {
        center: ['50%', '85%'],
        size: '140%',
        startAngle: -90,
        endAngle: 90,
        background: {
            backgroundColor:
                Highcharts.defaultOptions.legend.backgroundColor || '#EEE',
            innerRadius: '60%',
            outerRadius: '100%',
            shape: 'arc'
        }
    },

    exporting: {
        enabled: false
    },

    tooltip: {
        enabled: false
    },

    // the value axis
    yAxis: {
        stops: [
            [0.1, '#55BF3B'], // green
            [0.5, '#DDDF0D'], // yellow
            [0.9, '#DF5353'] // red
        ],
        lineWidth: 0,
        tickWidth: 0,
        minorTickInterval: null,
        tickAmount: 2,
        title: {
            y: -70
        },
        labels: {
            y: 16
        }
    },

    plotOptions: {
        solidgauge: {
            dataLabels: {
                y: 5,
                borderWidth: 0,
                useHTML: true
            }
        }
    }
};

