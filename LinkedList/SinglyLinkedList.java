package LinkedList;

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtLast(0);
        list.addAtLast(1);
        list.addAtLast(2);
        list.addAtLast(3);
        list.addAtLast(4);

        list.addAtLast(5);

        list.addAtLast(6);
        // list.printList();
        // System.out.println(list.getSize());

        list.printList();

        // list.reverseLinkedList();
        // list.printList();

        // System.out.println(list.findNthFromEnd(2));
        // System.out.println(list.findNthFromEndWithoutUseSize(7));
        // System.out.println(list.getMiddleNode().value);

        list.removeDuplicatesFromSorted();
        // list.removeDuplicatesFromSorted();

        list.printList();

        list.insertInSorted(3);
        list.insertInSorted(0);
        list.insertInSorted(6);
        list.insertInSorted(6);
        list.printList();
        // System.out.println(list.getSize());

    }
}
