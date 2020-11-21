package com.sda.travelagency.mvccontroller;

import com.sda.travelagency.dto.AirportDTO;
import com.sda.travelagency.service.AirportService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

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
