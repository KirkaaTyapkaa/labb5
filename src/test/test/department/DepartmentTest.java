package department;

import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DepartmentTest {

    @Test
    void addEmployee() {
        Employee employee = new Employee("John", 1000);
        Department department = new Department("IT");
        department.addEmployee(employee);

        assertEquals(1, department.getEmployees().size());
        assertTrue(department.getEmployees().contains(employee));
    }

    @Test
    void removeEmployee() {
        Employee employee = new Employee("John", 1000);
        Department department = new Department("IT");

        department.addEmployee(employee);
        department.removeEmployee(employee);

        assertEquals(0, department.getEmployees().size());
    }

    @Test
    void getEmployees() {
        Employee employee = new Employee("John", 1000);
        Department department = new Department("IT");
        department.addEmployee(employee);

        List<Employee> result = new ArrayList<>();
        result.add(employee);

        assertEquals(result, department.getEmployees());
    }
    @Test
    void getInfo() {
        Employee employee = new Employee("John", 1000);
        Department department = new Department("IT");

        department.addEmployee(employee);

        assertEquals("Department: IT.", department.getInfo());
    }

    @Test
    void getExpenses() {
        Employee employee = new Employee("John", 1000);
        Department department = new Department("IT");

        department.addEmployee(employee);

        assertEquals(1000, department.getExpenses());
    }

    @Test
    void getVacationsCount() {
        Employee employee = new Employee("John", 1000);
        Department department = new Department("IT");

        department.addEmployee(employee);
        employee.approveVacation();

        assertTrue(employee.getVacationStatus());

    }
}