package StrategyPattern.WithoutStrategyPattern;

public class SportyVehicle  extends Vehicle{

    @Override
    void drive() {
        this.driveFeature = "Special Feature";
    }
}
