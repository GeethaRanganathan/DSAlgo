package parkingLot.model;

import java.util.List;

public class ParkingSpot extends BaseModel{
    private ParkingFloor parkingFloor;
    private List<String> SupportedVehicleType;
    private ParkingSpotStatus parkingSpotStatus;
    private int number;

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<String> getSupportedVehicleType() {
        return SupportedVehicleType;
    }

    public void setSupportedVehicleType(List<String> supportedVehicleType) {
        SupportedVehicleType = supportedVehicleType;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
