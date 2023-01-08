package OOP_Exercises.lab06_Homework.src.ex1_2;

public class TestMyTime {
    public static void main(String[] args) {
        MyTime myTime = new MyTime(22, 30, 0);
        System.out.println(myTime);
        myTime.setTime(23, 59, 59);
        System.out.println(myTime);
        System.out.println(myTime.nextHour());
        System.out.println(myTime.previousHour());
        System.out.println(myTime.nextMinute());
        System.out.println(myTime.previousMinute());
        System.out.println(myTime.nextSecond());
        System.out.println(myTime.previousSecond());
        myTime.setTime(60, 1, 1);
    }
}



