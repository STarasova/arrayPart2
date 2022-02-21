package ru.netology.stats;

public class StatsService {
    public int calculateSaleSum (int[] sales) {
        int sum = 0;
        for (int sale : sales ) {
            sum += sale;
        }
        return sum;
    }

    public int calculateAverageInMonth (int[] sales) {
        return calculateSaleSum(sales) / sales.length;
    }

    public int calMaxSaleMonthNumber (int[] sales) {
        // Take first element as maximum
        int maxSaleMonth = sales [0];
        int index = 0;
        for (int i = 1; i < sales.length; i++ ) {
            if (sales[i] >= maxSaleMonth) {
                maxSaleMonth = sales[i];
                index = i;
            }
        }
        return index + 1;
    }

    public int calMinSaleMonthNumber (int[] sales) {

        int minSaleMonth = sales [0];
        int index = 0;
        for (int i = 1; i < sales.length; i++ ) {
            if (sales[i] <= minSaleMonth) {
                minSaleMonth = sales[i];
                index = i;
            }
        }
        return index + 1;
    }

    //Кол-во месяцев, в которых продажи были ниже среднего
    public int calMonthCountWhereSalesLessThenAverage (int[] sales) {
        int monthCountWhereSalesLessThenAverage = 0;
        int averageInMonth = calculateAverageInMonth (sales);
        for (int monthSale : sales) {
            if (monthSale < averageInMonth) {
                monthCountWhereSalesLessThenAverage++;
           }
        }
        return monthCountWhereSalesLessThenAverage;
    }

    //Кол-во месяцев, в которых продажи были выше среднего
    public int calMonthCountWhereSalesMoreThenAverage (int[] sales) {
        int monthCountWhereSalesMoreThenAverage = 0;
        int averageInMonth = calculateAverageInMonth (sales);
        for (int monthSale : sales) {
            if (monthSale > averageInMonth) {
                monthCountWhereSalesMoreThenAverage++;
            }
        }
        return monthCountWhereSalesMoreThenAverage;
    }
}


