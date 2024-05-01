public class CommandLineArguments {
    public static void main(String[] args) {
        int arraySize; // Size of the array

        // Check if a command-line argument is provided
        if (args.length > 0) {
            // Parse the first command-line argument as an integer
            arraySize = Integer.parseInt(args[0]);
        } else {
            // Use 10 as the default size if no command-line argument is provided
            arraySize = 10;
        }

        // Create the array with the specified size
        int[] array = new int[arraySize];

        // Initialize elements of the array with even values
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i;
        }

        System.out.printf("%s%8s%n", "Index", "Value");

        // Display the array elements
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d%8d%n", i, array[i]);
        }
    }
}
