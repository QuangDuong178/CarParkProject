package com.fsoft.carparkproject.controller;

import com.fsoft.carparkproject.dto.TicketDTO;
import com.fsoft.carparkproject.model.Ticket;
import com.fsoft.carparkproject.service.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/v1/ticket")
public class TicketController {
    private final TicketService ticketService;

    @GetMapping
    public List<Ticket> getAllTicket() {
        return ticketService.getAllTicket();
    }

    @PostMapping
    public ResponseEntity<Void> addTicket(@RequestBody TicketDTO ticketDTO) {
        ticketService.addTicket(ticketDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{idTicket}")
    public ResponseEntity<Void> deleteById(@PathVariable Long idTicket) {
        ticketService.deleteById(idTicket);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
