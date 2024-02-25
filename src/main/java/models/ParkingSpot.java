package models;

public class ParkingSpot {
   private VehicleType vehicleType;

    private ParkingSpotStatus parkingSpotStatus;

    private int number;

    private Floor Floors;


    public ParkingSpot(VehicleType vehicleType, ParkingSpotStatus parkingSpotStatus, int number, Floor floors) {
        this.vehicleType = vehicleType;
        this.parkingSpotStatus = parkingSpotStatus;
        this.number = number;
        Floors = floors;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Floor getFloors() {
        return Floors;
    }

    public void setFloors(Floor floors) {
        Floors = floors;
    }
}
