package com.sda.travelagency.controller;

import com.sda.travelagency.dto.HotelDTO;
import com.sda.travelagency.dto.TripDTO;
import com.sda.travelagency.service.HotelService;
import com.sda.travelagency.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class TripController {

    @Autowired
    private TripService tripService;

    @PostMapping("/api/addTrip")
    public ResponseEntity addHotel(@RequestBody TripDTO tripDTO) {
        tripService.addTrip(tripDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/api/getAllTrips")
    public ResponseEntity getAllTrips() {
        List<TripDTO> tripDTOList = tripService.getTrips();
        return ResponseEntity.ok(tripDTOList);
    }

}
