package com.example.controllers;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entities.Airport;
import com.example.services.AirportService;

@RestController
@RequestMapping("/api/airports")
@CrossOrigin("*")
public class AirportController {

    @Autowired
    private AirportService airportService;

    /**
     * Get airport by its code.
     * 
     * @param code the code of the airport.
     * @return the airport matching the provided code, wrapped in Optional.
     */
    @GetMapping("/{code}")
    public Optional<Airport> getAirportByCode(@PathVariable String code) {
        return airportService.getAirportByCode(code);
    }

    /**
     * Get all airports.
     * 
     * @return a list of all airports.
     */
    @GetMapping
    public List<Airport> getAllAirports() {
        return airportService.getAllAirports();
    }
}
