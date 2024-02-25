package DTOs;

import models.ParkingSpot;
import models.VehicleType;
import strategies.ParkingPlaceallotmentstrategy;

public class IssueTicketRequest {

    private VehicleType vehicleType;

    private String vehicleNumber;

    private String Owner;

    private Long gateID;

    private Long parkingLotID;

    private ParkingPlaceallotmentstrategy parkingPlaceallotmentstrategy;


    public IssueTicketRequest(String vehicleNumber, Long gateID, Long parkingLotID, ParkingPlaceallotmentstrategy parkingPlaceallotmentstrategy) {
        this.vehicleNumber = vehicleNumber;
        this.gateID = gateID;
        this.parkingLotID = parkingLotID;
        this.parkingPlaceallotmentstrategy = parkingPlaceallotmentstrategy;
    }


    public IssueTicketRequest(VehicleType vehicleType, String vehicleNumber, String owner, Long gateID, Long parkingLotID, ParkingPlaceallotmentstrategy parkingPlaceallotmentstrategy) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
        Owner = owner;
        this.gateID = gateID;
        this.parkingLotID = parkingLotID;
        this.parkingPlaceallotmentstrategy = parkingPlaceallotmentstrategy;
    }

    public ParkingPlaceallotmentstrategy getParkingPlaceallotmentstrategy() {
        return parkingPlaceallotmentstrategy;
    }

    public void setParkingPlaceallotmentstrategy(ParkingPlaceallotmentstrategy parkingPlaceallotmentstrategy) {
        this.parkingPlaceallotmentstrategy = parkingPlaceallotmentstrategy;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public Long getGateID() {
        return gateID;
    }

    public void setGateID(Long gateID) {
        this.gateID = gateID;
    }

    public Long getParkingLotID() {
        return parkingLotID;
    }

    public void setParkingLotID(Long parkingLotID) {
        this.parkingLotID = parkingLotID;
    }
}
