// Save as ques6.java

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class ques6 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Add 2 integers: " + calc.add(1, 2));
        System.out.println("Add 2 doubles: " + calc.add(5.5, 12.2));
        System.out.println("Add 3 integers: " + calc.add(12, 21, 31));
    }
}
