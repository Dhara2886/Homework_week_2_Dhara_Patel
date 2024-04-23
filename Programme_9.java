package Homework_week_2_DharaPatel;

import java.util.Scanner;

public class Programme_9 {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string in uppercase: ");
            String uppercaseString = scanner.nextLine();

            scanner.close();

            String lowercaseString = convertToLowercase(uppercaseString);

            System.out.println("The string in lowercase is: " + lowercaseString);
        }

        public static String convertToLowercase(String uppercaseString) {

            String lowercaseString = uppercaseString.toLowerCase();
            return lowercaseString;
        }
    }

