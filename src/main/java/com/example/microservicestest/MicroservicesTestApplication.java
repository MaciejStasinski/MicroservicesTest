package com.example.microservicestest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicroservicesTestApplication {

    @Autowired
    private CarProperties carProperties;

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesTestApplication.class, args);
    }

    @Bean
    public void show(){
        System.out.println(carProperties.mark + " "+ carProperties.getModel());
    }


}
