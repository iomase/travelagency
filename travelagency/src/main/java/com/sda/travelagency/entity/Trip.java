package com.sda.travelagency.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
