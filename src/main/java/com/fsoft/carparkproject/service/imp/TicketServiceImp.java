package com.fsoft.carparkproject.service.imp;

import com.fsoft.carparkproject.dto.TicketDTO;
import com.fsoft.carparkproject.model.Ticket;
import com.fsoft.carparkproject.model.Trip;
import com.fsoft.carparkproject.repository.TicketRepository;
import com.fsoft.carparkproject.repository.TripRepository;
import com.fsoft.carparkproject.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class TicketServiceImp implements TicketService {
    private final TicketRepository ticketRepository;
    private final TripRepository tripRepository;

    @Override
    public List<Ticket> getAllTicket() {
        return ticketRepository.findAll();
    }

    @Override
    @Transactional
    public void addTicket(TicketDTO ticketDTO) {
        ticketRepository.save(mapTicket(ticketDTO));
    }

    @Override
    @Transactional
    public void deleteById(Long idTicket) {
        ticketRepository.deleteById(idTicket);
    }

    private Ticket mapTicket(TicketDTO ticketDTO) {
        Trip trip = tripRepository.findById(ticketDTO.getIdTrip()).get();
        return Ticket.builder().bookingTime(Date.from(Instant.now()))
                .customerName(ticketDTO.getCustomerName())
                .licensePlate(ticketDTO.getLicensePlate())
                .trip(trip).build();
    }
}
