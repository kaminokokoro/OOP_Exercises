package OOP_Exercises.lab08.src.oop.collections.exercises;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class Maps {
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }

    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }

    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }

    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return map.containsKey(key) && map.containsValue(value);
    }

    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }

    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }

    public static String getColor(int value) {
        if (value == 0) {
            return "black";
        } else if (value == 1) {
            return "white";
        } else if (value == 2) {
            return "red";
        } else {
            return null;
        }
    }
}
