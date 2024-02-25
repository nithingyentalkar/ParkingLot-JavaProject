package models;

public class Vehicle {

    private VehicleType vehicleType;
     private String  number;

    private String OwnerName;


    public Vehicle(String number, VehicleType vehicleType, String ownerName) {
        this.vehicleType = vehicleType;
        this.number = number;
        OwnerName = ownerName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }
}
