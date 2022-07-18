package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class StatsServiceTest {

    @Test
    public void getSumAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 8, 14, 14, 18};
        long expectedDay = 181;
        long actualDay = service.sumAllSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void getAverageAmountSalesMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 8, 14, 14, 18};
        long expectedDay = 15;
        long actualDay = service.averageSalesAmounts(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void getNumberMonthMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 8, 14, 14, 18};
        long expectedDay = 8;
        long actualDay = service.maxSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void getNumberMonthMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 8, 14, 14, 18};
        long expectedDay = 9;
        long actualDay = service.minSales(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void getSumMonthsMinAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 8, 14, 14, 18};
        long expectedDay = 5;
        long actualDay = service.numberBelowAverage(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }

    @Test
    public void getSumMonthsMaxAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 8, 14, 14, 18};
        long expectedDay = 5;
        long actualDay = service.numberAboveAverage(sales);

        Assertions.assertEquals(expectedDay, actualDay);
    }
}
