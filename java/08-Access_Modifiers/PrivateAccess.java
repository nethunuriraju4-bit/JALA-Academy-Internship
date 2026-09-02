class Parent {

    // Private fields
    private int number = 10;
    private String name = "Raju";

    // Private method
    private void privateMethod() {
        System.out.println("Private method of Parent");
    }

    // Public method to access private members
    public void showPrivateMembers() {
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);

        privateMethod();
    }
}

// Subclass
class Child extends Parent {

    void tryToAccess() {

        // Private members cannot be accessed directly in subclass
        // System.out.println(number);       // ERROR
        // System.out.println(name);         // ERROR
        // privateMethod();                  // ERROR

        System.out.println("Private members cannot be accessed directly from Child.");
    }
}

public class PrivateAccess {

    public static void main(String[] args) {

        Parent obj = new Parent();

        // Access private members through public method
        obj.showPrivateMembers();

        Child child = new Child();
        child.tryToAccess();
    }
}