/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Repository;

import com.agnie.RestAPI.Model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lijoe
 */
@Repository
public interface ProjectRepository extends JpaRepository<Project, Long>{
 
}
