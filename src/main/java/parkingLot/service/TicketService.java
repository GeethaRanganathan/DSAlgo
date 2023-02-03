package parkingLot.service;

import parkingLot.model.Ticket;
import parkingLot.model.VehicleType;

public interface TicketService{
    Ticket generateTicket(String vehicleNumber, long gateId, VehicleType vehicleType);
}
