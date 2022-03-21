package com.csi.controller;

import com.csi.model.Product;
import com.csi.service.ProductServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Slf4j
public class ProductController {

    @Autowired
    ProductServiceImpl productServiceImpl;


    @GetMapping("/getdata")
    public ResponseEntity<List<Product>> getAllData()
    {
        return ResponseEntity.ok(productServiceImpl.getAllData());
    }

    @PostMapping("/savedata")
    public ResponseEntity<Product> saveData(@RequestBody Product product)
    {
        log.info("**********Trying to save Data for Product: "+ product.getProductName());
        return ResponseEntity.ok(productServiceImpl.saveData(product));
    }

    @PutMapping("/updatedata/{productId}")
    public ResponseEntity<Product> updateData(@PathVariable int productId, @RequestBody Product product)
    {
        return ResponseEntity.ok(productServiceImpl.updateData(productId, product));
    }

    @DeleteMapping("/deletedata/{productId}")
    public ResponseEntity<String> deleteData(@PathVariable int productId)
    {
        productServiceImpl.deleteData(productId);
        return ResponseEntity.ok("Data deleted Successfully");
    }
}
