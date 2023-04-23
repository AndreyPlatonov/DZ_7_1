package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @Test
    public void testSumSales() {
        StatsService service = new StatsService();
        long expectedSumSales = 180;
        long actualSumSales = service.sumSales(sales);
        Assertions.assertEquals(expectedSumSales, actualSumSales);

    }

    @Test
    public void testAvgSumSales() {
        StatsService service = new StatsService();
        double expectedAvgSumSales = 15;
        double actualAvgSumSales = service.avgSumSales(sales);
        Assertions.assertEquals(expectedAvgSumSales, actualAvgSumSales);

    }

    @Test
    public void testMonthTopSales() {
        StatsService service = new StatsService();
        int expectedMonthTopSales = 7;
        int actualMonthTopSales = service.monthTopSales(sales);
        Assertions.assertEquals(expectedMonthTopSales, actualMonthTopSales);

    }

    @Test
    public void testMonthLowSales() {
        StatsService service = new StatsService();
        int expectedMonthLowSales = 8;
        int actualMonthLowSales = service.monthLowSales(sales);
        Assertions.assertEquals(expectedMonthLowSales, actualMonthLowSales);

    }

    @Test
    public void testAmountMonthsLessAvgSales() {
        StatsService service = new StatsService();
        int expectedAmountMonthsLessAvgSales = 5;
        int actualAmountMonthsLessAvgSales = service.amountMonthsLessAvgSales(sales);
        Assertions.assertEquals(expectedAmountMonthsLessAvgSales, actualAmountMonthsLessAvgSales);

    }

    @Test
    public void testAmountMonthsMoreAvgSales() {
        StatsService service = new StatsService();
        int expectedAmountMonthsMoreAvgSales = 5;
        int actualAmountMonthsMoreAvgSales = service.amountMonthsMoreAvgSales(sales);
        Assertions.assertEquals(expectedAmountMonthsMoreAvgSales, actualAmountMonthsMoreAvgSales);

    }

}
