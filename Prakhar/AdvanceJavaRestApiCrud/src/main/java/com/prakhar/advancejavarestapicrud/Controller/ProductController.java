package com.prakhar.advancejavarestapicrud.Controller;

import com.prakhar.advancejavarestapicrud.Entity.Product;
import com.prakhar.advancejavarestapicrud.Repo.ProductRepository;
import com.prakhar.advancejavarestapicrud.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    @Autowired
    private ProductService productSer;

    @GetMapping
    public List<Product> getAllProducts() {
        return productSer.getAllProducts();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {
        return productSer.getProductById(id);
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product) {
        return productSer.createProduct(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProduct(@PathVariable int id, @RequestBody Product updatedProduct) {
        return productSer.updateProduct(id,updatedProduct);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable int id) {
       return productSer.deleteProduct(id);
    }
    @GetMapping("/searchbar/{name}")
    public List<Product> getAllProductsByName(@PathVariable String name) {
        return productSer.getAllProductsByName(name);
    }
    @GetMapping("/searchbar/price/{price}")
    public List<Product> getAllProductsByPrice(@PathVariable double price) {
        return productSer.getAllProductsByPrice(price);
    }

}

