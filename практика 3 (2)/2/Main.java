public class Main {
    public static void main(String[] args) {

        int[] testValues = {0, 1, 5, 7};
        for (int value : testValues) {
            System.out.println(value + "! = " + factorial(value));
        }
    }
    public static int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным.");
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
