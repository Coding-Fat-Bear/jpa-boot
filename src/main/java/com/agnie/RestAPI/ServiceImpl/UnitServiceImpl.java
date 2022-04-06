/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.ServiceImpl;

import com.agnie.RestAPI.Model.Unit;
import com.agnie.RestAPI.Repository.UnitRepository;
import com.agnie.RestAPI.Service.UnitService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class UnitServiceImpl implements UnitService {
    @Autowired
     UnitRepository untRepository;

    @Override
    public List<Unit> getAllUnits() {
       System.out.println(untRepository);
        return untRepository.findAll();
    }
}
