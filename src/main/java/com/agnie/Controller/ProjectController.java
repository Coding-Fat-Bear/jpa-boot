package com.agnie.Controller;

import com.agnie.Model.Project;
import javax.websocket.server.PathParam;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
    public String getAProjectDetail(@PathVariable long id)
    {
        return "Project"+id ;
    }
    @PostMapping("/save")
    public String saveProject(@RequestBody Project project)
    {
         
         return "saved " +project;
    }
    @PutMapping("/put")
    public Project updateProject(@RequestParam long id,@RequestBody Project project)
    {   System.out.println("updated "+id);
      return   project;
    }
    @DeleteMapping("/del")
    public String delProject(@RequestParam long id){
            return "deleted is "+ id;
    }
}
