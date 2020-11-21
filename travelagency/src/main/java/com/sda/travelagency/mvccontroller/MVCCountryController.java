package com.sda.travelagency.mvccontroller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCCountryController {

    @GetMapping("/viewCountry")
    public String viewCountry(){
        return "country-list";
    }
}
