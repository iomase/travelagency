package com.sda.travelagency.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class PurchaseTrip {

    private Long isoCode;
    private String trip;
    private String tripDetails;
    private Integer amount;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(Long isoCode) {
        this.isoCode = isoCode;
    }

    public String getTrip() {
        return trip;
    }

    public void setTrip(String trip) {
        this.trip = trip;
    }

    public String getTripDetails() {
        return tripDetails;
    }

    public void setTripDetails(String tripDetails) {
        this.tripDetails = tripDetails;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
