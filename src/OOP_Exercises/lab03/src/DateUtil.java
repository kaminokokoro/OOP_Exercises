package OOP_Exercises.lab03.src;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class DateUtil {
    public static String[] strMonths = {"Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static String[] strDays = {"Sunday", "Monday", "Tuesday", "Wednesday",
            "Thursday", "Friday", "Saturday"};
    public static int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public static int[] nonLeapYearMonthNumbers = {0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};
    public static int[] leapYearMonthNumbers = {6, 2, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5};

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        final int MIN_YEAR = 1;
        final int MAX_YEAR = 9999;
        if (year < MIN_YEAR || year > MAX_YEAR) {
            return false;
        }
        if (month < 1 || month > 12) {
            return false;
        }
        int monthDays = daysInMonths[month - 1] + (month == 2 && isLeapYear(year) ? 1 : 0);
        return 1 <= day && day <= monthDays;
    }

    public static int getDayOfWeek(int year, int month, int day) {
        int magicCenturyNumber = 6 - 2 * ((year / 100) % 4);
        int lastTwoDigitsOfYear = year % 100;
        int magicYearNumber = lastTwoDigitsOfYear / 4;
        int magicMonthNumber = isLeapYear(year) ? leapYearMonthNumbers[month - 1] : nonLeapYearMonthNumbers[month - 1];
        int magicDayNumber = day;
        return (magicCenturyNumber + lastTwoDigitsOfYear + magicYearNumber + magicMonthNumber + magicDayNumber) % 7;
    }

    public static void getDayOfWeekTest(int year, int month, int day) {
        Calendar cal = new GregorianCalendar(year, month - 1, day);
        // Get the day of the week number: 1 (Sunday) to 7 (Saturday)
        int dayNumber = cal.get(Calendar.DAY_OF_WEEK);
        String[] calendarDays = {"Sunday", "Monday", "Tuesday", "Wednesday",
                "Thursday", "Friday", "Saturday"};
        // Print result
        System.out.println("It is " + calendarDays[dayNumber - 1]);
    }

    public static String toString(int year, int day) {
        if (!isValidDate(year, 2, day)) {
            return "Not a valid date!";
        }
        int d = getDayOfWeek(year, 2, day);
        return strDays[d] + " " + day + " " + strMonths[2 - 1] + " " + year;
    }

    public static void main(String[] args) {

        System.out.println(isLeapYear(1900));  // false
        System.out.println(isLeapYear(2000));  // true
        System.out.println(isLeapYear(2011));  // false
        System.out.println(isLeapYear(2012));  // true

        System.out.println(isValidDate(2012, 2, 29));  // true
        System.out.println(isValidDate(2011, 2, 29));  // false
        System.out.println(isValidDate(2099, 12, 31)); // true
        System.out.println(isValidDate(2099, 12, 32)); // false

        System.out.println(getDayOfWeek(1982, 4, 24));  // 6:Sat
        System.out.println(getDayOfWeek(2000, 1, 1));   // 6:Sat
        System.out.println(getDayOfWeek(2054, 6, 19));  // 5:Fri
        System.out.println(getDayOfWeek(2012, 2, 17));  // 5:Fri

        System.out.println(toString(2012, 14)); // Tuesday 14 Feb 2012
        System.out.println(toString(2014, 26)); // Wednesday 26 Feb 2014
    }
}
