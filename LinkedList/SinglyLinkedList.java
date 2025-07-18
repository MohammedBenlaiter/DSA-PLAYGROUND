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
        Node pointedNode = list.findNthFromEnd(4);
        lastNode.next = pointedNode;
        // list.printList();

        System.out.println(list.detectLoop());
    }
}
