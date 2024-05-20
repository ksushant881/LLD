package org.example.parkinglot.ticket;

import org.example.parkinglot.parkingspot.ParkingSpot;
import java.time.LocalDateTime;

public class Ticket {
    private String        vehicleNumber;
    private LocalDateTime entryTime;
    private ParkingSpot   parkingSpot;
}
