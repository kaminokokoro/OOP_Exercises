package OOP_Exercises.lab10.src.com.oop.collections.mylist;

public class MyLinkedListNode {
    Object payload;
    MyLinkedListNode next;

    public MyLinkedListNode(Object payload) {
        this.payload = payload;
    }

    public MyLinkedListNode(Object payload, MyLinkedListNode next) {
        this.payload = payload;
        this.next = next;
    }

    public Object getPayload() {
        return payload;
    }

    public void setPayload(Object payload) {
        this.payload = payload;
    }

    public MyLinkedListNode getNext() {
        return next;
    }

    public void setNext(MyLinkedListNode next) {
        this.next = next;
    }
}
