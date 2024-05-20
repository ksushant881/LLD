package org.example.parkinglot.parkingspot;

import org.example.parkinglot.parkingpriority.ParkingPriorityStrategy;
import org.example.parkinglot.parkingspot.ParkingSpot;
import org.example.parkinglot.parkingspot.ParkingSpotManager;
import java.util.List;

public class TwoWheelerParkingSpotManager  extends ParkingSpotManager {
    List<ParkingSpot> parkingSpots;

    TwoWheelerParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingPriorityStrategy parkingPriorityStrategy){
        super(parkingSpots, parkingPriorityStrategy);
    }
}
