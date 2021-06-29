package com.backend.backend.DataBaseaccessObject;

import com.backend.backend.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface D_Product extends JpaRepository<Product, Long> {

    @Query(value = "select * from product where Name = ?1", nativeQuery=true)
    List<Product> getProducts(String Keyword);

}
