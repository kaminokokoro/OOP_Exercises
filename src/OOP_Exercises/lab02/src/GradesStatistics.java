package OOP_Exercises.lab02.src;

import java.util.Scanner;

public class GradesStatistics {
    static Scanner sc = new Scanner(System.in);

    public static int[] inputItems(int num) {
        int[] items = new int[num];
        for (int idx = 0; idx < num; idx++) {
            System.out.print("Enter the grade for student " + (idx + 1) + ": ");
            items[idx] = sc.nextInt();
        }
        return items;
    }

    public static double calAverage(int[] grades) {
        int sumGrades = 0;
        for (int grade : grades) {
            sumGrades += grade;
        }
        return (double) sumGrades / grades.length;
    }

    public static int findMinGrade(int[] grades) {
        int min = grades[0];
        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    public static int findMaxGrade(int[] grades) {
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        int numStudents = sc.nextInt();
        int[] grades = inputItems(numStudents);
        sc.close();

        System.out.printf("The average is: %.2f", calAverage(grades));
        System.out.println();
        System.out.println("The minimum is: " + findMinGrade(grades));
        System.out.println("The maximum is: " + findMaxGrade(grades));
    }
}
