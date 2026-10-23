package semester1.practice05;

import java.util.Scanner;

public class Task1DailySales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] days = {"Понеділок", "Вівторок", "Середа", "Четвер", "П'ятниця", "Субота", "Неділя"};

        double[] sales = new double[7];

        System.out.println("=== ФІНАНСОВИЙ ЗВІТ КАВ'ЯРНІ ЗА ТИЖДЕНЬ ===");

        for (int i = 0; i < sales.length; i++) {
            System.out.print("Введіть виторг за " + days[i] + " (грн): ");
            sales[i] = scanner.nextDouble();
        }
        double totalSales = 0;
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < sales.length; i++) {
            totalSales += sales[i];
            if (sales[i] > sales[maxIndex]) {
                maxIndex = i;
            }
            if (sales[i] < sales[minIndex]) {
                minIndex = i;
            }
        }
        double averageSales = totalSales / sales.length;

        System.out.println("---------------- ПІДСУМКИ ----------------");
        System.out.println("Загальний тижневий виторг: " + totalSales + "грн");
        System.out.println("Середній виторг на день:   " + averageSales + "грн");
        System.out.println("Найкращий день:" + days[maxIndex] +"("+ sales[maxIndex] + "грн)");
        System.out.println("Найгірший день:" + days[minIndex]+"("+ sales[minIndex] + "грн)");

        System.out.println("Дні з виторгом вище середнього:");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSales) {
                System.out.println(days[i] +":"+ sales[i] + "грн");
            }
        }
        System.out.println("==========================================");

        scanner.close();
    }
}
