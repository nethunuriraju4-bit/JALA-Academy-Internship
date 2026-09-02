abstract class Animal {

    // Abstract method
    abstract void sound();

    // Non-abstract method
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Animal {

    // Implementing abstract method
    @Override
    void sound() {
        System.out.println("Dog makes sound");
    }

    public static void main(String[] args) {

        // Create object of child class
        Dog obj = new Dog();

        // Access non-abstract method
        obj.eat();
    }
}