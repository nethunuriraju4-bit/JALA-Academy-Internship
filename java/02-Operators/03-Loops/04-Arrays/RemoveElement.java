public class RemoveElement {

    static void removeElement(int[] arr, int element) {
        System.out.print("Array after removing " + element + ": ");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != element) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};

        removeElement(arr, 30);
    }
}