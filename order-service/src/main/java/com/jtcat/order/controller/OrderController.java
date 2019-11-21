package com.jtcat.order.controller;

import com.jtcat.bean.Product;


import com.jtcat.order.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Classname OrderController
 * @Description TODO
 * @Date 2019/11/20 15:37
 * @Created by Sjt
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    /*@Autowired
    RestTemplate restTemplate;
    String URL="http://product-service/product/";
    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Integer id){
        return restTemplate.getForObject(URL  + id,Product.class);
    }
    @GetMapping("/all")
    public List<Product> getAll(){
        return restTemplate.getForObject(URL + "all",List.class);
    }*/

   @Autowired
   FeignService feignService;
   @GetMapping("/{id}")
   public Product getById(@PathVariable("id") Integer id){
      return feignService.findById(id);
   }

   @GetMapping("/all")
    public  List<Product> getAll(){
       return feignService.findall();
   }




}
