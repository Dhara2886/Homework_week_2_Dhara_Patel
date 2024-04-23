package Homework_week_2_DharaPatel;

import java.util.Scanner;

public class Programme_8 {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter the base and height of the triangle
            System.out.print("Enter the base of the triangle: ");
            double base = scanner.nextDouble();

            System.out.print("Enter the height of the triangle: ");
            double height = scanner.nextDouble();

            // Close the scanner to avoid resource leak
            scanner.close();

            // Calculate the area of the triangle
            double area = calculateTriangleArea(base, height);

            // Display the area of the triangle
            System.out.println("The area of the triangle with base " + base + " and height " + height + " is: " + area);
        }

        // Method to calculate the area of a triangle
        public static double calculateTriangleArea(double base, double height) {

            double area = 0.5 * base * height;
            return area;
        }
    }


