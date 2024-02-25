package strategies;

import models.*;

public class SimpleParkingAllotmentStartegy implements ParkingPlaceallotmentstrategy{


    @Override
    public ParkingSpot getParkingSpot(VehicleType vehicleType, ParkingLot parkingLot) {
        /*

        1. Get all the floors of the parking Lot
            for each floor, check the slots with vehicleType and status being free
            return it.
         */

        for(Floor floor: parkingLot.getfloors()){
            for(ParkingSpot parkingSpot : floor.getParkingSpots()){
                if (parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)) {
                    if(parkingSpot.getVehicleType().equals(vehicleType)){
                        return parkingSpot;
                    }
                }


            }
        }
        return null;
    }
}
