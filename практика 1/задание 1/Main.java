public class Main {
    public static void main(String[] args) {
        int a = 10;
        double b = 20.5;
        float c = 5.5f;
        char e = 'A';
        String f = "Hello";
        int sum = a + 5;
        double difference = b - c;
        double product = a * b;
        double division = b / a;
        int modulus = a % 3;
        boolean isGreater = false;
        boolean isEqual = true;
        boolean logicalAnd = true;
        boolean logicalOr = true;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Деление: " + division);
        System.out.println("Остаток от деления: " + modulus);
        System.out.println("Переменная a больше b: " + isGreater);
        System.out.println("Переменная a равна 10: " + isEqual);
        System.out.println("Логическое И: " + logicalAnd);
        System.out.println("Логическое ИЛИ: " + logicalOr);
        System.out.println("Символ: " + e);
        System.out.println("Строка: " + f);
    }
}