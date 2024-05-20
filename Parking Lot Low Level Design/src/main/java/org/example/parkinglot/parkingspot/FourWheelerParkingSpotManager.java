package org.example.parkinglot.parkingspot;

import org.example.parkinglot.parkingpriority.ParkingPriorityStrategy;
import java.util.List;

public class FourWheelerParkingSpotManager extends  ParkingSpotManager{
    List<ParkingSpot> parkingSpots;

    FourWheelerParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingPriorityStrategy parkingPriorityStrategy){
        super(parkingSpots, parkingPriorityStrategy);
    }
}
