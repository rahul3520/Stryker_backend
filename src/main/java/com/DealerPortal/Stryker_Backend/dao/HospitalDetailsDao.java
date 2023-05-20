package com.DealerPortal.Stryker_Backend.dao;

import com.DealerPortal.Stryker_Backend.model.HospitalDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface HospitalDetailsDao extends JpaRepository<HospitalDetailsModel,Integer> {

    @Query(value = "SELECT * FROM `hospitaldetails` WHERE `customer_name`=:customerName",nativeQuery = true)
    List<HospitalDetailsModel> FetchHospitalDetails(@Param("customerName") String customerName);
}
