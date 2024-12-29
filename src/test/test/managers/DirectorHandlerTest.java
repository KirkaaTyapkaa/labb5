package managers;

import department.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectorHandlerTest {

    @Test
    void positiveHandleRequest() {
        Employee alice = new Employee("Alice", 5000);
        alice.approveVacation();

        Request vacationRequest = new Request(alice, RequestType.SALARY);
        DirectorHandler manager = new DirectorHandler();

        String result = String.format(
                "Director approved salary (%d) request for %s",
                vacationRequest.getEmployee().getSalary(),
                vacationRequest.getEmployee().getName()
        );

        assertEquals(result, manager.handleRequest(vacationRequest));
    }

    @Test
    void negativeHandleRequest() {
        Employee alice = new Employee("Alice", 5000);

        Request vacationRequest = new Request(alice, RequestType.PROMOTION);
        DirectorHandler manager = new DirectorHandler();

        String result = "Request could not be handled.";

        assertEquals(result, manager.handleRequest(vacationRequest));
    }

}