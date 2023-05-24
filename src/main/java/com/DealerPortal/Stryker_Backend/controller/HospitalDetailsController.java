package com.DealerPortal.Stryker_Backend.controller;

import com.DealerPortal.Stryker_Backend.dao.HospitalDetailsDao;
import com.DealerPortal.Stryker_Backend.dao.OtherTicketsDao;
import com.DealerPortal.Stryker_Backend.dao.SurgeryDetailsDao;
import com.DealerPortal.Stryker_Backend.model.HospitalDetailsModel;
import com.DealerPortal.Stryker_Backend.model.OtherTicketsModel;
import com.DealerPortal.Stryker_Backend.model.SurgeryDetailsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class HospitalDetailsController {

    @Autowired
    private SurgeryDetailsDao sdao;

    @Autowired
    private HospitalDetailsDao hdao;

    @Autowired
    private OtherTicketsDao odao;

    @CrossOrigin(origins = "*")
    @GetMapping("/viewAllSurgeryDetails")
    public List<SurgeryDetailsModel> ViewSurgeryDetails()
    {
        return sdao.findAll();
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewFirstRowOfSurgeryDetails")
    public Optional<SurgeryDetailsModel> LoadFirstSurgeryDetails()
    {
        return sdao.findById(1);
    }


    @CrossOrigin(origins = "*")
    @PostMapping(path = "/viewTicketDetails",produces = "application/json",consumes = "application/json")
    public List<SurgeryDetailsModel> FindSurgeryDetails(@RequestBody SurgeryDetailsModel s)
    {
        System.out.println(s.getTicketId());

        return sdao.FindbyTicketId(s.getTicketId());
    }

//    @CrossOrigin(origins = "*")
//    @GetMapping("/viewHospitalDetails")
//    public List<HospitalDetailsModel> FindHospitalDetails(@RequestParam(name = "currentHospital") String currentHospital)
//    {
////        System.out.println(h.getCustomerName());
//
////        return hdao.FetchHospitalDetails(h.getCustomerName());
//
//        return hdao.FetchHospitalDetails(currentHospital);
//    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewHospitalDetails/{currentHospital}")
    public List<HospitalDetailsModel> FindHospitalDetails(@PathVariable String currentHospital)
    {
//        System.out.println(h.getCustomerName());

//        return hdao.FetchHospitalDetails(h.getCustomerName());

        return hdao.FetchHospitalDetails(currentHospital);
    }

    @CrossOrigin(origins = "*")
    @GetMapping("/viewOtherTickets")
    public List<OtherTicketsModel> FindOtherTickets(@RequestParam String ticketId)
    {
//        System.out.println(o.getTicketNumber());
//
//        return odao.FindAllOtherTickets(o.getTicketNumber());

        return  odao.FindAllOtherTickets(ticketId);
    }


}
