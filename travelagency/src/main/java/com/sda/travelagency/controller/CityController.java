package com.sda.travelagency.controller;


import com.sda.travelagency.dto.CityDTO;
import com.sda.travelagency.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping("/api/addCity")
    public ResponseEntity addCity(@RequestBody CityDTO cityDTO) {
        cityService.addCity(cityDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/api/getAllCities")
    public ResponseEntity getAllCities() {
        List<CityDTO> cityDTOList = cityService.getCitys();
        return ResponseEntity.ok(cityDTOList);
    }
}
