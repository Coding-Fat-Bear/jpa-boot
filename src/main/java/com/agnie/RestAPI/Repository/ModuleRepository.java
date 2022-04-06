/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.agnie.RestAPI.Model.Module;

/**
 *
 * @author Admin
 */
public interface ModuleRepository extends JpaRepository<Module, String> {
    
}
