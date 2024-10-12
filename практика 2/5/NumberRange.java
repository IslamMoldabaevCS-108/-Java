import java.util.Scanner;

public class NumberRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное целое число: ");
        int x = scanner.nextInt();
        for (int i = -(x - 1); i < x; i++) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
