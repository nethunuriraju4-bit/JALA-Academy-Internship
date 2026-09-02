public class InstanceVariablesInStatic {

    // Instance variables
    int number1 = 10;
    int number2 = 20;

    // Static method
    static void printInstanceVariables() {

        // Create object to access instance variables
        InstanceVariablesInStatic obj = new InstanceVariablesInStatic();

        System.out.println("Instance Variable 1: " + obj.number1);
        System.out.println("Instance Variable 2: " + obj.number2);
    }

    public static void main(String[] args) {
        printInstanceVariables();
    }
}