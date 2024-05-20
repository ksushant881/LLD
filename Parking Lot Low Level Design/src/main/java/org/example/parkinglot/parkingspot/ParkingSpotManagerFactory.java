package org.example.parkinglot.parkingspot;

import org.example.parkinglot.vehicle.VehicleType;

public class ParkingSpotManagerFactory {
    public ParkingSpotManager getParkingSpotManager(VehicleType vehicleType){
        return new ParkingSpotManager();
    }
}
