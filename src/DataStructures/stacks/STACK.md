# Stack
**Stack**: A Last-In-First-Out (LIFO) data structure where elements are added and removed from the top, similar to a stack of books. Common operations include:

## Methods of Stack:
- `.empty(): boolean`: Checks if the stack is empty or not.
- `.push(Object x): void`: Adds an element to the top of the stack.
- `.pop(): Object`: Removes and returns the topmost element.
- `.peek(): Object`: Returns the topmost element without removing it.
- `.search(Object x): int`: Returns the index of given element.

## Stacks are commonly used for:
- Undo/Redo functionality in text editors
- Browser history navigation
- Backtracking algorithms (e.g., solving mazes)
- Managing function calls in programming (Call Stack)

## Code Example:

**Imports**:
```
import java.util.Stack;
```

**Code**:
```
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
```

**Output**:
```
Is stack empty? true
[]
Is stack empty? false
[Minecraft, Detroit: Become Human, League of Legends, The Last of Us, Elden Ring]

Popped Game: The Last of Us
[Minecraft, Detroit: Become Human, League of Legends]

Peeked Game: League of Legends
[Minecraft, Detroit: Become Human, League of Legends]

Index of League of Legends: 1
Index of Minecraft: 3
Index of Blasphemous: -1
```