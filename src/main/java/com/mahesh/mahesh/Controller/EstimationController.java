    /*
    * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
    * and open the template in the editor.
    */
    package com.mahesh.mahesh.Controller;

    import com.mahesh.mahesh.Model.Estimation;
    import com.mahesh.mahesh.Service.EstimationService;
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
    //@CrossOrigin
    //mark class as Controller 
    @RestController
    public class EstimationController {

    //autowire the EstimationService class
    @Autowired
     EstimationService estService;

    //creating a get mapping that retrieves all the estimations detail from the database
    @GetMapping("/Estimations")
    public @ResponseBody List<Estimation> getAllEstimations()   
    {  
     return estService.getAllEstimations();  

    } 

     // creating a get mapping that retrieves the detail of a specific Estimation  
    @GetMapping("/Estimations/{estmno}")  
    public Estimation getEstimations(@PathVariable("estmno") long estmno)   
    {  
    return estService.getEstimationsById(estmno);  
    } 
    
         //creating post mapping that post the estimation detail in the database  
    @PostMapping("/createEstimation")  
    public Estimation saveEstimation(@RequestBody Estimation estimation)   
    {  
    return estService.saveEstimation(estimation);    
    }  
    
        //creating a delete mapping that deletes a specified estimation  
    @DeleteMapping("/Estimations/{estmno}")  
    public void deleteEstimation(@PathVariable("estmno") long estmno)   
    {  
    estService.delete(estmno);  
    } 
    
        //creating put mapping that updates the estimation detail   
    @PutMapping("/editEstimation/{estmno}")  
    public Estimation updateEstimation(@PathVariable("estmno") long estmno, @RequestBody Estimation estimation)   
    {  
    return estService.updateEstimation(estmno, estimation);  
    }

    }
