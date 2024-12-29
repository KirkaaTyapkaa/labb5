package managers;

public class ManagerHandler extends Handler {
    @Override
    public String handleRequest(Request request) {
        if (request.getType() == RequestType.VACATION)
            return String.format(
                    "Manager %s vacation request for %s",
                    request.getEmployee().getVacationStatus() ? "approved" : "rejected",
                    request.getEmployee().getName()
            );

        if (nextHandler != null)
            return nextHandler.handleRequest(request);

        return "Request could not be handled.";
    }
}
