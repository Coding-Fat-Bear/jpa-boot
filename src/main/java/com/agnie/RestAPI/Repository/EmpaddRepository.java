/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Repository;

import com.agnie.RestAPI.Model.Empadd;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Welcome
 */
@Repository
public class EmpaddRepository {
    @Autowired
    private EntityManager em;
    
    @SuppressWarnings("unchecked")
    public List<Empadd> getEmpaddById(Long empcod){
       List<Empadd> listAnything = new ArrayList<Empadd>();
       
       
        
       return  em.createNamedStoredProcedureQuery("empgetdet").setParameter("empcod", empcod).getResultList();
    
    }
    
}
