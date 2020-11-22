package com.sda.travelagency.mvccontroller;

import com.sda.travelagency.dto.HotelDTO;
import com.sda.travelagency.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
public class MVCHotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/viewHotels")
    public String viewHotels(Model model) {
        List<HotelDTO> hotelList = hotelService.getHotels();
        model.addAttribute("hotels", hotelList);
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
