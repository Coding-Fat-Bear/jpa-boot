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
@Table(name = "Employee_Master")

public class Employee {
        
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EMPCOD")
    private Long empcod;
    
    @Column(name = "CCOD")
    private String ccod;
    
    @Column(name = "EMPNAM")
    private String empnam;
    
    @Column(name = "EMPDOB")
    private String empdob;
    
    @Column(name = "GENDER")
    private String gender;
    
    @Column(name = "ADDNO")
    private String addno;
    
    @Column(name = "BIZID")
    private String bizid;
    
    @Column(name = "DPTCOD")
    private String dptcod;
    
    @Column(name = "EMPTYP")
    private String emptyp;
    
    @Column(name = "QUALI")
    private String quali;
    
    @Column(name = "BANCOD")
    private String bancod;
    
    @Column(name = "RANKCOD")
    private String rankcod;
    
    @Column(name = "MODUL")
    private String modul;
    
    @Column(name = "SPLNGID")
    private String splngid;
    
    @Column(name = "PGMLANG")
    private String pgmlang;
    
    @Column(name = "EXSAP")
    private String exsap;
    
    @Column(name = "EXPIT")
    private String expit;
    
    @Column(name = "RESERV")
    private String reserv;
    
    @Column(name = "ACTFLG")
    private String actflg;
    
    @Column(name = "BASSAL")
    private String bassal;
    
    @Column(name = "INCNT")
    private String incnt;
    
    @Column(name = "BONUS")
    private String bonus;
    
    @Column(name = "SOCINS")
    private String socins;
    
    @Column(name = "HELINS")
    private String helins;
    
    @Column(name = "STATBEN")
    private String statben;
    
    @Column(name = "HRALW")
    private String hralw;
    
    @Column(name = "TAX")
    private String tax;
    
    @Column(name = "PENSION")
    private String pension;
    
    @Column(name = "LOAN")
    private String loan;
    
    @Column(name = "BILRATE")
    private String bilrate;
    
    @Column(name = "CREDT")
    private String credt;
    
    @Column(name = "ACTSTRDT")
    private String actstrdt;
    
    @Column(name = "ACTENDT")
    private String actendt;
    
     
}
