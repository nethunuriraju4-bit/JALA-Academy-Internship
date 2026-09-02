abstract class Animal {

    // Abstract method
    abstract void sound();

    // Non-abstract method
    void eat() {
        System.out.println("Animal is eating");
    }
}

public class AbstractExample {

    public static void main(String[] args) {
        System.out.println("Abstract class created with abstract and non-abstract methods.");
    }
}