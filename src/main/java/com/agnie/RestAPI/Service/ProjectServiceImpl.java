/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Service;

import com.agnie.RestAPI.Model.Project;
import com.agnie.RestAPI.Repository.ProjectRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Autowired
    private ProjectRepository eRepo;


    @Override
    public List<Project> getProject() {
        System.out.println(eRepo);
        return eRepo.findAll();
    }

    @Override
    public Project saveProject(Project project) {
        return eRepo.save(project);
    }

    @Override
    public Project getproject(Long Id) {
        Optional<Project> project= eRepo.findById(Id);
        if(project.isPresent()){
            return project.get();
        }
        throw new RuntimeException("There is no project for this ID "+Id);
    }
    

}
