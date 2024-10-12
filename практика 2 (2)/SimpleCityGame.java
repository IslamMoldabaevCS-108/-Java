import java.util.Scanner;

public class SimpleCityGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String previousWord = "";
        boolean isPlayer1Turn = true;
        while (true) {
            if (isPlayer1Turn) {
                System.out.print("Игрок 1, введите слово: ");
            } else {
                System.out.print("Игрок 2, введите слово: ");
            }
            String currentWord = scanner.nextLine().trim().toLowerCase();
            if (!previousWord.isEmpty() && currentWord.charAt(0) != previousWord.charAt(previousWord.length() - 1)) {
                System.out.println("Неверно! Слово должно начинаться с буквы '" + previousWord.charAt(previousWord.length() - 1) + "'.");
                break;
            }
            previousWord = currentWord;
            isPlayer1Turn = !isPlayer1Turn;
        }
        System.out.println("Игра окончена.");
        scanner.close();
    }
}
