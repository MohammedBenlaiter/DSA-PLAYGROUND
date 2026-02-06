package StackDs;

public class StackArray {
    private int top;
    private int[] arr;

    public StackArray(int capacity) {
        top = -1;
        arr = new int[capacity];
    }

    public StackArray() {
        this(10);
    }

    public int size() {
        return top + 1;
    }

    public boolean isFull() {
        return arr.length == size();
    }

    public boolean isEmpty() {
        return top < 0;
    }

    public void push(int data) {
        if (isFull()) {
            throw new RuntimeException("The stack is full");
        }
        top++;
        arr[top] = data;
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("The Stack is empty");
        }
        int result = arr[top];
        top--;
        return result;
    }

    public int peek() {
        if (isEmpty()) {
            throw new RuntimeException("The Stack is empty");
        }
        return arr[top];
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("<- top");
    }

}
