interface Animal {

    // Two methods
    void sound();

    void eat();
}

// Implement only one method
abstract class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog makes sound");
    }

    // eat() is not implemented
}

// Child class implements the remaining method
class Puppy extends Dog {

    @Override
    public void eat() {
        System.out.println("Puppy is eating");
    }

    public static void main(String[] args) {

        Puppy obj = new Puppy();

        // Call the implemented method
        obj.sound();
    }
}