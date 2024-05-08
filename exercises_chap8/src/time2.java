public class time2 {
    private int hour;
    private int minute;
    private int second;

    public time2() {
        this(0, 0, 0);
    }

    public time2(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60 || second < 0 || second >= 60) {
            throw new IllegalArgumentException("hour, minute, and/or second out of range");
        }

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void tick() {
        second++;
        if (second >= 60) {
            second = 0;
            incrementMinute();
        }
    }

    public void incrementMinute() {
        minute++;
        if (minute >= 60) {
            minute = 0;
            incrementHour();
        }
    }

    public void incrementHour() {
        hour++;
        if (hour >= 24) {
            hour = 0;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
}
