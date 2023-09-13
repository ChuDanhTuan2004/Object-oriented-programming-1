import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahrenheit");
            System.out.println("0. Exit");
            System.out.print("Please enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Please enter the temperature in Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.println("The temperature in Celsius is " + celsius);
                    break;
                case 2:
                    System.out.print("Please enter the temperature in Celsius: ");
                    double celsius2 = scanner.nextDouble();
                    double fahrenheit2 = celsiusToFahrenheit(celsius2);
                    System.out.println("The temperature in Fahrenheit is " + fahrenheit2);
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println();

        } while (choice != 0);

        scanner.close();

    }

    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9 / 5) + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5 / 9;
        return celsius;
    }
}
