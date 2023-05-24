package ru.netoligy.stats;

public class StatsService {// сумма продаж

    public int SummaSales(int[] sales) {
        int summa = 0;

        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];
        }
        return summa;
    }

    public int AverageSummaSales(int[] sales) {// средняя сумма продаж
        int summa = 0;
        int average;
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            summa = summa + sales[i];
            count = count + 1;
        }
        average = summa / count;
        return average;
    }

    public int maxSales(int[] sales) { // номер месяца с максимальными продажами
        int maxMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) { //в i месяце меньше
                maxMonth = i; //запомним как максимальный
            }
        }
        return maxMonth;
    }

    public int minSales(int[] sales) {// номер месяца с минимальными продажами
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { //в i месяце меньше
                minMonth = i; //запомним как минимальный
            }
        }
        return minMonth;
    }

    public int minAverageSales(int[] sales) {// количество месяцев в которых продажи ниже среднего
        int minaverage = AverageSummaSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < minaverage) {
                count = count + 1;
            }
        }
        return count;
    }

    public int maxAverageSales(int[] sales) {// // количество месяцев в которых продажи выше среднего
        int maxaverage = AverageSummaSales(sales);
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > maxaverage) {
                count = count + 1;
            }
        }
        return count;
    }
}

