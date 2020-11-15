package com.sda.travelagency.service;

import com.sda.travelagency.dto.HotelDTO;
import com.sda.travelagency.entity.Hotel;
import com.sda.travelagency.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public void addHotel(HotelDTO hotelDTO) {
        Hotel hotel = new Hotel();
        hotel.setIsoCode(hotelDTO.getIsoCode());
        hotel.setName(hotelDTO.getName());
        hotel.setDescription(hotelDTO.getDescription());
        hotel.setRating(hotelDTO.getRating());
        hotelRepository.save(hotel);

    }

    public List<HotelDTO> getHotels() {
        List<Hotel> hotels = hotelRepository.findAll();
        List<HotelDTO> hotelDTOList = new ArrayList<>();

        for (Hotel hotel : hotels) {
            HotelDTO hotelDTO = new HotelDTO();
            hotelDTO.setIsoCode(hotel.getIsoCode());
            hotelDTO.setName(hotel.getName());
            hotelDTO.setDescription(hotel.getDescription());
            hotelDTO.setRating(hotel.getRating());
            hotelDTOList.add(hotelDTO);
        }

        return hotelDTOList;

    }

}
