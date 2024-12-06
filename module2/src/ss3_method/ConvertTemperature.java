package ss3_method;

import java.util.Scanner;

public class ConvertTemperature {
    public static double celsiusToFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static void main(String[] args) {
        System.out.println("----------Menu----------");
        System.out.println("1. Fahrenheit to Celsius");
        System.out.println("2. Celsius to Fahrenheit");
        System.out.println("0. Exit");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Enter fahrenheit: ");
                double fahrenheit = sc.nextDouble();
                System.out.print("Fahrenheit to Celsius: " + fahrenheitToCelsius(fahrenheit));
                break;
            case 2:
                System.out.print("Enter celsius: ");
                double celsius = sc.nextDouble();
                System.out.print("Celsius to Fahrenheit: " + celsiusToFahrenheit(celsius));
                break;
            case 0:
                System.exit(0);
        }
    }
}
