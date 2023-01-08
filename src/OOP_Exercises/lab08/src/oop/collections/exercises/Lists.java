package OOP_Exercises.lab08.src.oop.collections.exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    public static void replace(ArrayList<Integer> list, int value) {
        if (list.size() >= 3) {
            list.set(2, value);
        }
    }

    public static void removeThird(ArrayList<Integer> list) {
        if (list.size() >= 3) {
            list.remove(2);
        }
    }

    public static void removeEvil(ArrayList<Integer> list) {
        list.removeAll(List.of(666));
    }

    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> squareList = new ArrayList<>();
        int count = 0;
        while (count < 10) {
            count++;
            squareList.add(count * count);
        }
        return squareList;
    }

    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        target.clear();
        for (int element : source) {
            target.add(element);
        }
    }

    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    public static void reverseManual(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            int temp = list.get(i);
            list.set(i, list.get(list.size() - 1 - i));
            list.set(list.size() - 1 - i, temp);
        }
    }

    public static void insertBeginningEnd(LinkedList<Integer> list, int value) {
        list.addFirst(value);
        list.addLast(value);
    }
}













