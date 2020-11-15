package com.sda.travelagency.repository;

import com.sda.travelagency.entity.PurchaseTrip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.temporal.TemporalAmount;

@Repository
public interface PurchaseTripRepository extends JpaRepository<PurchaseTrip, Long> {


}
