package com.sda.travelagency.controller;

import com.sda.travelagency.dto.HotelDTO;
import com.sda.travelagency.dto.TripDTO;
import com.sda.travelagency.service.HotelService;
import com.sda.travelagency.service.TripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class TripController {

    @Autowired
    private TripService tripService;

    @PostMapping("/api/addTrip")
    public void addHotel(@RequestBody TripDTO tripDTO) {
        tripService.addTrip(tripDTO);
    }

}
