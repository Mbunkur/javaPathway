public class ExceptionPropagationDemo {
    public static void main(String[] args) {
        try {
            methodWithInnerTry();
        } catch (Exception e) {
            System.out.println("Exception caught in main: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void methodWithInnerTry() {
        try {
            System.out.println("In methodWithInnerTry");
            someMethod();
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught in methodWithInnerTry: " + e.getMessage());
        }
    }

    public static void someMethod() throws Exception {
        System.out.println("In someMethod");
        if (true) {
            throw new Exception("Exception thrown in someMethod");
        }
    }
}

