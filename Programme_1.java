package Homework_week_2_DharaPatel;

public class Programme_1 {


        // Step 1: Declare two instance variables
         int variable1 = 2024;
         String variable2 = "Current Year";

        // Step 2: Declare one instance method
        public void printVariables() {
            // Step 3: Call both instance variables into the instance method inside the print statement
            System.out.println("Variable 1: " + variable1);
            System.out.println("Variable 2: " + variable2);
        }

        // Step 4: Declare the Main method
        public static void main(String[] args) {
            // Step 5: Call the above instance method into the Main method and Run the program
            Programme_1 instance = new Programme_1();
            instance.printVariables();

    }

}
