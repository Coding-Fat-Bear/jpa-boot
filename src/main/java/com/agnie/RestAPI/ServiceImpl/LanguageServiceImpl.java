/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.ServiceImpl;

import com.agnie.RestAPI.Model.Language;
import com.agnie.RestAPI.Repository.LanguageRepository;
import com.agnie.RestAPI.Service.LanguageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class LanguageServiceImpl implements LanguageService {
       @Autowired 
            LanguageRepository lngRepository;
    @Override
    public List<Language> getAllLanguages() {
       System.out.println(lngRepository);
        return lngRepository.findAll(); 
    }
    
}
