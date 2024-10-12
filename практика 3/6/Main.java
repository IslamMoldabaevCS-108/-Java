public class Main {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    
    public static void main(String[] args) {
        int result1 = multiply(5, 3);
        System.out.println("5 * 3 = " + result1);
        int result2 = multiply(2, 4, 6);
        System.out.println("2 * 4 * 6 = " + result2);
    }
}
