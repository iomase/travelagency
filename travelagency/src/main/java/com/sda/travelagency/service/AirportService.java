package com.sda.travelagency.service;

import com.sda.travelagency.dto.AirportDTO;
import com.sda.travelagency.entity.Airport;
import com.sda.travelagency.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AirportService {

   @Autowired
   private AirportRepository airportRepository;

   public void addAirport(AirportDTO  airportDTO){

       Airport airport = new Airport();
       airport.setIsoCode(airportDTO.getIsoCode());
       airport.setDescription(airportDTO.getDescription());
       airport.setRating(airportDTO.getRating());
       airportRepository.save(airport);


   }

   public List <AirportDTO> getAirports(){
       List<Airport> airports = airportRepository.findAll();
       List<AirportDTO> airportDTOList = new ArrayList<>();

       for(Airport airport: airports){

           AirportDTO airportDTO = new AirportDTO();
           airportDTO.setIsoCode(airport.getIsoCode());
           airportDTO.setName(airport.getName());
           airportDTO.setDescription(airport.getDescription());
           airportDTO.setRating(airport.getRating());
           airportDTOList.add(airportDTO);

       }
       return airportDTOList;
   }


}
