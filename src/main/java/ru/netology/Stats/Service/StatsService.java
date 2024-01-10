package ru.netology.Stats.Service;

import java.util.Arrays;

public class StatsService {

    public int calculateSumSales(long[] sales) {
        int sum = 0;

        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int averageSalesMonth(long[] sales) {
        int sumYear = 0;

        for (long sale : sales) {
            sumYear += sale;
        }
        return sumYear / sales.length;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int numberMonthBelowAverage(long[] sales) {
        int count = 0;
        long averageSale = averageSalesMonth(sales);
        for (long sale : sales) {
            if (sale < averageSale) {
                count++;
            }
        }
        return count;
    }

    public int numberMonthAboveAverage(long[] sales) {
        int count = 0;
        long averageSale = averageSalesMonth(sales);
        for (long sale : sales) {
            if (sale > averageSale) {
                count++;
            }
        }
        return count;
    }
}
