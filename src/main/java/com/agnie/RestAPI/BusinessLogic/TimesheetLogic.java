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
        long t1 =  (dateDifMin(tCheckin,tCheckout))-60;
        System.out.println("t1: "+t1);
        long t =0;
        
        if(timesheet.getBtstart()==null || timesheet.getBtend()==null ||timesheet.getBreakflag()==null)
            {
                System.out.println("null");
                t = t1;
                 }

               else{
                   System.out.println("not null");
                   Time tBtstart = timesheet.getBtstart();
                    Time tBtend = timesheet.getBtend();
                    long t2 =  dateDifMin(tBtstart,tBtend);
                    t= t1-t2;
            }
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
            System.out.println("string: "+ str1);
        double d=Double.parseDouble(str1); 
        System.out.println(d);
        return d;
    }
    
     public long dateDifMin(Time t1,Time t2) {

      LocalDateTime d1 = LocalDateTime.of(1996,1,1,t1.getHours(),t1.getMinutes());
      LocalDateTime d2 = LocalDateTime.of(1996,1,1,t2.getHours(),t2.getMinutes());
      LocalDateTime d3 = LocalDateTime.of(1996,1,2,t2.getHours(),t2.getMinutes());
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
