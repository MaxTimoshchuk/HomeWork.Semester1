package semester1.practice02;

public class Task1CurrencyExchange {
    static void main(String[] args) {

        double usdAmount = 1000;
        double usdСurrency = 59.67;
        double commission = 12.5;

        double translated = usdAmount * usdСurrency;
        double commissionSum = translated * (commission / 100);
        double finalSum = translated - commissionSum;

        System.out.println("Нараховано: " + translated);
        System.out.println("Комісія: " + commissionSum);
        System.out.println("Чиста сума: " + finalSum);
    }
}
