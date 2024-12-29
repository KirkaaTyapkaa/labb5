package managers;

public class CEOHandler extends Handler {
    @Override
    public String handleRequest(Request request) {
        if (request.getType() == RequestType.PROMOTION)
            return String.format(
                    "CEO %s promotion request for %s",
                    request.getEmployee().getPromotionStatus() ? "approved" : "rejected",
                    request.getEmployee().getName()
            );

        if (this.nextHandler != null)
            return this.nextHandler.handleRequest(request);

        return "Request could not be handled.";
    }
}
