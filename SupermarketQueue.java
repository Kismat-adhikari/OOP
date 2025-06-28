import java.util.Scanner;

public class SupermarketQueue {
    private String[] queue;
    private int front, rear, size, capacity;

    public SupermarketQueue(int capacity) {
        this.capacity = capacity;
        queue = new String[capacity];
        front = size = 0;
        rear = -1;
    }

    public void addCustomer(String name) {
        if (size == capacity) {
            System.out.println("Queue full! No more customers, please.");
            return;
        }
        rear = (rear + 1) % capacity;
        queue[rear] = name;
        size++;
    }

    public void serveCustomer() {
        if (size == 0) {
            System.out.println("No customers to serve.");
            return;
        }
        System.out.println("Serving: " + queue[front]);
        front = (front + 1) % capacity;
        size--;
    }

    public void displayQueue() {
        if (size == 0) {
            System.out.println("Queue is empty.");
            return;
        }
        System.out.print("Current Queue: ");
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    public void customerCount() {
        System.out.println("Number of customers: " + size);
    }

    public static void main(String[] args) {
        SupermarketQueue sq = new SupermarketQueue(10);
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out
                    .println("\n1. Add Customer\n2. Serve Customer\n3. Display Queue\n4. Number of Customers\n5. Exit");
            choice = sc.nextInt();
            sc.nextLine(); // clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter customer name: ");
                    String name = sc.nextLine();
                    sq.addCustomer(name);
                    break;
                case 2:
                    sq.serveCustomer();
                    break;
                case 3:
                    sq.displayQueue();
                    break;
                case 4:
                    sq.customerCount();
                    break;
                case 5:
                    System.out.println("Exiting queue system. Bye!");
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        } while (choice != 5);
        sc.close();
    }
}