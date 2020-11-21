package com.sda.travelagency.mvccontroller;

import com.sda.travelagency.dto.HotelDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MVCHotelController {

    @GetMapping("/viewHotels")
    public String viewHotels() {
        return "hotels-list";
    }

    @GetMapping("/viewAddHotel")
    public String viewAddHotelPage(Model model) {
        model.addAttribute("hotel", new HotelDTO());
        return "view-add-hotel";
    }

    @PostMapping("addHotel")
    public String addHotel(@ModelAttribute HotelDTO hotelDTO) {
        addHotel(hotelDTO);
        return "redirect: hotels-list";
    }

}
