package com.casestudy.addToCart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.casestudy.addToCart.Entity.Cart;
import com.casestudy.addToCart.Services.AddToCartService;

@RestController
@RequestMapping("/offerzone/addToCart")
public class AddToCartController {

	@Autowired
	AddToCartService addToCartService;
	
	@PostMapping("/add")
	public void addToCart(@RequestBody Cart cart) {
		addToCartService.addItemTOCartService(cart);
	}
	
	@DeleteMapping("/remove")
	public void removeFromCart(@RequestBody Cart cart) {
		addToCartService.removeItemFromCartService(cart);
	}
	
	/*
	 * @GetMapping("/show/{userId}") public void showItems(@PathVariable long id) {
	 * addToCartService.displayAllProductInCart(id); }
	 */
	
}
