public class RemoveDuplicatesNewArray {

    static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];
        int newSize = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < newSize; j++) {
                if (arr[i] == temp[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                temp[newSize] = arr[i];
                newSize++;
            }
        }

        int[] newArray = new int[newSize];

        for (int i = 0; i < newSize; i++) {
            newArray[i] = temp[i];
        }

        return newArray;
    }

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40};

        int[] newArray = removeDuplicates(arr);

        System.out.print("New array after removing duplicates: ");

        for (int value : newArray) {
            System.out.print(value + " ");
        }
    }
}