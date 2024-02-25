package DTOs;

import Controllers.TicketController;
import models.Ticket;

public class IssueTicketResponse {
    private Ticket ticket;

    private String Response;

    private String message;

    public IssueTicketResponse(Ticket ticket, String response, String message) {
        this.ticket = ticket;
        Response = response;
        this.message = message;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getResponse() {
        return Response;
    }

    public void setResponse(String response) {
        Response = response;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

