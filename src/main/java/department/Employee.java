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
                "Employee: %s; Vacation Approved: %s; Salary: %s; Promotion Approved: %s.",
                this.getName(),
                this.isVacationApproved ? "yes" : "no",
                this.salary,
                this.isPromotionApproved ? "yes" : "no"
        );
    }


    public void approvePromotion() {
        this.isPromotionApproved = true;
    }

    public void rejectPromotion() {
        this.isPromotionApproved = false;
    }

    public boolean getPromotionStatus() {
        return this.isPromotionApproved;
    }

    public void approveVacation() {
        isVacationApproved = true;
    }

    public void rejectVacation() {
        isVacationApproved = false;
    }

    public boolean getVacationStatus() {
        return isVacationApproved;
    }

}
