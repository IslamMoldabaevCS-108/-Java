public class Main {

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
    public static void main(String[] args) {
        
        System.out.println("4 is even: " + isEven(4));   // true
        System.out.println("7 is even: " + isEven(7));   // false
        System.out.println("0 is even: " + isEven(0));   // true
        System.out.println("-2 is even: " + isEven(-2)); // true
        System.out.println("15 is even: " + isEven(15)); // false
    }
}
