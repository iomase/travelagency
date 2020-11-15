package com.sda.travelagency.service;


import com.sda.travelagency.dto.CityDTO;
import com.sda.travelagency.entity.Airport;
import com.sda.travelagency.entity.City;
import com.sda.travelagency.repository.AirportRepository;
import com.sda.travelagency.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CityService {
    @Autowired
    private CityRepository cityRepository;

    public void addCity(CityDTO cityDTO){

        City city = new City();
        city.setIsoCode(cityDTO.getIsoCode());
        city.setDescription(cityDTO.getDescription());
        city.setRating(cityDTO.getRating());
        cityRepository.save(city);


    }

    public List<CityDTO> getCitys(){
        List<City> citys = cityRepository.findAll();
        List<CityDTO> cityDTOList = new ArrayList<>();


        for(City city: citys){

            CityDTO cityDTO = new CityDTO();
            cityDTO.setIsoCode(city.getIsoCode());
            cityDTO.setName(city.getName());
            cityDTO.setDescription(city.getDescription());
            cityDTO.setRating(city.getRating());

        }
        return cityDTOList;
    }



}
