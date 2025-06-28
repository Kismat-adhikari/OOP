import java.util.Scanner;

public class CallCenterQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    public CallCenterQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = size = 0;
        rear = -1;
    }

    public void addCall(String callInfo) {
        if (size == capacity) {
            System.out.println("Call queue is full! Can't take more calls.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = callInfo;
        size++;
    }

    public void handleCall() {
        if (size == 0) {
            System.out.println("No calls to handle.");
            return;
        }
        System.out.println("Handling call: " + queue[front]);
        front = (front + 1) % capacity;
        size--;
    }

    public void displayCalls() {
        if (size == 0) {
            System.out.println("No pending calls.");
            return;
        }
        System.out.print("Pending Calls: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public void pendingCallCount() {
        System.out.println("Number of pending calls: " + size);
    }

    public static void main(String[] args) {
        CallCenterQueue ccq = new CallCenterQueue(10);
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n1. Add Call\n2. Handle Next Call\n3. Display Calls\n4. Pending Call Count\n5. Exit");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter call info: ");
                    String call = sc.nextLine();
                    ccq.addCall(call);
                    break;
                case 2:
                    ccq.handleCall();
                    break;
                case 3:
                    ccq.displayCalls();
                    break;
                case 4:
                    ccq.pendingCallCount();
                    break;
                case 5:
                    System.out.println("Call center system shutting down.");
                    break;
                default:
                    System.out.println("Invalid option, fam.");
            }
        } while (choice != 5);
        sc.close();
    }
}