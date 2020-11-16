package com.sda.travelagency.repository;

import com.sda.travelagency.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository <City, Long>{
}
