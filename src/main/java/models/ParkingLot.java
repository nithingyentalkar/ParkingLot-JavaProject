package models;

import java.util.List;

public class ParkingLot {

    private Long id;
   private List<Floor> floors;

    private List<Gate> gates;

    private ParkingLotStatus parkingLotstatus;

    private VehicleType allowedVehicleType;

    public ParkingLot(Long id, List<Floor> floors, List<Gate> gates, ParkingLotStatus parkingLotstatus) {
        this.id = id;
        this.floors = floors;
        this.gates = gates;
        this.parkingLotstatus = parkingLotstatus;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Floor> getfloors() {
        return floors;
    }

    public void setFloor(List<Floor> floors) {
        this.floors = floors;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public VehicleType getAllowedVehicleType() {
        return allowedVehicleType;
    }

    public void setAllowedVehicleType(VehicleType allowedVehicleType) {
        this.allowedVehicleType = allowedVehicleType;
    }

    public ParkingLotStatus getParkingLotstatus() {
        return parkingLotstatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotstatus) {
        this.parkingLotstatus = parkingLotstatus;
    }
}
