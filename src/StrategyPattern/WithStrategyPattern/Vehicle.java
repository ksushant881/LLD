package StrategyPattern.WithStrategyPattern;

public class Vehicle {
    int fuelCapacity;
    String driveFeature;
    DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    void drive() {
        this.driveFeature = driveStrategy.drive();
    }
}
