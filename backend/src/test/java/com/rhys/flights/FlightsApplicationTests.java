package com.rhys.flights;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static junit.framework.TestCase.assertEquals;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FlightsApplicationTests {

	@Autowired
	FlightRepository flightRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void findFlightsByDepairAndDestair(){
		List<Flight> found = flightRepository.findFlightsByDepairAndDestair("LHR", "DXB");
		assertEquals(false, found.isEmpty());
	}

	@Test
	public void countFlightsByDepairAndDestair(){
		List<Flight> found = flightRepository.findFlightsByDepairAndDestair("LHR", "DXB");
		assertEquals(107, found.size());
	}

}
