package com.gurung.gurungSpring1.repository;

import com.gurung.gurungSpring1.models.ProductModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductModel,Integer> {
}
