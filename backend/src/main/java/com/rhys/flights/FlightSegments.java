package com.rhys.flights;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "flight_segments")
public class FlightSegments {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonIgnore
    @ManyToOne
    @JoinColumn(name = "flightid")
    private Flight flightid;

    @Column(name = "depcode")
    private String depcode;

    @Column(name = "arrcode")
    private String arrcode;

    @Column(name = "depdate")
    private LocalDate depdate;

    @Column(name = "arrdate")
    private LocalDate arrdate;

    @Column(name = "deptime")
    private LocalTime deptime;

    @Column(name = "arrtime")
    private LocalTime arrtime;

    @Column(name = "depterminal")
    private String depterminal;

    @Column(name = "arrterminal")
    private String arrterminal;

    @Column(name = "flightno")
    private String flightno;

    @Column(name = "journey")
    private String journey;

    @Column(name = "class")
    private String payclass;

    @Column(name = "bookingclass")
    private String bookingclass;

    public FlightSegments() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepcode() {
        return depcode;
    }


    public void setDepcode(String depcode) {
        this.depcode = depcode;
    }

    public String getArrcode() {
        return arrcode;
    }

    public void setArrcode(String arrcode) {
        this.arrcode = arrcode;
    }

    public LocalDate getDepdate() {
        return depdate;
    }

    public void setDepdate(LocalDate depdate) {
        this.depdate = depdate;
    }

    public LocalDate getArrdate() {
        return arrdate;
    }

    public void setArrdate(LocalDate arrdate) {
        this.arrdate = arrdate;
    }

    public LocalTime getDeptime() {
        return deptime;
    }

    public void setDeptime(LocalTime deptime) {
        this.deptime = deptime;
    }

    public LocalTime getArrtime() {
        return arrtime;
    }

    public void setArrtime(LocalTime arrtime) {
        this.arrtime = arrtime;
    }

    public String getDepterminal() {
        return depterminal;
    }

    public void setDepterminal(String depterminal) {
        this.depterminal = depterminal;
    }

    public String getArrterminal() {
        return arrterminal;
    }

    public void setArrterminal(String arrterminal) {
        this.arrterminal = arrterminal;
    }

    public String getFlightno() {
        return flightno;
    }

    public void setFlightno(String flightno) {
        this.flightno = flightno;
    }

    public String getJourney() {
        return journey;
    }

    public void setJourney(String journey) {
        this.journey = journey;
    }

    public String getPayclass() {
        return payclass;
    }

    public void setPayclass(String payclass) {
        this.payclass = payclass;
    }

    public String getBookingclass() {
        return bookingclass;
    }

    public void setBookingclass(String bookingclass) {
        this.bookingclass = bookingclass;
    }

    public Flight getFlightid() {
        return flightid;
    }

    public void setFlightid(Flight flightid) {
        this.flightid = flightid;
    }
}
