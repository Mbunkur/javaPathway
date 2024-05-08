public class time2test {
    public static void main(String[] args) {
        // Testing incrementing into the next minute
        time2 time1 = new time2(11, 59, 58);
        System.out.println("Current time: " + time1);
        time1.tick(); // incrementing into the next minute
        System.out.println("After tick: " + time1);

        // Testing incrementing into the next hour
        time2 time2 = new time2(12, 59, 58);
        System.out.println("\nCurrent time: " + time2);
        time2.tick(); // incrementing into the next minute
        System.out.println("After tick: " + time2);

        // Testing incrementing into the next day
        time2 time3 = new time2(23, 59, 58);
        System.out.println("\nCurrent time: " + time3);
        time3.tick(); // incrementing into the next minute
        System.out.println("After tick: " + time3);
    }
}
