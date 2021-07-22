package com.fsoft.carparkproject.repository;

import com.fsoft.carparkproject.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket,Long> {
}
