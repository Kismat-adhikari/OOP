// Save as ques9.java

class Account {
    double calculateInterest() {
        return 0.0;
    }
}

class SavingsAccount extends Account {
    @Override
    double calculateInterest() {
        return 1000 * 0.04; // 4% interest
    }
}

class FixedDepositAccount extends Account {
    @Override
    double calculateInterest() {
        return 1000 * 0.08; // 8% interest
    }
}

public class ques9 {
    public static void main(String[] args) {
        Account savings = new SavingsAccount();
        Account fixed = new FixedDepositAccount();

        System.out.println("Savings Account Interest: " + savings.calculateInterest());
        System.out.println("Fixed Deposit Interest: " + fixed.calculateInterest());
    }
}
