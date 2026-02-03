package DoublyLinkedList;

public class Playground {
    public static void main(String[] args) {
        // DoublyLinkedList list = new DoublyLinkedList();
        // list.insertLast(0);
        // list.insertLast(1);
        // list.insertLast(2);
        // list.insertLast(3);
        // list.insertLast(4);
        // list.insertLast(5);
        // list.displayForward();
        // list.displayBackward();

        DoublyLinkedList list2 = new DoublyLinkedList();
        list2.insertLast(1);
        list2.insertLast(2);
        list2.insertLast(3);
        list2.insertLast(4);
        list2.displayBackward();
        System.out.println();
        list2.deleteAtEnd();
        list2.displayBackward();
        System.out.println();
        list2.deleteAtEnd();
        list2.displayBackward();
        System.out.println();
        list2.deleteAtEnd();
        list2.displayBackward();
        System.out.println();
        list2.deleteAtEnd();
        list2.displayBackward();
    }
}