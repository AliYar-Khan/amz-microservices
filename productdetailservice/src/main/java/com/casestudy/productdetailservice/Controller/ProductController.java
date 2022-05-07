package com.casestudy.productdetailservice.Controller;

import java.util.List;
//import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
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
		return productService.addProduct(product); 
	}
	
	@GetMapping("/getAllProducts")
	public List<Product> getAllProducts() {
		return productService.findAllProducts();
	}
	
	@PutMapping("/update/{productId}")
	public Product updateProduct(@RequestBody Product product,@PathVariable int id) {
		return productService.updateProduct(product,id);
	}
	
	@DeleteMapping("/product/{id}")
	void deleteEmployee(@PathVariable int id) {
		productService.deleteById(id);
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
