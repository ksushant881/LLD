package StrategyPattern.WithStrategyPattern;

public class SportyVehicle  extends Vehicle{
    SportyVehicle() {
        super(new SpecialDrive());
    }
}
