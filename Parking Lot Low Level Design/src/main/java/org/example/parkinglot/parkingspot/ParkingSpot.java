package org.example.parkinglot.parkingspot;

import org.springframework.data.annotation.Id;
import jakarta.persistence.GeneratedValue;

public class ParkingSpot {
    @Id
    @GeneratedValue
    private int             id;
    private ParkingSpotType parkingSpotType;
    private boolean         isEmpty;
    private double          price;


    //park vehicle
    //remove vehicle

    public ParkingSpot(ParkingSpotType parkingSpotType, double price) {
        this.parkingSpotType = parkingSpotType;
        this.isEmpty = false;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
