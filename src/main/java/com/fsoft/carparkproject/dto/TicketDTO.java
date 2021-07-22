package com.fsoft.carparkproject.dto;

import com.fsoft.carparkproject.model.Trip;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class TicketDTO {

    private Long idTicket;
    private Date bookingTime;
    private String customerName;
    private String licensePlate;
    private Long idTrip;
}
