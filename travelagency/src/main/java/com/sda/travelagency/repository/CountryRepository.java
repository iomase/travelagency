package com.sda.travelagency.repository;

import com.sda.travelagency.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository <Country, Long>{
}
