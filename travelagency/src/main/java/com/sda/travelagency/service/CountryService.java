package com.sda.travelagency.service;


import com.sda.travelagency.dto.CityDTO;
import com.sda.travelagency.dto.CountryDTO;
import com.sda.travelagency.entity.City;
import com.sda.travelagency.entity.Country;
import com.sda.travelagency.repository.CityRepository;
import com.sda.travelagency.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;

    public void addCountry(CountryDTO countryDTO){

        Country country = new Country();
        country.setIsoCode(countryDTO.getIsoCode());
        country.setDescription(countryDTO.getDescription());
        country.setRating(countryDTO.getRating());
        countryRepository.save(country);


    }

    public List<CountryDTO> getCountries(){
        List<Country> countries = countryRepository.findAll();
        List<CountryDTO> countryDTOList = new ArrayList<>();

        for(Country country: countries){

            CountryDTO countryDTO = new CountryDTO();
            countryDTO.setIsoCode(country.getIsoCode());
            countryDTO.setName(country.getName());
            countryDTO.setDescription(country.getDescription());
            countryDTO.setRating(country.getRating());
            countryDTOList.add(countryDTO);

        }
        return countryDTOList;
    }





}
