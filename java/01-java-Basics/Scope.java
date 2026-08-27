public class Scope {

    static int number = 100;   // Global variable

    public static void main(String[] args) {

        int number = 50;       // Local variable

        System.out.println("Local variable: " + number);
        System.out.println("Global variable: " + Scope.number);
    }
}