package com.sda.travelagency.mvccontroller;


import com.sda.travelagency.dto.AirportDTO;
import com.sda.travelagency.dto.ContinentDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MVCContinentController {

    @GetMapping("/viewContinent")
    public String viewContinent() {
        return "continent-list";
    }

    @GetMapping("viewAddContinent")
    public String viewAddContinentPage(Model model) {
        model.addAttribute("continent", new ContinentDTO());
        return "view-add-continent";
    }

    @PostMapping("addAirport")
    public String addContinent(@ModelAttribute ContinentDTO continentDTO) {
        addContinent(continentDTO);
        return "redirect:continent-list";
    }

}
