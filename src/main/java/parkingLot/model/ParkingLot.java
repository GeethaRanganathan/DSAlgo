package parkingLot.model;

import java.util.List;

public class ParkingLot extends BaseModel{
    private  ParkingFloor parkingFloor;
    private List<VehicleType> supportedVehicleType;
    private ParkingLotStatus parkingLotStatus;
    int number;

    public ParkingFloor getParkingFloor() {
        return parkingFloor;
    }

    public void setParkingFloor(ParkingFloor parkingFloor) {
        this.parkingFloor = parkingFloor;
    }

    public List<VehicleType> getSupportedVehicleType() {
        return supportedVehicleType;
    }

    public void setSupportedVehicleType(List<VehicleType> supportedVehicleType) {
        this.supportedVehicleType = supportedVehicleType;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
