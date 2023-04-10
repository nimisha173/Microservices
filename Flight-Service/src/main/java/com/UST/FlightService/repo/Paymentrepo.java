package com.UST.FlightService.repo;

import com.UST.FlightService.entity.Paymentinfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Paymentrepo extends JpaRepository<Paymentinfo,String> {
}
