/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Model;

import java.io.Serializable;
import java.time.LocalDate;
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
 * @author Admin
 */
 //mark class as an Entity
    @Entity

    // Getter and Setter Methods
    @Getter
    @Setter
    @ToString

    //defining Table name in Class
    @Table(name = "Business_Line")

public class BusinessLine implements Serializable {
             //Defining Module no as primary key 
        @Id
        @Column
      //  @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String bizid;
        @Column
        private String biz_text;
    
}
