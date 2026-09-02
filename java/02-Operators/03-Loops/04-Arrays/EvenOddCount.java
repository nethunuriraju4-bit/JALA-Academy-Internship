public class EvenOddCount {

    static void countEvenOdd(int[] arr) {

        int evenCount = 0;
        int oddCount = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }

    public static void main(String[] args) {

        int[] arr = {10, 15, 20, 25, 30, 35};

        countEvenOdd(arr);
    }
}