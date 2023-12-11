package com.example.productManagementSystem.service;

import com.example.productManagementSystem.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ProductService {

    List<Product> getAllProducts();

    Product insertProductInToDatabase(Product product);

    Product getProductById(int id) ;

    Product updateProduct(int id , Product product) ;

    Product deleteProduct(int id ) ;

}
