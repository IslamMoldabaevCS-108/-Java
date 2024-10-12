public class Main {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(n + "-е число Фибоначчи: " + fibonacci(n)); // 8
        for (int i = 0; i <= 10; i++) {
            System.out.println(i + "-е число Фибоначчи: " + fibonacci(i));
        }
    }
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n должно быть неотрицательным.");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
