package ru.netology.stats;

public class StatsService {
    public double getTotalSum(long[] sales) { //#1 Total Sales
        long totalSum = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSum += sales[i];
        }
        return totalSum;
    }

    public double getAverageSumMonth(long[] sales) { // #2 Average sales per month
        long totalSum = (long) getTotalSum(sales);
        long averageSumMonth = totalSum / sales.length;
        return averageSumMonth;
    }

    public int getMaxSalesMonths(long[] sales) { // #3 The highest selling month
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int getMinSalesMonths(long[] sales) { // #4 The lowest selling month
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int getTotalMonthsMinSales(long[] sales) {  // #5 Number of months with sales below average
        long averageSum = (long) getAverageSumMonth(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < averageSum) {
                count++;
            }
        }
        return count;
    }

    public int getTotalMonthsMaxSales(long[] sales) { // #6 Number of months with sales above average
        long averageSum = (long) getAverageSumMonth(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > averageSum) {
                count++;
            }
        }
        return count;
    }

}
