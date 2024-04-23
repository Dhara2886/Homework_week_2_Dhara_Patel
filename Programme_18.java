package Homework_week_2_DharaPatel;

import java.util.Scanner;

public class Programme_18 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            scanner.close();

            // Perform arithmetic operations
            double sum = num1 + num2;
            double multiply = num1 * num2;
            double subtract = num1 - num2;
            double divide = num1 / num2;
            double remainder = num1 % num2;

            // Print the results
            System.out.println(num1 + " + " + num2 + " = " + sum);
            System.out.println(num1 + " - " + num2 + " = " + subtract);
            System.out.println(num1 + " x " + num2 + " = " + multiply);
            System.out.println(num1 + " / " + num2 + " = " + divide);
            System.out.println(num1 + " mod " + num2 + " = " + remainder);
        }
    }


