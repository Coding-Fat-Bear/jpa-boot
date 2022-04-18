/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Repository;

import com.agnie.RestAPI.Model.Timesheet;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Lijoe
 */
@Repository
public interface TimesheetRepository extends JpaRepository<Timesheet,Long>{
    List<Timesheet> findByLoginid(Long loginid);
    Timesheet findByTsdate(Date tsdate);
    
   Optional <Timesheet> findByTsdateAndLoginid(Date tsdate,Long loginid);
   @Query(value="select * from agnieportal.time_sheet  where year(tsdate) = ?1 and month(tsdate) = ?2 and LOGINID = ?3 ", 
  nativeQuery = true)
    List<Timesheet> getByYearAndMonth(int month, int year,int id);
}
