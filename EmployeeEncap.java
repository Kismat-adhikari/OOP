public class EmployeeEncap {
    private String name;
    private String id;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void updateSalary(double amount) {
        if (salary + amount >= 0)
            salary += amount;
    }

    public double getSalary() {
        return salary;
    }
}