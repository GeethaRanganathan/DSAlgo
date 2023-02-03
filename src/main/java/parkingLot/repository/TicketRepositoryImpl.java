package parkingLot.repository;

import parkingLot.model.Ticket;
import parkingLot.service.TicketServiceImpl;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class TicketRepositoryImpl implements TicketRepository {
    private Map<Long, Ticket> tickets;
    private Long idSq;

    public TicketRepositoryImpl(){
        this.tickets = new HashMap<>();
        this.idSq = 1000L;
    }
    @Override
    public Ticket save(Ticket ticket){
        tickets.put(idSq++, ticket);
        ticket.setId(idSq++);
        return ticket;
    }
    @Override
    public Ticket get(int ticketID){
        return tickets.get(ticketID);
    }
}
