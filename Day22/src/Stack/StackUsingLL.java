package Stack;

public class StackUsingLL {
    private Node head;
    private int size;

    public StackUsingLL() {
        this.head = null;
        this.size = 0;
    }

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = head; 
        head = newNode;     
        size++;
        System.out.println(data + " is pushed into stack");
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return;
        }
        int poppedValue = head.data; 
        head = head.next;           
        size--;
        System.out.println(poppedValue + " is popped from stack");
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return head.data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        StackUsingLL stack = new StackUsingLL();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        System.out.println("Top element is now: " + stack.peek());
        System.out.println("Stack size: " + stack.getSize());
    }
}
