/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.ServiceImpl;

import com.agnie.RestAPI.Model.Phase;
import com.agnie.RestAPI.Repository.PhaseRepository;
import com.agnie.RestAPI.Service.PhaseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class PhaseServiceImpl implements PhaseService {
         @Autowired 
            PhaseRepository phsRepository;
  
    @Override
    public List<Phase> getAllPhases() {
        System.out.println(phsRepository);
        return phsRepository.findAll();
    }
}
