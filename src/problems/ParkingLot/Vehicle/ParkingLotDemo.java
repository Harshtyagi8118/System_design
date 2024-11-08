package problems.ParkingLot.Vehicle;

import problems.ParkingLot.Level;
import problems.ParkingLot.ParkingLot;

public class ParkingLotDemo {
    public static void run(){
        ParkingLot parkingLot = ParkingLot.getInstance();

        parkingLot.addLevel(new Level(1,100));
        parkingLot.addLevel(new Level(2,80));

        Vehicle car = new Car("ABCD-1");
        Vehicle bike = new Bike("ABCD-2");
        Vehicle truck = new Truck("ABCD-3");

        parkingLot.parkVehicle(car);
        parkingLot.parkVehicle(bike);
        parkingLot.parkVehicle(truck);

        parkingLot.displayAvailablity();

        parkingLot.unparkVehicle(car);

        parkingLot.displayAvailablity();
    }
}
