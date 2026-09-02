interface Animal {

    // One abstract method
    void sound();
}

// Implementing the interface
class Dog implements Animal {

    // Implementing the interface method
    public void sound() {
        System.out.println("Dog makes sound");
    }

    public static void main(String[] args) {

        Dog obj = new Dog();

        // Call implemented method
        obj.sound();
    }
}