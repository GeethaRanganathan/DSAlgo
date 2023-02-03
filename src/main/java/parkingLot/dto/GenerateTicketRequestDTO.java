package parkingLot.dto;

import parkingLot.model.Vehicle;
import parkingLot.model.VehicleType;

public class GenerateTicketRequestDTO {
    private String vehicleNumber;
    private long gateID;
    private VehicleType vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public long getGateID() {
        return gateID;
    }

    public void setGateID(long gateID) {
        this.gateID = gateID;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
