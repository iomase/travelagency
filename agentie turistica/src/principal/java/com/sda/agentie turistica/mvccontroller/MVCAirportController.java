package com.sda.travelagency.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCAirportController {
    @GetMapping("/viewAirports")
    public String viewAirports(){
        return "airports-list";
    }
        @GetMapping("viewAddAirport")
    public String viewAddAirportPage(Model model){
        model.addAttribute("airport",new AirportDTO());
        return "view-add-airport";
    }
    @PostMapping("addAirport")
    public String addAirport(@ModelAttribute AirportDTO airportDTO){
       addAirport(airportDTO);
        return "redirect:airports-List";
    }
}
