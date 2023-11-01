package com.prakhar.advancejavarestapicrud.Repo;

import com.prakhar.advancejavarestapicrud.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    public List<Product> findByName(String name);

    public List<Product> findByPriceGreaterThanEqual(double price);


}
