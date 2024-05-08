public class date {
    private int month;
    private int day;
    private int year;

    private static final String[] MONTH_NAMES = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    public date(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public date(String monthName, int day, int year) {
        this.month = monthToInt(monthName);
        this.day = day;
        this.year = year;
    }

    public date(int dayOfYear, int year) {
        this.year = year;
        int[] daysPerMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int totalDays = 0;
        int monthIndex = 0;
        while (totalDays + daysPerMonth[monthIndex] < dayOfYear) {
            totalDays += daysPerMonth[monthIndex];
            monthIndex++;
        }
        this.month = monthIndex + 1;
        this.day = dayOfYear - totalDays;
    }

    private int monthToInt(String monthName) {
        for (int i = 0; i < MONTH_NAMES.length; i++) {
            if (MONTH_NAMES[i].equalsIgnoreCase(monthName)) {
                return i + 1;
            }
        }
        throw new IllegalArgumentException("Invalid month name: " + monthName);
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public String toStringMMDDYYYY() {
        return String.format("%02d/%02d/%04d", month, day, year);
    }

    public String toStringMonthDDYYYY() {
        return MONTH_NAMES[month - 1] + " " + day + ", " + year;
    }

    public String toStringDDDYYYY() {
        int dayOfYear = dayOfYear();
        return String.format("%d %04d", dayOfYear, year);
    }

    private int dayOfYear() {
        int dayOfYear = day;
        int[] daysPerMonth = {31, isLeapYear(year) ? 29 : 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        for (int i = 0; i < month - 1; i++) {
            dayOfYear += daysPerMonth[i];
        }
        return dayOfYear;
    }
}
