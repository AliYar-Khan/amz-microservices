package com.casestudy.productdetailservice.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.casestudy.productdetailservice.Entity.Product;

@Repository
public interface ProductRepo extends MongoRepository<Product, Integer> {


//	Product deleteById(Product product);

}
