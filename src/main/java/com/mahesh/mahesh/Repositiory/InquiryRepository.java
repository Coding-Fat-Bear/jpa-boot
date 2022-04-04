/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mahesh.mahesh.Repositiory;

import com.mahesh.mahesh.Model.Inquiry;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Admin Mahesh
 */
public interface InquiryRepository extends JpaRepository<Inquiry, Long> {
    
}
