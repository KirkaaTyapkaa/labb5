package department;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void setSalary() {
        int newSalary = 1;

        Employee employee = new Employee("John Doe", 0);
        employee.setSalary(newSalary);

        assertEquals(newSalary, employee.getSalary());
    }

    @Test
    void incrementSalary() {
        int salary = 0;
        int increment = 1;

        Employee employee = new Employee("John Doe", salary);
        employee.incrementSalary(increment);

        assertEquals(salary + increment, employee.getSalary());

    }

    @Test
    void decrementSalary() {
        int salary = 2;
        int decrement = 1;

        Employee employee = new Employee("John Doe", salary);
        employee.decrementSalary(decrement);

        assertEquals(salary - decrement, employee.getSalary());
    }

    @Test
    void getSalary() {
        int salary = 2;

        Employee employee = new Employee("John Doe", salary);

        assertEquals(salary, employee.getSalary());
    }

    @Test
    void getInfo() {
        Employee employee = new Employee("John Doe", 1);

        String result = String.format(
                "Employee: %s; Salary: %s",
                employee.getName(),

                employee.getSalary()

        );

        assertEquals(result, employee.getInfo());
    }
}
