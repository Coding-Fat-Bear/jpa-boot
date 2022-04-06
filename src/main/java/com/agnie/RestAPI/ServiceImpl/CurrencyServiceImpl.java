/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.ServiceImpl;

import com.agnie.RestAPI.Model.Currency;
import com.agnie.RestAPI.Repository.CurrencyRepository;
import com.agnie.RestAPI.Service.CurrencyService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class CurrencyServiceImpl implements CurrencyService {
      @Autowired
       CurrencyRepository currRepository;
      
    @Override
    public List<Currency> getAllCurrencies() {
        System.out.println(currRepository);
        return currRepository.findAll();
    }
    
}
