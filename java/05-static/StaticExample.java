public class StaticExample {

    // 2 static variables
    static int staticVar1 = 10;
    static int staticVar2 = 20;

    // 2 instance variables
    int instanceVar1 = 30;
    int instanceVar2 = 40;

    // 2 static methods
    static void staticMethod1() {
        System.out.println("Static Method 1");
    }

    static void staticMethod2() {
        System.out.println("Static Method 2");
    }

    // 2 instance methods
    void instanceMethod1() {
        System.out.println("Instance Method 1");
    }

    void instanceMethod2() {
        System.out.println("Instance Method 2");
    }

    // Main method
    public static void main(String[] args) {

        StaticExample obj = new StaticExample();

        System.out.println("Static Variable 1: " + staticVar1);
        System.out.println("Static Variable 2: " + staticVar2);

        System.out.println("Instance Variable 1: " + obj.instanceVar1);
        System.out.println("Instance Variable 2: " + obj.instanceVar2);

        staticMethod1();
        staticMethod2();

        obj.instanceMethod1();
        obj.instanceMethod2();
    }
}