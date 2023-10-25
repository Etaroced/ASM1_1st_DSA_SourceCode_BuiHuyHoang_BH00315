import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /* LinkedList */
        LinkedList<String> animals = new LinkedList<>();
        // 1 - operator add
        LinkedListADT.addElement(animals);
        LinkedListADT.addElementWithIndex(animals,0 , "Tiger");
        // 2 - operator get
        LinkedListADT.getElementByIndex(animals, 2);
        // 3 - operator set
        LinkedListADT.setElementValueByIndex(animals, 0, "Leopard");
        // 4 - operator iterator
        LinkedListADT.listIteratorElement(animals.listIterator());
        // 5 - operator remove
        LinkedListADT.removeElementByIndex(animals, 2);
        // 6 - operator contains
        LinkedListADT.containsElementByValue(animals, "Tiger");
        // 7 - operator indexOf and lastIndexOf
        LinkedListADT.indexOfElement(animals, "Mouse");
        LinkedListADT.lastIndexOfElement(animals, "Cat");
        // 8 - operator clear
        LinkedListADT.clearElement(animals);


        /* Stack */
        Stack<Integer> numbers = new Stack<>();
        // 1 - push stack
        StackADT.stackPush(numbers);
        // 2 - pop stack
        StackADT.stackPop(numbers);
        // 3 - peek stack
        StackADT.stackPeek(numbers);
        // 4 - search stack
        StackADT.stackSearch(numbers, 8);
        // 5 - check empty
        StackADT.checkEmptyStack(numbers);
        // 6 - size stack
        StackADT.sizeStack(numbers);


        /* Queue implemention LinkedList */
        Queue<String> fruits = new LinkedList<>();
        Queue<Integer> number = new LinkedList<>();
        // 1 - add queue
        QueueLinkedListADT.queueAdd(fruits);
        // 2 - offer queue
        QueueLinkedListADT.queueOffer(number);
        // 3 - peek queue
        QueueLinkedListADT.queuePeek(number);
        // 4 - poll queue
        QueueLinkedListADT.queuePoll(number);
        // 5 - search queue
        QueueLinkedListADT.queueSearch(fruits, "banana");
        // 6 - for...queue
        QueueLinkedListADT.forQueue(fruits);
    }
}