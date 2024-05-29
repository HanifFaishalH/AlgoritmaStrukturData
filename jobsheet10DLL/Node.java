package jobsheet10DLL;

public class Node {
    int data;
    Node prev, next;

    Node (Node prev, int data, Node next) {
        this.next = next;
        this.data = data;
        this.prev = prev;
    }
}
