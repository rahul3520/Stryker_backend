package com.DealerPortal.Stryker_Backend.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="othertickets")
public class OtherTicketsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "ticket_number")
    private String ticketNumber;

    @Column(name="requested_date")
    private Date requestedDate;

    @Column(name = "return_date")
    private Date returnDate;

    @Column(name = "status")
    private String status;

    public OtherTicketsModel() {
    }

    public OtherTicketsModel(int id, String ticketNumber, Date requestedDate, Date returnDate, String status) {
        this.id = id;
        this.ticketNumber = ticketNumber;
        this.requestedDate = requestedDate;
        this.returnDate = returnDate;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getRequestedDate() {
        return requestedDate;
    }

    public void setRequestedDate(Date requestedDate) {
        this.requestedDate = requestedDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
