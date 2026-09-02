interface Animal {

    void sound();
}

class Dog implements Animal {

    @Override
    public void sound() {
        System.out.println("Dog makes sound");
    }

    public static void main(String[] args) {

        // Interface reference and object of implementing class
        Animal obj = new Dog();

        // Call implemented method
        obj.sound();
    }
}