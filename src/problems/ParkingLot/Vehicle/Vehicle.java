package problems.ParkingLot.Vehicle;

import problems.ParkingLot.VehicleType;

public abstract class Vehicle {
    protected String vehiclePlateNumber;
    protected VehicleType vehicleType;

    public Vehicle(String vehiclePlateNumber, VehicleType vehicleType){
        this.vehiclePlateNumber = vehiclePlateNumber;
        this.vehicleType = vehicleType;
    }

    public String getVehiclePlateNumber(){
        return vehiclePlateNumber;
    }
    public VehicleType getType(){
        return vehicleType;
    }
}
