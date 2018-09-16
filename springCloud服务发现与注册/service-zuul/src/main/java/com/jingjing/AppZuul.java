package com.jingjing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/*注意启动网关服务器必须得加这个注解Proxy哦*/
@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class AppZuul {
    public  static  void main(String[] args) {
        SpringApplication.run(AppZuul.class, args);
    }}
