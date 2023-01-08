package OOP_Exercises.lab10.src.com.oop.collections.mylist;

import java.util.Arrays;
import java.util.Objects;

public class MyArrayList extends MyAbstractList {
    static final int INITIAL_SIZE = 16;
    Object[] elements;
    int size;

    public MyArrayList() {
        elements = new Object[INITIAL_SIZE];
        size = 0;
    }

    @Override
    public void add(Object o) {
        if (size > elements.length - 1) {
            enlarge();
        }
        elements[size++] = o;
        // add(o,size);
    }

    @Override
    public void add(Object o, int index) {
        if (size > elements.length - 1) {
            enlarge();
        }
        try {
            checkBoundaries(index, size);
            for (int i = size; i > index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = o;
            size++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't add " + o + " at index " + index);
        }
    }

    @Override
    public void remove(int index) {
        try {
            checkBoundaries(index, size - 1);
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            size--;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't remove object at index " + index);
        }
    }

    @Override
    public Object get(int index) {
        try {
            checkBoundaries(index, size - 1);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't get object at index " + index);
            return null;
        }
        return elements[index];

    }

    @Override
    public int size() {
        return size;
    }

    void enlarge() {
        Object[] tmp = new Object[elements.length * 2];
        System.arraycopy(elements, 0, tmp, 0, elements.length);
        elements = tmp;
//        elements = Arrays.copyOf(elements, elements.length * 2);
    }
}
