package Homework_week_2_DharaPatel;

public class Programme_4 {
    /**
     * Declare two instance and two static variables
     * Declare one instance method
     * Call all four instance and static variables into instance method inside the print statement
     * Declare one static method
     * Call all four instance and static variables into static method inside the print statement
     * Declare the Main method
     * Call both instance and static methods into the Main method and run the program
     */
    private static String SV1 = "Java";
    private static String SV2 = "Program";
    private int IV1 = 20;
    private int IV2 = 24;



    public void printVariables() {
        System.out.print("Static Variable 1: " + SV1);
        System.out.println("Static Variable 2: " + SV2);
        System.out.print("Instance Variable 1: " + IV1);
        System.out.println("Instance Variable 2: " + IV2);

    }


    public static void printStaticVariables() {


        System.out.print("Static Variable 1: " + SV1);
        System.out.println("Static Variable 2: " + SV2);
        Programme_4 method = new Programme_4();
        System.out.println("Instance Variable 1: " + method.IV1);
        System.out.print("Instance Variable 2: " + method.IV2);

    }


    public static void main(String[] args) {

        Programme_4 programme4 = new Programme_4();
        programme4.printVariables();
        printStaticVariables();
    }
}
