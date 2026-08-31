public class ContainsValue {

    static void checkValue(int[] numbers, int value) {
        boolean found = false;

        for (int number : numbers) {
            if (number == value) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Array contains " + value);
        } else {
            System.out.println("Array does not contain " + value);
        }
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        checkValue(numbers, 30);
    }
}