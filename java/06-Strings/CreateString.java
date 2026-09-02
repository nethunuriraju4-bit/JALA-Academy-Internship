public class CreateString {

    public static void main(String[] args) {

        // 1. Using String literal
        String str1 = "Hello";

        // 2. Using new keyword
        String str2 = new String("Welcome");

        // 3. Using character array
        char[] chars = {'J', 'A', 'V', 'A'};
        String str3 = new String(chars);

        // 4. Using byte array
        byte[] bytes = {65, 66, 67};
        String str4 = new String(bytes);

        System.out.println("Using String literal: " + str1);
        System.out.println("Using new keyword: " + str2);
        System.out.println("Using character array: " + str3);
        System.out.println("Using byte array: " + str4);
    }
}