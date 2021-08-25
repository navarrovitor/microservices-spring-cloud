package com.vitor.productcatalog.repository;

import com.vitor.productcatalog.model.Product;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface ProductRepository extends CrudRepository<Product, Integer> {

}
