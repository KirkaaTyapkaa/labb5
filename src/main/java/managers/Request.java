package managers;

import department.Employee;

public class Request {
    private final Employee employee;
    private final RequestType type;

    public Request(Employee employee, RequestType type) {
        this.employee = employee;
        this.type = type;
    }

    public Employee getEmployee() {
        return employee;
    }

    public RequestType getType() {
        return type;
    }
}
