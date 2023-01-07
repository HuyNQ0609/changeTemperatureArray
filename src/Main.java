import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double degreeF;
        double degreeC;
        int choice;
        do {
            System.out.println("Menu.");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter fahrenheit: ");
                    degreeF = input.nextDouble();
                    System.out.println("Fahrenheit to Celsius: " + fromFtoC(degreeF));
                }
                case 2 -> {
                    System.out.println("Enter Celsius: ");
                    degreeC = input.nextDouble();
                    System.out.println("Celsius to Fahrenheit: " + fromCtoF(degreeC));
                }
                case 0 -> System.exit(0);
            }
        } while (true);
    }
    public static double fromCtoF(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }
    public static double fromFtoC(double fahrenheit) {
        return (5.0 / 9) * (fahrenheit - 32);
    }
}
