package CircularSinglyLinkedList;

public class playground {
    public static void main(String[] args) {

        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        list.createCicularLinkedListExmp();
        list.insertAtBegin(99);
        list.insertAtBegin(100);
        list.insertAtEnd(555);
        CircularSinglyLinkedList newList = new CircularSinglyLinkedList();
        newList.insertAtEnd(1);
        newList.insertAtEnd(2);
        newList.insertAtEnd(3);
        newList.insertAtEnd(4);
        newList.printList();
        // newList.removeAtFirst();
        // newList.removeAtFirst();
        // newList.removeAtFirst();
        // newList.removeAtFirst();
        newList.printList();
    }
}
