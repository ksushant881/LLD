package StrategyPattern.WithStrategyPattern;

public class PassengerVehicle extends Vehicle{
    PassengerVehicle() {
        super(new NormalDrive());
    }
}
