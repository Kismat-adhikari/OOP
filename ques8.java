// Save as ques8.java

class Employee {
    double calculateSalary() {
        return 30000; // base salary
    }
}

class Manager extends Employee {
    @Override
    double calculateSalary() {
        double baseSalary = super.calculateSalary();
        double bonus = 10000; // fixed bonus for performance
        return baseSalary + bonus;
    }
}

public class ques8 {
    public static void main(String[] args) {
        Employee regular = new Employee();
        Employee manager = new Manager();

        System.out.println("Employee Salary: " + regular.calculateSalary());
        System.out.println("Manager Salary: " + manager.calculateSalary());
    }
}
