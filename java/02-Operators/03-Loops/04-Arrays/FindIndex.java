public class FindIndex {

    static void findIndex(int[] numbers, int value) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                System.out.println("Index of " + value + ": " + i);
                return;
            }
        }

        System.out.println("Element not found");
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        findIndex(numbers, 30);
    }
}