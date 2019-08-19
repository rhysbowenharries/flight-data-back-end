package com.rhys.flights;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/flights")
public class FlightController {

    @Autowired
    FlightRepository flightRepository;

    @GetMapping(value = "/from/{depair}/to/{destair}")
    public List<Flight> findFlightsByDepairAndDestair(@PathVariable String depair, @PathVariable String destair){
        return flightRepository.findFlightsByDepairAndDestair(depair, destair);
    }

    @GetMapping(value = "/from/{depair}")
    public List<Flight> findFlightsByDepair(@PathVariable String depair){
        return flightRepository.findFlightsByDepair(depair);
    }

    @GetMapping(value = "/all")
    public List<Flight> findAll(){
        return flightRepository.findAll();
    }


}
