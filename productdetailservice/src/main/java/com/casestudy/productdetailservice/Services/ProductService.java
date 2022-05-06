package com.casestudy.productdetailservice.Services;

import java.util.ArrayList;

import com.casestudy.productdetailservice.Entity.Product;

public interface ProductService {

	Product save(Product product);

	Product update(Product product);

	ArrayList<Product> findAllProducts();

//	ArrayList<Product> getProductDetails(int productId);

//	ArrayList<Product> findAll();

//	Product delete(Product product);

//	ArrayList<Product> getProductDetails(String CompanyName );

}
