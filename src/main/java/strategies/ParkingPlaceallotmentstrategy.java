package strategies;

import models.ParkingLot;
import models.ParkingSpot;
import models.VehicleType;

public interface ParkingPlaceallotmentstrategy {

    ParkingSpot getParkingSpot(VehicleType vehicleType, ParkingLot parkingLot);

}
