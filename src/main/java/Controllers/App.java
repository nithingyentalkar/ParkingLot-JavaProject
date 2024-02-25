package Controllers;

import DTOs.IssueTicketRequest;
import DTOs.IssueTicketResponse;
import Repositories.GateRepository;
import Repositories.ParkingLotRepository;
import Repositories.TicketRepository;
import Repositories.VehicleRespository;
import Services.TicketService;
import models.*;
import strategies.SimpleParkingAllotmentStartegy;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {

        /*
        You need to create a parking Lot first.

         */

        Gate gate = new Gate(GateType.ENTRY,1l, GateStatus.WORKING);
        Floor floor1 = new Floor(1);
        for(int i=1;i<=10;i++) {
            floor1.getParkingSpots().add(
                    new ParkingSpot(VehicleType.FOUR_WHEELER, ParkingSpotStatus.AVAILABLE, i, floor1));
        }

        ArrayList<Floor> floors = new ArrayList<>();
        floors.add(floor1);
        ArrayList<Gate> gates = new ArrayList<>();
        gates.add(gate);

        ParkingLot parkingLot = new ParkingLot(1l, floors, gates, ParkingLotStatus.ACTIVE);


        GateRepository gateRepository = new GateRepository();
        gateRepository.getGates().put(1l, gate);
        VehicleRespository vehicleRespository = new VehicleRespository();
        ParkingLotRepository parkingLotRepository = new ParkingLotRepository();
        parkingLotRepository.getParkingLotMap().put(1l,parkingLot);

        TicketRepository ticketRepository = new TicketRepository();
        TicketService ticketService =
                new TicketService(gateRepository, vehicleRespository,
                        parkingLotRepository, ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        //VehicleType vehicleType, String vehicleNumber, String owner, Long gateID, Long parkingLotID, ParkingPlaceallotmentstrategy parkingPlaceallotmentstrategy
        IssueTicketRequest issueTicketRequest = new IssueTicketRequest(
                VehicleType.TWO_WHEELER, "KA-02", "Eren Yeager",
                1l, 1l, new SimpleParkingAllotmentStartegy());

        IssueTicketResponse issueTicketResponse = ticketController.issueTicket(issueTicketRequest);

        System.out.println(issueTicketResponse);

   /*
   ---------------------------------IMPORTANT ----------------------------------------
   HAVE NOT WRITTEN CODE FOR FILLED STATUS, IT WILL ONLY TAKE 2 MIN TO WRITE IT,
    WATCH <CODE PARKING LOT> LAST VIDEO, WATCH 2 MINUTES BEFORE DOUBT RESOLUTION POINTER.
    YOU WILL BE ABLE TO ADD THROW CATCH CODE FOR FILLED STATUS
      */
    }


}
