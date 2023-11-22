import java.util.*;
import java.util.Scanner;

class StackEmptyException extends Exception {
    public StackEmptyException(String message) {
        super(message);
    }
}

class GenericStack<T> {
    private List<T> stack;

    public GenericStack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
        System.out.println("Pushed: " + element);
    }

    public T pop() throws StackEmptyException {
        if (isEmpty()) {
            throw new StackEmptyException("Stack is empty");
        }
        T popped = stack.remove(stack.size() - 1);
        System.out.println("Popped: " + popped);
        return popped;
    }

    public void display() {
        System.out.println("Stack elements: " + stack);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}

public class StackMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer Stack
        GenericStack<Integer> integerStack = new GenericStack<>();

        // String Stack
        GenericStack<String> stringStack = new GenericStack<>();

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Push to Integer Stack");
            System.out.println("2. Pop from Integer Stack");
            System.out.println("3. Display Integer Stack");
            System.out.println("4. Push to String Stack");
            System.out.println("5. Pop from String Stack");
            System.out.println("6. Display String Stack");
            System.out.println("7. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter integer to push:");
                    int intToPush = scanner.nextInt();
                    new Thread(() -> integerStack.push(intToPush)).start();
                    break;
                case 2:
                    new Thread(() -> {
                        try {
                            integerStack.pop();
                        } catch (StackEmptyException e) {
                            System.out.println(e.getMessage());
                        }
                    }).start();
                    break;
                case 3:
                    new Thread(integerStack::display).start();
                    break;
                case 4:
                    System.out.println("Enter string to push:");
                    String strToPush = scanner.next();
                    new Thread(() -> stringStack.push(strToPush)).start();
                    break;
                case 5:
                    new Thread(() -> {
                        try {
                            stringStack.pop();
                        } catch (StackEmptyException e) {
                            System.out.println(e.getMessage());
                        }
                    }).start();
                    break;
                case 6:
                    new Thread(stringStack::display).start();
                    break;
                case 7:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 7.");
            }
        }
    }
}
