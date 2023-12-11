package com.example.productManagementSystem.service.impl;

import com.example.productManagementSystem.entity.Product;
import com.example.productManagementSystem.repository.ProductRepo;
import com.example.productManagementSystem.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepo productRepo;

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }

    @Override
    public Product insertProductInToDatabase(Product product) {
        return productRepo.save(product);
    }

    @Override
    public Product getProductById(int id) {
        return productRepo.findById(id).get();
    }

    @Override
    public Product updateProduct(int id, Product product) {
        Product productFromDb = productRepo.findById(id).get();
        productFromDb.setName(product.getName()) ;
        productFromDb.setPrice(product.getPrice()) ;
        productFromDb.setQuantity(product.getQuantity()) ;

        productRepo.save(productFromDb) ;
        return productFromDb;
    }

    @Override
    public Product deleteProduct(int id) {
        Product product = productRepo.findById(id).get();
        productRepo.deleteById(id);
        return product;
    }


}
