/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.sql.Date;
import java.sql.Time;
import javax.persistence.Column;
/**
 *
 * @author Lijoe
 */
@Getter
@Setter
@ToString
@Entity
@Table(name = "time_sheet")
public class Timesheet {
    
    @Column(name = "LOGINID")
    private Long loginid;
    @Column(name = "tsdate")
    private Date tsdate;
    @Column(name = "checkin")
    private Time checkin;
    @Column(name = "checkout")
    private Time checkout;
    @Column(name = "totalhours")
    private double totalhours;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timeid")
    private Long timeid;
    @Column(name = "btstart")
    private Time btstart;
    @Column(name = "btend")
    private Time btend;
    @Column(name = "breakflag")
    private String breakflag;
    @Column(name = "comment")
    
    private String comment;
    @Column(name = "otstart")
    private Time otstart;
    @Column(name = "otend")
    private Time otend;
    @Column(name = "otbtstart")
    private Time otbtstart;
    @Column(name = "otbtend")
    private Time otbtend;
    @Column(name = "daytype")
    private String daytype;
    
    
}
