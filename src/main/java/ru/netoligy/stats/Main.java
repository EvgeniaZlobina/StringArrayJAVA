package ru.netoligy.stats;

public class Main {
    public static void main(String[] args) {
        StatsService Service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int summaIncome = Service.SummaSales(sales); // сумма продаж
        System.out.println(summaIncome + " сумма продаж");

        int summaAveragle = Service.AverageSummaSales(sales); // средняя сумма продаж
        System.out.println(summaAveragle);

        int salesmin = Service.minSales(sales); // средняя сумма продаж
        System.out.println(salesmin);

        int salesmax = Service.maxSales(sales); // средняя сумма продаж
        System.out.println(salesmax);

        int quantitymin = Service.minAverageSales(sales); // количество месяцев в котором продажи меньше среднего
        System.out.println(quantitymin);

        int quantitymax = Service.maxAverageSales(sales); // количество месяцев в котором продажи выше среднего
        System.out.println(quantitymax);


    }
}