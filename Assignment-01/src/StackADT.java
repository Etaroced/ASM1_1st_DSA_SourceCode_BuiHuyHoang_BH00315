import java.util.Stack;

public class StackADT {
    //Pushing element on the top of the Stack
    public static void stackPush(Stack<Integer> stack){
        for (int i = 0; i <= 10; i++){
            stack.push(i);
        }
        System.out.println("Stack: " + stack);
    }

    //Popping element from the top of stack
    public static void stackPop(Stack<Integer> stack){
        int element = stack.pop();
        System.out.println("Element pop: " + element);
        System.out.println("Stack pop: " + stack);
    }

    //Displaying element on the top of the stack
    public static void stackPeek(Stack<Integer> stack){
        int element = stack.peek();
        System.out.println("Element on the top: " + element);
        System.out.println("Stack peek: " + stack);
    }

    //Search element in the stack
    public static void stackSearch(Stack<Integer> stack, int value){
        int findElement = stack.search(value);
        if (findElement == -1){
            System.out.println(value + " can not find in the stack");
        }
        else {
            System.out.println(value + " is found at position: " + findElement);
        }
    }

    //Tests if this stack is empty
    public static void checkEmptyStack(Stack<Integer> stack){
        boolean result = stack.empty();
        if (result) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack is not empty");
        }
    }

    //Check size of stack
    public static void sizeStack(Stack<Integer> stack){
        int count = stack.size();
        System.out.println("Size stack: " + count);
    }
}