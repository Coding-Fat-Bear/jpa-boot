/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.ServiceImpl;

import com.agnie.RestAPI.Model.Timesheet;
import com.agnie.RestAPI.Repository.TimesheetRepository;
import com.agnie.RestAPI.Service.TimesheetService;
import java.sql.Date;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalDateTime;
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
        
        System.out.println(timesheet.getCheckin());
            System.out.println(timesheet.getCheckout());
           
        System.out.println(timesheet.getCheckin().getHours());
        Time tCheckin = timesheet.getCheckin();
        Time tCheckout = timesheet.getCheckout();
        
        long t1 =  dateDifMin(tCheckin,tCheckout);
        long t ;
        if(timesheet.getBtstart()==null || timesheet.getBtend()==null)
               {System.out.println("null");
               t = t1;
               }

               else{
                   System.out.println("not null");
                   Time tBtstart = timesheet.getBtstart();
                    Time tBtend = timesheet.getBtend();
                    long t2 =  dateDifMin(tBtstart,tBtend);
                    t= t1-t2;
               }
        
        
        long hours = t / 60;
        long minutes = t % 60;
        String str1;
            if(minutes <10){
                str1 = hours+".0"+ minutes;
            }
            else{
                str1 = hours+"."+ minutes;
            }
        double d=Double.parseDouble(str1); 
        System.out.println(d);
        timesheet.setTotalhours(d);
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

   
    
//    public long dateDifMin(Timesheet timesheet) {
//
//      LocalDateTime d1 = LocalDateTime.of(1996, 1, 1, timesheet.getCheckin().getHours(),timesheet.getCheckin().getMinutes());
//      LocalDateTime d2 = LocalDateTime.of(1996, 1,1, timesheet.getCheckout().getHours(),timesheet.getCheckout().getMinutes());
//      LocalDateTime d3 = LocalDateTime.of(1996, 1,2, timesheet.getCheckout().getHours(),timesheet.getCheckout().getMinutes());
//
//        if (d1.isBefore(d2)) {
//
//        }
//        else{
//            d2 = d3;
//        }
//    Duration duration = Duration.between(d1, d2);
//    long t = duration.toMinutes();
//        
//       if(timesheet.getBtstart()==null || timesheet.getBtend()==null)
//        {System.out.println("null");
//        
//        }
//        
//        else{
//            System.out.println("not null");
//            
//        }
//      
//      
//        
//        return t;
//                
//    }
    
    
    public long dateDifMin(Time t1,Time t2) {

      LocalDateTime d1 = LocalDateTime.of(1996, 1, 1, t1.getHours(),t1.getMinutes());
      LocalDateTime d2 = LocalDateTime.of(1996, 1,1, t2.getHours(),t2.getMinutes());
      LocalDateTime d3 = LocalDateTime.of(1996, 1,2, t2.getHours(),t2.getMinutes());
        System.out.println(d1);
        System.out.println(d2);
        if (d1.isBefore(d2)) {

        }
        else{
            d2 = d3;
        }
    Duration duration = Duration.between(d1, d2);
    long t = duration.toMinutes();
        
        return t;
                
    }
        
}

