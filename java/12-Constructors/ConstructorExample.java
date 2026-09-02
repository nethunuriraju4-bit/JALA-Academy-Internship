class Student {

    // Default constructor
    Student() {
        System.out.println("Default constructor called");
    }

    // One-argument constructor
    Student(String name) {
        System.out.println("One-argument constructor called");
        System.out.println("Name: " + name);
    }

    // Two-argument constructor
    Student(String name, int age) {
        System.out.println("Two-argument constructor called");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ConstructorExample {

    public static void main(String[] args) {

        // Calling default constructor
        Student obj1 = new Student();

        // Calling one-argument constructor
        Student obj2 = new Student("Raju");

        // Calling two-argument constructor
        Student obj3 = new Student("Raju", 20);
    }
}