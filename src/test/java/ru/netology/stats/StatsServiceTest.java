package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void shouldFindTotalSum() { // #1
        StatsService service = new StatsService();
        long[] sales = {8, 15, (long) 13.5, 15, (long) 17.2, 20, 19, 20, 7, 14, 14, 18};
        long expectedSum = (long) 180;
        long actualSum = (long) service.getTotalSum(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSum() { //#2
        StatsService service = new StatsService();
        long[] sales = {8, 15, (long) 13.5, 15, (long) 17.2, 20, 19, 20, 7, 14, 14, 18};
        long expectedAverageSum = 15;
        long actualAverageSum = (long) service.getAverageSumMonth(sales);

        Assertions.assertEquals(expectedAverageSum, actualAverageSum);
    }

    @Test
    public void shouldFindMaxSalesMonths() { //#3
        StatsService service = new StatsService();
        long[] sales = {8, 15, (long) 13.5, 15, (long) 17.2, 20, 19, 20, 7, 14, 14, 18};
        int expectedMaxSalesMonth = 8;
        int actualMaxSalesMonth = service.getMaxSalesMonths(sales);

        Assertions.assertEquals(expectedMaxSalesMonth, actualMaxSalesMonth);
    }

    @Test
    public void shouldFindMinSalesMonths() { //#4
        StatsService service = new StatsService();
        long[] sales = {8, 15, (long) 13.5, 15, (long) 17.2, 20, 19, 20, 7, 14, 14, 18};
        int expectedMinSalesMonth = 9;
        int actualMinSalesMonth = service.getMinSalesMonths(sales);
        Assertions.assertEquals(expectedMinSalesMonth, actualMinSalesMonth);
    }

    @Test
    public void shouldFindTotalMonthsMinSales() { //#5
        StatsService service = new StatsService();
        long[] sales = {8, 15, (long) 13.5, 15, (long) 17.2, 20, 19, 20, 7, 14, 14, 18};
        int expectedTotalMonthsMin = 5;
        int actualTotalMonthsMin = service.getTotalMonthsMinSales(sales);
        Assertions.assertEquals(expectedTotalMonthsMin, actualTotalMonthsMin);

    }

    @Test
    public void shouldFindTotalMonthsMaxSales() { //#6
        StatsService service = new StatsService();
        long[] sales = {8, 15, (long) 13.5, 15, (long) 17.2, 20, 19, 20, 7, 14, 14, 18};
        int expectedTotalMonthsMax = 5;
        int actualTotalMonthsMax = service.getTotalMonthsMaxSales(sales);
        Assertions.assertEquals(expectedTotalMonthsMax, actualTotalMonthsMax);


    }


}