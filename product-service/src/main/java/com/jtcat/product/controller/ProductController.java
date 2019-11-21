package com.jtcat.product.controller;

import com.jtcat.bean.Product;
import com.jtcat.mapper.ProductMapper;
import com.jtcat.service.ProductService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname OrderController
 * @Description TODO
 * @Date 2019/11/20 13:15
 * @Created by Sjt
 */
@RestController
@RequestMapping("/product")
@DefaultProperties(defaultFallback = "defaultFallBack")
public class ProductController {

    @Autowired
    ProductService productService;
    @Value("${server.port}")
    String port;
    @GetMapping("/{id}")
    @HystrixCommand//(fallbackMethod = "getProductByIdFallBack")
    public Product getOrderById(@PathVariable("id") Integer id){
        if(id >4){
            throw  new RuntimeException("id不合法");
        }
        Product product = productService.findById(id);
        product.setPort(port);
        return product;
    }
    public  Product  getProductByIdFallBack(@PathVariable("id") Integer id){
        Product product = new Product();
        product.setId(id);
        product.setName("没有请求的id" + id);
        return product;
    }
    public Product defaultFallBack(){
        Product product = new Product();
        product.setName("统一降级方法");
        return product;
    }
    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.findAll();
    }
}
