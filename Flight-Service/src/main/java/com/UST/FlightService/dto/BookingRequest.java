package com.UST.FlightService.dto;

import com.UST.FlightService.entity.Passengerinfo;
import com.UST.FlightService.entity.Paymentinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class BookingRequest {
    private Passengerinfo passengerinfo;
    private Paymentinfo paymentinfo;


}
