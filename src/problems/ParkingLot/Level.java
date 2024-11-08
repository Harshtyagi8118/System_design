package problems.ParkingLot;

import problems.ParkingLot.Vehicle.Vehicle;

import java.awt.datatransfer.FlavorEvent;
import java.util.ArrayList;
import java.util.List;

public class Level {
    public final int level;
    public final List<ParkingSpot> parkingSpots;
    public Level(int level, int numSpots){
        this.level = level;
        this.parkingSpots = new ArrayList<>(numSpots);

        double spotsForBike = 0.50;
        double spotsForCar = 0.40;

        int numBikes = (int)(spotsForBike * numSpots);
        int numCars = (int)(spotsForCar * numSpots);

        for(int i=1;i<=numBikes;i++){
            parkingSpots.add(new ParkingSpot(i,VehicleType.BIKE));
        }
        for(int i=numBikes+1;i<=numBikes+numCars ;i++){
            parkingSpots.add((new ParkingSpot(i,VehicleType.CAR)));
        }
        for(int i=1+numBikes+numCars;i<=numSpots;i++){
            parkingSpots.add(new ParkingSpot(i,VehicleType.TRUCK));
        }
    }
    public synchronized boolean parkVehicle(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpots){
            if(spot.isAvailable() && spot.getVehicleType()==vehicle.getType()){
                spot.parkVehicle(vehicle);
                return true;
            }
        }
        return false;
    }
    public synchronized boolean unParkVehicle(Vehicle vehicle){
        for(ParkingSpot spot:parkingSpots){
            if(!spot.isAvailable() && spot.getParkedVehicle().equals(vehicle)){
                spot.unParkVehicle();
                return true;
            }
        }
        return false;
    }
    public void displayAvailablity(){
        System.out.println("Level "+level + " Availablity");
        for(ParkingSpot spot : parkingSpots){
            System.out.println("Spot number "+spot.getSpotNumber()+ (spot.isAvailable()?" is Available for Vehicle Type ":" is Occupied By Vehicle Type ") +spot.getVehicleType());
        }
    }
    public int getLevel(){
        return level;
    }


}
