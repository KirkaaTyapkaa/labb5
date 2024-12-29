package managers;

public class DirectorHandler extends Handler {
    @Override
    public String handleRequest(Request request) {
        if (request.getType() == RequestType.SALARY)
            return String.format(
                    "Director approved salary (%d) request for %s",
                    request.getEmployee().getSalary(),
                    request.getEmployee().getName()
            );

        if (nextHandler != null)
            return nextHandler.handleRequest(request);

        return "Request could not be handled.";
    }

}