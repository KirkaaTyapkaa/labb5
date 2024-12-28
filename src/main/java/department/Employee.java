package department;

public class Employee extends OrganizationComponent {
    private int salary;
    private boolean isPromotionApproved = false;
    private boolean isVacationApproved = false;

    public Employee(String name, int salary) {
        super(name);

        this.salary = salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void incrementSalary(int increment) {
        this.salary += increment;
    }
    
    public void decrementSalary(int decrement) {
        this.salary -= decrement;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String getInfo() {
        return String.format(
                "Employee: %s; Salary: %s;",
                this.getName(),
                this.salary
        );
    }

}
