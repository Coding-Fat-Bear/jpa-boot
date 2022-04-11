/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 *
 * @author Welcome
 */

@Getter
@Setter
@ToString
@Entity
@Table(name = "Address")
public class Address {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADDNO")
    private Long addno;
    
    @Column(name = "STREET1")
    private String street1;
    
    @Column(name = "STREET2")
    private String street2;
    
    @Column(name = "STREET3")
    private String street3;
    
    @Column(name = "CITY")
    private String city;
    
    @Column(name = "STATE")
    private String state1;
    
    @Column(name = "CNTRY")
    private String cntry;
    
    @Column(name = "PINCODE")
    private String pincode;
    
    @Column(name = "PHONE1")
    private String phone1;
    
    @Column(name= "PHONE2")
    private String phone2;
    
    @Column(name = "FAXNO")
    private String faxno;
    
    @Column(name = "EMAIL")
    private String email;
    
    @Column(name = "LNGID")
    private String lngid;
    
    @Column(name = "CREDT")
    private String acredt;
    
    @Column(name = "CRETIM")
    private String acretim;
    
    
    
    
}
