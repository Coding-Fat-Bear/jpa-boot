/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.ServiceImpl;

import com.agnie.RestAPI.Model.Employee;
import com.agnie.RestAPI.Repository.EmployeeRepository;
import com.agnie.RestAPI.Service.EmployeeService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Welcome
 */
@Service
public class EmployeeServiceimpl implements EmployeeService{
    
    @Autowired
    private EmployeeRepository emprpo;
    
    @Override
    public Employee getEmployee(Long empcod){
        
        Optional<Employee> employee = emprpo.findByEmpcod(empcod);
        if(employee.isPresent()){
            return employee.get();
            
        }
        throw new RuntimeException("There is no employee for this ID "+empcod);
    
    }
    
}
