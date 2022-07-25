import ru.netology.stats.StatsService;

public class Main {

    public static void main(String[] args){
        StatsService stats = new StatsService();
        long[] inputData = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long resultSum = stats.SumSales(inputData);
        System.out.println("Сумма всех продаж: " + resultSum);

        long resultAverageAmount = stats.AverageAmountForMonth(inputData);
        System.out.println("Средняя сумма продаж в месяц: " + resultAverageAmount);

        long resultMaxSales = stats.MaxSales(inputData);
        System.out.println("Номер месяца, в котором был пик продаж: " + resultMaxSales);

        long resultMinSales = stats.MinSales(inputData);
        System.out.println("Номер месяца, в котором был минимум продаж: " + resultMinSales);

        long resultMonthAmountUnderAverage = stats.UnderAverageSales(inputData);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего: " + resultMonthAmountUnderAverage);

        long resultMonthAmountUpperAverage = stats.UpperAverageSales(inputData);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего: " + resultMonthAmountUpperAverage);
    }

}
