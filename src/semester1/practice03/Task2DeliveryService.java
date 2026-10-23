package semester1.practice03;

import java.util.Scanner;
// не вийшло              :(

public class Task2DeliveryService {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть вагу відправлення (кг): ");
        double weight = scanner.nextDouble();

        System.out.print("Введіть відстань транспортування (км): ");
        double kilometr = scanner.nextDouble();

        System.out.print("Оберіть пункт призначення (1 - Відділення, 2 - Поштомат, 3 - Кур'єр): ");
        int delivery = scanner.nextInt();

        System.out.print("Чи є у вас карта Premium? (так/ні): ");
        String premium = scanner.nextLine();

        if (weight <= 0 || weight > 50){
            System.out.print("Помилка: Вага відправлення повинна бути в межах від 0 до 50 кг!");
        if (kilometr <= 0) {
            System.out.print("Помилка: Відстань доставки повинна бути більшою за 0 км!");

        String deliveryType;
        double base = switch (delivery){
            case 1 -> {
                deliveryType = "Віділення";
                yield  50;
            }
            case 2 -> {
                if (weight > 15){
                    System.out.println("Помилка: Поштомат не приймає габаритні посилки понад 15 кг!");
                    yield -1;
                }
                deliveryType = "Поштомат";
                yield 60;
            }
            case 3 -> {
                deliveryType = "Кур'єр";
                yield 100;
            }
            default -> {
                System.out.println("Помилка: Некоректний тип доставки!");
                yield -1;
            }
        };
        if (base < 0 ){
        }
        double distance;
        if(kilometr <= 50){
        distance = 0;
        } else if (kilometr <= 200){
            distance = 35;
        }else {
            distance = 80;
        }
            boolean isPremium = premium.equalsIgnoreCase("так");
            double subtotal = base + distance;
            double finalCost = isPremium ? subtotal * 0.80 : subtotal;
            System.out.println("Тип доставки:" + delivery + base);
            System.out.println("Доплата за відстань: " + distance + distance);
            System.out.println("Сума до знижки: " + subtotal);
            System.out.print("Статус клієнта: "  );
            System.out.println(isPremium ? "Premium (-20%)" : "Звичайний");
            System.out.println("РАЗОМ ДО СПЛАТИ: " + finalCost);


        }
        }
    }
}
