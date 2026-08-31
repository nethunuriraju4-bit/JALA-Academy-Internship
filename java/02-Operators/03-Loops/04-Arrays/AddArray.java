public class AddArray {

    static void addArray(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        System.out.println("Sum of array values: " + sum);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        addArray(numbers);
    }
}
