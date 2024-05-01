public class Array7_11 {
    public static void main(String[] args) {
        // Set the 10 elements of integer array counts to zero
        int[] counts = new int[10];
        for (int i = 0; i < counts.length; i++) {
            counts[i] = 0;
        }

        // Add one to each of the 15 elements of integer array bonus
        int[] bonus = new int[15];
        for (int i = 0; i < bonus.length; i++) {
            bonus[i]++;
        }

        // Display the five values of integer array bestScores in column format
        int[] bestScores = {90, 85, 95, 88, 92};
        System.out.println("Best Scores:");
        for (int score : bestScores) {
            System.out.println(score);
        }
    }
}
