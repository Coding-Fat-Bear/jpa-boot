/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.ServiceImpl;

import com.agnie.RestAPI.Model.Login;
import com.agnie.RestAPI.Repository.LoginRepository;
import com.agnie.RestAPI.Service.LoginService;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Welcome
 */

@Service
public class LoginServiceimpl implements LoginService{

    @Autowired
    private LoginRepository LogRepo;
    
    @Override
    public Login login(String username, String password) {
        System.out.println("post");
        System.out.println(username+""+ password);
        Optional<Login> login= LogRepo.findByUsernameAndPassword(username, password);
        if(login.isPresent()){
//            System.out.println("return"+login.get());
            return login.get();
             
        }else{
        throw new UnsupportedOperationException("Username or Password is worng"); //To change body of generated methods, choose Tools | Templates.
        }
    }

    
}
