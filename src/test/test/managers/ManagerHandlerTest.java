package managers;

import department.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerHandlerTest {
    @Test
    void positiveHandleRequest() {
        Employee alice = new Employee("Alice", 5000);
        alice.approveVacation();
        
        Request vacationRequest = new Request(alice, RequestType.VACATION);
        ManagerHandler manager = new ManagerHandler();

        String result = String.format(
                "Manager approved vacation request for %s",
                alice.getName()
        );

        assertEquals(result, manager.handleRequest(vacationRequest));
    }

    @Test
    void negativeHandleRequest() {
        Employee alice = new Employee("Alice", 5000);

        Request vacationRequest = new Request(alice, RequestType.PROMOTION);
        ManagerHandler manager = new ManagerHandler();

        String result = "Request could not be handled.";

        assertEquals(result, manager.handleRequest(vacationRequest));
    }
}
