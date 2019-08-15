package com.rhys.flights;

import org.springframework.data.jpa.repository.JpaRepository;

public interface flightRepository extends JpaRepository<Flight, Long> {
}
