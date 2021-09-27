package com.example.demo.repo;

import com.example.demo.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MyRepo extends JpaRepository<Product,String> {
}
