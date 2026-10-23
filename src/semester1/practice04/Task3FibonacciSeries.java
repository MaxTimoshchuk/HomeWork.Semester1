package semester1.practice04;

import java.util.Scanner;

public class Task3FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            System.out.print("Скільки чисел згенерувати (N >= 3): ");
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n < 3) {
                    System.out.println("Помилка: N має бути не менше 3!");
                }
            } else {
                System.out.println("Помилка: введіть ціле число!");
                scanner.next();
            }
        } while (n < 3);

        int f1 = 1;
        int f2 = 1;

        System.out.println();
        System.out.println("№ 1  | Число: " + f1);
        System.out.println("№ 2  | Число: " + f2);

        double lastRatio = 0.0;

        for (int i = 3; i <= n; i++) {
            int next = f1 + f2;
            double ratio = (double) next / f2;
            lastRatio = ratio;

            System.out.println("№"+ i +" Число: " + next + " ; Відношення  = " + i + next + ratio);

            f1 = f2;
            f2 = next;
        }

        double ratioConst = 1.618034;
        System.out.println();
        System.out.println("Підсумок: знайдено наближення Золотого перетину: " + lastRatio);
        System.out.println("Еталонне значення: " + ratioConst);
    }
}