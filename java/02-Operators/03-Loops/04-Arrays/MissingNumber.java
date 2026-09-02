public class MissingNumber {

    static int findMissingNumber(int[] arr) {
        int n = 100;

        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int value : arr) {
            actualSum += value;
        }

        return expectedSum - actualSum;
    }

    public static void main(String[] args) {

        int[] arr = new int[99];

        int index = 0;

        // Creating array from 1 to 100 except 50
        for (int i = 1; i <= 100; i++) {
            if (i != 50) {
                arr[index] = i;
                index++;
            }
        }

        int missing = findMissingNumber(arr);

        System.out.println("Missing number: " + missing);
    }
}