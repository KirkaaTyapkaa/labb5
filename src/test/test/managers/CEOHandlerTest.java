package managers;

import department.Employee;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CEOHandlerTest {

    @Test
    void positiveHandleRequest() {
        Employee alice = new Employee("Alice", 5000);
        alice.approvePromotion();

        Request promotionRequest = new Request(alice, RequestType.PROMOTION);
        CEOHandler ceo = new CEOHandler();

        String result = String.format(
                "CEO approved promotion request for %s",
                alice.getName()
        );

        assertEquals(result, ceo.handleRequest(promotionRequest));
    }

    @Test
    void negativeHandleRequest() {
        Employee alice = new Employee("Alice", 5000);

        Request vacationRequest = new Request(alice, RequestType.VACATION);
        CEOHandler ceo = new CEOHandler();

        String result = "Request could not be handled.";
        assertEquals(result, ceo.handleRequest(vacationRequest));
    }
}