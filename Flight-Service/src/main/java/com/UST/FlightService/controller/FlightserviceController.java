package com.UST.FlightService.controller;

import com.UST.FlightService.dto.BookingRequest;
import com.UST.FlightService.dto.FlightBookingAcknowledgement;
import com.UST.FlightService.exception.InsufficentAmountException;
import com.UST.FlightService.service.FlightBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FlightserviceController {
    @Autowired
    private FlightBookingService flightBookingService;
    @PostMapping("/booking")
    public FlightBookingAcknowledgement bookingFlightTicket(@RequestBody BookingRequest request) throws InsufficentAmountException {
        return flightBookingService.bookingFlightTicket(request);
    }
}
