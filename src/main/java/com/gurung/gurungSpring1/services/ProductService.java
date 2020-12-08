package com.gurung.gurungSpring1.services;

import com.gurung.gurungSpring1.models.ProductModel;
import com.gurung.gurungSpring1.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository repository;

    public ProductModel saveProduct(ProductModel productModel)
    {
        return repository.save(productModel);
    }

    public List<ProductModel> getProducts()
    {
        return repository.findAll();
    }
}
