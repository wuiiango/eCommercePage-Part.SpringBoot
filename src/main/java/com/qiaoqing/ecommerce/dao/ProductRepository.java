package com.qiaoqing.ecommerce.dao;

import com.qiaoqing.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
