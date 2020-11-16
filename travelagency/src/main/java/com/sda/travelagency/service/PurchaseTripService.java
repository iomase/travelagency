package com.sda.travelagency.service;

import com.sda.travelagency.dto.PurchaseTripDTO;
import com.sda.travelagency.entity.PurchaseTrip;
import com.sda.travelagency.repository.PurchaseTripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PurchaseTripService {

    @Autowired
    private PurchaseTripRepository purchaseTripRepository;

    public void addPurchaseTrip(PurchaseTripDTO purchaseTripDTO) {
        PurchaseTrip purchaseTrip = new PurchaseTrip();
        purchaseTrip.setIsoCode(purchaseTripDTO.getIsoCode());
        purchaseTrip.setTrip(purchaseTripDTO.getTrip());
        purchaseTrip.setClientDetails(purchaseTripDTO.getClientDetails());
        purchaseTrip.setAmount(purchaseTripDTO.getAmount());
        purchaseTripRepository.save(purchaseTrip);

    }

    public List<PurchaseTripDTO> getPurchaseTrips() {
        List<PurchaseTrip> purchaseTrips = purchaseTripRepository.findAll();
        List<PurchaseTripDTO> purchaseTripDTOList = new ArrayList<>();

        for (PurchaseTrip purchaseTrip : purchaseTrips) {
            PurchaseTripDTO purchaseTripDTO = new PurchaseTripDTO();
            purchaseTripDTO.setIsoCode(purchaseTrip.getIsoCode());
            purchaseTripDTO.setTrip(purchaseTrip.getTrip());
            purchaseTripDTO.setClientDetails(purchaseTrip.getClientDetails());
            purchaseTripDTO.setAmount(purchaseTrip.getAmount());
            purchaseTripDTOList.add(purchaseTripDTO);
        }

        return purchaseTripDTOList;

    }

}
