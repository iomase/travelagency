package com.sda.travelagency.controller;

import com.sda.travelagency.dto.HotelDTO;
import com.sda.travelagency.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @PostMapping("/api/addHotel")
    public ResponseEntity addHotel(@RequestBody HotelDTO hotelDTO) {
        hotelService.addHotel(hotelDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/api/getAllHotels")
    public ResponseEntity getAllHotels() {
        List<HotelDTO> hotelDTOList = hotelService.getHotels();
        return ResponseEntity.ok(hotelDTOList);
    }

}
