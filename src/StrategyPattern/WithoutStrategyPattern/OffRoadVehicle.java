package StrategyPattern.WithoutStrategyPattern;

public class OffRoadVehicle  extends Vehicle{

    @Override
    void drive() {
        this.driveFeature = "Special Feature";
    }
}
