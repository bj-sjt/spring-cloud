package com.jtcat.bean;

import lombok.Data;

/**
 * @Classname Order
 * @Description TODO
 * @Date 2019/11/20 13:03
 * @Created by Sjt
 */

@Data
public class Product {
    private Integer id;
    private String name;
    private Integer status;
    private String description;
    private String port;
}
