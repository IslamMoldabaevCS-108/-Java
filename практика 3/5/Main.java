public class Main {

    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        double avg1 = calculateAverage(10.0, 20.0, 30.0);
        double avg2 = calculateAverage(4.5, 3.2, 6.8);
        double avg3 = calculateAverage(0.0, -1.0, 1.0);

        System.out.println("Average of 10.0, 20.0, 30.0: " + avg1);
        System.out.println("Average of 4.5, 3.2, 6.8: " + avg2);
        System.out.println("Average of 0.0, -1.0, 1.0: " + avg3);
    }
}
