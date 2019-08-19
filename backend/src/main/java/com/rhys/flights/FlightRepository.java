package com.rhys.flights;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin
@Repository
public interface FlightRepository extends JpaRepository<Flight, Long>, FlightRepositoryCustom {
    List<Flight> findFlightsByDepairAndDestair(String depair, String destair);
    List<Flight> findFlightsByDepair(String depair);
}
