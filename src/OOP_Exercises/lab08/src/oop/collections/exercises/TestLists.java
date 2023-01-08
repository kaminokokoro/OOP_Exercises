package OOP_Exercises.lab08.src.oop.collections.exercises;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(List.of(1,3,4,5,666));
        Lists.insertFirst(list1, 1);
        Lists.insertLast(list1, 2);
        System.out.println(list1);
        Lists.reverseManual(list1);
        System.out.println(list1);

        ArrayList<Integer> list2 = new ArrayList<>();
        Lists.copy(list1, list2);
        System.out.println(list2);
        System.out.println(Lists.contains(list2, 2));

        LinkedList<Integer> list3 = new LinkedList<>(list1);
        Lists.insertBeginningEnd(list3, 12);
        System.out.println(list3);

        Lists.removeEvil(list2);
        System.out.println(list2);
        Lists.replace(list2, 7);
        System.out.println(list2);
    }
}
