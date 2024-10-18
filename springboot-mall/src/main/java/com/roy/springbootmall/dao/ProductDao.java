package com.roy.springbootmall.dao;

import com.roy.springbootmall.dto.ProductRequest;
import com.roy.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
