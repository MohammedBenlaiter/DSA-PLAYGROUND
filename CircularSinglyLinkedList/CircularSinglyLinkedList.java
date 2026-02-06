package CircularSinglyLinkedList;

public class CircularSinglyLinkedList {

    private ListNode last;
    private int length;

    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public CircularSinglyLinkedList() {
        last = null;
        length = 0;
    }

    public int length() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void createCicularLinkedListExmp() {
        ListNode first = new ListNode(0);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = first;
        last = fourth;

        length = 4;
    }

    public void printList() {
        if (last == null) {
            return;
        }
        ListNode temp = last.next;
        System.out.print(temp.data + " -> ");
        while (temp != last) {
            temp = temp.next;
            System.out.print(temp.data + " -> ");
        }
        System.out.println("null");
    }

    public void insertAtBegin(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            last = newNode;
        } else {
            newNode.next = last.next;
        }
        last.next = newNode;
        length++;
    }

    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            last = newNode;
            newNode.next = last;
        } else {
            newNode.next = last.next;
            last.next = newNode;
            last = newNode;
        }
        length++;
    }

    public void removeAtFirst() {
        if (isEmpty()) {
            return;
        }
        if (length == 1) {
            last = null;
        } else {
            last.next = last.next.next;
        }
        length--;
    }
}
