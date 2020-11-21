package com.sda.travelagency.mvccontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MVCPurchaseTripController {

    @GetMapping("/viewPurchaseTrips")
    public String viewPurchaseTrips(){
        return "purchaseTrips-list";
    }

}
