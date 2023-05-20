package com.DealerPortal.Stryker_Backend.dao;

import com.DealerPortal.Stryker_Backend.model.OtherTicketsModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OtherTicketsDao extends JpaRepository<OtherTicketsModel,Integer> {

    @Query(value = "SELECT * FROM `othertickets` WHERE `ticket_number`!=:ticketNumber",nativeQuery = true)
    List<OtherTicketsModel> FindAllOtherTickets(@Param("ticketNumber") String ticketNumber);
}
