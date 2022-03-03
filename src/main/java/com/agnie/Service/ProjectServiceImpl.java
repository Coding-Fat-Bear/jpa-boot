/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.Service;

import com.agnie.Model.Project;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImpl implements ProjectService {

    private static List<Project> list = new ArrayList<>();

    static {
        Project P = new Project();
        P.setId("1");
        P.setName("Peter");
        P.setCompany("Sibur");
        list.add(P);
        P = new Project();
        P.setId("2");
        P.setName("Lijoe");
        P.setCompany("Lukoil");
        list.add(P);
    }

    @Override
    public List<Project> getProject() {
        return list;
    }

}
