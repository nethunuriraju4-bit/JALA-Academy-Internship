public class PrintAllVariables {

    // Static variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // Instance variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    public static void main(String[] args) {

        // Create object to access instance variables
        PrintAllVariables obj = new PrintAllVariables();

        // Print static variables
        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

        // Print instance variables
        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);
    }
}