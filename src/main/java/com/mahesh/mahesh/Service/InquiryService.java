/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mahesh.mahesh.Service;

import com.mahesh.mahesh.Model.Inquiry;
import com.mahesh.mahesh.Repositiory.InquiryRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin Mahesh
 */

  public interface InquiryService {
      public List<Inquiry> getAllInquiries();
      public Inquiry getInquiriesById(long id);
      public Inquiry saveInquiry(Inquiry inquiry);
      public void delete(long id);
      public Inquiry updateInquiry(long inqno, Inquiry inquiry);
  }


//@Service
//public class InquiryService {
//    
//       @Autowired 
//           InquiryRepository inqRepository;
//       
//           //getting all Estimations record by using the method findaAll() of Jpa/CrudRepository
//
//        public List<Inquiry> getAllInquiries()   
//    {  
//    List<Inquiry> inquiry = new ArrayList<Inquiry>();  
//    inqRepository.findAll().forEach(inq1 -> inquiry.add(inq1));  
//    return inquiry;  
//    }
//        
//        //getting a specific record by using the method findById() of Jpa/CrudRepository
//    public Inquiry getInquiriesById(long id) {
//       return inqRepository.findById(id).get();
//    }
//    
//    //saving a specific record by using the method save() of Jpa/CrudRepository  
//     public Inquiry saveInquiry(Inquiry inquiry)   
//        {  
//      return inqRepository.save(inquiry);  
//      }
//    
//         //deleting a specific record by using the method deleteById() of Jpa/CrudRepository  
//     public void delete(long id)   
//       {  
//      inqRepository.deleteById(id);  
//       }
//          //updating a record  
//    public Inquiry updateInquiry(long inqno, Inquiry inquiry)   
//    {  
//    return inqRepository.save(inquiry);  
//    } 
//    
//}
