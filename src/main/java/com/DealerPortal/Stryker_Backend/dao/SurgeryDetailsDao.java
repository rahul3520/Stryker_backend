package com.DealerPortal.Stryker_Backend.dao;

import com.DealerPortal.Stryker_Backend.model.SurgeryDetailsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SurgeryDetailsDao extends JpaRepository<SurgeryDetailsModel,Integer> {

    @Query(value = "SELECT * FROM `surgerydetails` WHERE `ticket_id`=:ticketId",nativeQuery = true)
    List<SurgeryDetailsModel> FindbyTicketId(@Param("ticketId") String ticketId);

}
