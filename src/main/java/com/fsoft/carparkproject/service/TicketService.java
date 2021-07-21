package com.fsoft.carparkproject.service;

import com.fsoft.carparkproject.dto.TicketDTO;
import com.fsoft.carparkproject.model.Ticket;

import java.util.List;

public interface TicketService {

    List<Ticket> getAllTicket();

    void addTicket(TicketDTO ticketDTO);

    void deleteById(Long idTicket);
}
