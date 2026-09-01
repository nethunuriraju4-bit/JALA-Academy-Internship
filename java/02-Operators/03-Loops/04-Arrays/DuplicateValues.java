public class DuplicateValues {

    static void findDuplicates(int[] arr) {
        System.out.print("Duplicate values: ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 20, 40, 10, 50};

        findDuplicates(arr);
    }
}