package semester1.practice03;

import java.util.Scanner;

public class Task1FuelCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть відстань (км): ");
        double distance = scanner.nextDouble();

        System.out.print("Введіть витрату пального (л/100 км): ");
        double consumption = scanner.nextDouble();

        System.out.print("Оберіть тип пального (1 - А-95, 2 - Дизель, 3 - Газ): ");
        int fuelType = scanner.nextInt();

        double priceLiter = 0;
        String fuelName = "";

        switch (fuelType) {
            case 1:
                priceLiter = 56.5;
                fuelName = "А-95";
                break;
            case 2:
                priceLiter = 52.0;
                fuelName = "Дизель";
                break;
            case 3:
                priceLiter = 29.4;
                fuelName = "Газ";
                break;
            default:
                System.out.println("Невірний тип пального!");
                scanner.close();
                return;
        }

        double fuelNeeded = (distance / 100.0) * consumption;
        double baseCost = fuelNeeded * priceLiter;

        double discountPercent = (baseCost >= 2000) ? 0.05 : 0.0;
        double discountAmount = baseCost * discountPercent;
        double totalCost = baseCost - discountAmount;

        System.out.println("=== РОЗРАХУНОК ПОЇЗДКИ ===");
        System.out.println("Обране пальне: " + fuelName + priceLiter);
        System.out.println("Необхідно пального: " + fuelNeeded);
        System.out.println("Базова вартість: " + baseCost);

        if (discountPercent > 0) {
            System.out.println("Знижка: " + discountPercent * 100 + discountAmount);
        } else {
            System.out.println("Знижка: відсутня");
        }

        System.out.println("До сплати: " + totalCost);

        scanner.close();
    }
}