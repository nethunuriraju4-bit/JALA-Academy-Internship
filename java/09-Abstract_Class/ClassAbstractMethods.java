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

        // Create instance of child class
        Dog obj = new Dog();

        // Call abstract method
        obj.sound();
    }
}