public class ExceptionTest {
    public static void main(String[] args) {
        try {
            throw new ExceptionB("ExceptionB occurred");
        } catch (ExceptionA e) { // This catch block will catch ExceptionA and its subclasses
            System.out.println("Caught ExceptionA: " + e.getMessage());
        } catch (ExceptionB e) { // This catch block will be unreachable
            System.out.println("Caught ExceptionB: " + e.getMessage());
        }
    }
}

