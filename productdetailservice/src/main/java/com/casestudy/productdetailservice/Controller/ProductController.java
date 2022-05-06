package com.casestudy.productdetailservice.Controller;

import java.util.ArrayList;
//import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.casestudy.productdetailservice.Entity.Product;
import com.casestudy.productdetailservice.Services.ProductService;

@RestController
@RequestMapping("/offerzone/products")
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@SuppressWarnings("unused")
	@Autowired
	private RestTemplate restTemplate;
	
	@PostMapping("/save")
	public Product saveData(@RequestBody Product product) {
		return productService.save(product); 
	}
	
	@GetMapping("/getAllProducts")
	public ArrayList<Product> getAllProducts() {
		return productService.findAllProducts();
	}
	
//	@GetMapping("/search/{productId}")     //this can be implemented in our frontend
//	public ArrayList<Product> getProductById(@PathVariable int productId) {
//		return productService.getProductDetails(productId);
//	}
	
//	@PutMapping("/search/{productId}")
//	public ArrayList<Product> updateProduct() {
//		return productService.update(product);
//	}
	
//	@DeleteMapping("/search/remove{productId}")
//	public ArrayList<Product> deleteProductById(@PathVariable int productId) {
//		return productService.getProductDetails(productId);
//	}
	
}
