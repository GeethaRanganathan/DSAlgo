package parkingLot.controller;

import parkingLot.dto.GenerateTicketResponseDTO;
import parkingLot.model.Gate;
import parkingLot.model.Vehicle;
import parkingLot.service.TicketService;

import java.util.Date;

public class TicketController {
    private TicketService ticketService;
    TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }
    GenerateTicketResponseDTO generateTicket(Vehicle vehicle, Date entryTime, Gate gate){
        return  null;
    }
}
