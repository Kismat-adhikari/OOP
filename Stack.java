public class Stack {
    private int[] stack;
    private int top;
    private int capacity;

    public Stack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack overflow! Can't push " + element);
            return;
        }
        stack[++top] = element;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow! Nothing to pop.");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Nothing to peek.");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }

    public static void main(String[] args) {
        Stack s = new Stack(2);
        s.pop(); // underflow
        s.push(10);
        s.push(20);
        s.push(30); // overflow
        System.out.println(s.pop()); // 20
        System.out.println(s.peek()); // 10
        System.out.println(s.size()); // 1
        System.out.println(s.isEmpty()); // false
        s.pop();
        System.out.println(s.isEmpty()); // true
    }
}
