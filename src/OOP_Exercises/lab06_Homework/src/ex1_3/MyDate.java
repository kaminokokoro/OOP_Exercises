package OOP_Exercises.lab06_Homework.src.ex1_3;

import java.time.MonthDay;

public class MyDate {
    private int year;
    private int month;
    private int day;
    public final String[] MONTHS = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public final String[] DAYS = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public final int[] DAYS_IN_MONTHS = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static final int MIN_YEAR = 1;
    private static final int MAX_YEAR = 9999;

    private static final int MIN_MONTH = 1;
    private static final int MAX_MONTH = 12;

    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int monthDays = DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        return 1 <= day && day <= monthDays;
    }

    public int getDayOfWeek(int year, int month, int day) {
        int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
        int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int magicYearNumber = lastTwoDigitsOfYear / 4;
        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];
        int magicDayNumber = day;
        return (magicCenturyNumber + lastTwoDigitsOfYear + magicYearNumber + magicMonthNumber + magicDayNumber) % 7;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setDate(int year, int month, int day) {
        if (!isValidDate(year, month, day)) {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year < 1 || year > 9999) {
            throw new IllegalArgumentException("Invalid year!");
        }
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month!");
        }
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (1 > day || day > getMonthLastDay(this.year, this.month)) {
            throw new IllegalArgumentException("Invalid day!");
        }
        this.day = day;
    }

    @Override
    public String toString() {
        if (!isValidDate(year, 2, day)) {
            return "Not a valid date!";
        }
        int d = getDayOfWeek(year, 2, day);
        return DAYS[d] + " " + day + " " + MONTHS[2 - 1] + " " + year;
    }

    public int getMonthLastDay(int year, int month) {
        return DAYS_IN_MONTHS[month - 1] + (isLeapYear(year) && month == 2 ? 1 : 0);
    }

    public MyDate nextDay() {
        int monthDays = DAYS_IN_MONTHS[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        int maxDay = getMonthLastDay(year, month);
        if (maxDay == day && 12 == month && 9999 == year) {
            return this;
        }

        if (maxDay == day && 12 == month) {
            setDate(year + 1, 1, 1);
            return this;
        }

        if (maxDay == day) {
            setDate(year, month + 1, 1);
            return this;
        }

        setDate(year, month, day + 1);
        return this;
    }

    public MyDate nextMonth() {
        if (MAX_MONTH == month && MAX_YEAR == year) {
            return this;
        }

        int maxDay = (MAX_MONTH == month)
                ? getMonthLastDay(year + 1, MIN_MONTH)
                : getMonthLastDay(year, month + 1);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        if (MAX_MONTH == month) {
            setDate(year + 1, MIN_MONTH, maxDay);
            return this;
        }

        setDate(year, month + 1, maxDay);
        return this;
    }

    public MyDate nextYear() {
        if (MAX_YEAR == year) {
            return this;
        }

        int maxDay = getMonthLastDay(year + 1, month);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year + 1, month, maxDay);
        return this;
    }

    public MyDate previousDay() {
        if (1 == day && MIN_MONTH == month && MIN_YEAR == year) {
            return this;
        }

        if (1 == day && MIN_MONTH == month) {
            setDate(year - 1, MAX_MONTH, getMonthLastDay(year - 1, MAX_MONTH));
            return this;
        }

        if (1 == day) {
            setDate(year, month - 1, getMonthLastDay(year, month - 1));
            return this;
        }

        setDate(year, month, --day);
        return this;
    }

    public MyDate previousMonth() {
        if (MIN_MONTH == month && MIN_YEAR == year) {
            return this;
        }

        int maxDay = (MIN_MONTH == month)
                ? getMonthLastDay(year - 1, MAX_MONTH)
                : getMonthLastDay(year, month - 1);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        if (MIN_MONTH == month) {
            setDate(year - 1, MAX_MONTH, maxDay);
            return this;
        }

        setDate(year, month - 1, maxDay);
        return this;
    }

    public MyDate previousYear() {
        if (MIN_YEAR == year) {
            return this;
        }

        int maxDay = getMonthLastDay(year - 1, month);

        if (day == getMonthLastDay(year, month)) {
            maxDay = maxDay;
        } else if (day > maxDay) {
            maxDay = maxDay;
        } else if (day < maxDay) {
            maxDay = day;
        }

        setDate(year - 1, month, maxDay);
        return this;
    }
}
