package Controllers;


import DTOs.IssueTicketRequest;
import Exceptions.GateNotFoundException;
import Exceptions.ParkingLotNotFoundException;
import Services.TicketService;
import DTOs.IssueTicketResponse;
import models.Ticket;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest request) {

        Ticket ticket = null;
        try {
            ticket = ticketService.issueTicket(request);
        } catch (GateNotFoundException e) {
            System.out.println("Gate Not Found");
            return new IssueTicketResponse(null, "FAILURE", "INVALID TICKET");
        } catch (ParkingLotNotFoundException e) {
            System.out.println("Parking Not Found");
            return new IssueTicketResponse(null, "FAILURE", "INVALID Parking");
        }
        return new IssueTicketResponse(ticket, "SUCCESS", "Ticket Generated");
    }
}
