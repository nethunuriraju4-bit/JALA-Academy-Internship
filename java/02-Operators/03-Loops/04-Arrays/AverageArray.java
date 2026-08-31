public class AverageArray {

    static void averageArray(int[] numbers) {
        int sum = 0;

        for (int number : numbers) {
            sum = sum + number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Average of array values: " + average);
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        averageArray(numbers);
    }
}
