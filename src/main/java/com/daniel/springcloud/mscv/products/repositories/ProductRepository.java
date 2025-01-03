package com.daniel.springcloud.mscv.products.repositories;

import org.springframework.data.repository.CrudRepository;

import com.daniel.springcloud.mscv.products.entities.Product;

public interface ProductRepository extends CrudRepository<Product, Long>{

}
