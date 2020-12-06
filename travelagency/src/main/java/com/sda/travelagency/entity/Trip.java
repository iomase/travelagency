package com.sda.travelagency.entity;

import javax.persistence.*;

@Entity
public class Trip {

    private Long isoCode;
    private String departureDate;
    private String returnDate;
    private String numberOfDays;
    private String type;
    private Integer adultPrice;
    private Integer childPrice;
    private String promoted;
    private String numberOfBedsAdults;
    private String getNumberOfBedsChildren;

    @ManyToOne
    private City fromCity;
    @ManyToOne
    private Airport fromAirport;
    @ManyToOne
    private City toCity;
    @ManyToOne
    private Hotel toHotel;
    @ManyToOne
    private Airport toAirport;


    public Trip() {
    }

    public Trip(String departureDate, String returnDate, String numberOfDays, String type,
                Integer adultPrice, Integer childPrice, String promoted,
                String numberOfBedsAdults, String getNumberOfBedsChildren) {
        this.departureDate = departureDate;
        this.returnDate = returnDate;
        this.numberOfDays = numberOfDays;
        this.type = type;
        this.adultPrice = adultPrice;
        this.childPrice = childPrice;
        this.promoted = promoted;
        this.numberOfBedsAdults = numberOfBedsAdults;
        this.getNumberOfBedsChildren = getNumberOfBedsChildren;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(Long isoCode) {
        this.isoCode = isoCode;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    public String getNumberOfDays() {
        return numberOfDays;
    }

    public void setNumberOfDays(String numberOfDays) {
        this.numberOfDays = numberOfDays;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getAdultPrice() {
        return adultPrice;
    }

    public void setAdultPrice(Integer adultPrice) {
        this.adultPrice = adultPrice;
    }

    public Integer getChildPrice() {
        return childPrice;
    }

    public void setChildPrice(Integer childPrice) {
        this.childPrice = childPrice;
    }

    public String getPromoted() {
        return promoted;
    }

    public void setPromoted(String promoted) {
        this.promoted = promoted;
    }

    public String getNumberOfBedsAdults() {
        return numberOfBedsAdults;
    }

    public void setNumberOfBedsAdults(String numberOfBedsAdults) {
        this.numberOfBedsAdults = numberOfBedsAdults;
    }

    public String getGetNumberOfBedsChildren() {
        return getNumberOfBedsChildren;
    }

    public void setGetNumberOfBedsChildren(String getNumberOfBedsChildren) {
        this.getNumberOfBedsChildren = getNumberOfBedsChildren;
    }

}
