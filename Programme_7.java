package Homework_week_2_DharaPatel;

import java.util.Scanner;

public class Programme_7 {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the temperature in Fahrenheit
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();

            // Close the scanner to avoid resource leak
            scanner.close();

            // Convert Fahrenheit to Celsius
            double celsius = convertToFahrenheit(fahrenheit);

            // Display the temperature in Celsius
            System.out.println(fahrenheit + "°F is equal to " + celsius + "°C");
        }

        // Method to convert temperature from Fahrenheit to Celsius
        public static double convertToFahrenheit(double fahrenheit) {

            double celsius = (fahrenheit - 32) * 5 / 9;
            return celsius;
        }
    }

