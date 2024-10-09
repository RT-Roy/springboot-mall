package com.roy.springbootmall.service.impl;

import com.roy.springbootmall.dao.ProductDao;
import com.roy.springbootmall.model.Product;
import com.roy.springbootmall.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
