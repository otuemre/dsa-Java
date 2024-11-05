package stacks;

import java.util.Stack;

public class Main {
    /*
     * What is a Stack?
     *
     * A stack is a LIFO data structure (Last-In First-Out).
     * It stores objects in a vertical "tower," where the last item added is the first to be removed.
     */

    /*
     * Methods of Stack:
     *
     * .empty(): boolean --> checks if the stack is empty or not
     * .push(Object x): void --> adds an element to the stack
     * .pop(): Object --> returns the topmost element of the stack and removes it
     *     *** throws "EmptyStackException" if the stack is empty
     * .peek(): Object --> returns the topmost element without removing it
     *     *** throws "EmptyStackException" if the stack is empty
     * .search(Object x): int --> returns the position of the specified element
     *     *** returns -1 if the element is not found
     *
     * *** Note: Stack may cause "OutOfMemoryError" due to Java heap space limitations!
     */

    /*
     * Uses of Stack:
     *
     * - Undo/Redo features in text editors
     * - Moving back/forward through browser history
     * - Backtracking algorithms (e.g., Mazes, File Directories)
     * - Function call management (Call Stack)
     */

    public static void main(String[] args) {
        // Creating an instance of Stack (imported from java.util.Stack)
        Stack<String> stack = new Stack<>();

        // Checking if the stack is empty using .empty()
        System.out.println("Is stack empty? " + stack.empty());
        System.out.println(stack);

        // Adding items to the stack using .push(Object x)
        stack.push("Minecraft");
        stack.push("Detroit: Become Human");
        stack.push("League of Legends");
        stack.push("The Last of Us");
        stack.push("Elden Ring");

        // Checking if the stack is empty after adding items
        System.out.println("Is stack empty? " + stack.empty());

        // Printing the stack contents
        System.out.println(stack);
        System.out.println();

        // Removing the topmost item from the stack using .pop()
        stack.pop(); // removes "Elden Ring"
        String poppedGame = stack.pop(); // removes "The Last of Us" and assigns it to a variable
        System.out.println("Popped Game: " + poppedGame);
        System.out.println(stack);
        System.out.println();

        // Checking the topmost item in the stack using .peek()
        String peekedGame = stack.peek();
        System.out.println("Peeked Game: " + peekedGame);
        System.out.println(stack);
        System.out.println();

        // Searching for items in the stack using .search(Object x)
        int lol = stack.search("League of Legends");
        System.out.println("Index of League of Legends: " + lol); // returns 1, not 0
        int minecraft = stack.search("Minecraft");
        System.out.println("Index of Minecraft: " + minecraft); // returns 3
        int blasphemous = stack.search("Blasphemous");
        System.out.println("Index of Blasphemous: " + blasphemous); // returns -1

        /* Uncommenting the following code will cause an OutOfMemoryError
         * due to an infinite loop of pushing to the stack.
         *
         * while (true) {
         *     stack.push("Blasphemous");
         * }
         */
    }
}
