package com.jtcat.order.service;

import com.jtcat.bean.Product;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Classname FeignHytrixIpml
 * @Description TODO
 * @Date 2019/11/21 12:27
 * @Created by Sjt
 */
@Component
public class FeignHytrixIpml implements FallbackFactory<FeignService> {
    @Override
    public FeignService create(Throwable throwable) {
        return new FeignService() {
            @Override
            public Product findById(Integer id) {
                Product product= new Product();
                product.setId(id);
                product.setName("Hytrix基于feign的降级服务");
                return product;
            }

            @Override
            public List<Product> findall() {
                return null;
            }
        };
    }
}
