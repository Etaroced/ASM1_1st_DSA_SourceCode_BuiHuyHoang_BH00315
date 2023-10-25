public class Main {
    public static void main(String[] args) {
        StackArray stackArray = new StackArray(5);
        StackLinkedList stackLinkedList = new StackLinkedList();

        // Using the stack implemented with an array
        stackArray.push(1);
        stackArray.push(2);
        stackArray.push(3);

        System.out.println("Stack using Array:");
        System.out.println("Peek: " + stackArray.peek());
        System.out.println("Pop: " + stackArray.pop());
        System.out.println("Peek: " + stackArray.peek());
        System.out.println("Stack size: " + stackArray.size());

        // Using the stack implemented with a linked list
        stackLinkedList.push(4);
        stackLinkedList.push(5);
        stackLinkedList.push(6);

        System.out.println("\nStack using Linked List:");
        System.out.println("Peek: " + stackLinkedList.peek());
        System.out.println("Pop: " + stackLinkedList.pop());
        System.out.println("Peek: " + stackLinkedList.peek());
        System.out.println("Stack size: " + stackLinkedList.size());
    }
}