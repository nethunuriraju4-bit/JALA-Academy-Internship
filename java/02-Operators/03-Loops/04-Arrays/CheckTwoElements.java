public class CheckTwoElements {

    static boolean containsElements(int[] arr, int a, int b) {
        boolean foundA = false;
        boolean foundB = false;

        for (int value : arr) {
            if (value == a) {
                foundA = true;
            }
            if (value == b) {
                foundB = true;
            }
        }

        return foundA && foundB;
    }

    public static void main(String[] args) {

        int[] arr = {10, 12, 20, 23, 30};

        if (containsElements(arr, 12, 23)) {
            System.out.println("Array contains both 12 and 23");
        } else {
            System.out.println("Array does not contain both 12 and 23");
        }
    }
}