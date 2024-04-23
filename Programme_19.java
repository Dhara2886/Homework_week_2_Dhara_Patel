package Homework_week_2_DharaPatel;

import java.util.Scanner;

public class Programme_19 {

        public static void main(String[] args) {
            // Create a Scanner object to read input from the user
            Scanner scanner = new Scanner(System.in);

            // Prompt the user to enter a string
            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            // Close the scanner to avoid resource leak
            scanner.close();

            // Convert the input string to lowercase
            String lowercase = input.toLowerCase();

            // Print the lowercase string
            System.out.println("Output: " + lowercase);
        }
    }



