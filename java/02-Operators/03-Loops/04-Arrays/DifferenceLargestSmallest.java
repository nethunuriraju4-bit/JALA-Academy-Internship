public class DifferenceLargestSmallest {

    static int findDifference(int[] arr) {
        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }

            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        return largest - smallest;
    }

    public static void main(String[] args) {

        int[] arr = {10, 50, 20, 5, 40};

        int difference = findDifference(arr);

        System.out.println("Difference between largest and smallest: " + difference);
    }
}