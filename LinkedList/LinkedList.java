package LinkedList;

class LinkedList {

    private Node head;
    private int size;

    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return size;
    }

    class Node {

        int value;
        Node next;

        public Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // validate
    private Node acessSpecificPosition(int position, Node head) {
        Node currNode = head;
        if (position >= size || position < 0) {
            System.out.println("The position invalid");
            return null;
        } else if (head == null) {
            System.out.println("The list is empty");
            return null;
        } else if (position == 0) {
            return currNode;
        } else {
            for (int i = 1; i <= position; i++) {
                currNode = currNode.next;
            }
            return currNode;
        }
    }

    public void printAcessSpecificPosition(int position) {
        Node currNode = head;
        currNode = acessSpecificPosition(position, currNode);
        if (currNode != null) {
            System.out.println(currNode.value);
        }
    }

    // validate
    public void printList() {
        if (size == 0) {
            System.out.println("It cant print the list because the list is empty");
        } else {
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.value);
                System.out.print(" -> ");
                currNode = currNode.next;
            }
            System.out.println("null");
        }
    }

    // validate
    public void addAtFirst(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            size++;
        } else {
            newNode.next = head;
            head = newNode;
            size++;
        }
    }

    // validate
    public void addAtLast(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            size++;
        } else {
            Node currNode = head;
            for (int i = 0; i < size - 1; i++) {
                currNode = currNode.next;
            }
            currNode.next = newNode;
            size++;
        }
    }

    // validate
    public void addAtSpecificPosition(int value, int position) {
        Node newNode = new Node(value);
        Node curNode = head;
        if (position > size || position < 0) {
            System.out.println("The size invalid");
        } else if (position == 0) {
            addAtFirst(value);
        } else {
            curNode = acessSpecificPosition(position - 1, curNode);
            newNode.next = curNode.next;
            curNode.next = newNode;
            size++;
        }
    }

    // validate
    public void deleteAtFirst() {
        if (head == null) {
            System.out.println("The list is empty you cant delete any element");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            head = head.next;
            size--;
        }
    }

    // validate
    public void deleteAtLast() {
        Node currNode = head;
        if (head == null) {
            System.out.println("The list is empty you cant delete any element");
        } else {
            while (currNode.next.next != null) {
                currNode = currNode.next;
            }
            currNode.next = null;
            size--;
        }
    }

    // validate
    public void delteAtSpecificPosition(int position) {
        Node currNode = head;
        if (position < 0 || position >= size) {
            System.out.println("The Position invalid");
        } else if (position == 0) {
            deleteAtFirst();
        } else {
            currNode = acessSpecificPosition(position - 1, currNode);
            System.out.println(currNode.value);
            currNode.next = currNode.next.next;
            size--;
        }
    }

    // validate
    public void searchElement(int value) {
        Node currNode = head;
        int position = 0;
        if (head == null) {
            System.out.println("List is empty");
        } else {
            while (currNode != null && value != currNode.value) {
                currNode = currNode.next;
                position++;
            }
            if (currNode == null) {
                System.out.println("The value not found");
            } else {
                System.out.println("Find " + value + " At position " + position);
            }
        }
    }

    public int searchElementt(int value) {
        Node currNode = head;
        int position = 0;
        if (head == null) {
            System.out.println("List is empty");
            return -1;
        } else {
            while (currNode != null && currNode.value != value) {
                currNode = currNode.next;
                position++;
            }
            if (currNode == null) {
                System.out.println("The value not found");
                return -1;
            } else {
                System.out.println("Find " + value + " At position " + position);
                return position;
            }
        }
    }

    public void reverseLinkedListCost() {
        int[] tempArray = new int[size];
        Node currNode = head;
        for (int i = 0; i < tempArray.length; i++) {
            tempArray[i] = currNode.value;
            currNode = currNode.next;
        }
        currNode = head;
        for (int i = tempArray.length - 1; i >= 0; i--) {
            currNode.value = tempArray[i];
            currNode = currNode.next;
        }
    }

    public void reverseLinkedList() {
        if (head == null) {
            return;
        }
        Node currNode = head;
        Node prevNode = null;
        Node nextNode = null;
        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head = prevNode;
    }

    public Node getMiddleNode() {
        if (head == null) {
            return null;
        }
        Node slowPtr = head;
        Node fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public Node getLastNode() {
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        return currNode;
    }

    public Node findNthFromEnd(int n) {
        if (n <= 0 || n > getSize()) {
            throw new IllegalArgumentException("N is out the bound of the list");
        }
        Node currNode = head;
        for (int i = 0; i < getSize() - n; i++) {
            currNode = currNode.next;
        }
        return currNode;
    }

    public int findNthFromEndWithoutUseSize(int n) {
        if (n <= 0 || n > getSize()) {
            throw new IllegalArgumentException("N is out the bound of the list");
        }
        Node resultPtr = head;
        Node refPtr = head;
        for (int i = 0; i < n; i++) {
            refPtr = refPtr.next;
        }
        while (refPtr != null) {
            refPtr = refPtr.next;
            resultPtr = resultPtr.next;
        }
        return resultPtr.value;
    }

    public void removeDuplicatesFromSorted() {
        if (head == null) {
            return;
        }
        Node currNode = head;
        while (currNode != null && currNode.next != null) {
            if (currNode.value == currNode.next.value) {
                currNode.next = currNode.next.next;
            } else {
                currNode = currNode.next;
            }
        }
    }

    public void insertInSorted(int value) {
        Node currNode = head;
        Node newNode = new Node(value);
        while (currNode.next != null && currNode.value < newNode.value) {
            currNode = currNode.next;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
    }

    public void removeGivenKey(int key) {
        Node currNode = head;
        Node temp = null;
        if (currNode.value == key) {
            head = head.next.next;
        } else {
            while (currNode != null && currNode.value != key) {
                temp = currNode;
                currNode = currNode.next;
            }
            if (currNode == null) {
                return;
            }
            temp.next = currNode.next;
        }
    }

    public boolean detectLoop() {
        Node slowPtr = head;
        Node fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (fastPtr == slowPtr) {
                System.out.println("Loops detected");
                return true;
            }
        }
        return false;
    }

}