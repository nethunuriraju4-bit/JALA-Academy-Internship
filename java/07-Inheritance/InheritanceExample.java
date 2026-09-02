class A {
    void methodA() {
        System.out.println("Method of Class A");
    }
}

class B extends A {
    void methodB() {
        System.out.println("Method of Class B");
    }
}

class C extends B {
    void methodC() {
        System.out.println("Method of Class C");
    }
}

public class InheritanceExample {

    public static void main(String[] args) {

        A objA = new A();
        B objB = new B();
        C objC = new C();

        objA.methodA();

        objB.methodA();
        objB.methodB();

        objC.methodA();
        objC.methodB();
        objC.methodC();
    }
}