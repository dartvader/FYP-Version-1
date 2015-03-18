/**
 * 
 */
! function() {
    var ClaimPieChart = {};

    ClaimPieChart.draw = function(id, rulesData, google) {
    	
    	var data = new google.visualization.DataTable();
        data.addColumn('string', 'Rule Name');
        data.addColumn('number', 'Score');
        data.addRows(rulesData);
        
        var options = {
          title: 'Score Break Down'
        };

        var chart = new google.visualization.PieChart(document.getElementById(id));
        
        chart.draw(data, options);
    }

this.ClaimPieChart = ClaimPieChart;
}();