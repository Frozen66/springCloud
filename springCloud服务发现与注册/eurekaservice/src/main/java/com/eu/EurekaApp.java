package com.eu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
/*服务*/
public class EurekaApp {

    public static  void main(String[] args){
        SpringApplication.run(EurekaApp.class,args);
    }
}
