package com.sda.travelagency.mvccontroller;


import com.sda.travelagency.dto.AirportDTO;
import com.sda.travelagency.dto.CityDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MVCCityController {

    @GetMapping("/viewCities")
    public String viewCities(){
        return "cities-list";
    }

    @GetMapping("viewAddCity")
    public String viewAddCityPage(Model model){
        model.addAttribute("city",new CityDTO());
        return "view-add-city";
    }
    @PostMapping("addCity")
    public String addCity(@ModelAttribute CityDTO cityDTO){
        addCity(cityDTO);
        return "redirect:cities-List";
    }

}
