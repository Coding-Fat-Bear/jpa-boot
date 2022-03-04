package com.agnie.RestAPI.Controller;

import com.agnie.RestAPI.Model.Project;
import com.agnie.RestAPI.Service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

    //we mention the interface only autowired to the service
    @Autowired
    private ProjectService getService;
    
    @GetMapping("/get")
    public List<Project> getProjectDetails() {
        System.out.println("get");
        return getService.getProject();
    }

    @GetMapping("/get/{id}")
    public String getAProjectDetail(@PathVariable long id) {
        return "Project" + id;
    }

    @PostMapping("/save")
    public String saveProject(@RequestBody Project project) {
        return "saved" + project;
    }

    @PutMapping("/put")
    public Project updateProject(@RequestParam long id, @RequestBody Project project) {
        System.out.println("updated " + id);
        return project;
    }

    @DeleteMapping("/del")
    public String delProject(@RequestParam long id) {
        return "deleted is " + id;
    }
}
