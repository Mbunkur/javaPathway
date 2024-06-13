public class ExceptionTest {
    public static void main(String[] args) {
        try {
            throw new ExceptionB("ExceptionB occurred");
        } catch (ExceptionB e) { // Catch the most specific exception first
            System.out.println("Caught ExceptionB: " + e.getMessage());
        } catch (ExceptionA e) { // Then catch the more general exception
            System.out.println("Caught ExceptionA: " + e.getMessage());
        }
    }
}

