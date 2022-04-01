/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Repository;

import com.agnie.RestAPI.Model.Login;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Welcome
 */
@Repository
public interface LoginRepository extends JpaRepository<Login, Long>{

    

    public Optional<Login> findByUsernameAndPassword(String username, String password);
    
}
