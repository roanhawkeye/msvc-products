package com.daniel.springcloud.mscv.products.services;

import java.util.List;
import java.util.Optional;

import com.daniel.springcloud.mscv.products.entities.Product;

public interface ProductService {

    List<Product> findAll();
    
    Optional<Product> findById(Long id);

}
