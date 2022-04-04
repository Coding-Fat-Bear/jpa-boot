/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.ServiceImpl;

import com.agnie.RestAPI.Model.Estimation;
import com.agnie.RestAPI.Repository.EstimationRepository;
import com.agnie.RestAPI.Service.EstimationService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class EstimationServiceImpl implements EstimationService {
    
    @Autowired
    private EstimationRepository estRepository;

    //getting all Estimations record by using the method findaAll() of Jpa/CrudRepository
    @Override
    public List<Estimation> getAllEstimations() {
        System.out.println(estRepository);
        return estRepository.findAll();
    }
    
    //getting a specific record by using the method findById() of Jpa/CrudRepository
    @Override
     public Estimation getEstimationsById(long id) {
       return estRepository.findById(id).get();
    }
    
    //saving a specific record by using the method save() of Jpa/CrudRepository
    @Override 
     public Estimation saveEstimation(Estimation estimation)   
        {  
      return estRepository.save(estimation);  
      }
     
     //deleting a specific record by using the method deleteById() of Jpa/CrudRepository  
     @Override
     public void delete(long id)   
       {  
      estRepository.deleteById(id);  
       }
     
          //updating a record 
      @Override
      public Estimation updateEstimation(long estmno, Estimation estimation)   
        {  
        return estRepository.save(estimation);  
        } 
      
      
//    @Override
//    public Estimation saveEstimation(Estimation estimation) {
//         //To change body of generated methods, choose Tools | Templates.
//         return estRepo.save(estimation);
//    }
//
//    @Override
//    public Estimation getEstimation(Long Id) {
//         //To change body of generated methods, choose Tools | Templates.
//         Optional<Estimation> estimation= estRepo.findById(Id);
//        if(estimation.isPresent()){
//            return estimation.get();
//        }
//        throw new RuntimeException("There is no Estimation for this ID "+Id);
//    }
//
//    @Override
//    public String deleteEstimation(Long Id) {
//         //To change body of generated methods, choose Tools | Templates.
//         estRepo.deleteById(Id);
//         return "deleted";
//    }
//
//    @Override
//    public Estimation updateEstimation(Long Id, Estimation estimation) {
//         //To change body of generated methods, choose Tools | Templates.
////          estimation.setId(Id);
//        System.out.println(estimation);
//        return estRepo.save(estimation);
//    }
    
}
