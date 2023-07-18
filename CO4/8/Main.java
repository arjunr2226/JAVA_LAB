import java.util.*;

class MyStack<T> {
    ArrayList<T> stack;

    public MyStack() {
        stack = new ArrayList<>();
    }

    void Push(T item) {
        stack.add(item);
    }

    void Pop() {
        System.out.println("Popped: " + stack.remove(stack.size() - 1));
    }

    void peek() {
        System.out.println("Top Element: " + stack.get(stack.size() - 1));
    }
}

public class Main {
    public static void main(String[] a) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the type:\n1.Integer\n2.String\n");
        int c = sc.nextInt();

        if (c == 1) {
            MyStack<Integer> stack = new MyStack<>();
            int choice;
            do {
                System.out.println("Enter the choice:\n1.Push\n2.Pop\n3.Top value\n0.Exit");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter the value:");
                        int item = sc.nextInt();
                        stack.Push(item);
                        break;
                    case 2:
                        stack.Pop();
                        break;
                    case 3:
                        stack.peek();
                        break;
                }
            } while (choice != 0);
        } else {
            MyStack<String> stack = new MyStack<>();
            int choice;
            do {
                System.out.println("Enter the choice:\n1.Push\n2.Pop\n3.Top value\n0.Exit");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        sc.nextLine();
                        System.out.println("Enter the value:");
                        String item = sc.nextLine();
                        stack.Push(item);
                        break;
                    case 2:
                        stack.Pop();
                        break;
                    case 3:
                        stack.peek();
                        break;
                }
            } while (choice != 0);
        }
        sc.close();
    }
}
