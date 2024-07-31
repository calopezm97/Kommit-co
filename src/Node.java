public class Node {
    int name;
    Node prev;
    Node next;

    public Node(int name) {
        this.name = name;
        this.prev = null;
        this.next = null;
    }
}
