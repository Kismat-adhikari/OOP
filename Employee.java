public class Employee {
    private String name, jobTitle;
    private double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public void updateSalary(double amount) {
        if (amount >= 0)
            this.salary += amount;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Employee e = new Employee("Alice", "Developer", 50000);
        e.updateSalary(5000);
        System.out.println("Updated Salary: " + e.getSalary());
    }
}