package com.sda.travelagency.service;

import com.sda.travelagency.dto.TripDTO;
import com.sda.travelagency.entity.Trip;
import com.sda.travelagency.repository.TripRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
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

    public List<TripDTO> getTrips(){
        List<Trip> trips = tripRepository.findAll();
        List<TripDTO> tripDTOList = new ArrayList<>();

        for(Trip trip : trips) {
            TripDTO tripDTO = new TripDTO();
            tripDTO.setIsoCode(tripDTO.getIsoCode());
            tripDTO.setDepartureDate(tripDTO.getDepartureDate());
            tripDTO.setReturnDate(tripDTO.getReturnDate());
            tripDTO.setNumberOfDays(tripDTO.getNumberOfDays());
            tripDTO.setType(tripDTO.getType());
            tripDTO.setAdultPrice(tripDTO.getAdultPrice());
            tripDTO.setChildPrice(tripDTO.getChildPrice());
            tripDTO.setPromoted(tripDTO.getPromoted());
            tripDTO.setNumberOfBedsAdults(tripDTO.getNumberOfBedsAdults());
            tripDTO.setGetNumberOfBedsChildren(tripDTO.getGetNumberOfBedsChildren());
            tripDTOList.add(tripDTO);
        }

        return tripDTOList;

    }

}
