public class StaticMethodsInInstance {

    // Static methods
    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    // Instance method
    void callStaticMethods() {
        staticMethod1();
        staticMethod2();
    }

    public static void main(String[] args) {

        // Create object to call instance method
        StaticMethodsInInstance obj = new StaticMethodsInInstance();

        obj.callStaticMethods();
    }
}