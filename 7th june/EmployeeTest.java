class Employee {
    void work() {
        System.out.println("Employee is working.");
    }
    int getSalary() {
        return 30000;
    }
}

class HRManager extends Employee {
    
    void work() {
        System.out.println("HR Manager is managing HR tasks.");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.work();
        System.out.println("Salary: " + emp.getSalary());

        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
    }
}
