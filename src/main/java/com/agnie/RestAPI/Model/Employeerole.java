/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "Auth_EMPRole")
public class Employeerole {
    
    @Id
    @Column(name = "EMPCOD")
    private Long rempcod;
    
    @Column(name = "ROLEID")
    private String rroleid;
    
}
