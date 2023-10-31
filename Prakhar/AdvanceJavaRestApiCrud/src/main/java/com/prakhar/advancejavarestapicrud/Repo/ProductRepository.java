package com.prakhar.advancejavarestapicrud.Repo;

import com.prakhar.advancejavarestapicrud.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
