package com.sda.travelagency.mvccontroller;

import com.sda.travelagency.dto.PurchaseTripDTO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MVCPurchaseTripController {

    @GetMapping("/viewPurchaseTrips")
    public String viewPurchaseTrips() {
        return "purchaseTrips-list";
    }

    @GetMapping("/viewAddPurchaseTrip")
    public String viewAddPurchaseTripPage(Model model) {
        model.addAttribute("purchaseTrip", new PurchaseTripDTO());
        return "view-add-purchaseTrip";
    }

    @PostMapping("/viewPurchaseTrip")
    public String addPurchaseTrip(@ModelAttribute PurchaseTripDTO purchaseTripDTO) {
        addPurchaseTrip(purchaseTripDTO);
        return "redirect: purchaseTrips-list";
    }

}
