package Homework_week_2_DharaPatel;

public class Programme_2 {
    /**
     * Step 1: Declare two static variables
     * Step 2: Declare one static method
     * Step 3: Call both static variables into the static method inside the print statement
     * Step 4: Declare the Main method
     * Step 5: Call the static method into the Main method and Run the program
     */


        private static int a = 1986;
        private static String name = "Birth Year";


        public static void printStaticVariables() {

            System.out.println("Static Variable 1: " + a);
            System.out.println("Static Variable 2: " + name);
        }


        public static void main(String[] args) {
            Programme_2 obj = new Programme_2();
            obj.printStaticVariables();

            printStaticVariables();

    }

}

