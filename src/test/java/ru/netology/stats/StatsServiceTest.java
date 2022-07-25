package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StatsServiceTest {

    @Test
    void CalculateSumSales(){
        StatsService stats = new StatsService();
        long[] inputData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        long resultSum = stats.SumSales(inputData);

        assertEquals(expected, resultSum);
    }

    @Test
    void CalculateAverageAmountForMonth(){
        StatsService stats = new StatsService();
        long[] inputData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        long resultAverageAmount = stats.AverageAmountForMonth(inputData);

        assertEquals(expected, resultAverageAmount);
    }

    @Test
    void CalculateMaxSales(){
        StatsService stats = new StatsService();
        long[] inputData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 8;
        long resultMaxSales = stats.MaxSales(inputData);

        assertEquals(expected, resultMaxSales);
    }

    @Test
    void CalculateMinSales(){
        StatsService stats = new StatsService();
        long[] inputData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 9;
        long resultMinSales = stats.MinSales(inputData);

        assertEquals(expected, resultMinSales);
    }

    @Test
    void MonthAmountUnderAverage(){
        StatsService stats = new StatsService();
        long[] inputData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long resultMonthAmountUnderAverage = stats.UnderAverageSales(inputData);

        assertEquals(expected, resultMonthAmountUnderAverage);
    }

    @Test
    void MonthAmountUpperAverage(){
        StatsService stats = new StatsService();
        long[] inputData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        long resultMonthAmountUpperAverage = stats.UpperAverageSales(inputData);

        assertEquals(expected, resultMonthAmountUpperAverage);
    }
}
