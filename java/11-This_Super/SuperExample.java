class Parent {

    // Parent class instance variables
    int age = 40;
    String name = "Father";
}

class Child extends Parent {

    // Child class instance variables
    int age = 20;
    String name = "Son";

    void display() {

        // Using super to access parent class variables
        System.out.println("Parent Age: " + super.age);
        System.out.println("Parent Name: " + super.name);
    }
}

public class SuperExample {

    public static void main(String[] args) {

        Child obj = new Child();

        obj.display();
    }
}