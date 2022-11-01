
    Highcharts.chart('chart_div', {
    colors : ['#EF7B00'],
    chart: {
        type: 'area'
    },
    title: {
        text: ' '
    },
    xAxis: {
        categories: ['09.13', '09.14', '09.15', '09.16', '09.17', '09.18', '09.19', '09.20', '09.21', '09.22']
    },
    yAxis: {
        max: 100,
        title: {
            text: ' '
        }
    },
    legend: {

    },
    // 하단 highchart.com 글씨 삭제
    credits: {
        enabled: false
    },
    // 상단 context menu 제거
    exporting: {
        enabled: false
    },
    tooltip: {
        valueSuffix:'%'
    },
    plotOptions: {
        series: {

        },
        area: {
            stacking: 'normal',
            lineColor: '#FFFFFF',
            lineWidth: 1,
            marker: {
                lineWidth: 1,
                lineColor: '#FFFFFF'
            }
        }
    },
    series: [{
        name: 'Percent',
        data: [85, 91, 95, 88, 90, 87, 97, 90, 87, 98]
    }]
});