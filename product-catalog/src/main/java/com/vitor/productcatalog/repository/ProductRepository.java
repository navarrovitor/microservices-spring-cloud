package com.vitor.productcatalog.repository;

import com.vitor.productcatalog.model.Product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {

}
