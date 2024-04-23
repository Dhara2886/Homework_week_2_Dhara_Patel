package Homework_week_2_DharaPatel;

import java.util.Scanner;

public class Programme_6 {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the radius of the circle
            System.out.print("Enter the radius of the circle: ");
            double radius = scanner.nextDouble();

            // Close the scanner to avoid resource leak
            scanner.close();

            // Calculate the area of the circle
            double area = calculateArea(radius);

            // Display the area of the circle
            System.out.println("The area of the circle with radius " + radius + " is: " + area);
        }

        // Method to calculate the area of a circle
        public static double calculateArea(double radius) {
            // Formula: A = PI * r^2
            double area = Math.PI * radius * radius;
            return area;
        }
    }


