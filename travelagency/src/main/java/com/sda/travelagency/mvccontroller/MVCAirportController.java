package com.sda.travelagency.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCAirportController {
    @GetMapping("/viewAirports")
    public String viewAirports(){
        return "airports-list";
    }
}
