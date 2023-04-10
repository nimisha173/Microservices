package com.UST.FlightService.repo;

import com.UST.FlightService.entity.Passengerinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Passengerrepo extends JpaRepository<Passengerinfo,Long> {
}
