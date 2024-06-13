public class ExceptionTest {
    public static void main(String[] args) {
        try {
            // You can change this to throw new ExceptionB or new ExceptionC to test each case
            throw new ExceptionC("ExceptionC occurred");
        } catch (ExceptionA e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

