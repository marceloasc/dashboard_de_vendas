import axios from 'axios';
import Chart from 'react-apexcharts';
import { SaleSum } from 'types/sale';
import { BASE_URL } from 'utils/requests';

type ChartData = {
    labels: string[];
    series: number[];
}

const DonutChart = () => {

    //FORMA ERRADA
    let chartData: ChartData = {labels:[], series:[]};

    //FORMA ERRADA 
    axios.get(`${BASE_URL}/vendas/soma-por-vendedor`)
        .then(response => {
            const data: SaleSum[] = response.data;
            const myLabels = data.map(x => x.nomeVendedor);
            const mySeries = data.map(x => x.total);

            chartData = {labels: myLabels, series: mySeries};
        });

    //const mockData = {
        //series: [477138, 499928, 444867, 220426, 473088],
        //labels: ['Anakin', 'Barry Allen', 'Kal-El','Logan', 'Padmé']
    //}

    const options = {
        legend: {
            show: true
        }
    }

    return (
        <Chart 
            options={{ ...options, labels: chartData.labels}}
            series={chartData.series}
            type="donut"
            height="240"
        />
    );
}

export default DonutChart;
