import java.io.IOException;

public class ExceptionTest {
    public static void main(String[] args) {
        // ExceptionA
        try {
            throw new ExceptionA("ExceptionA occurred");
        } catch (Exception exception) {
            System.out.println("Caught exception: " + exception.getMessage());
        }

        // ExceptionB
        try {
            throw new ExceptionB("ExceptionB occurred");
        } catch (Exception exception) {
            System.out.println("Caught exception: " + exception.getMessage());
        }

        // NullPointerException
        try {
            throw new NullPointerException("NullPointerException occurred");
        } catch (Exception exception) {
            System.out.println("Caught exception: " + exception.getMessage());
        }

        // IOException
        try {
            throw new IOException("IOException occurred");
        } catch (Exception exception) {
            System.out.println("Caught exception: " + exception.getMessage());
        }
    }
}

