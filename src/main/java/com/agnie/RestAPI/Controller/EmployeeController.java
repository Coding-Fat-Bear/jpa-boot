/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Controller;

import com.agnie.RestAPI.Model.Employee;
import com.agnie.RestAPI.Repository.EmployeeRepository;
import com.agnie.RestAPI.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Welcome
 */
@CrossOrigin
@RestController
public class EmployeeController {
    
    @Autowired
    private EmployeeService empServ;
    private  EmployeeRepository empRpo;
    
    @GetMapping("/Employee/{empcod}")
    public Employee getEmployee(@PathVariable long empcod) {
        return empServ.getEmployee(empcod);
    }
    
    
}
