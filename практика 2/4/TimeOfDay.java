import java.util.Scanner;

public class TimeOfDay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите час суток (от 0 до 23): ");
        int hour = scanner.nextInt();

        if (hour < 0 || hour > 23) {
            System.out.println("Ошибка: Введите число в диапазоне от 0 до 23.");
        } else {
            if (hour >= 6 && hour < 10) {
                System.out.println("Утро");
            } else if (hour >= 10 && hour <= 18) {
                System.out.println("День");
            } else if (hour > 18 && hour < 22) {
                System.out.println("Вечер");
            } else {
                System.out.println("Ночь");
            }
        }
        scanner.close();
    }
}
