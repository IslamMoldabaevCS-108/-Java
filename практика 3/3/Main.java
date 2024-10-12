public class Main {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
    public static int findMax(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        System.out.println("Multiply 2 and 3: " + multiply(2, 3));   // 6
        System.out.println("Multiply 2, 3 and 4: " + multiply(2, 3, 4)); // 24

        int[] array1 = {1, 5, 3, 9, 2};
        int[] array2 = {-10, -5, -1, -7};
        int[] array3 = {42};

        System.out.println("Max in array1: " + findMax(array1)); // 9
        System.out.println("Max in array2: " + findMax(array2)); // -1
        System.out.println("Max in array3: " + findMax(array3)); // 42
    }
}
