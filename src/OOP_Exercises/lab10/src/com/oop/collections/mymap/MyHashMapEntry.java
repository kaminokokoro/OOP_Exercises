package OOP_Exercises.lab10.src.com.oop.collections.mymap;

public class MyHashMapEntry {
    private final Object key;
    private final Object value;

    public MyHashMapEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
