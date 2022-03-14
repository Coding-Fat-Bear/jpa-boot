/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Service;

import com.agnie.RestAPI.Model.Timesheet;
import com.agnie.RestAPI.Repository.TimesheetRepository;
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
    public Timesheet saveTimesheet(Timesheet timesheet) {
        return tRepo.save(timesheet);
    }

    @Override
    public Timesheet updateTimesheet(Long Id, Timesheet timesheet) {
        timesheet.setTimeid(Id);
        return tRepo.save(timesheet);
    }
}

