package com.roy.springbootmall.service;

import com.roy.springbootmall.dto.ProductRequest;
import com.roy.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
