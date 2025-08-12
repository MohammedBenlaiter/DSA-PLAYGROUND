package LinkedList;

public class SinglyLinkedList {
    public static void main(String[] args) {
        LinkedList list1 = new LinkedList();
        list1.addAtLast(1);
        list1.addAtLast(4);
        list1.addAtLast(8);
        list1.addAtLast(10);
        list1.addAtLast(16);


        LinkedList list2 = new LinkedList();
        list2.addAtLast(3);
        list2.addAtLast(6);
        
        LinkedList list3 = new LinkedList();
        
        list3.merge(list1, list2);

        list3.printList();
    }
}