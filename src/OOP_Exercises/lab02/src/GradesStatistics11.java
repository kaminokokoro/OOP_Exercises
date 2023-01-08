package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class GradesStatistics11 {
    static Scanner sc = new Scanner(System.in);

    public static int[] readGrades(int num) {
        int[] grades = new int[num];
        for (int idx = 0; idx < num; idx++) {
            System.out.print("Enter the grade for student " + (idx + 1) + ": ");
            grades[idx] = sc.nextInt();
        }
        return grades;
    }

    public static void print(int[] array) {
        for (int idx = 0; idx < array.length; idx++) {
            if (idx == 0) {
                System.out.print("[" + array[idx]);
            } else if (idx == array.length - 1) {
                System.out.println(", " + array[idx] + "]");
            } else {
                System.out.print(", " + array[idx]);
            }
        }
    }

    public static double calAverage(int[] grades) {
        int sumGrades = 0;
        for (int idx = 0; idx < grades.length; idx++) {
            sumGrades += grades[idx];
        }
        return (double) sumGrades / grades.length;
    }

    public static double calMedian(int[] array) {
        double median;
        sortArray(array);
        if (array.length % 2 == 0) {
            int mid = array.length / 2;
            median = (double) (array[mid - 1] + array[mid]) / 2;
        } else {
            int mid = (array.length - 1) / 2;
            median = array[mid];
        }

        return median;
    }

    public static int findMinGrade(int[] grades) {
        int min = grades[0];
        for (int idx = 0; idx < grades.length; idx++) {
            if (grades[idx] < min) {
                min = grades[idx];
            }
        }
        return min;
    }

    public static int findMaxGrade(int[] grades) {
        int max = grades[0];
        for (int idx = 0; idx < grades.length; idx++) {
            if (grades[idx] > max) {
                max = grades[idx];
            }
        }
        return max;
    }

    public static void sortArray(int[] array) {
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }

    public static double stdDev(int[] array) {
        double varience = 0;

        for (int arrElement : array) {
            varience += (arrElement - calAverage(array)) * ((arrElement - calAverage(array))) / array.length;
        }
        return Math.sqrt(varience);
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[] grades = readGrades(numStudents);
        sc.close();

        System.out.print("The grades are: ");
        print(grades);

        System.out.printf("The average is: %.2f\n", calAverage(grades));
        System.out.printf("The median is: %.2f\n", calMedian(grades));
        System.out.println("The minimum is: " + findMinGrade(grades));
        System.out.println("The maximum is: " + findMaxGrade(grades));
        System.out.printf("The standard deviation is: %.2f", stdDev(grades));
    }
}
