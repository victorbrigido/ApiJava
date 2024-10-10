package com.CRUDapi.ApiLabel.repository;

import com.CRUDapi.ApiLabel.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
