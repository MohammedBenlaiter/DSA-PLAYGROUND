package StackDs;

public class playground {
    public static void main(String[] args) {

        StackLinkedList stack = new StackLinkedList();
        stack.push(0);
        stack.push(1);
        stack.push(2);

        System.out.println(stack.peek());
        stack.push(3);

        System.out.println(stack.peek());

        StackArray stack2 = new StackArray();
        stack2.push(0);
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        int result = stack2.pop();
        // System.out.println(result);
        stack2.printStack();
    }
}
