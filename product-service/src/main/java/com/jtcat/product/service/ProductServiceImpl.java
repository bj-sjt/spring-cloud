package com.jtcat.product.service;

import com.jtcat.bean.Product;
import com.jtcat.mapper.ProductMapper;
import com.jtcat.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname OrderServiceImpl
 * @Description TODO
 * @Date 2019/11/20 13:10
 * @Created by Sjt
 */
@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductMapper procuctMapper;
    @Override
    public Product findById(Integer id) {
        return procuctMapper.findById(id);
    }

    @Override
    public List<Product> findAll() {
        return procuctMapper.findAll();
    }
}
