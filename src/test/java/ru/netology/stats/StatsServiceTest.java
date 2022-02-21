package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCalculateSaleSum() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;

        int actual = service.calculateSaleSum(sales);

        assertEquals(expected, actual );

    }

    @Test
    void shouldCalculateAverageInMonth() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;

        int actual = service.calculateAverageInMonth(sales);

        assertEquals(expected, actual );
    }

    @Test
    void shouldCalMaxSaleMonthNumber() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;

        int actual = service.calMaxSaleMonthNumber(sales);

        assertEquals(expected, actual );
    }

    @Test
    void calMinSaleMonthNumber() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;

        int actual = service.calMinSaleMonthNumber(sales);

        assertEquals(expected, actual );
    }

    @Test
    void shouldCalMonthCountWhereSalesLessThenAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calMonthCountWhereSalesLessThenAverage(sales);

        assertEquals(expected, actual );
    }


    @Test
    void shouldCalMonthCountWhereSalesMoreThenAverage() {
        StatsService service = new StatsService();
        int [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;

        int actual = service.calMonthCountWhereSalesMoreThenAverage(sales);

        assertEquals(expected, actual );
    }

}