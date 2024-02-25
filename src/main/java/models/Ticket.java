package models;

import strategies.ParkingPlaceallotmentstrategy;

import java.util.Date;

public class Ticket {
    private String number;

    private Date entryTime;

   private Vehicle vehicle;


    private Gate gate;

   private ParkingSpot parkingSpot;

    private Operator operator;

    public ParkingPlaceallotmentstrategy getParkingPlaceallotmentstrategy() {
        return parkingPlaceallotmentstrategy;
    }

    public void setParkingPlaceallotmentstrategy(ParkingPlaceallotmentstrategy parkingPlaceallotmentstrategy) {
        this.parkingPlaceallotmentstrategy = parkingPlaceallotmentstrategy;
    }

    private ParkingPlaceallotmentstrategy parkingPlaceallotmentstrategy;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
    public Gate getGate() {
        return gate;
    }

    public void setGate(Gate gate) {
        this.gate = gate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
