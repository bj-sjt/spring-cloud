package com.jtcat.service;

import com.jtcat.bean.Product;

import java.util.List;

/**
 * @Classname OrderService
 * @Description TODO
 * @Date 2019/11/20 13:07
 * @Created by Sjt
 */
public interface ProductService {

    public Product findById(Integer id);

    public List<Product> findAll();


}
