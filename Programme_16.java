package Homework_week_2_DharaPatel;

import java.util.Scanner;

public class Programme_16 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Input first binary number: ");
            String binary1 = scanner.nextLine();

            System.out.print("Input second binary number: ");
            String binary2 = scanner.nextLine();

            scanner.close();

            // Convert the binary numbers to integers and add them
            int sum = binaryToDecimal(binary1) + binaryToDecimal(binary2);

            // Convert the sum back to binary
            String binarySum = decimalToBinary(sum);

            // Print the sum of the two binary numbers
            System.out.println("Sum of two binary numbers: " + binarySum);
        }

        // Method to convert a binary number to decimal
        public static int binaryToDecimal(String binary) {
            return Integer.parseInt(binary, 2);
        }

        // Method to convert a decimal number to binary
        public static String decimalToBinary(int decimal) {
            return Integer.toBinaryString(decimal);
        }
    }


