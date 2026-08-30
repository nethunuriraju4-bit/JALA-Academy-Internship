public class IncrementDecrement {

    static void incrementDecrement(int a) {
        System.out.println("Increment: " + (++a));
        System.out.println("Decrement: " + (--a));
    }

    public static void main(String[] args) {
        incrementDecrement(10);
    }
}