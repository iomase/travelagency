package com.sda.travelagency.repository;

import com.sda.travelagency.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.naming.Name;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long> {


}
