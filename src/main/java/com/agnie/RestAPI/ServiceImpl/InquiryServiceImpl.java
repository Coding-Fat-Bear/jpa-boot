/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.ServiceImpl;

import com.agnie.RestAPI.Model.Inquiry;
import com.agnie.RestAPI.Repository.InquiryRepository;
import com.agnie.RestAPI.Service.InquiryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */

@Service
public class InquiryServiceImpl implements InquiryService {
    
    
    @Autowired 
            InquiryRepository inqRepository;
    
     //getting all Estimations record by using the method findaAll() of Jpa/CrudRepository
    @Override
    public List<Inquiry> getAllInquiries() {
        System.out.println(inqRepository);
        return inqRepository.findAll();   
    }

     //getting a specific record by using the method findById() of Jpa/CrudRepository
    @Override
    public Inquiry getInquiriesById(long id) {
        return inqRepository.findById(id).get();      
    }

    //saving a specific record by using the method save() of Jpa/CrudRepository 
    @Override
    public Inquiry saveInquiry(Inquiry inquiry) {
        return inqRepository.save(inquiry);      
    }

    //deleting a specific record by using the method deleteById() of Jpa/CrudRepository 
    @Override
    public void delete(long id) {
       inqRepository.deleteById(id);
    }

      //updating a record 
    @Override
    public Inquiry updateInquiry(long inqno, Inquiry inquiry) {
        return inqRepository.save(inquiry);
    }
    
}
