package com.agnie.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lijoe
 */
@RestController
       
public class ProjectController {

    public ProjectController() {
        System.out.println("constructor");
    }
    
//    @RequestMapping(value = "/get",method = RequestMethod.GET) 
    @GetMapping("/get")
    public String getProjectDetails(){
        System.out.println("works");
        return "Project Details";
    }
    @GetMapping("/get/{id}")
    public String getAProjectDetail(@PathVariable("id")long id)
    {
        return "Project"+id ;
    }
    @DeleteMapping("/del")
    public String delProject(@RequestParam long id){
            return "deleted is "+ id;
    }
}
