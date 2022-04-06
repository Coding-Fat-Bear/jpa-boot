package com.agnie.RestAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@SpringBootApplication
//@EnableWebSecurity
//        (scanBasePackages = {"com.agnie.Controller", "com.agnie.RestAPI", "com.agnie.Service","com.agnie.Repository"})
//@ComponentScan
public class RestApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApiApplication.class, args);
        System.out.println("main");
//                       LocalDate localDate = LocalDate.now();
//               LocalTime localTime = LocalTime.now();
//       System.out.println(localDate);
//       System.out.println(localTime);
    
    }

}
