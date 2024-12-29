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
    void getInfo() {
        Employee employee = new Employee("John Doe", 1);

        String result = String.format(
                "Employee: %s; Vacation Approved: %s; Salary: %s; Promotion Approved: %s.",
                employee.getName(),
                employee.getVacationStatus() ? "yes" : "no",
                employee.getSalary(),
                employee.getPromotionStatus() ? "yes" : "no"
        );

        assertEquals(result, employee.getInfo());
    }


    @Test
    void approvePromotion() {
        Employee employee = new Employee("John Doe", 1);
        employee.approvePromotion();

        assertTrue(employee.getPromotionStatus());
    }

    @Test
    void rejectPromotion() {
        Employee employee = new Employee("John Doe", 1);
        employee.rejectPromotion();

        assertFalse(employee.getPromotionStatus());
    }

    @Test
    void getPromotionStatus() {
        Employee employee = new Employee("John Doe", 1);

        assertFalse(employee.getPromotionStatus());
    }

    @Test
    void approveVacation() {
        Employee employee = new Employee("John Doe", 1);
        employee.approveVacation();

        assertTrue(employee.getVacationStatus());
    }

    @Test
    void rejectVacation() {
        Employee employee = new Employee("John Doe", 1);
        employee.rejectVacation();

        assertFalse(employee.getVacationStatus());
    }

    @Test
    void getVacationStatus() {
        Employee employee = new Employee("John Doe", 1);
        assertFalse(employee.getVacationStatus());
    }

}
