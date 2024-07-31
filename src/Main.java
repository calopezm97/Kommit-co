public class Main {
    public static void main(String[] args) {

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.insertHead(6);
        doubleLinkedList.insertTail(3);
        doubleLinkedList.insertHead(4);
        doubleLinkedList.insertTail(2);
        System.out.println(doubleLinkedList.getSize());
        System.out.println(doubleLinkedList.search(6));
        doubleLinkedList.deleteNode(new Node(6));

    }
}