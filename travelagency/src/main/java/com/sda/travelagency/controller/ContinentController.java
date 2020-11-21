package com.sda.travelagency.controller;



import com.sda.travelagency.dto.ContinentDTO;
import com.sda.travelagency.service.ContinentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class ContinentController {

    @Autowired
    private ContinentService continentService;

    @PostMapping("/api/addContinent")
    public ResponseEntity addContinent (@RequestBody ContinentDTO continentDTO){
        continentService.addContinent(continentDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }
    @GetMapping("/api/getAllContinentals")
    public ResponseEntity getAllContinents(){
        List<ContinentDTO> continentDTOList = continentService.getContinentals();
        return ResponseEntity.ok(continentDTOList);
    }

}
