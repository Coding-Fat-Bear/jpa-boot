/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.agnie.RestAPI.BusinessLogic;

import com.agnie.RestAPI.Model.Timesheet;
import java.sql.Time;
import java.time.Duration;
import java.time.LocalDateTime;

/**
 *
 * @author Lijoe
 */
public class TimesheetLogic {
    
    public double workTimeCalc(Timesheet timesheet){
         
         ///////////CheckTime//////////////////
        Time tCheckin = timesheet.getCheckin();
        Time tCheckout = timesheet.getCheckout();
        //////calculating 
        long t1 =  (dateDifMin(tCheckin,tCheckout));  ////worktime with no adjustments
        System.out.println("t1: "+t1);
        long t =0;
        long t2 = 0;  ////Breaktime
        long t3 = 0;  ////overtime
        long t4 = 0; ////overtime break
        
        /////calculating  custom breaktime t2/////
        if(timesheet.getBtstart()==null || timesheet.getBtend()==null ||timesheet.getBreakflag()==null)
            {
                System.out.println("null");
                t2 = 60;
                 }

               else{
                   System.out.println("not null");
                   Time tBtstart = timesheet.getBtstart();
                    Time tBtend = timesheet.getBtend();
                    t2 =  dateDifMin(tBtstart,tBtend);
            }
        
        
        /////calculating  overtime t3/////
        if(timesheet.getOtend()==null || timesheet.getOtstart()==null )
            {
                System.out.println("null");
                t3 = 0;
                 }

               else{
                   System.out.println("not null");
                   Time totstart = timesheet.getOtstart();
                    Time totend = timesheet.getOtend();
                    t3 =  dateDifMin(totstart,totend);
            }
        
        /////calculating  overtime breakl t4/////
        if(timesheet.getOtbtstart()==null || timesheet.getOtbtend()==null )
            {
                System.out.println("null");
                t4 = 0;
                 }

               else{
                   System.out.println("not null");
                   Time totBtstart = timesheet.getOtbtstart();
                    Time totBtend = timesheet.getOtbtend();
                    t4 =  dateDifMin(totBtstart,totBtend);
            }
        
        
        
        System.out.println("t1: "+t1);
        System.out.println("t2: "+t2);
        System.out.println("t3: "+t3);
        System.out.println("t4: "+t4);
        
        
        t=t1-t2+t3-t4;
        System.out.println("t: "+t);
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
        return d;
    }
    
     public long dateDifMin(Time t1,Time t2) {

      LocalDateTime d1 = LocalDateTime.of(1996,1,1,t1.getHours(),t1.getMinutes());
      LocalDateTime d2 = LocalDateTime.of(1996,1,1,t2.getHours(),t2.getMinutes());
      LocalDateTime d3 = LocalDateTime.of(1996,1,2,t2.getHours(),t2.getMinutes());
      
        if (d1.isBefore(d2)) {

        }
        else{
            d2 = d3;
        }
    Duration duration = Duration.between(d1, d2);
    long t = duration.toMinutes();
         System.out.println("livereload ");
        return t;
                
    }
}
