package Homework_week_2_DharaPatel;

import java.util.Scanner;

public class Programme_10 {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a number
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            // Close the scanner to avoid resource leak
            scanner.close();

            // Print the multiplication table
            System.out.println("Multiplication table for " + number + ":");

            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }

