package com.jtcat.product.controller;

import com.jtcat.bean.Product;
import com.jtcat.mapper.ProductMapper;
import com.jtcat.service.ProductService;
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
public class ProductController {

    @Autowired
    ProductService productService;
    @Value("server.port")
    String port;
    @GetMapping("/{id}")
    public Product getOrderById(@PathVariable("id") Integer id){
        if(id>4){
            throw  new RuntimeException("id不合法");
        }
        Product product = productService.findById(id);
        product.setPort(port);
        return product;
    }

    @GetMapping("/all")
    public List<Product> getAll(){
        return productService.findAll();
    }
}
