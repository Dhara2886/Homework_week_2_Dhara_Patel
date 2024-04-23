package Homework_week_2_DharaPatel;

public class Programme_3 {
    // Declare instance and static variable
    // IV is instance variable
    // SV is static variable

    private static String SV = "Software Testing";
    int IV = 2024;

    // Declare instance method
    public void printVariables() {
        // Step 3.4: Call both instance and static variables into instance method inside the print statement
        System.out.println("Instance Variable: " + IV);
        System.out.println("Static Variable: " + SV);
    }

    // Declare static method
    public static void printStaticVariables() {
        // Step 3.4: Call both instance and static variables into static method inside the print statement
        // Note: Instance variables cannot be accessed directly from static context, so we need an instance of the class
        Programme_3 example = new Programme_3();
        System.out.println("Instance Variable: " + example.IV);
        System.out.println("Static Variable: " + SV);
    }

    // Declare the Main method
    public static void main(String[] args) {
        // Call both instance and static methods into the Main method and run the program
        Programme_3 example = new Programme_3();
        example.printVariables(); // Call instance method
        printStaticVariables(); // Call static method
    }
}

