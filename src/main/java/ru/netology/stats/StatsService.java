package ru.netology.stats;

public class StatsService {
    public int sumAllSales(long[] sales) {
        int sumAllSales = 0;
        for (int i = 0; i < sales.length; i++) {
            sumAllSales = (int) (sumAllSales + sales[i]);
        }
        return sumAllSales;
    }

    public int averageSalesAmounts(long[] sales) {
        int averageSalesAmounts = sumAllSales(sales) / sales.length;
        return averageSalesAmounts;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }


    public int numberBelowAverage(long[] sales) {
        int minAverage = 0;
        for (long sale : sales) {
            if (sale < averageSalesAmounts(sales)) {
                minAverage = minAverage + 1;
            }

        }
        return minAverage;
    }

    public int numberAboveAverage(long[] sales) {
        int maxAverage = 0;
        for (long sale : sales) {
            if (sale > averageSalesAmounts(sales)) {
                maxAverage = maxAverage + 1;
            }

        }
        return maxAverage;
    }
}