package com.csi.dao;

import com.csi.model.Product;
import com.csi.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductDaoImpl {

    @Autowired
    ProductRepository productRepositoryImpl;

    public List<Product> getAllData(){
       return productRepositoryImpl.findAll();
    }

    public Product saveData(Product product){
        return productRepositoryImpl.save(product);
    }

    public Product updateData(int productId, Product product){
        return productRepositoryImpl.save(product);

    }

    public void deleteData(int productId){
        productRepositoryImpl.deleteById(productId);
    }
}
