    package com.agnie.RestAPI.Controller;

import com.agnie.RestAPI.Model.Project;
import com.agnie.RestAPI.Repository.ProjectRepository;
import com.agnie.RestAPI.Service.ProjectService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Lijoe
 */
@CrossOrigin
@RestController

public class ProjectController {

    //we mention the interface only autowired to the service
    @Autowired
    private ProjectService repService;
    private  ProjectRepository eRepo;
    @GetMapping("/")
    public String login() {
        return "Logged in successfully";
    }
    
    @GetMapping("/get")
    public List<Project> getProjectDetails() {
        System.out.println("get");
        return repService.getProject();
    }
    //fectes data by Id
    @GetMapping("/get/{id}")
    public Project getAProjectDetail(@PathVariable long id) {
        return repService.getproject(id);
    }
    
    //to add a data to table
    @PostMapping("/save")
    public Project saveProject(@RequestBody Project project) {
        return repService.saveProject(project);
    }
    //to update existing data
    @PutMapping("/put/{id}")
    public Project updateProject(@PathVariable long id, @RequestBody Project project) {
        return repService.updateProject(id,project);
    }
    //Delete by id
    @DeleteMapping("/del/{id}")
    public void delProject(@PathVariable long id) {
        boolean exist = eRepo.existsById(id);
        if (!exist) {
            throw new RuntimeException("No Record for "+id);
        }
         repService.deleteProject(id);
    }
}
