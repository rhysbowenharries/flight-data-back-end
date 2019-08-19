package com.rhys.flights;

import org.springframework.data.rest.core.config.Projection;

import java.time.LocalDate;
import java.time.LocalTime;

@Projection(name = "embedSegment", types = Flight.class)
public interface EmbedSegments {
    Long getId();
    String getDepcode();
    String getArrcode();
    LocalDate getDepdate();
    LocalDate getArrdate();
    LocalTime getDeptime();
    LocalTime getArrtime();
    String getDepterminal();
    String getArrterminal();
    String getFlightno();
    String getJourney();
    String getPayclass();
    String getBookingclass();
    Flight getFlightid();
}
