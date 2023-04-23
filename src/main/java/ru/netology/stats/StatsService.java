package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {

        long sumSalesTemp = 0;

        for (long t : sales) {
            sumSalesTemp = sumSalesTemp + t;

        }
        return sumSalesTemp;
    }

    public double avgSumSales(long[] sales) {

        return sumSales(sales) / sales.length;
    }

    public int monthTopSales(long[] sales) {
        int monthTopSalesTemp = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[monthTopSalesTemp]) {
                monthTopSalesTemp = i;
            }

        }
        return monthTopSalesTemp;
    }


    public int monthLowSales(long[] sales) {
        int monthLowSalesTemp = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[monthLowSalesTemp]) {
                monthLowSalesTemp = i;
            }

        }
        return monthLowSalesTemp;
    }

    public int amountMonthsLessAvgSales(long[] sales) {
        int amountMonthsLessAvgSalesTemp = 0;
        for (long t : sales) {
            if (t < avgSumSales(sales)) {
                amountMonthsLessAvgSalesTemp++;
            }
        }
        return amountMonthsLessAvgSalesTemp;

    }

    public int amountMonthsMoreAvgSales(long[] sales) {
        int amountMonthsMoreAvgSalesTemp = 0;
        for (long t : sales) {

            if (t > avgSumSales(sales)) {
                amountMonthsMoreAvgSalesTemp++;
            }
        }

        return amountMonthsMoreAvgSalesTemp;
    }
}
