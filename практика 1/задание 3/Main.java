import java.util.Scanner;

class SimpleDiscountCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите исходную цену товара: ");
        double price = scanner.nextDouble();
        System.out.print("Введите процент скидки: ");
        double discount = scanner.nextDouble();
        double finalPrice = price - (price * discount / 100);
        System.out.println("Цена товара со скидкой: " + finalPrice);
    }
}
