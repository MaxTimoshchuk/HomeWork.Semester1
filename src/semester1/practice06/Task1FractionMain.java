package semester1.practice06;

public class Task1FractionMain {
    public static void main(String[] args){
        System.out.println("=== КАЛЬКУЛЯТОР ЗВИЧАЙНИХ ДРОБІВ ===");

        Task1Fraction fraction1 = new Task1Fraction(8, 12);
        System.out.print("Дріб 1: ");
        fraction1.printFraction();
        System.out.println();

        fraction1.simplify();
        System.out.print("Після скорочення: ");
        fraction1.printFraction();
        System.out.println("десятковий вигляд: " + fraction1.toDecimal());
        System.out.println();

        System.out.println("Додаємо дріб 3/4 до 2/3...");
        Task1Fraction fraction2 = new Task1Fraction(2, 3);
        fraction2.add(3, 4);

        System.out.print("Результат додавання: ");
        fraction2.printFraction();
        System.out.println("десятковий вигляд: " + fraction2.toDecimal());
        System.out.println("=====================================");
    }}
