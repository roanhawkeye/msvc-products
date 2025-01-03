package com.daniel.springcloud.mscv.products.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.daniel.springcloud.mscv.products.entities.Product;
import com.daniel.springcloud.mscv.products.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

    
    final private ProductRepository repository;

    public ProductServiceImpl(ProductRepository repository){
        this.repository = repository;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Product> findAll() {
        return (List<Product>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Product> findById(Long id) {
        return repository.findById(id);
    }

}
