package com.UST.FlightService.dto;

import com.UST.FlightService.entity.Passengerinfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data


public class FlightBookingAcknowledgement {
    private String Status;
    public double amount;
    private String pnrno;
    private Passengerinfo passengerinfo;

}
