package problems.ParkingLot.Vehicle;

import problems.ParkingLot.VehicleType;

public class Car extends Vehicle{
    public Car(String vehiclePlateNumber) {
        super(vehiclePlateNumber, VehicleType.CAR);
    }
}
