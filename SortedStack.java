
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

/**
 * A class that reads integers from input and stores them in a sorted Stack
 * Everything that I imported are examples of code reuse
 * The importance of code reuse is it's maintainable, readable, and flexible.
 * I am reusing built-in sorting algorithms and data structures instead of recreating them
 * For example, instead of creating code to sort the numbers, I imported Collections and use the collections.sort() method.
 * If I want to reuse the sortAndPrintStack for two different stacks i could just label one stack stackA and the next stack stackB.
 */

public class SortedStack {
    public static void main(String[] args) {

        // Create a stack to store integers
        Stack<Integer> stack = getInputStack();

        // Sort and display the stack
        sortAndPrintStack(stack);
    }

    // Method to get inout and osuh elements onto the stack
    public static Stack<Integer> getInputStack() {
        Stack<Integer> stack = new Stack<>();
        try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Enter integers and type 'done' to finish: ");

        // Read the integers from the input
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                stack.push(scanner.nextInt());
            } else if (scanner.next().equalsIgnoreCase("done")) {
                break;
            }
        }
    }
    return stack;
}

    // Method to sort the stack an dprint the sorted elements
    public static void sortAndPrintStack(Stack<Integer> stack) {
        // Sort the stack in ascending order
        Collections.sort(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}