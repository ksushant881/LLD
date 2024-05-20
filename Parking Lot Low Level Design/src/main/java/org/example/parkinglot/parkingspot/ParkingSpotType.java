package org.example.parkinglot.parkingspot;

public enum ParkingSpotType {
    double price;

    TWO_WHEELER(10),
    FOUR_WHEELER(20)

    ParkingSpotType(double price) {
        this.price = price;
    }
}
