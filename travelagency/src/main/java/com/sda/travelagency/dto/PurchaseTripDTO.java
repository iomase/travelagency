package com.sda.travelagency.dto;

public class PurchaseTripDTO {

    private Long isoCode;
    private String trip;
    private String clientDetails;
    private Integer amount;

    public PurchaseTripDTO(Long isoCode, String trip, String clientDetails, Integer amount) {
        this.isoCode = isoCode;
        this.trip = trip;
        this.clientDetails = clientDetails;
        this.amount = amount;
    }

    public PurchaseTripDTO() {

    }

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

    public String getClientDetails() {
        return clientDetails;
    }

    public void setClientDetails(String clientDetails) {
        this.clientDetails = clientDetails;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

}
