public class Main {
    public static void main(String[] args) {
        System.out.println("2^3 = " + power(2, 3));  // 8
        System.out.println("5^0 = " + power(5, 0));  // 1
        System.out.println("7^2 = " + power(7, 2));  // 49
        System.out.println("10^-2 = " + power(10, -2)); // 0.01
    }
    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 1 / power(a, -n);
        }
        return a * power(a, n - 1);
    }
}
