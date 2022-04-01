/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Service;

import com.agnie.RestAPI.Model.Employee;

/**
 *
 * @author Welcome
 */
public interface EmployeeService {
    
    Employee getEmployee(Long empcod);
    
}
