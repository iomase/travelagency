package com.sda.travelagency.dto;

public class AirportDTO {
    private Long id;
    private String IsoCode;
    private String description;
    private String name;
    private String rating;

    public Long getId() {
        return id;
    }

    public String getIsoCode() {
        return IsoCode;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getRating() {
        return rating;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIsoCode(String isoCode) {
        IsoCode = isoCode;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
