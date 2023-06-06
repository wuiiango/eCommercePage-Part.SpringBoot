package com.qiaoqing.ecommerce.dao;

import com.qiaoqing.ecommerce.entity.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

// accept calls from web browser scripts for this origin
// Origin: protocol + hostname + port
@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<Product, Long> {

    /*
    * findBy... query method
    * the method is similar to:
    * SELECT * FROM product WHERE category_id=?
    * */
    Page<Product> findByCategoryId(@Param("id") Long id, Pageable pageable);

    /**
     * similar to:
     * SELECT * FROM product p WHERE p.name LIKE CONCAT('%', :name, '%')
     * */
    Page<Product> findByNameContaining(@Param("name") String name, Pageable pageable);

}
