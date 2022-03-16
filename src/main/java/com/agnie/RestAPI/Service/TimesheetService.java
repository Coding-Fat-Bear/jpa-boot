/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.Service;

import com.agnie.RestAPI.Model.Timesheet;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Lijoe
 */
public interface TimesheetService {
    List<Timesheet> getTimesheet();
    Timesheet getTimesheet(Long Id);
    Timesheet saveTimesheet(Timesheet timesheet);
    Timesheet updateTimesheet(Long Id,Timesheet timesheet);
    List<Timesheet> getTimesheetByLoginid(Long loginid);
    Timesheet getTimesheetBydate(Date tsdate);
    Timesheet getTimesheetBydateAndLoginid(Date tsdate,Long loginid);
}
