package com.rhys.flights;

import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
public interface FlightRepositoryCustom {
    List<Flight> findFlightsByDepairAndDestair(String depair, String destair);
    List<Flight> findFlightsByDepair(String depair);
}
