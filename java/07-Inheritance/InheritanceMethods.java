class A {

    // 2 methods specific to A
    void methodA1() {
        System.out.println("Method A1");
    }

    void methodA2() {
        System.out.println("Method A2");
    }

    // Common method
    void display() {
        System.out.println("Display method of A");
    }
}

class B extends A {

    // 2 methods specific to B
    void methodB1() {
        System.out.println("Method B1");
    }

    void methodB2() {
        System.out.println("Method B2");
    }

    // Overriding common method
    @Override
    void display() {
        System.out.println("Display method of B");
    }
}

class C extends B {

    // 2 methods specific to C
    void methodC1() {
        System.out.println("Method C1");
    }

    void methodC2() {
        System.out.println("Method C2");
    }

    // Overriding common method
    @Override
    void display() {
        System.out.println("Display method of C");
    }
}

public class InheritanceMethods {

    public static void main(String[] args) {

        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.methodA1();
        objA.methodA2();
        objA.display();

        objB.methodB1();
        objB.methodB2();
        objB.display();

        objC.methodC1();
        objC.methodC2();
        objC.display();
    }
}