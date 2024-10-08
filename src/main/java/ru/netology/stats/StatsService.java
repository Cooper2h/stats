package ru.netology.stats;

public class StatsService {

    // 1. Сумма всех продаж
    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    // 2. Средняя сумма продаж в месяц
    public long averageSales(long[] sales) {
        return sumSales(sales) / sales.length;
    }

    // 3. Номер месяца с пиком продаж (максимальная сумма)
    public int maxSales(long[] sales) {
        int maxMonth = 0; // Переменная для хранения индекса месяца с максимальными продажами
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > sales[maxMonth]) {
                maxMonth = i; // Обновляем maxMonth, если нашли месяц с большим значением продаж
            }
        }
        return maxMonth + 1; // Возвращаем месяц с 1, а не с 0
    }


    // 4. Номер месяца с минимальными продажами
    public int minSales(long[] sales) {
        int minMonth = 0;
        for (int i = 1; i < sales.length; i++) {
            if (sales[i] < sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1; // нумерация месяцев начинается с 1
    }

    // 5. Количество месяцев, в которых продажи были ниже среднего
    public int belowAverageSales(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale < average) {
                count++;
            }
        }
        return count;
    }

    // 6. Количество месяцев, в которых продажи были выше среднего
    public int aboveAverageSales(long[] sales) {
        long average = averageSales(sales);
        int count = 0;
        for (long sale : sales) {
            if (sale > average) {
                count++;
            }
        }
        return count;
    }
}
