package ru.netology.Stats.Service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void calculateSumSales() {
        StatsService service = new StatsService();

        long[] sumYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};// Набор данных о продажах за 12 месяцев
        int expected = 180;
        int sum = service.calculateSumSales(sumYear);

        Assertions.assertEquals(expected, sum);
    }

    @Test
    public void averageSalesMonth() {
        StatsService service = new StatsService();

        long[] sumYear = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int averageSale = service.averageSalesMonth(sumYear);
        int expected = 15;
        Assertions.assertEquals(expected, averageSale);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        long actualMonth = service.maxSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        long actualMonth = service.minSales(sales);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test
    public void numberMonthBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.numberMonthBelowAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void numberMonthAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.numberMonthAboveAverage(sales);
        long expected = 5;

        Assertions.assertEquals(expected, actual);

    }
}


