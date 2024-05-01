public class SumCommandLineDoubles {
    public static void main(String[] args) {
        double sum = 0.0;

        // Loop through the command-line arguments and sum the double values
        for (String arg : args) {
            try {
                double value = Double.parseDouble(arg);
                sum += value;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg + ". Skipping...");
            }
        }

        // Display the sum of double values
        System.out.println("Sum of double values: " + sum);
    }
}
