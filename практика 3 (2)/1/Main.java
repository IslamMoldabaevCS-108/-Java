public class Main {
    public static void main(String[] args) {
        int number = 1234;
        System.out.println("Сумма цифр: " + sumDigits(number));
    }
    public static int sumDigits(int number) {
        int sum = 0;
        number = Math.abs(number);
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
