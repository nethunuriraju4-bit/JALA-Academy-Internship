class Parent {

    // Default constructor
    Parent() {
        System.out.println("Parent default constructor called");
    }

    // Argument constructor
    Parent(String name) {
        System.out.println("Parent argument constructor called");
        System.out.println("Name: " + name);
    }
}

class Child extends Parent {

    // Child default constructor
    Child() {
        super();  // Calls Parent default constructor
        System.out.println("Child default constructor called");
    }

    // Child argument constructor
    Child(String name) {
        super(name);  // Calls Parent argument constructor
        System.out.println("Child argument constructor called");
    }
}

public class SuperConstructor {

    public static void main(String[] args) {

        // Calls Parent default constructor
        Child obj1 = new Child();

        System.out.println();

        // Calls Parent argument constructor
        Child obj2 = new Child("Raju");
    }
}