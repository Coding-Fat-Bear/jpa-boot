/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.ServiceImpl;

import com.agnie.RestAPI.BusinessLogic.TimesheetLogic;
import com.agnie.RestAPI.Model.Timesheet;
import com.agnie.RestAPI.Repository.TimesheetRepository;
import com.agnie.RestAPI.Service.TimesheetService;
import java.sql.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Lijoe
 */
@Service
public class TimesheetServiceImpl implements TimesheetService{
    
    @Autowired
    private TimesheetRepository tRepo;
    public  TimesheetLogic timesheetLogic = new TimesheetLogic();
    
    
    @Override
    public List<Timesheet> getTimesheet() {
        System.out.println(tRepo);
        return tRepo.findAll();
    }

    @Override
    public Timesheet getTimesheet(Long Id) { 
       
        Optional<Timesheet> timesheet= tRepo.findById(Id);
        if(timesheet.isPresent()){
            return timesheet.get();
        }
        throw new RuntimeException("There is no project for this ID "+Id);
    }
    @Override
    public Timesheet getTimesheetBydateAndLoginid(Date tsdate, Long loginid) {
       Optional <Timesheet> timesheet= tRepo.findByTsdateAndLoginid(tsdate, loginid);
        if(timesheet.isPresent() )
            
        {

            return timesheet.get() ;
        }
       throw new IllegalStateException("There is no project for this ID "+tsdate+ " for your login Id");
        
    }


    @Override
    public Timesheet saveTimesheet(Timesheet timesheet) {
        
        double worktime = timesheetLogic.workTimeCalc(timesheet); 
        System.out.println("method called : " +timesheetLogic.workTimeCalc(timesheet));
        System.out.println("wortime"+worktime);
        timesheet.setTotalhours(worktime);
//        System.out.println("**************"+worktime);
        return tRepo.save(timesheet);
    }

    @Override
    public Timesheet updateTimesheet(Long Id, Timesheet timesheet) {
        timesheet.setTimeid(Id);
        return tRepo.save(timesheet);
    }

    @Override
    public List<Timesheet> getTimesheetByLoginid(Long loginid) {
        return tRepo.findByLoginid(loginid);
    }

    @Override
    public Timesheet getTimesheetBydate(Date tsdate) {
        return tRepo.findByTsdate(tsdate);
    }
    
}

