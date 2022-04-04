/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mahesh.mahesh.Controller;

import com.mahesh.mahesh.Model.Inquiry;
import com.mahesh.mahesh.Service.InquiryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin Mahesh
 */

//CORS Policy Error Resolvig
@CrossOrigin
//mark class as Controller 
    @RestController
public class InquiryController {
        
        //autowire the EstimationService class
    @Autowired
    InquiryService inqService;
    
//creating a get mapping that retrieves all the inquiries detail from the database
    @GetMapping("/Inquiries")
    public @ResponseBody List<Inquiry> getAllInquiries()   
    {  
     return inqService.getAllInquiries();  
    }   
    
     //creating a get mapping that retrieves the detail of a specific inquiry  
    @GetMapping("/Inquiries/{inqno}")  
    public Inquiry getInquiries(@PathVariable("inqno") long inqno)   
    {  
    return inqService.getInquiriesById(inqno);  
    } 
    
        //creating post mapping that post the inquiry detail in the database  
    @PostMapping("/createInquiry")  
    public Inquiry saveInquiry(@RequestBody Inquiry inquiry)   
    {  
    return inqService.saveInquiry(inquiry);    
    }
    
        //creating a delete mapping that deletes a specified estimation  
    @DeleteMapping("/Inquiries/{inqno}")   
    public void deleteInquiry(@PathVariable("inqno") long inqno)   
    {  
    inqService.delete(inqno);  
    } 
    
        //creating put mapping that updates the estimation detail   
    @PutMapping("/editInquiry/{inqno}")  
    public Inquiry updateInquiry(@PathVariable("inqno") long inqno, @RequestBody Inquiry inquiry)   
    {  
    return inqService.updateInquiry(inqno, inquiry);  
    }
    
}
