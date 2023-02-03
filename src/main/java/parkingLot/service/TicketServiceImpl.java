package parkingLot.service;

import parkingLot.model.Ticket;
import parkingLot.model.VehicleType;
import parkingLot.repository.TicketRepositoryImpl;

public class TicketServiceImpl implements TicketService{
    private TicketRepositoryImpl ticketRepository;
    TicketServiceImpl(TicketRepositoryImpl ticketRepository){
        this.ticketRepository = ticketRepository;
    }
    @Override
    public Ticket generateTicket(String vehicleNumber, long gateId, VehicleType vehicleType){
        return null;
    }
}
