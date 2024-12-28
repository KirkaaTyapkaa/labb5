package department;

import java.util.ArrayList;
import java.util.List;

public class Department extends OrganizationComponent {
    private final List<Employee> employees = new ArrayList<>();

    public Department(String name) {
        super(name);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public String getInfo() {
        return String.format(
                "Department: %s.",
                super.getName()
        );
    }

    public int getExpenses() {
        int expenses = 0;

        for (Employee employee : employees)
            expenses += employee.getSalary();

        return expenses;
    }

    public int getVacationsCount() {
        int vacation = 0;

        for (Employee employee : employees)
            if (employee.getVacationStatus())
                vacation++;

        return vacation;
    }

}