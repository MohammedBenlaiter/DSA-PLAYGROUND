package LinkedList;

import LinkedList.LinkedList.Node;

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtLast(1);
        list.addAtLast(2);
        list.addAtLast(3);
        list.addAtLast(4);
        list.addAtLast(5);
        list.addAtLast(6);
        Node lastNode = list.getLastNode();
        Node pointedNode = list.findNthFromEnd(5);
        lastNode.next = pointedNode;
        // list.printList();

        // System.out.println(list.detectLoop().value);
        list.removeLoop();
        // list.printList();

        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();
        list2.addAtLast(1);
        list2.addAtLast(4);
        list2.addAtLast(8);
        list3.addAtLast(3);
        list3.addAtLast(6);
        list3.addAtLast(7);
        list2.mergeWithAnotherList(list3);
        list2.printList();
    }
}