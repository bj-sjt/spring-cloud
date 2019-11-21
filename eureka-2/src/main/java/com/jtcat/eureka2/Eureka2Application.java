package com.jtcat.eureka2;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Classname EurekaApplication
 * @Description TODO
 * @Date 2019/11/20 16:18
 * @Created by Sjt
 */

@SpringBootApplication
@EnableEurekaServer
public class Eureka2Application {
    public static void main(String[] args) {

        SpringApplication.run(Eureka2Application.class,args);
    }
}
