package com.UST.FlightService.service;

import com.UST.FlightService.dto.BookingRequest;
import com.UST.FlightService.dto.FlightBookingAcknowledgement;
import com.UST.FlightService.entity.Passengerinfo;
import com.UST.FlightService.entity.Paymentinfo;
import com.UST.FlightService.exception.InsufficentAmountException;
import com.UST.FlightService.repo.Passengerrepo;
import com.UST.FlightService.repo.Paymentrepo;
import com.UST.FlightService.utils.PaymentUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class FlightBookingService {
    @Autowired
    private Passengerrepo passengerrepo;
    @Autowired
    private Paymentrepo paymentrepo;
    @Transactional
    public FlightBookingAcknowledgement bookingFlightTicket(BookingRequest request) throws InsufficentAmountException {
        Passengerinfo passengerinfo=request.getPassengerinfo();
        passengerinfo= passengerrepo.save(passengerinfo);
        Paymentinfo paymentinfo=request.getPaymentinfo();
        PaymentUtils.validateCreditLimit(paymentinfo.getAccountNo(),passengerinfo.getFare());
        paymentinfo.setPassengerId(passengerinfo.getPId());
        paymentinfo.setAmount(passengerinfo.getFare());
        paymentrepo.save(paymentinfo);

        return new FlightBookingAcknowledgement("success",passengerinfo.getFare(),
                UUID.randomUUID().toString().split("-")[0],passengerinfo);



    }
}
