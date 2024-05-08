public class Time2 {
    private int seconds;

    public Time2() {
        this(0, 0, 0);
    }

    public Time2(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("hour, minute, and/or second out of range");
        }

        this.seconds = hour * 3600 + minute * 60 + second;
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", seconds / 3600, (seconds % 3600) / 60, seconds % 60);
    }
}
