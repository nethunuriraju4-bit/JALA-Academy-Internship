class A {

    void methodA1() {
        System.out.println("Method A1");
    }

    void methodA2() {
        System.out.println("Method A2");
    }

    void display() {
        System.out.println("Display method of A");
    }
}

class B extends A {

    void methodB1() {
        System.out.println("Method B1");
    }

    void methodB2() {
        System.out.println("Method B2");
    }

    @Override
    void display() {
        System.out.println("Display method of B");
    }
}

class C extends B {

    void methodC1() {
        System.out.println("Method C1");
    }

    void methodC2() {
        System.out.println("Method C2");
    }

    @Override
    void display() {
        System.out.println("Display method of C");
    }
}

public class CallAllMethods {

    public static void main(String[] args) {

        // Object of A
        A objA = new A();
        objA.methodA1();
        objA.methodA2();
        objA.display();

        // Object of B
        B objB = new B();
        objB.methodA1();
        objB.methodA2();
        objB.methodB1();
        objB.methodB2();
        objB.display();

        // Object of C
        C objC = new C();
        objC.methodA1();
        objC.methodA2();
        objC.methodB1();
        objC.methodB2();
        objC.methodC1();
        objC.methodC2();
        objC.display();
    }
}