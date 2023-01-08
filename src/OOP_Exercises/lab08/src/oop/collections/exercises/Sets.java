package OOP_Exercises.lab08.src.oop.collections.exercises;

import java.util.*;

public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> results = new HashSet<>();
        for (int i : first) {
            for (int j : second) {
                if (i == j) {
                    results.add(j);
                }
            }
        }
        return results;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> results = new HashSet<>();
        for (int i : first) {
            for (int j : second) {
                if (i == j) {
                    results.add(i);
                } else {
                    results.add(i);
                    results.add(j);
                }
            }
        }
        return results;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> results = new HashSet<>(first);
        results.retainAll(second);
        return results;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> results = new HashSet<>(first);
        results.addAll(second);
        return results;
    }

    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new HashSet<>(source));
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        List<Integer> results = new ArrayList<>();
        for (int i : source) {
            if (results.contains(i)) {
                results.add(i);
            }
        }
        return results;
    }

    public static String firstRecurringCharacter(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                return s.charAt(i) + "";
            }
            set.add(s.charAt(i));
        }
        return set + "";
    }

    public static Set<Character> allRecurringCharacter(String s) {
        Set<Character> set = new HashSet<>();
        Set<Character> results = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                results.add(s.charAt(i));
            } else {
                set.add(s.charAt(i));
            }
        }
        return results;
    }

    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[0]);
    }

    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}










