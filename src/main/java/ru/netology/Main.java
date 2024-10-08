package ru.netology.stats;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        // Сумма всех продаж
        long totalSales = service.sumSales(sales);
        System.out.println("Сумма всех продаж: " + totalSales);

        // Средняя сумма продаж в месяц
        long averageSales = service.averageSales(sales);
        System.out.println("Средняя сумма продаж в месяц: " + averageSales);

        // Месяц с максимальными продажами
        int maxSalesMonth = service.maxSales(sales);
        System.out.println("Месяц с пиковыми продажами: " + maxSalesMonth);

        // Месяц с минимальными продажами
        int minSalesMonth = service.minSales(sales);
        System.out.println("Месяц с минимальными продажами: " + minSalesMonth);

        // Количество месяцев с продажами ниже среднего
        int monthsBelowAverage = service.belowAverageSales(sales);
        System.out.println("Количество месяцев с продажами ниже среднего: " + monthsBelowAverage);

        // Количество месяцев с продажами выше среднего
        int monthsAboveAverage = service.aboveAverageSales(sales);
        System.out.println("Количество месяцев с продажами выше среднего: " + monthsAboveAverage);
    }
}
