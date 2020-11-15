package com.sda.travelagency.dto;

public class HotelDTO {

    private Long isoCode;
    private String name;
    private String rating;
    private String description;


    public HotelDTO(Long isoCode, String name, String rating, String description) {
        this.isoCode = isoCode;
        this.name = name;
        this.rating = rating;
        this.description = description;
    }

    public HotelDTO() {

    }

    public Long getIsoCode() {
        return isoCode;
    }

    public void setIsoCode(Long isoCode) {
        this.isoCode = isoCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
