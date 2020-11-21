package com.sda.travelagency.mvccontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCCityController {

    @GetMapping("/viewCities")
    public String viewCities(){
        return "cities-list";
    }
}
