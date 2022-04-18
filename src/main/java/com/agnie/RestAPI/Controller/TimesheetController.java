/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Controller;
import com.agnie.RestAPI.Model.Timesheet;
import com.agnie.RestAPI.Service.TimesheetService;
import java.sql.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
public class TimesheetController {
    @Autowired
    private TimesheetService timeService;
   
    @GetMapping("/gettime")
    public List<Timesheet> getTimeDetails() {
        System.out.println("get time");
        return timeService.getTimesheet();
    }
    
    @GetMapping("/gettime/{timeid}")
    public Timesheet getATimeDetail(@PathVariable long timeid) {
        return timeService.getTimesheet(timeid);
    }
    
    @PostMapping("/savetime")
    public Timesheet saveTimesheet(@RequestBody Timesheet timeSheet) {
        return timeService.saveTimesheet(timeSheet);
    }
    
     @PutMapping("/puttime/{id}")
    public Timesheet updateTimesheet(@PathVariable long id, @RequestBody Timesheet timeSheet) {
        return timeService.updateTimesheet(id,timeSheet);
    }
    @GetMapping("/gettimeBylogin/{loginid}")
    public List<Timesheet> getTimeDetailByLoginid(@PathVariable long loginid) {
        return timeService.getTimesheetByLoginid(loginid);
    }
    @GetMapping("/gettimeBydate/{tsdate}")
    public Timesheet getTimeDetailBydate(@PathVariable Date tsdate) {
        return timeService.getTimesheetBydate(tsdate);
    }
    @GetMapping("/gettimeBydateAndloginid/{tsdate}/{loginid}")
    public Timesheet getTimeDetailBydate(@PathVariable Date tsdate,@PathVariable long loginid) {
        return timeService.getTimesheetBydateAndLoginid(tsdate,loginid);
    }
    @GetMapping("/gettimeBymonthandyear/{month}/{year}/{id}")
    public List<Timesheet> getTimeDetailByMonthAndYear(@PathVariable int month,@PathVariable int year,@PathVariable int id) {
        return timeService.getTimesheetBymonthandyear(month,year,id);
    }
}
