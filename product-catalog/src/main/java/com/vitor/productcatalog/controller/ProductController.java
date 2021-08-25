package com.vitor.productcatalog.controller;

import java.util.Optional;

import com.vitor.productcatalog.model.Product;
import com.vitor.productcatalog.repository.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

  @Autowired
  private ProductRepository productRepository;

  @RequestMapping(method = RequestMethod.POST)
  Product create(@RequestBody Product product) {
    return productRepository.save(product);
  }

  @RequestMapping(method = RequestMethod.GET, value = "/{id}")
  Optional<Product> findById(@PathVariable Integer id) {
    return productRepository.findById(id);
  }

}
