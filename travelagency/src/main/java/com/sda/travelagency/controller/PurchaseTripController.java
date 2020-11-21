package com.sda.travelagency.controller;

import com.sda.travelagency.dto.HotelDTO;
import com.sda.travelagency.dto.PurchaseTripDTO;
import com.sda.travelagency.entity.PurchaseTrip;
import com.sda.travelagency.service.HotelService;
import com.sda.travelagency.service.PurchaseTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class PurchaseTripController {

    @Autowired
    private PurchaseTripService purchaseTripService;

    @PostMapping("/api/addPurchaseTrip")
    public void addPurchaseTrip(@RequestBody PurchaseTripDTO purchaseTripDTO) {
        purchaseTripService.addPurchaseTrip(purchaseTripDTO);
    }

}
