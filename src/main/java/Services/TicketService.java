package Services;

import DTOs.IssueTicketRequest;
import DTOs.IssueTicketResponse;
import Exceptions.GateNotFoundException;
import Exceptions.ParkingLotNotFoundException;
import Repositories.GateRepository;
import Repositories.ParkingLotRepository;
import Repositories.TicketRepository;
import Repositories.VehicleRespository;
import models.*;
import strategies.ParkingPlaceallotmentstrategy;

import java.util.Date;
import java.util.UUID;

public class TicketService {

    private GateRepository gateRepository;

    private VehicleRespository vehicleRespository;

    private ParkingLotRepository parkingLotRepository;

    private TicketRepository ticketRepository;


    public TicketService(GateRepository gateRepository, VehicleRespository vehicleRespository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.gateRepository = gateRepository;
        this.vehicleRespository = vehicleRespository;
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
    }

    public Ticket issueTicket(IssueTicketRequest request) throws GateNotFoundException, ParkingLotNotFoundException {


        /*
        1. SET TIME
        2. GET VEHICLE AND GATE DETAILS
        3. GET PARKING LOT
        Assign an empty spot for this vehicle
        4. GENERATE TICKET NUMBER
        5. SAVE AND RETURN THE TICKET
         */
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        Gate gate = gateRepository.findGateById(request.getGateID());
        ticket.setGate(gate);

        Vehicle vehicle = vehicleRespository.getVehicleByNumber(request.getVehicleNumber());
        if (vehicle==null) {
            vehicle = new Vehicle(request.getVehicleNumber(), request.getVehicleType(), request.getOwner());
            vehicleRespository.save(vehicle);
        }
        ticket.setVehicle(vehicle);

        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(request.getParkingLotID());
        ParkingPlaceallotmentstrategy allotmentstrategy = request.getParkingPlaceallotmentstrategy();
        ParkingSpot parkingSpot =
                allotmentstrategy.getParkingSpot(request.getVehicleType(), parkingLot);

        ticket.setParkingSpot(parkingSpot);
        ticket.setNumber(request.getVehicleNumber()+ UUID.randomUUID());

        ticketRepository.save(ticket);

        return null;
    }
}
