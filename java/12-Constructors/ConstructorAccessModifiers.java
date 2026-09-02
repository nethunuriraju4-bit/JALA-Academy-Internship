class ConstructorExample {

    // Private constructor
    private ConstructorExample() {
        System.out.println("Private constructor called");
    }

    // Public constructor
    public ConstructorExample(int a) {
        System.out.println("Public constructor called");
    }

    // Protected constructor
    protected ConstructorExample(String name) {
        System.out.println("Protected constructor called");
    }

    // Default constructor
    ConstructorExample(double value) {
        System.out.println("Default constructor called");
    }

    public static void main(String[] args) {

        // Private constructor can be called inside the same class
        ConstructorExample obj1 = new ConstructorExample();

        // Public constructor
        ConstructorExample obj2 = new ConstructorExample(10);

        // Protected constructor
        ConstructorExample obj3 = new ConstructorExample("Raju");

        // Default constructor
        ConstructorExample obj4 = new ConstructorExample(10.5);
    }
}