package com.sda.travelagency.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCTripController {

    @GetMapping("/viewTrips")
    public String viewTrips(){
        return "trips-list";
    }


}
