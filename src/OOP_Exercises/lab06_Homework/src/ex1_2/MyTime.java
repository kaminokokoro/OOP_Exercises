package OOP_Exercises.lab06_Homework.src.ex1_2;

public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime() {
    }

    public MyTime(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour < 0 || hour > 23 || minute < 0 || minute > 59 || second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid hour, minute, or second!");
        }
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour!");
        }
        this.hour = hour;
    }

    public void setMinute(int minute) {
        if (minute < 0 || minute > 59) {
            throw new IllegalArgumentException("Invalid minute!");
        }
        this.minute = minute;
    }

    public void setSecond(int second) {
        if (second < 0 || second > 59) {
            throw new IllegalArgumentException("Invalid second!");
        }
        this.second = second;
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }

    public MyTime nextSecond() {
        second++;
        if (second > 59) {
            second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        minute++;
        if (minute > 59) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        hour++;
        if (hour > 23) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        minute--;
        if (minute < 0) {
            minute = 59;
            previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        hour--;
        if (hour < 0) {
            hour = 23;
        }
        return this;
    }
}
