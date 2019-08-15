package com.rhys.flights;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name= "flights")
public class Flight {

    @Id
    private Long id;

    @Column(name = "depair")
    private String depair;

    @Column(name = "destair")
    private String destair;

    @Column(name = "indepartcode")
    private String indepartcode;

    @Column(name = "inarrivecode")
    private String inarrivecode;

    @Column(name = "outflightno")
    private String outflightno;

    @Column(name = "outdepartdate")
    private LocalDate outdepartdate;

    @Column(name = "outdeparttime")
    private LocalTime outdeparttime;

    @Column(name = "outarrivaldate")
    private LocalDate outarrivaldate;

    @Column(name = "outarrivaltime")
    private LocalTime outarrivaltime;

    @Column(name = "outbookingclass")
    private String outbookingclass;

    @Column(name = "outflightclass")
    private String outflightclass;

    @Column(name = "outcarriercode")
    private String outcarriercode;

    @Column(name = "inflightno")
    private String inflightno;

    @Column(name = "indepartdate")
    private LocalDate indepartdate;

    @Column(name = "indeparttime")
    private LocalTime indeparttime;

    @Column(name = "inarrivaldate")
    private LocalDate inarrivaldate;

    @Column(name = "inarrivaltime")
    private LocalTime inarrivaltime;

    @Column(name = "inbookingclass")
    private String inbookingclass;

    @Column(name = "inflightclass")
    private String inflightclass;

    @Column(name = "incarriercode")
    private String incarriercode;

    @Column(name = "originalprice")
    private Double originalprice;

    @Column(name = "originalcurrency")
    private String originalcurrency;

    @Column(name = "reservation")
    private String reservation;

    @Column(name = "carrier")
    private String carrier;

    @Column(name = "oneway")
    private String oneway;

    @JsonIgnore
    @OneToMany(mappedBy="flightid", fetch = FetchType.LAZY)
    private List<FlightSegments> flightSegments;


    public Flight(Long id, String depair, String destair, String indepartcode, String inarrivecode, String outflightno, LocalDate outdepartdate, LocalTime outdeparttime, LocalDate outarrivaldate, LocalTime outarrivaltime, String outbookingclass, String outflightclass, String outcarriercode, String inflightno, LocalDate indepartdate, LocalTime indeparttime, LocalDate inarrivaldate, LocalTime inarrivaltime, String inbookingclass, String inflightclass, String incarriercode, Double originalprice, String originalcurrency, String reservation, String carrier, String oneway) {
        this.id = id;
        this.depair = depair;
        this.destair = destair;
        this.indepartcode = indepartcode;
        this.inarrivecode = inarrivecode;
        this.outflightno = outflightno;
        this.outdepartdate = outdepartdate;
        this.outdeparttime = outdeparttime;
        this.outarrivaldate = outarrivaldate;
        this.outarrivaltime = outarrivaltime;
        this.outbookingclass = outbookingclass;
        this.outflightclass = outflightclass;
        this.outcarriercode = outcarriercode;
        this.inflightno = inflightno;
        this.indepartdate = indepartdate;
        this.indeparttime = indeparttime;
        this.inarrivaldate = inarrivaldate;
        this.inarrivaltime = inarrivaltime;
        this.inbookingclass = inbookingclass;
        this.inflightclass = inflightclass;
        this.incarriercode = incarriercode;
        this.originalprice = originalprice;
        this.originalcurrency = originalcurrency;
        this.reservation = reservation;
        this.carrier = carrier;
        this.oneway = oneway;
    }

    public Flight() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDepair() {
        return depair;
    }

    public void setDepair(String depair) {
        this.depair = depair;
    }

    public String getDestair() {
        return destair;
    }

    public void setDestair(String destair) {
        this.destair = destair;
    }

    public String getIndepartcode() {
        return indepartcode;
    }

    public void setIndepartcode(String indepartcode) {
        this.indepartcode = indepartcode;
    }

    public String getInarrivecode() {
        return inarrivecode;
    }

    public void setInarrivecode(String inarrivecode) {
        this.inarrivecode = inarrivecode;
    }

    public String getOutflightno() {
        return outflightno;
    }

    public void setOutflightno(String outflightno) {
        this.outflightno = outflightno;
    }

    public LocalDate getOutdepartdate() {
        return outdepartdate;
    }

    public void setOutdepartdate(LocalDate outdepartdate) {
        this.outdepartdate = outdepartdate;
    }

    public LocalTime getOutdeparttime() {
        return outdeparttime;
    }

    public void setOutdeparttime(LocalTime outdeparttime) {
        this.outdeparttime = outdeparttime;
    }

    public LocalDate getOutarrivaldate() {
        return outarrivaldate;
    }

    public void setOutarrivaldate(LocalDate outarrivaldate) {
        this.outarrivaldate = outarrivaldate;
    }

    public LocalTime getOutarrivaltime() {
        return outarrivaltime;
    }

    public void setOutarrivaltime(LocalTime outarrivaltime) {
        this.outarrivaltime = outarrivaltime;
    }

    public String getOutbookingclass() {
        return outbookingclass;
    }

    public void setOutbookingclass(String outbookingclass) {
        this.outbookingclass = outbookingclass;
    }

    public String getOutflightclass() {
        return outflightclass;
    }

    public void setOutflightclass(String outflightclass) {
        this.outflightclass = outflightclass;
    }

    public String getOutcarriercode() {
        return outcarriercode;
    }

    public void setOutcarriercode(String outcarriercode) {
        this.outcarriercode = outcarriercode;
    }

    public String getInflightno() {
        return inflightno;
    }

    public void setInflightno(String inflightno) {
        this.inflightno = inflightno;
    }

    public LocalDate getIndepartdate() {
        return indepartdate;
    }

    public void setIndepartdate(LocalDate indepartdate) {
        this.indepartdate = indepartdate;
    }

    public LocalTime getIndeparttime() {
        return indeparttime;
    }

    public void setIndeparttime(LocalTime indeparttime) {
        this.indeparttime = indeparttime;
    }

    public LocalDate getInarrivaldate() {
        return inarrivaldate;
    }

    public void setInarrivaldate(LocalDate inarrivaldate) {
        this.inarrivaldate = inarrivaldate;
    }

    public LocalTime getInarrivaltime() {
        return inarrivaltime;
    }

    public void setInarrivaltime(LocalTime inarrivaltime) {
        this.inarrivaltime = inarrivaltime;
    }

    public String getInbookingclass() {
        return inbookingclass;
    }

    public void setInbookingclass(String inbookingclass) {
        this.inbookingclass = inbookingclass;
    }

    public String getInflightclass() {
        return inflightclass;
    }

    public void setInflightclass(String inflightclass) {
        this.inflightclass = inflightclass;
    }

    public String getIncarriercode() {
        return incarriercode;
    }

    public void setIncarriercode(String incarriercode) {
        this.incarriercode = incarriercode;
    }

    public Double getOriginalprice() {
        return originalprice;
    }

    public List<FlightSegments> getFlightSegments() {
        return flightSegments;
    }

    public void setFlightSegments(List<FlightSegments> flightSegments) {
        this.flightSegments = flightSegments;
    }

    public void setOriginalprice(Double originalprice) {
        this.originalprice = originalprice;
    }

    public String getOriginalcurrency() {
        return originalcurrency;
    }

    public void setOriginalcurrency(String originalcurrency) {
        this.originalcurrency = originalcurrency;
    }

    public String getReservation() {
        return reservation;
    }

    public void setReservation(String reservation) {
        this.reservation = reservation;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getOneway() {
        return oneway;
    }

    public void setOneway(String oneway) {
        this.oneway = oneway;
    }
}
