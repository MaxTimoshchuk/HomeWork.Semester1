package semester1.practice03;

import java.util.Locale;
import java.util.Scanner;

    public class Task3CreditScoring {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.print("Введіть вік позичальника: ");
            int age = scanner.nextInt();

            System.out.print("Введіть офіційний місячний дохід (грн): ");
            double monthlyIncome = scanner.nextDouble();

            System.out.print("Чи є негативна кредитна історія? (true/false): ");
            boolean badCreditHistory = scanner.nextBoolean();

            System.out.print("Введіть запитувану суму кредиту (грн): ");
            double loanAmount = scanner.nextDouble();

            System.out.print("Введіть бажаний термін (місяців): ");
            int loanMonths = scanner.nextInt();

            boolean ageValid = (age >= 21 && age <= 65);
            boolean creditHistoryOk = !badCreditHistory;

            boolean isPaymentAffordable = (loanMonths > 0) && ((loanAmount / loanMonths) <= (monthlyIncome * 0.5));

            double interestRate = (monthlyIncome >= 35000.0) ? 14.5 : 21.0;
            boolean approved = ageValid && creditHistoryOk && isPaymentAffordable;

            if (approved) {
                double monthlyPayment = loanAmount / loanMonths;
                double dtiPercent = (monthlyPayment / monthlyIncome) * 100.0;
                double maxAllowedPayment = monthlyIncome * 0.5;

                System.out.println("Орієнтовний платіж/міс: " + monthlyPayment +dtiPercent);
                System.out.println("Персональна ставка: " + interestRate);
                System.out.println("Максимально допустимий платіж: " + maxAllowedPayment);
            } else {
                System.out.println("Статус заявки: ВІДХИЛЕНО ");
                if (!ageValid) {
                    System.out.println("Причина відмови: Відмова: вік не відповідає критеріям (21-65 років)");
                } else if (!creditHistoryOk) {
                    System.out.println("Причина відмови: Відмова: виявлено негативну кредитну історію");
                } else {
                    System.out.println("Причина відмови: Відмова: термін кредиту некоректний або щомісячний платіж перевищує 50% доходу");
                }
            }

            scanner.close();
        }
    }

