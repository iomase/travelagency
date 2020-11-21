package com.sda.travelagency.mvccontroller;

import com.sda.travelagency.dto.TripDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MVCTripController {

    @GetMapping("/viewTrips")
    public String viewTrips() {
        return "trips-list";
    }

    @GetMapping("/viewAddTrip")
    public String viewAddTripPage(Model model) {
        model.addAttribute("trip", new TripDTO());
        return "view-add-trip";
    }

    @PostMapping("/viewTrip")
    public String addTrip(@ModelAttribute TripDTO tripDTO) {
        addTrip(tripDTO);
        return "redirect: trips-list";
    }

}
