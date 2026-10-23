package semester1.practice05;

public class Task2WarehouseInventory {
    public static void main(String[] args) {
        String[] items = {"Ноутбук", "Смартфон", "Бездротові навушники", "Механічна клавіатура", "Монітор 27\""};
        int[] quantities = {8, 3, 25, 4, 12};
        double[] prices = {28500.0, 19200.0, 1850.0, 3100.0, 9400.0};

        double[] totalValues = new double[items.length];

        double grandTotalWarehouse = 0;
        int maxCapitalIndex = 0;

        for (int i = 0; i < items.length; i++) {
            totalValues[i] = quantities[i] * prices[i];
            grandTotalWarehouse += totalValues[i];

            if (totalValues[i] > totalValues[maxCapitalIndex]) {
                maxCapitalIndex = i;
            }
        }

        System.out.println("=================== ЗВІТ СКЛАДУ ЕЛЕКТРОНІКИ ===================");
        System.out.println("№ | Назва товару            | К-сть | Ціна (грн) | Загальна вартість");
        System.out.println("----------------------------------------------------------------");

        System.out.println("1 | Ноутбук                 | " + quantities[0] + " шт. | " + prices[0] + "   | " + totalValues[0] + " грн");
        System.out.println("2 | Смартфон                | " + quantities[1] + " шт. | " + prices[1] + "   | " + totalValues[1] + " грн");
        System.out.println("3 | Бездротові навушники    | " + quantities[2] + " шт.| " + prices[2] + "    | " + totalValues[2] + " грн");
        System.out.println("4 | Механічна клавіатура    | " + quantities[3] + " шт. | " + prices[3] + "    | " + totalValues[3] + " грн");
        System.out.println("5 | Монітор 27             | " + quantities[4] + " шт.| " + prices[4] + "    | " + totalValues[4] + " грн");

        System.out.println("----------------------------------------------------------------");

        System.out.println("Загальна вартість складу: " + grandTotalWarehouse + " грн");
        System.out.println("Найбільший капітал у товарі: " + items[maxCapitalIndex] + " (" + totalValues[maxCapitalIndex] + " грн)");
        System.out.println();

        System.out.println("ДЕФІЦИТНІ ПОЗИЦІЇ (менше 5 шт.):");
        System.out.println("Смартфон (залишилось: " + quantities[1] + " шт.) -> Терміново дозамовити!");
        System.out.println("Механічна клавіатура (залишилось: " + quantities[3] + " шт.) -> Терміново дозамовити!");
        System.out.println("================================================================");
    }
}