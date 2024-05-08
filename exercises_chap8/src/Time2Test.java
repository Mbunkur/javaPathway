public class Time2Test {
    public static void main(String[] args) {
        Time2 time = new Time2(13, 30, 45);
        System.out.println("Time is: " + time); // Outputs: Time is: 13:30:45

        time.setTime(18, 45, 20);
        System.out.println("Updated time is: " + time); // Outputs: Updated time is: 18:45:20
    }
}
