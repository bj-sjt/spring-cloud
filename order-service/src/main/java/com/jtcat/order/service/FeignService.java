package com.jtcat.order.service;

import com.jtcat.bean.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @Classname FeignService
 * @Description TODO
 * @Date 2019/11/20 20:51
 * @Created by Sjt
 */

@FeignClient(value="product-service" ,fallbackFactory = FeignHytrixIpml.class)
public interface FeignService {
    @GetMapping("/product/{id}")
    public Product findById(@PathVariable("id") Integer id);

    @GetMapping("/product/all")
    public List<Product> findall();

}
