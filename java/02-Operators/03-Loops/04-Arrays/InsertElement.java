public class InsertElement {

    static void insertElement(int[] arr, int element, int position) {
        int[] newArray = new int[arr.length + 1];

        for (int i = 0; i < position; i++) {
            newArray[i] = arr[i];
        }

        newArray[position] = element;

        for (int i = position; i < arr.length; i++) {
            newArray[i + 1] = arr[i];
        }

        System.out.print("Array after insertion: ");

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        insertElement(arr, 25, 2);
    }
}