import java.util.EmptyStackException;

class Stack<T> {
    private static class Node<T> {
        private final T data;
        private Node<T> next;

        private Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    public void push(T data) {
        Node<T> newNode = new Node<>(data);
        newNode.next = top;
        top = newNode;
    }

    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        T data = top.data;
        top = top.next;
        return data;
    }

    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Peek: " + stack.peek());

        while (!stack.isEmpty()) {
            System.out.println("Pop: " + stack.pop());
        }
    }
}
