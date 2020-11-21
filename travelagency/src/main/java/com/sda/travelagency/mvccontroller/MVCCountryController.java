package com.sda.travelagency.mvccontroller;


import com.sda.travelagency.dto.AirportDTO;
import com.sda.travelagency.dto.CountryDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MVCCountryController {

    @GetMapping("/viewCountry")
    public String viewCountry(){
        return "country-list";
    }

    @GetMapping("viewAddCountry")
    public String viewAddCountryPage(Model model){
        model.addAttribute("country",new CountryDTO());
        return "view-add-country";
    }
    @PostMapping("addCountry")
    public String addCountry(@ModelAttribute CountryDTO countryDTO){
        addCountry(countryDTO);
        return "redirect:country-List";
    }


}
