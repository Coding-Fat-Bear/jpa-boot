/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.ServiceImpl;

import com.agnie.RestAPI.Model.BusinessLine;
import com.agnie.RestAPI.Repository.BusinessLineRepository;
import com.agnie.RestAPI.Service.BusinessLineService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class BusinessLineServiceImpl implements BusinessLineService {
    
     @Autowired 
            BusinessLineRepository bizRepository;

    @Override
    public List<BusinessLine> getAllBusinessLines() {
    System.out.println(bizRepository);
        return bizRepository.findAll();
    }
    
}
