public class InstanceMethodsInStatic {

    // Instance methods
    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    // Static method
    static void callInstanceMethods() {

        // Create object to call instance methods
        InstanceMethodsInStatic obj = new InstanceMethodsInStatic();

        obj.instanceMethod1();
        obj.instanceMethod2();
    }

    public static void main(String[] args) {
        callInstanceMethods();
    }
}