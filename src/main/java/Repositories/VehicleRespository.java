package Repositories;

import models.Vehicle;

import java.util.HashMap;
import java.util.Map;

public class VehicleRespository {

    private Map<String, Vehicle> vehicleMap = new HashMap<>();

    public Map<String, Vehicle> getVehicleMap() {
        return vehicleMap;
    }

    public void setVehicleMap(Map<String, Vehicle> vehicleMap) {
        this.vehicleMap = vehicleMap;
    }

    public Vehicle getVehicleByNumber(String VehicleNumber){
        if (vehicleMap.containsKey(VehicleNumber)) {
            return vehicleMap.get(VehicleNumber);
        }
        return null;
    }

    public void save(Vehicle vehicle) {
        vehicleMap.put(vehicle.getNumber(), vehicle);
    }
}
