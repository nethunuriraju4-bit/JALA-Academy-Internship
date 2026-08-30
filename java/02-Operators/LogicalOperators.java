public class LogicalOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Logical AND: " + (a < b && b > a));
        System.out.println("Logical OR: " + (a > b || b > a));
        System.out.println("Logical NOT: " + !(a > b));
    }
}