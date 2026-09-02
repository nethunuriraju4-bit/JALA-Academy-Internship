public class StaticVariablesInInstance {

    // Static variables
    static int number1 = 10;
    static int number2 = 20;

    // Instance method
    void printStaticVariables() {
        System.out.println("Static Variable 1: " + number1);
        System.out.println("Static Variable 2: " + number2);
    }

    public static void main(String[] args) {

        // Create object to call instance method
        StaticVariablesInInstance obj = new StaticVariablesInInstance();

        obj.printStaticVariables();
    }
}