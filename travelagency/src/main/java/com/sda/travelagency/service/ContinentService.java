package com.sda.travelagency.service;


import com.sda.travelagency.dto.CityDTO;
import com.sda.travelagency.dto.ContinentDTO;
import com.sda.travelagency.entity.City;
import com.sda.travelagency.entity.Continent;
import com.sda.travelagency.repository.CityRepository;
import com.sda.travelagency.repository.ContinentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContinentService {
    @Autowired
    private ContinentRepository continentRepository;

    public void addContinent(ContinentDTO continentDTO){

        Continent continent = new Continent();
        continent.setIsoCode(continentDTO.getIsoCode());
        continent.setDescription(continentDTO.getDescription());
        continent.setRating(continentDTO.getRating());
        continentRepository.save(continent);


    }

    public List<ContinentDTO> getContinentals(){
        List<Continent> continentals = continentRepository.findAll();
        List<ContinentDTO> continentDTOList = new ArrayList<>();

        for(Continent continent: continentals){

            ContinentDTO continentDTO = new ContinentDTO();
            continentDTO.setIsoCode(continent.getIsoCode());
            continentDTO.setName(continent.getName());
            continentDTO.setDescription(continent.getDescription());
            continentDTO.setRating(continent.getRating());

        }
        return continentDTOList;
    }


}
