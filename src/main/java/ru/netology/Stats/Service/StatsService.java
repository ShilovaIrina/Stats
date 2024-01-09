package ru.netology.Stats.Service;

import java.util.Arrays;

public class StatsService {

    public int calculateSumSales(int[] sales) {
        int sum = 0;

        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }


    public int averageSalesMonth(int[] sales) {
        int sumYear = 0;

        for (int sale : sales) {
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

    public int numberBelowAverage(int[] sales) {
        int count = 0;

        int average = Arrays.stream(sales).sum() / sales.length;
        for (int sale : sales) {
            if (sale < average) {
                count++;
            }
        }

        return count;
    }

    public int numberAboveAverage(int[] sales) {
        int count = 0;

        int average = Arrays.stream(sales).sum() / sales.length;
        for (int sale : sales) {
            if (sale > average) {
                count++;
            }
        }

        return count;
    }
}
