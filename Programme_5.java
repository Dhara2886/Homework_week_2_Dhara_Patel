package Homework_week_2_DharaPatel;

public class Programme_5 {

        // Instance methods

        // Addition method
        public String add(double num1, double num2) {
            double result = num1 + num2;
            return num1 + " + " + num2 + " = " + result;
        }

        // Subtraction method
        public String subtract(double num1, double num2) {
            double result = num1 - num2;
            return num1 + " - " + num2 + " = " + result;
        }

        // Static methods

        // Multiplication method
        public static String multiply(double num1, double num2) {
            double result = num1 * num2;
            return num1 + " * " + num2 + " = " + result;
        }

        // Division method
        public static String divide(double num1, double num2) {
            if (num2 == 0) {
                return "Cannot divide by zero!";
            }
            double result = num1 / num2;
            return num1 + " / " + num2 + " = " + result;
        }

        public static void main(String[] args) {
            // Creating an instance of Calculator class
            Programme_5 calculator = new Programme_5();

            // Testing instance methods
            System.out.println("Addition: " + calculator.add(10, 5));
            System.out.println("Subtraction: " + calculator.subtract(10, 5));

            // Testing static methods
            System.out.println("Multiplication: " + multiply(10, 5));
            System.out.println("Division: " + divide(10, 5));
        }
    }


