public class MethodOverloadingQ1 {

    // Method with one parameter
    static void display(int a) {
        System.out.println("One parameter: " + a);
    }

    // Method with two parameters of the same type
    static void display(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }

    public static void main(String[] args) {

        // Calling method with one parameter
        display(10);

        // Calling method with two parameters
        display(10, 20);
    }
}