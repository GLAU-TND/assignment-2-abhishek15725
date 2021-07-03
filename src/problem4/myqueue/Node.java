package problem4.myqueue;

public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        next=null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }
}
