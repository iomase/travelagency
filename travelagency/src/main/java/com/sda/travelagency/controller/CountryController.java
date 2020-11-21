package com.sda.travelagency.controller;


import com.sda.travelagency.dto.CountryDTO;
import com.sda.travelagency.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;

    @PostMapping("/api/addCountry")
    public ResponseEntity addCountry (@RequestBody CountryDTO countryDTO){
        countryService.addCountry(countryDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @GetMapping("/api/getAllCountries")
    public ResponseEntity getAllCities(){
        List<CountryDTO> countryDTOList = countryService.getCountries();
        return ResponseEntity.ok(countryDTOList);
    }




}
