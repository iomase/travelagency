package com.sda.travelagency.controller;


import com.sda.travelagency.dto.AirportDTO;
import com.sda.travelagency.service.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class AirportController {

    @Autowired
    private AirportService airportService;

    @PostMapping("/api/addAirport")
    public ResponseEntity addAirport(@RequestBody AirportDTO airportDTO) {
        airportService.addAirport(airportDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/api/getAllAirports")
    public ResponseEntity getAllAirports() {
        List<AirportDTO> airportDTOList = airportService.getAirports();
        return ResponseEntity.ok(airportDTOList);
    }

}
