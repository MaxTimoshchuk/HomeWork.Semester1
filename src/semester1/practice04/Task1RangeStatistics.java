package semester1.practice04;

import java.util.Scanner;

public class Task1RangeStatistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;

        System.out.println("АНАЛІЗАТОР ДІАПАЗОНУ ЧИСЕЛ");

        do {
            System.out.print("Введіть число N: ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.println("Помилка: N має бути більшим за 0!");
                }
            } else {
                System.out.println("Помилка: будь ласка, введіть ціле число!");
                scanner.next();
            }
        } while (n <= 0);

        int totalSum = 0;
        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;

        for (int i = 1; i <= n; i++) {
            totalSum += i;
            if (i % 2 == 0) {
                evenSum += i;
                evenCount++;
            } else {
                oddSum += i;
                oddCount++;
            }
        }

        double average = (double) totalSum / n;

        System.out.println("Загальна сума чисел: " + totalSum);
        System.out.println("Сума парних чисел: " + evenSum + evenCount);
        System.out.println("Сума непарних чисел: " + oddSum + oddCount);
        System.out.println("Середнє арифметичне: " + average);
    }
}