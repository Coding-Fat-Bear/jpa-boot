/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Controller;

import com.agnie.RestAPI.Model.Login;
import com.agnie.RestAPI.Repository.LoginRepository;
import com.agnie.RestAPI.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Welcome
 */
@CrossOrigin
@RestController
public class LoginController {
    
    @Autowired
    private LoginService logService;
    private  LoginRepository LogRepo;
    
//    @PostMapping("/login/{username}")
//    public Login login(@PathVariable String username,@RequestParam String password ) {
//        return logService.login(username,password);
//    }
    
   @PostMapping("/login")
    public Login login(@RequestBody Login log) {
       String username = log.getUsername();
       String password = log.getPassword();
       System.out.println("post");
        return logService.login(username,password);
    } 
    
}
