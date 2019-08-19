package com.rhys.flights;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(excerptProjection = EmbedSegments.class)
public interface FlightSegmentRepository extends JpaRepository<FlightSegments, Long> {
}
