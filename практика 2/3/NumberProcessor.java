import java.util.Scanner;

public class NumberProcessor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите целое число: ");
        int integer = scanner.nextInt();
        if (integer % 2 == 0) {
            System.out.print("Введите дробное число: ");
            double doubleNumber = scanner.nextDouble();
            System.out.println("Результат: " + (integer * doubleNumber));
        } else {
            System.out.print("Введите другое целое число: ");
            int secondInteger = scanner.nextInt();
            System.out.println("Результат: " + (integer + secondInteger));
        }
        scanner.close();
    }
}
