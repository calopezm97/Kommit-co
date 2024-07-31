public class DoubleLinkedList {

    Node head;

    public void insertHead(int date){
        Node newNode = new Node(date);
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
    }

    public void insertTail(int date){
        Node newNode = new Node(date);
        Node tail = head;

        newNode.next= null;

        if (head==null) {
            newNode.prev = null;
            head = newNode;
            return;
        }
        while (tail.next != null){
            tail = tail.next;
        }
        tail.next= newNode;
        newNode.prev = tail;
    }

    public void deleteNode(Node delete){
        if (head== null || delete == null) {
            return;
        }
        if (head == delete) {
            head = delete.next;
        }
        if (delete.next != null) {
            delete.next.prev = delete.prev;
        }
        if (delete.prev != null) {
            delete.prev.next = delete.next;
        }
        delete = null;
    }

    public boolean search(int value){
        Node temp = head;
        while (temp != null){
            if (temp.name ==value){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int getSize(){
        int size = 0;
        Node temp = head;
        while (temp != null){
            size++;
            temp = temp.next;
        }

        return size;
    }
}
