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
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureParameter;
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
@Table
//@NamedStoredProcedureQueries({
    @NamedStoredProcedureQuery(name="empgetdet",
        procedureName = "employeeget",
        parameters = {@StoredProcedureParameter(mode = ParameterMode.IN,name = "empcod",type = Long.class)})
//})
public class Empadd {
    
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "EMPCOD")
    private Long empcod;
    
//    @Column(name = "CCOD")
    private String ccod;
    
//    @Column(name = "EMPNAM")
    private String empnam;
    
//    @Column(name = "EMPDOB")
    private String empdob;
    
//    @Column(name = "GENDER")
    private String gender;
    
//    @Column(name = "ADDNO")
    private String addno;
    
//    @Column(name = "BIZID")
    private String bizid;
    
//    @Column(name = "DPTCOD")
    private String dptcod;
    
//    @Column(name = "EMPTYP")
    private String emptyp;
    
//    @Column(name = "QUALI")
    private String quali;
    
//    @Column(name = "BANCOD")
    private String bancod;
    
//    @Column(name = "RANKCOD")
    private String rankcod;
    
//    @Column(name = "MODUL")
    private String modul;
    
//    @Column(name = "SPLNGID")
    private String splngid;
    
//    @Column(name = "PGMLANG")
    private String pgmlang;
    
//    @Column(name = "EXSAP")
    private String exsap;
    
//    @Column(name = "EXPIT")
    private String expit;
    
//    @Column(name = "RESERV")
    private String reserv;
    
//    @Column(name = "ACTFLG")
    private String actflg;
    
//    @Column(name = "BASSAL")
    private String bassal;
    
//    @Column(name = "INCNT")
    private String incnt;
    
//    @Column(name = "BONUS")
    private String bonus;
    
//    @Column(name = "SOCINS")
    private String socins;
    
//    @Column(name = "HELINS")
    private String helins;
    
//    @Column(name = "STATBEN")
    private String statben;
    
//    @Column(name = "HRALW")
    private String hralw;
    
//    @Column(name = "TAX")
    private String tax;
    
//    @Column(name = "PENSION")
    private String pension;
    
//    @Column(name = "LOAN")
    private String loan;
    
//    @Column(name = "BILRATE")
    private String bilrate;
    
//    @Column(name = "CREDT")
    private String credt;
    
//    @Column(name = "ACTSTRDT")
    private String actstrdt;
    
//    @Column(name = "ACTENDT")
    private String actendt;
    
//    @Column(name = "STREET1")
    private String street1;
    
//    @Column(name = "STREET2")
    private String street2;
    
//    @Column(name = "STREET3")
    private String street3;
    
//    @Column(name = "CITY")
    private String city;
    
//    @Column(name = "STATE")
    private String state1;
    
//    @Column(name = "CNTRY")
    private String cntry;
    
//    @Column(name = "PINCODE")
    private String pincode;
    
//    @Column(name = "PHONE1")
    private String phone1;
    
//    @Column(name= "PHONE2")
    private String phone2;
    
//    @Column(name = "FAXNO")
    private String faxno;
    
//    @Column(name = "EMAIL")
    private String email;
    
//    @Column(name = "LNGID")
    private String lngid;
    
}
