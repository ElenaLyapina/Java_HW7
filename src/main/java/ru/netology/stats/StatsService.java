package ru.netology.stats;

public class StatsService {

    public long SumSales (long[] sales){
        long sumSales = 0;
        for (long sale : sales){
            sumSales = sumSales + sale;
        }
        return sumSales;
    }

    public long AverageAmountForMonth (long[] sales){
        long averageAmount = 0;
        long sumSales = 0;
        int monthAmount = 0;
        for (long sale : sales){
            sumSales = sumSales + sale;
            monthAmount = monthAmount + 1;
        }
        averageAmount = sumSales / monthAmount;
        return averageAmount;
    }

    public long MaxSales (long[] sales){
        int maxMonth = 0;
        int month = 0; // счетчик месяца
        for (long sale : sales){
            if (sale >= sales[maxMonth]) {
               maxMonth = month;
            }
            month = month + 1;
        }

        return maxMonth + 1;
    }

    public long MinSales (long[] sales){
        int minMonth = 0;
        int month = 0; // счетчик месяца
        for (long sale : sales){
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }

        return minMonth + 1;
    }

    public long UnderAverageSales (long[] sales){
        long averageSales = AverageAmountForMonth(sales);
        int monthAmount = 0;
        for (long sale : sales){
            if(sale < averageSales){
                monthAmount = monthAmount + 1;
            }
        }
        return monthAmount;
    }

    public long UpperAverageSales (long[] sales){
        long averageSales = AverageAmountForMonth(sales);
        int monthAmount = 0;
        for (long sale : sales){
            if(sale > averageSales){
                monthAmount = monthAmount + 1;
            }
        }
        return monthAmount;
    }
}
