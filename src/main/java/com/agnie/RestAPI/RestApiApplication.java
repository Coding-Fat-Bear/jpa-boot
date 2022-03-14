package com.agnie.RestAPI;

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
    
    }

}
