public class ConstructorTest {
    public static void main(String[] args) {
        try {
            // Attempt to create an object of SomeClass
            SomeClass obj = new SomeClass();
        } catch (Exception e) {
            // Catch the exception thrown by the SomeClass constructor
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

