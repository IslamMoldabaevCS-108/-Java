public class Main {

    public static int sum(int a, int b) {
        return a + b;
    }


    public static void main(String[] args) {
        int result1 = sum(5, 3);
        int result2 = sum(-10, 25);
        int result3 = sum(0, 0);
        System.out.println("5 + 3 = " + result1);
        System.out.println("-10 + 25 = " + result2);
        System.out.println("0 + 0 = " + result3);
    }
}
