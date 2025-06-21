// Save as ques2.java

abstract class Payment {
    abstract void processPayment();
}

class CreditCard extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing credit card payment...");
    }
}

class PayPal extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing PayPal payment...");
    }
}

class BankTransfer extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing bank transfer payment...");
    }
}

public class ques2 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        Payment p2 = new PayPal();
        Payment p3 = new BankTransfer();

        p1.processPayment();
        p2.processPayment();
        p3.processPayment();
    }
}
