package com.gurung.gurungSpring1.controllers;

import com.gurung.gurungSpring1.models.ProductModel;
import com.gurung.gurungSpring1.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/product")
    public ProductModel addProduct(@RequestBody ProductModel productModel)
    {
        return productService.saveProduct(productModel);
    }
    @GetMapping("/products")
    public List<ProductModel> getProduct()
    {
        return productService.getProducts();
    }


}
