package parkingLot.repository;

import parkingLot.model.Ticket;

public interface TicketRepository {
    public Ticket save(Ticket ticket);
    public Ticket get(int ticketID);
}
