class Node {
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class StackLinkedList {
    private Node top;

    public boolean isEmpty() {
        return top == null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (!isEmpty()) {
            int value = top.data;
            top = top.next;
            return value;
        } else {
            System.out.println("Stack is empty.");
            return -1; // Return -1 to indicate an empty stack
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return top.data;
        } else {
            System.out.println("Stack is empty.");
            return -1; // Return -1 to indicate an empty stack
        }
    }

    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}
