package org.example.parkinglot.parkingspot;

import org.example.parkinglot.parkingpriority.ParkingPriorityStrategy;
import java.util.List;

public class ParkingSpotManager {
    List<ParkingSpot> parkingSpots;

    //find parking spot
    // add parking spot
    //remove parking spot
    //park vehicle
    //remove vehicle

    ParkingSpotManager(List<ParkingSpot> parkingSpots, ParkingPriorityStrategy parkingPriorityStrategy) {
        this.parkingSpots = parkingSpots;
    }
}
