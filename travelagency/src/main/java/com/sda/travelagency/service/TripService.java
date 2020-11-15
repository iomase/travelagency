package com.sda.travelagency.service;

import com.sda.travelagency.dto.TripDTO;
import com.sda.travelagency.entity.Trip;
import com.sda.travelagency.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class TripService {

    @Autowired
    private TripRepository tripRepository;

    public void addTrip(TripDTO tripDTO) {
        Trip trip = new Trip();
        trip.setIsoCode(tripDTO.getIsoCode());
        trip.setDepartureDate(tripDTO.getDepartureDate());
        trip.setReturnDate(tripDTO.getReturnDate());
        trip.setNumberOfDays(tripDTO.getNumberOfDays());
        trip.setType(tripDTO.getType());
        trip.setAdultPrice(tripDTO.getAdultPrice());
        trip.setChildPrice(tripDTO.getChildPrice());
        trip.setPromoted(tripDTO.getPromoted());
        trip.setNumberOfBedsAdults(tripDTO.getNumberOfBedsAdults());
        trip.setGetNumberOfBedsChildren(tripDTO.getGetNumberOfBedsChildren());
        tripRepository.save(trip);

    }

    public List<TripDTO> getTrips() {
        List<Trip> trips = tripRepository.findAll();
        List<TripDTO> tripDTOList = new ArrayList<>();

        for (Trip trip : trips) ;
            TripDTO tripDTO = new TripDTO();
            tripDTO.setIsoCode(trip.getIsoCode());
            tripDTO.setDepartureDate(trip.getDepartureDate());
            tripDTO.setReturnDate(trip.getReturnDate());
            tripDTO.setNumberOfDays(trip.getNumberOfDays());
            tripDTO.setType(trip.getType());
            tripDTO.setAdultPrice(trip.getAdultPrice());
            tripDTO.setChildPrice(trip.getChildPrice());
            tripDTO.setPromoted(trip.getPromoted());
            tripDTO.setNumberOfBedsAdults(trip.getNumberOfBedsAdults());
            tripDTO.setGetNumberOfBedsChildren(trip.getGetNumberOfBedsChildren());
            tripDTOList.add(tripDTO);

    }

    return tripDTOList;

}
