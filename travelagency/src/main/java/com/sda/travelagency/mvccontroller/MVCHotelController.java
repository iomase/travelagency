package com.sda.travelagency.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCHotelController {

    @GetMapping("/viewHotels")
    public String viewHotels(){
        return "hotels-list";
    }

}
