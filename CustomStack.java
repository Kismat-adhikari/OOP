public class CustomStack {
    private int[] stack;
    private int top;
    private int capacity;

    public CustomStack(int size) {
        capacity = size;
        stack = new int[capacity];
        top = -1;
    }

    public void push(int val) {
        if (isFull()) {
            System.out.println("Stack full! Can't push " + val);
            return;
        }
        stack[++top] = val;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack empty! Can't pop.");
            return -1;
        }
        return stack[top--];
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack empty! Can't peek.");
            return -1;
        }
        return stack[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public static void main(String[] args) {
        CustomStack cs = new CustomStack(2);
        cs.pop(); // underflow
        cs.push(10);
        cs.push(20);
        cs.push(30); // overflow
        System.out.println(cs.pop()); // 20
        System.out.println(cs.peek()); // 10
        System.out.println(cs.isEmpty()); // false
        cs.pop();
        System.out.println(cs.isEmpty()); // true
    }
}