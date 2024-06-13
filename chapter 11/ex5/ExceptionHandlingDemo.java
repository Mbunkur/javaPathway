public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        try {
            someMethod();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void someMethod() throws Exception {
        try {
            someMethod2();
        } catch (Exception e) {
            System.out.println("Exception caught in someMethod and rethrowing it");
            throw e; // Rethrow the exception
        }
    }

    public static void someMethod2() throws Exception {
        throw new Exception("Exception thrown in someMethod2");
    }
}

