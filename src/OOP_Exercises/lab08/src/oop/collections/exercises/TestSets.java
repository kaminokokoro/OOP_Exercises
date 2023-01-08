package OOP_Exercises.lab08.src.oop.collections.exercises;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1,7,4,5,666));
        Set<Integer> set2 = new HashSet<>(List.of(1,3,4,5,2));
        System.out.println(Sets.intersectionManual(set1, set2));
        System.out.println(Sets.unionManual(set1, set2));

        System.out.println(Sets.firstRecurringCharacter("mathematics"));
        System.out.println(Sets.allRecurringCharacter("mathematics"));
    }
}
