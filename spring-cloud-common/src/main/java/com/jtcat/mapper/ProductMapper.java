package com.jtcat.mapper;


import com.jtcat.bean.Product;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;


/**
 * @Classname OrderDao
 * @Description TODO
 * @Date 2019/11/20 12:55
 * @Created by Sjt
 */
@Mapper
public interface ProductMapper {
    @Select("select * from tbl_product where id= #{id}")
    public Product findById(Integer id);

    @Select("select * from tbl_product")
    public List<Product> findAll();
}
