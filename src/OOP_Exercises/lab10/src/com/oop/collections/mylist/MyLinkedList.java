package OOP_Exercises.lab10.src.com.oop.collections.mylist;

public class MyLinkedList extends MyAbstractList {
    MyLinkedListNode head;
    int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(Object o, int index) {
        try {
            checkBoundaries(index, size);
            if (index == 0) {
                head = new MyLinkedListNode(o, head);
            } else {
                MyLinkedListNode current = getNodeByIndex(index - 1);
                current.setNext(new MyLinkedListNode(o, current.getNext()));
            }
            size++;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid");
        }
    }

    @Override
    public void remove(int index) {
        try {
            checkBoundaries(index, size - 1);
            if (index == 0) {
                head = head.getNext();
            } else {
                MyLinkedListNode current = getNodeByIndex(index - 1);
                current.setNext(current.getNext().getNext());
            }
            size--;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid");
        }
    }

    public MyLinkedListNode getNodeByIndex(int index) {
        MyLinkedListNode current = null;
        try {
            checkBoundaries(index, size);
            current = head;
            for (int i = 0; i < index; i++) {
                current = current.getNext();
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Can't get node at index " + index);
        }
        return current;

    }

    @Override
    public void add(Object o) {
        add(o, size);
    }

    @Override
    public Object get(int index) {
        return getNodeByIndex(index);
    }
}
