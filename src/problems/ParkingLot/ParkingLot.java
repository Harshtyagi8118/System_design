package problems.ParkingLot;

import problems.ParkingLot.Vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private static ParkingLot instance;
    private final List<Level> levelList;

    public ParkingLot(){
        levelList = new ArrayList<>();
    }

    public static ParkingLot getInstance(){
        if(instance==null){
            instance = new ParkingLot();
        }
        return instance;
    }
    public void addLevel(Level level){
        this.levelList.add(level);
    }
    public boolean parkVehicle(Vehicle vehicle){
        for(Level level : levelList){
            for(ParkingSpot parkingSpot : level.parkingSpots){
                if(level.parkVehicle(vehicle)){
                    System.out.println("Vehicle Parked successfully at level " + level.getLevel() + " at "+ parkingSpot.getSpotNumber()+ " parkingSpot");
                    return true;
                }
            }
        }
        return false;
    }
    public boolean unparkVehicle(Vehicle vehicle){
        for(Level level : levelList){
            for(ParkingSpot parkingSpot : level.parkingSpots){
                if(level.unParkVehicle(vehicle)){
                    System.out.println("Vehicle UnParked successfully at level " + level.getLevel() + " at "+ parkingSpot.getSpotNumber()+ " parkingSpot");
                    return true;
                }
            }
        }
        return false;
    }
    public void displayAvailablity(){
        for(Level level : levelList){
            level.displayAvailablity();
        }
    }
}
