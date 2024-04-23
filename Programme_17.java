package Homework_week_2_DharaPatel;

import java.util.Scanner;

public class Programme_17 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Input a Decimal Number: ");
            int decimalNumber = scanner.nextInt();
            scanner.close();


            String binaryNumber = decimalToBinary(decimalNumber);

            System.out.println("Binary number is: " + binaryNumber);
        }

        public static String decimalToBinary(int decimal) {
            return Integer.toBinaryString(decimal);
        }
    }


