package com.sda.travelagency.controller;

import com.sda.travelagency.dto.HotelDTO;
import com.sda.travelagency.dto.PurchaseTripDTO;
import com.sda.travelagency.entity.PurchaseTrip;
import com.sda.travelagency.service.HotelService;
import com.sda.travelagency.service.PurchaseTripService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
public class PurchaseTripController {

    @Autowired
    private PurchaseTripService purchaseTripService;

    @PostMapping("/api/addPurchaseTrip")
    public ResponseEntity addPurchaseTrip(@RequestBody PurchaseTripDTO purchaseTripDTO) {
        purchaseTripService.addPurchaseTrip(purchaseTripDTO);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    @GetMapping("/api/getAllPurchaseTrips")
    public ResponseEntity getAllPurchaseTrips() {
        List<PurchaseTripDTO> purchaseTripDTOList = purchaseTripService.getPurchaseTrips();
        return ResponseEntity.ok(purchaseTripDTOList);
    }

}
