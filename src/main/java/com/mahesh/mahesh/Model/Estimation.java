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
    @Table(name = "Estimation_Master")

    public class Estimation implements Serializable {
        //Defining Estimation no as primary key 
        @Id
        @Column
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long estmno;
        @Column(name = "estmdes")
        private String estmdes;
        @Column(name = "prjno")
        private String prjno;
        @Column(name = "estrevno")
        private String estrevno;
        @Column(name = "ccod")
        private String ccod;
        @Column(name = "inqno")
        private int inqno;
        @Column(name = "curr")
        private String curr;
        @Column(name = "taxcode")
        private String taxcode;
        @Column(name = "discount")
        private float discount;
        @Column(name = "frmdt")
        private String frmdt;
        @Column(name = "todt")
        private String todt;
        @Column(name = "delloc")
        private String delloc;
        @Column(name = "delvrbls")
        private String delvrbls;
        @Column(name = "estmamt")
        private double estmamt;
        @Column(name = "estmtxt1")
        private String estmtxt1;
        @Column(name = "estmtxt2")
        private String estmtxt2;
        @Column(name = "estmtxt3")
        private String estmtxt3;
        @Column(name = "delflg")
        private String delflg;
        @Column(name = "credt")
        private String credt;
        @Column(name = "cretim")
        private String cretim;

    }
