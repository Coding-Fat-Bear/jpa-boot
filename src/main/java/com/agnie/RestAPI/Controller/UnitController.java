/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Controller;

import com.agnie.RestAPI.Model.Unit;
import com.agnie.RestAPI.Service.UnitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
//CORS Policy Error Resolvig
    @CrossOrigin
//mark class as Controller 
    @RestController
public class UnitController {
            @Autowired
       UnitService untService;
    
    @GetMapping("/Units")
    public @ResponseBody List<Unit> getAllUnits()   
    {  
     return untService.getAllUnits();  
 
    }
}
