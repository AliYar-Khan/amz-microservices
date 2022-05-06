package com.casestudy.addToCart.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Cart {

	@Id
	@GeneratedValue
//	public long id;
	@NotNull
	public long id;
	public int productId;
		
	public Cart() {
		super();
	}

	public Cart(long id, int productId) {
		super();
		this.id = id;
		this.productId = productId;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

		
}
