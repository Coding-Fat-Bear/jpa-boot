/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Repository;

import com.agnie.RestAPI.Model.Employee;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Welcome
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    
    public Optional<Employee> findByEmpcod(Long empcod);
    
}
