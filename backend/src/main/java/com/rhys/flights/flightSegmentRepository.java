package com.rhys.flights;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = embedSegments.class)
public interface flightSegmentRepository extends JpaRepository<FlightSegments, Long> {
}
