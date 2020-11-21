package com.sda.travelagency.controller;

import com.sda.travelagency.dto.HotelDTO;
import com.sda.travelagency.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/api/addHotel")
    public void addHotel(@RequestBody HotelDTO hotelDTO) {
        hotelService.addHotel(hotelDTO);
    }

}
