class Student {

    // Default fields
    int age = 20;
    String name = "Raju";

    // Default method
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class DefaultAccess {

    public static void main(String[] args) {

        // Create object of Student class
        Student obj = new Student();

        // Access default fields
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);

        // Access default method
        obj.display();
    }
}