package problems.ParkingLot;

import problems.ParkingLot.Vehicle.Vehicle;

public class ParkingSpot {

    private final int spotNumber;
    private final VehicleType vehicleType;
    private Vehicle parkedVehicle;

    public ParkingSpot(int spotNumber, VehicleType vehicleType) {
        this.spotNumber = spotNumber;
        this.vehicleType = vehicleType;
    }

    public boolean isAvailable(){
        return parkedVehicle==null;
    }
    public void parkVehicle(Vehicle vehicle){
        if(isAvailable() && vehicle.getType()==vehicleType){
            this.parkedVehicle = vehicle;
        }
        else{
            throw new IllegalArgumentException("Invallid Vehicle Type or Spot Already Occupied");
        }
    }
    public void unParkVehicle() {
        this.parkedVehicle = null;
    }
    public int getSpotNumber(){
        return spotNumber;
    }
    public VehicleType getVehicleType(){
        return vehicleType;
    }

    public Vehicle getParkedVehicle(){
        return this.parkedVehicle;
    }

}
