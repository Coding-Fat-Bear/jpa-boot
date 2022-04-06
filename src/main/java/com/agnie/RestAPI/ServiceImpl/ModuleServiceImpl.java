/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.ServiceImpl;

import com.agnie.RestAPI.Model.Module;
import com.agnie.RestAPI.Repository.ModuleRepository;
import com.agnie.RestAPI.Service.ModuleService;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class ModuleServiceImpl implements ModuleService {
    
    @Autowired 
            ModuleRepository modRepository;

    @Override
    public List<Module> getAllModules() {
//               LocalDate localDate = LocalDate.now();
//               LocalTime localTime = LocalTime.now();
//       System.out.println(localDate);
//       System.out.println(localTime);
    System.out.println(modRepository);
        return modRepository.findAll();
    }
    
}
