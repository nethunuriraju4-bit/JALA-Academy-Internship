class Student {

    // Instance fields
    int age = 20;
    String name = "Raju";

    void display() {

        // Using this
        System.out.println("Using this - Age: " + this.age);
        System.out.println("Using this - Name: " + this.name);

        // Without using this/object
        System.out.println("Without this - Age: " + age);
        System.out.println("Without this - Name: " + name);
    }
}

public class ThisExample {

    public static void main(String[] args) {

        Student student = new Student();

        student.display();
    }
}