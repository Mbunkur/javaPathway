public class VariableLengthArgument {
    public static void main(String[] args) {
        // Test method with different number of arguments
        System.out.println("Product of 2, 3, and 4: " + product(2, 3, 4));
        System.out.println("Product of 5 and 6: " + product(5, 6));
        System.out.println("Product of 7, 8, 9, and 10: " + product(7, 8, 9, 10));
    }

    // Method to calculate the product of integers using a variable-length argument list
    public static int product(int... numbers) {
        int result = 1;
        for (int num : numbers) {
            result *= num;
        }
        return result;
    }
}
