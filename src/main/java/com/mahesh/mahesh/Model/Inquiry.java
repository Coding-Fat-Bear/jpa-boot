/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mahesh.mahesh.Model;

import java.io.Serializable;
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
 * @author Admin Mahesh
 */

    //mark class as an Entity
    @Entity

    // Getter and Setter Methods
    @Getter
    @Setter
    @ToString

    //defining Table name in Class
    @Table(name = "Inquiry")

public class Inquiry implements Serializable {
            //Defining Estimation no as primary key 
        @Id
        @Column
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long inqno;
        @Column
        private String ccod;
        @Column
        private Long empno;
        @Column
        private String assnper;
        @Column
        private String bizid;
        @Column
        private String modul;
        @Column
        private String lngid;
        @Column
        private String frmdt;
        @Column
        private String todt;
        @Column
        private String posbper;
        @Column
        private String prjdes;
        @Column
        private String prjsts;
        @Column
        private String phaseid;
        @Column
        private double estmamt;
        @Column
        private String curr;
        @Column
        private double tax;
        @Column
        private String unit;
        @Column
        private int qty;
        @Column
        private double rate;
        @Column 
        private String custno;
        @Column
        private String eusrno;
        @Column
        private String custinfo;
        @Column 
        private String remarks;
        @Column
        private String actflg;
        @Column
        private String credt;
        @Column
        private String cretim;
    
}
