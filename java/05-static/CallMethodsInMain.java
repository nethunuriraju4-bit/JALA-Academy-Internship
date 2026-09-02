public class CallMethodsInMain {

    // Static methods
    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    // Instance methods
    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    public static void main(String[] args) {

        // Call static methods directly
        staticMethod1();
        staticMethod2();

        // Create object to call instance methods
        CallMethodsInMain obj = new CallMethodsInMain();

        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}