import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.sql.SQLException;

// Q6 - User-defined exception
class MyException extends Exception {
    MyException(String message) {
        super(message);
    }
}

public class AllExceptions {

    // Q3 - Method which throws exception
    static void throwException() throws Exception {
        throw new Exception("Exception thrown from method");
    }

    public static void main(String[] args) {

        // 
        // Q1. Generate Arithmetic Exception without handling
        // 
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Q1: ArithmeticException generated");
        }


        // 
        // Q2. Handle Arithmetic Exception using try-catch
        // 
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Q2: ArithmeticException handled");
        }


        // 
        // Q3. Method which throws exception
        // 
        try {
            throwException();
        } catch (Exception e) {
            System.out.println("Q3: " + e.getMessage());
        }


        // 
        // Q4. Program with multiple catch blocks
        // 
        try {
            int[] numbers = {10, 20, 30};
            System.out.println(numbers[5]);
        } catch (ArithmeticException e) {
            System.out.println("Q4: ArithmeticException");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Q4: ArrayIndexOutOfBoundsException");
        } catch (Exception e) {
            System.out.println("Q4: General Exception");
        }


        // 
        // Q5. Throw exception with your own message
        // 
        try {
            throw new Exception("This is my own exception message");
        } catch (Exception e) {
            System.out.println("Q5: " + e.getMessage());
        }


        // 
        // Q6. Create your own exception
        // 
        try {
            throw new MyException("This is my custom exception");
        } catch (MyException e) {
            System.out.println("Q6: " + e.getMessage());
        }


        // 
        // Q7. Program with finally block
        // 
        try {
            System.out.println("Q7: Try block executed");
        } catch (Exception e) {
            System.out.println("Q7: Exception occurred");
        } finally {
            System.out.println("Q7: Finally block executed");
        }


        // 
        // Q8. Generate ArithmeticException
        // 
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Q8: ArithmeticException generated");
        }


        // 
        // Q9. Generate ArrayIndexOutOfBoundsException
        // 
        try {
            int[] arr = {10, 20, 30};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Q9: ArrayIndexOutOfBoundsException generated");
        }


        // 
        // Q10. Generate ClassNotFoundException
        // 
        try {
            Class.forName("UnknownClass");
        } catch (ClassNotFoundException e) {
            System.out.println("Q10: ClassNotFoundException generated");
        }


        // 
        // Q11. Generate FileNotFoundException
        // 
        try {
            FileInputStream file = new FileInputStream("abc.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Q11: FileNotFoundException generated");
        }


        // 
        // Q12. Generate IOException
        // 
        try {
            throw new IOException("IO Exception generated");
        } catch (IOException e) {
            System.out.println("Q12: IOException generated");
        }


        // 
        // Q13. Generate NoSuchFieldException
        // 
        try {
            Field field = AllExceptions.class.getDeclaredField("unknownField");
        } catch (NoSuchFieldException e) {
            System.out.println("Q13: NoSuchFieldException generated");
        }


        // 
        // Q14. Generate NoSuchMethodException
        //
        try {
            Method method = AllExceptions.class.getDeclaredMethod("unknownMethod");
        } catch (NoSuchMethodException e) {
            System.out.println("Q14: NoSuchMethodException generated");
        }


        // 
        // Q15. Generate NullPointerException
        // 
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Q15: NullPointerException generated");
        }


        // 
        // Q16. Generate NumberFormatException
        // 
        try {
            int number = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println("Q16: NumberFormatException generated");
        }


        // 
        //      // Q17. Generate StringIndexOutOfBoundsException
        // 
        try {
            String text = "Hello";
            System.out.println(text.charAt(10));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Q17: StringIndexOutOfBoundsException generated");
        }


        // 
        // Q18. Generate SQLException
        // 
        try {
            throw new SQLException("SQL Exception generated");
        } catch (SQLException e) {
            System.out.println("Q18: SQLException generated");
        }
    }
}