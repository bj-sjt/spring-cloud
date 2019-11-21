package com.jtcat.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

/**
 * @Classname ProductApplication
 * @Description TODO
 * @Date 2019/11/20 13:27
 * @Created by Sjt
 */
@SpringBootApplication
@MapperScan("com.jtcat.mapper")
@EnableCircuitBreaker
public class ProductApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class,args);
    }
}
