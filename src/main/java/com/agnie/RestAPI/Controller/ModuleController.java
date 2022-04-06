/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Controller;

import com.agnie.RestAPI.Service.ModuleService;
import com.agnie.RestAPI.Model.Module;
import static java.lang.System.console;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Admin
 */
//CORS Policy Error Resolvig
@CrossOrigin
//mark class as Controller 
    @RestController
public class ModuleController {
    @Autowired
    ModuleService modService;
    
    @GetMapping("/Modules")
    public @ResponseBody List<Module> getAllModules()   
    {  
     return modService.getAllModules();  
 
    }
    
}
