/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Service;

import com.agnie.RestAPI.Model.Estimation;
import java.util.List;


/**
 *
 * @author Admin Mahesh
 */
 
public interface EstimationService {
    public List<Estimation> getAllEstimations();
    public Estimation getEstimationsById(long id);
    public Estimation saveEstimation(Estimation estimation);
    public void delete(long id);
    public Estimation updateEstimation(long estmno, Estimation estimation);
}
 
//@Service
//public class EstimationService {
//
//    @Autowired
//            EstimationRepository estRepository;
//
//    //getting all Estimations record by using the method findaAll() of Jpa/CrudRepository
//
//        public List<Estimation> getAllEstimations()   
//    {  
//    List<Estimation> estimation = new ArrayList<Estimation>();  
//    estRepository.findAll().forEach(est1 -> estimation.add(est1));  
//    return estimation;  
//    } 
//
////getting a specific record by using the method findById() of Jpa/CrudRepository
//    public Estimation getEstimationsById(long id) {
//       return estRepository.findById(id).get();
//    }
//
//    //saving a specific record by using the method save() of Jpa/CrudRepository  
//     public Estimation saveEstimation(Estimation estimation)   
//        {  
//      return estRepository.save(estimation);  
//      }  
//
//          //deleting a specific record by using the method deleteById() of Jpa/CrudRepository  
//     public void delete(long id)   
//       {  
//      estRepository.deleteById(id);  
//       }
//     
//         //updating a record  
//    public Estimation updateEstimation(long estmno, Estimation estimation)   
//    {  
//    return estRepository.save(estimation);  
//    } 
//
//}
