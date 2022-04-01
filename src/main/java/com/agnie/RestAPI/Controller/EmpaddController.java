/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Controller;

import com.agnie.RestAPI.Model.Empadd;
import com.agnie.RestAPI.Repository.EmpaddRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Welcome
 */

@RestController
public class EmpaddController {
    
    @Autowired
    private EmpaddRepository empgrpo;
    
    @GetMapping("/employeedetail/{empcod}")
    public List<Empadd> getEmpadd(@PathVariable Long empcod){
        
    return empgrpo.getEmpaddById(empcod);
    }
    
}
