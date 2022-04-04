    package com.mahesh.mahesh;

    import org.springframework.boot.SpringApplication;
    import org.springframework.boot.autoconfigure.SpringBootApplication;

    @SpringBootApplication
            (scanBasePackages={
    "com.mahesh.mahesh.Service", "com.mahesh.mahesh.ServiceImpl", "com.mahesh.mahesh.Controller", "com.mahesh.mahesh.Model", "com.mahesh.mahesh.Repository"})
    public class MaheshApplication {

            public static void main(String[] args) {
                    SpringApplication.run(MaheshApplication.class, args);
            }

    }
