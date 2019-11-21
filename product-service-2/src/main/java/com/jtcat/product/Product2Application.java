package com.jtcat.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @Classname ProductApplication
 * @Description TODO
 * @Date 2019/11/20 13:27
 * @Created by Sjt
 */
@SpringBootApplication
@MapperScan("com.jtcat.mapper")
@EnableCircuitBreaker
public class Product2Application {
    public static void main(String[] args) {
        SpringApplication.run(Product2Application.class,args);
    }
}
