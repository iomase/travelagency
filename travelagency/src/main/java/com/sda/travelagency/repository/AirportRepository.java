package com.sda.travelagency.repository;

import com.sda.travelagency.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepository extends JpaRepository <Airport, Long>{
}
