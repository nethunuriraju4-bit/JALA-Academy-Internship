import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.BufferedInputStream;

public class AllJavaIO {

    public static void main(String[] args) throws Exception {

        // Q1. Read text from .txt file using InputStream

        FileInputStream input = new FileInputStream("input.txt");

        int data;

        System.out.println("Q1: Reading using InputStream:");

        while ((data = input.read()) != -1) {
            System.out.print((char) data);
        }

        input.close();

        System.out.println("\n");


        // Q2. Write text to .txt file using OutputStream

        FileOutputStream output = new FileOutputStream("output.txt");

        String text = "Hello, this text is written using OutputStream.";

        output.write(text.getBytes());

        output.close();

        System.out.println("Q2: Text written to output.txt successfully.");

        System.out.println();


        // Q3. Read text from .txt file using BufferedInputStream

        BufferedInputStream bufferedInput =
                new BufferedInputStream(new FileInputStream("input.txt"));

        System.out.println("Q3: Reading using BufferedInputStream:");

        while ((data = bufferedInput.read()) != -1) {
            System.out.print((char) data);
        }

        bufferedInput.close();
    }
}